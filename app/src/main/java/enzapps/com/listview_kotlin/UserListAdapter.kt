package enzapps.com.listview_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class UserListAdapter(var mCtx: Context, var resource:Int, var items:List<UserDto>)
    : ArrayAdapter<UserDto>( mCtx , resource , items ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val layoutInflater : LayoutInflater = LayoutInflater.from(mCtx)

        val view : View = layoutInflater.inflate(resource , null )
        val name: TextView =view.findViewById(R.id.txtName1)
        val comment: TextView =view.findViewById(R.id.txtComment)
        var person : UserDto = items[position]
        name.text=person.name
        comment.text=person.comment
        return view
    }
    }