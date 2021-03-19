package com.biradev.rod.view

import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

open class BasicActivity : AppCompatActivity() {

    protected fun setupToolbarActivity(toolbar : Toolbar, titleRes: Int, showBackButton: Boolean = false){
        toolbar.title = getString(titleRes)
        setSupportActionBar(toolbar)
        if (showBackButton){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

        }

    }

}