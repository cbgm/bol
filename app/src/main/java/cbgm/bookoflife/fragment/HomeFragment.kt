package cbgm.bookoflife.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import cbgm.bookoflife.R
import cbgm.bookoflife.RecyclerAdapter

/**
 * Created by SA_Admin on 02.02.2018.
 */
class HomeFragment: Fragment {

    constructor() {

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.home_fragment, container, false)
        val names = listOf("Fowler", "Beck", "Evans", "Fowler", "Beck", "Evans", "Fowler", "Beck", "Evans", "Fowler", "Beck", "Evans", "Fowler", "Beck", "Evans")
        val adap = ArrayAdapter<String>(context, android.R.layout.simple_list_item_1)
        adap.addAll(names)
        val list_home = rootView.findViewById<RecyclerView>(R.id.list_home)
        list_home.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(context)
        list_home.layoutManager = layoutManager

        val adapter = RecyclerAdapter(names)
        list_home.adapter = adapter
        return rootView
    }
}