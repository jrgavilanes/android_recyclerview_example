package es.codekai.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class MessageAdapter : ListAdapter<Message, MessageAdapter.ViewHolder>(DiffCallback) {
    companion object DiffCallback : DiffUtil.ItemCallback<Message>() {
        override fun areItemsTheSame(oldItem: Message, newItem: Message): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Message, newItem: Message): Boolean {
            return oldItem == newItem
        }
    }

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val message = view.findViewById<TextView>(R.id.txt_message)
        val author = view.findViewById<TextView>(R.id.txt_author)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_message, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val message = getItem(position)
        holder.author.text = message.author
        holder.message.text = message.message
    }
}


//** MÉTODO CON VIEWBINDING **/
//package es.codekai.myrecyclerview
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.DiffUtil
//import androidx.recyclerview.widget.ListAdapter
//import androidx.recyclerview.widget.RecyclerView
//import es.codekai.myrecyclerview.databinding.RecyclerMessageBinding
//
//class MessageAdapter : ListAdapter<Message, MessageAdapter.ViewHolder>(DiffCallback) {
//    companion object DiffCallback : DiffUtil.ItemCallback<Message>() {
//        override fun areItemsTheSame(oldItem: Message, newItem: Message): Boolean {
//            return oldItem.id == newItem.id
//        }
//
//        override fun areContentsTheSame(oldItem: Message, newItem: Message): Boolean {
//            return oldItem == newItem
//        }
//    }
//
//    inner class ViewHolder(private val binding: RecyclerMessageBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//        fun bind(message: Message) {
//            binding.txtAuthor.text = message.author
//            binding.txtMessage.text = message.message
//
//            binding.executePendingBindings()
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val binding = RecyclerMessageBinding.inflate(LayoutInflater.from(parent.context))
//        return ViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val message = getItem(position)
//        holder.bind(message)
//    }
//}
