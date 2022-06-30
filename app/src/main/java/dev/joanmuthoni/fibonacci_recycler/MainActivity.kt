package dev.joanmuthoni.fibonacci_recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.joanmuthoni.fibonacci_recycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        sumDisplay()
    }
    fun sumDisplay() {
        var sumList = fibonacci(100)
        val sumAdapter = SumRecyclerViewAdapter(sumList)
        binding.rvnumbers.layoutManager = LinearLayoutManager(this)
        binding.rvnumbers.adapter = sumAdapter
    }
    fun fibonacci(new:Int):List<Int>{
        val list = ArrayList<Int>()
        var previous = 0
        var current = 1
        for (i in 0..new){
            var sum = previous + current
            previous = current
            current = sum
            list += sum
        }
        return list
    }
}




