package com.biradev.rod.view

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.biradev.rod.Model.Music
import com.biradev.rod.R
import kotlinx.android.synthetic.main.activity_list_music.*

class ListMusicActivity : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_music)

        setupToolbarActivity(ListMusicAct_Toolbar_ID,R.string.title_toolbar_ListMusic)


        setRecyclerView(createListBooks())




    }


    fun setRecyclerView(musics: List<Music>){
        with(ListMusicAct_RecyclerView_List_ID){
            layoutManager = LinearLayoutManager(this@ListMusicActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = AdapterListMusic(musics){}
        }
    }


      fun createListBooks(): List<Music>{
        return listOf(
            Music("","",1594593343640, false),
            Music("","",1594593343640, false),
            Music("","",1594593343640, false),
            Music("","",1594593343640, false),
            Music("","",1594593343640, false),
            Music("","",1594593343640, false),
            Music("","",1594593343640, false)
        )
    }
}
