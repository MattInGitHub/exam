package zhang.matt.exam;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.multilevel.treelist.Node;
import com.multilevel.treelist.TreeRecyclerAdapter;

import java.util.List;

/**
 * Created by 张恽 on 2017/12/4.
 */

public class CatTreeAdapter extends TreeRecyclerAdapter {
    public CatTreeAdapter(RecyclerView mTree, Context context, List<Node> datas, int defaultExpandLevel, int iconExpand, int iconNoExpand) {
        super(mTree, context, datas, defaultExpandLevel, iconExpand, iconNoExpand);
    }

    public CatTreeAdapter(RecyclerView mTree, Context context, List<Node> datas, int defaultExpandLevel) {

        super(mTree, context, datas, defaultExpandLevel);
    }

    @Override
    public void onBindViewHolder(Node node, RecyclerView.ViewHolder holder, int position) {
        final MyHolder viewHolder = (MyHolder) holder;
        Log.e("AAAA",node.getName());
        viewHolder.label.setText(node.getName());
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(View.inflate(mContext, R.layout.item_question_cat,null));
    }

    class MyHolder extends RecyclerView.ViewHolder{
        public TextView label;
        public MyHolder(View itemView) {
            super(itemView);
            label = (TextView) itemView.findViewById(R.id.text_cat);
        }

    }
}
