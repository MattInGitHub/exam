package zhang.matt.exam

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.*
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup

import kotlinx.android.synthetic.main.activity_question.*
import kotlinx.android.synthetic.main.content_question.*
import kotlinx.android.synthetic.main.content_question.view.*
import java.util.*

class QuestionActivity : AppCompatActivity() {

    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        setSupportActionBar(toolbar)
        val ab = supportActionBar
        ab!!.setDisplayHomeAsUpEnabled(true)


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)

        // Set up the ViewPager with the sections adapter.
        question_container.adapter = mSectionsPagerAdapter

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
//        return true
    }



    inner class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            return PlaceholderFragment.newInstance(position + 1)
        }

        override fun getCount(): Int {
            // Show 3 total pages.
            return 3
        }
    }

    class PlaceholderFragment : Fragment() {
        internal var mList: List<String>? = null
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                  savedInstanceState: Bundle?): View? {
            val rootView = inflater.inflate(R.layout.fragment_scroll_question, container, false)
//            rootView.item_question.text = getString(R.string.section_format, arguments.getInt(ARG_SECTION_NUMBER))+getString(R.string.test001)
/*
            initData()
//        item_question.setText(R.string.test001)
            item_options.layoutManager = LinearLayoutManager(activity)
//        recycle_view.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
//        recycle_view.layoutManager = GridLayoutManager(this,5)
            val recycleViewAdapter = RecycleViewAdapter(activity, mList!!)
            item_options.adapter = recycleViewAdapter
//        recycle_view.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
*/
            return rootView
        }

        fun initData() {
            mList = ArrayList<String>()
            for (i in 0..3) {
                (mList as ArrayList<String>).add("这是一个测试，有这么多多多多多多多多多多多多多多多的字。" + i)
            }
        }

        companion object {
            /**
             * The fragment argument representing the section number for this
             * fragment.
             */
            private val ARG_SECTION_NUMBER = "section_number"

            /**
             * Returns a new instance of this fragment for the given section
             * number.
             */
            fun newInstance(sectionNumber: Int): PlaceholderFragment {
                val fragment = PlaceholderFragment()
                val args = Bundle()
                args.putInt(ARG_SECTION_NUMBER, sectionNumber)
                fragment.arguments = args
                return fragment
            }
        }
    }
}
