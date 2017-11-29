package zhang.matt.exam

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

/**
 * Created by 513078556@qq.com on 2017/11/27.
 */

class RecycleViewAdapter internal constructor(private val mContext: Context, private val mList: List<String>) : RecyclerView.Adapter<RecycleViewAdapter.CusHolder>() {
    var mHightList: List<Int>? =null
    init {
        mHightList = ArrayList<Int>()
        for (i in 0..mList.size) {
            (mHightList as ArrayList<Int>).add((50+Math.random()*300).toInt())
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CusHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.item_single_option, parent, false)
        return CusHolder(view)
    }

    override fun onBindViewHolder(holder: CusHolder, position: Int) {
        holder.mTextView.text = mList[position]
        when(position){
            0->{
                holder.mImgView.setImageResource(R.drawable.ic_option_a)
            }
            1->{
                holder.mImgView.setImageResource(R.drawable.ic_option_b)
            }
            2->{
                holder.mImgView.setImageResource(R.drawable.ic_option_c)
            }
            3->{
                holder.mImgView.setImageResource(R.drawable.ic_option_d)
            }
        }
//        holder.mTextView.layoutParams.height= mHightList!![position]
        holder.itemView.setOnClickListener{
            view->Snackbar.make(view, "btn"+position, Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        holder.itemView.setOnLongClickListener {
            view->Snackbar.make(view, "long click"+position, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
           true
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    inner class CusHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mTextView: TextView
        var mImgView:ImageView
//        var mItemView: ConstraintLayout? = null

        init {
            mTextView = itemView.findViewById<View>(R.id.option_text) as TextView
            mImgView = itemView.findViewById<View>(R.id.option_img) as ImageView
//            mItemView = itemView.findViewById(R.id.item_single_option)
        }
    }
}
