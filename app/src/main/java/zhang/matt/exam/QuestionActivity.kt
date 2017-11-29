package zhang.matt.exam

import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.*
import android.util.Log
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_question.*
import kotlinx.android.synthetic.main.content_question.*
import java.util.*

class QuestionActivity : AppCompatActivity() {
    internal var mList: List<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        setSupportActionBar(toolbar)
        val ab = supportActionBar
        ab!!.setDisplayHomeAsUpEnabled(true)
        initData()
        item_question.setText("根据以下资料，回答1-5题。\n" +
                "2013年，我国物流运行总体平稳，物流需求规模保持较高增幅，物流业增加值平稳增长，但经济运行中的物流成本依然较高。\n" +
                "2013年全国社会物流总额197.8万亿元，同比增长9.5%，增幅比上年回落0.3个百分点。分季度看，一季度增长9.4%，上半年增长9.1%，前三季度增长9.5%，呈现由“趋稳回升”转变的态势。\n" +
                "从构成情况看，工业品物流总额181.5万亿元，同比增长9.7%，增幅比上年回落0.3个百分点。进口货物物流总额12.1万亿元，同比增长6.4%，增幅比上年回落1.3个百分点。农产品物流总额同比增长4.0%，增幅比上年回落0.6个百分点。受电子商务和网络购物快速增长带动，单位与居民物品物流总额保持快速增长态势，同比增长30.4%，增幅比上年加快6.9个百分点;受绿色经济、低碳经济和循环经济快速发展带动，再生资源物流总额快速增长，同比增长20.3%，增幅比上年加快10.2个百分点。\n" +
                "2013年社会物流总费用10.2万亿元，同比增长9.3%，增幅比上年回落2.1个百分点。社会物流总费用与GDP的比率为18.0%，与上年基本持平。其中，运输费用5.4万亿元，同比增长9.2%，占社会物流总费用的比重为52.5%，与上年基本持平;保管费用3.6万亿元，同比增长8.9%，占社会物流总费用的比重为35.0%，同比下降0.2个百分点;管理费用1.3万亿元，同比增长10.8%，占社会物流总费用的比重为12.5%，同比提高0.2个百分点。")
        item_options.layoutManager = LinearLayoutManager(this)
//        recycle_view.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
//        recycle_view.layoutManager = GridLayoutManager(this,5)
        val recycleViewAdapter = RecycleViewAdapter(this, mList!!)
        item_options.adapter = recycleViewAdapter
//        recycle_view.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
//        return true
    }

    fun initData() {
         mList = ArrayList<String>()
        for (i in 0..3) {
            (mList as ArrayList<String>).add("这是一个测试，有这么多多多多多多多多多多多多多多多的字。" + i)
        }
    }
}
