package com.cis.uiquiz.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.cis.uiquiz.R
import com.cis.uiquiz.model.Student

import kotlinx.android.synthetic.main.listitem_student.view.*


public class StudentAdapter(val mCtx: Context,
                            var resource:Int,
                            var items:List<Student>)
    : ArrayAdapter<Student> (mCtx,resource,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //return super.getView(position, convertView, parent)
        val layout:LayoutInflater = LayoutInflater.from(mCtx)

        val v:View = layout.inflate(resource,null)
        val icon : ImageView = v.findViewById(R.id.imageView3)
        val name : TextView = v.findViewById(R.id.textView10)
        val id:TextView = v.findViewById(R.id.textView11)

        val student:Student = items[position]

        name.text = student.name
        id.text = student.id
        try {
            icon.setImageDrawable(mCtx.getDrawable(student.icon))
        }
        catch (ex:Exception){

        }

        return v
    }
}

// var -> change value
// val -> final ประกาศแบบไม่เปลี่ยนแปลงค่า