package com.developerscracks.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.developerscracks.nestedrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var parentAdapter: ParentMusicGroupAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        getData()
    }

    private fun setupRecyclerView() {
        parentAdapter = ParentMusicGroupAdapter()
        binding.rvParent.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = parentAdapter
        }
    }

    private fun getData() {
        val data = FakeDataBase.getAllMusic()
        parentAdapter.submitList(data)
    }
}