package enzapps.com.listview_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var adapter: UserListAdapter? = null
    var result = ArrayList<UserDto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user: UserDto = UserDto("Bett", "Awesome work ;)")
        result.add(user)
        var user1: UserDto = UserDto("Jack", "Awesome work ;)")
        result.add(user1)
        adapter = UserListAdapter(this,R.layout.user_list_row,result)

        listView.adapter = adapter
        adapter?.notifyDataSetChanged()
        listView.setOnItemClickListener{parent,view,position,id ->
            var name: TextView = view.findViewById(R.id.txtName1)
            var str_name:String=name.text.toString()
            Toast.makeText(this,str_name, Toast.LENGTH_SHORT).show()
        }
    }
}
