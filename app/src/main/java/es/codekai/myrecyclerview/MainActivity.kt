package es.codekai.myrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import es.codekai.myrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerMessages.layoutManager = LinearLayoutManager(this)

        val messages: MutableList<Message> = mutableListOf<Message>()
        messages.add(Message(id = 1, author = "juanra", "Hola"))
        messages.add(Message(id = 2, author = "bot", "Qué pasa?"))
        messages.add(Message(id = 3, author = "juanra", "Nada. Gafudo!"))
        messages.add(Message(id = 1, author = "juanra", "Hola"))
        messages.add(Message(id = 2, author = "bot", "Qué pasa?"))
        messages.add(Message(id = 3, author = "juanra", "Nada. Gafudo!"))
        messages.add(Message(id = 1, author = "juanra", "Hola"))
        messages.add(Message(id = 2, author = "bot", "Qué pasa?"))
        messages.add(Message(id = 3, author = "juanra", "Nada. Gafudo!"))
        messages.add(Message(id = 1, author = "juanra", "Hola"))
        messages.add(Message(id = 2, author = "bot", "Qué pasa?"))
        messages.add(Message(id = 3, author = "juanra", "Nada. Gafudo!"))
        messages.add(Message(id = 1, author = "juanra", "Hola"))
        messages.add(Message(id = 2, author = "bot", "Qué pasa?"))
        messages.add(Message(id = 3, author = "juanra", "Nada. Gafudo!"))
        messages.add(Message(id = 1, author = "juanra", "Hola"))
        messages.add(Message(id = 2, author = "bot", "Qué pasa?"))
        messages.add(Message(id = 3, author = "juanra", "Nada. Gafudo!"))
        messages.add(Message(id = 1, author = "juanra", "Hola"))
        messages.add(Message(id = 2, author = "bot", "Qué pasa?"))
        messages.add(Message(id = 3, author = "juanra", "Nada. Gafudo!"))

        val adapter = MessageAdapter()
        binding.recyclerMessages.adapter = adapter
        adapter.submitList(messages)
    }
}
