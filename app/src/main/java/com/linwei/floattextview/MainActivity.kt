package com.linwei.floattextview

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import com.linwei.floattextlibrary.listener.OnFloatTextViewClickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list: MutableList<String> = mutableListOf()
        list.add(0, "今天星期日")
        list.add(1, "今天星期一")
        list.add(2, "今天星期二")
        list.add(3, "今天星期三")
        list.add(4, "今天星期四")
        list.add(5, "今天星期五")
        list.add(6, "今天星期六")


        //第一种方式
        val icon: Drawable = this.resources.getDrawable(R.mipmap.ic_launcher)
        float_text_view_one.setDataWithDrawableIcon(list, icon, 150, Gravity.LEFT)

        //第二种方式
        float_text_view_two.setData(list)

        float_text_view_one.setOnFloatTextViewClickListener(object : OnFloatTextViewClickListener {
            override fun onClick(childPosition: Int, childContent: String) {
            }
        })
    }

    override fun onResume() {
        super.onResume()
        float_text_view_one.startViewAnimator()
        float_text_view_two.startViewAnimator()
    }

    override fun onPause() {
        super.onPause()
        float_text_view_one.stopViewAnimator()
        float_text_view_two.stopViewAnimator()
    }
}
