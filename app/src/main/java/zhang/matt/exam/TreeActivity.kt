package zhang.matt.exam

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.multilevel.treelist.Node

import kotlinx.android.synthetic.main.activity_tree.*
import kotlinx.android.synthetic.main.content_tree.*
import java.util.ArrayList

class TreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tree)
        setSupportActionBar(toolbar)
        var mDatas: MutableList<Node<Any,Any>> = ArrayList()
        // id , pid , label , 其他属性
        mDatas.add(Node("1", "-1", "文件管理系统"))

        mDatas.add(Node(2.toString() + "", 1.toString() + "", "游戏"))
        mDatas.add(Node(3.toString() + "", 1.toString() + "", "文档"))
        mDatas.add(Node(4.toString() + "", 1.toString() + "", "程序"))
        mDatas.add(Node(5.toString() + "", 2.toString() + "", "war3"))
        mDatas.add(Node(6.toString() + "", 2.toString() + "", "刀塔传奇"))

        mDatas.add(Node(7.toString() + "", 4.toString() + "", "面向对象"))
        mDatas.add(Node(8.toString() + "", 4.toString() + "", "非面向对象"))

        mDatas.add(Node(9.toString() + "", 7.toString() + "", "C++"))
        mDatas.add(Node(10.toString() + "", 7.toString() + "", "JAVA"))
        mDatas.add(Node(11.toString() + "", 7.toString() + "", "Javascript"))
        mDatas.add(Node(12.toString() + "", 8.toString() + "", "C"))
        mDatas.add(Node(13.toString() + "", 12.toString() + "", "C"))
        mDatas.add(Node(14.toString() + "", 13.toString() + "", "C"))
        mDatas.add(Node(15.toString() + "", 14.toString() + "", "C"))
        mDatas.add(Node(16.toString() + "", 15.toString() + "", "C"))

        tree_recycle.layoutManager = LinearLayoutManager(this)
        val catTreeAdapter = CatTreeAdapter(tree_recycle,this,mDatas,1)
        tree_recycle.adapter = catTreeAdapter
    }
}
