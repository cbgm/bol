package cbgm.bookoflife

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * Created by SA_Admin on 05.02.2018.
 */
class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.SimpleViewHolder> {

    private var dataSource: List<String>? = null

    constructor(dataArgs: List<String>) {
        dataSource = dataArgs
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        // create a new view
        val view = TextView(parent.context)
        return SimpleViewHolder(view)
    }

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.textView.text = dataSource?.get(position)
    }

    override fun getItemCount(): Int {
        return dataSource?.size!!
    }

    class SimpleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView

        init {
            textView = itemView as TextView
            textView.height = 150
        }
    }
}