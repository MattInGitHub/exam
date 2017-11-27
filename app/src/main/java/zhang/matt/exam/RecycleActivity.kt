package zhang.matt.exam

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.*
import android.util.Log

import kotlinx.android.synthetic.main.activity_recycle.*
import kotlinx.android.synthetic.main.content_recycle.*
import java.util.*

class RecycleActivity : AppCompatActivity() {
    internal var mList: List<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)
        setSupportActionBar(toolbar)
        initData()
//        recycle_view.layoutManager = LinearLayoutManager(this)
        recycle_view.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
//        recycle_view.layoutManager = GridLayoutManager(this,5)
//        Log.e("AAA", mList.toString())
        val recycleViewAdapter = RecycleViewAdapter(this, mList!!)
        recycle_view.adapter = recycleViewAdapter
//        recycle_view.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL))
    }

    fun initData() {
         mList = ArrayList<String>()
        for (i in 0..9) {
            (mList as ArrayList<String>).add("no." + i)
        }
    }
}
