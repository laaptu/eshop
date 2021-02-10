package org.ahivs.shopping.common

import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import org.ahivs.shopping.R

abstract class BaseActivity : AppCompatActivity() {

    fun initToolBar(
        toolbar: Toolbar, appIcon: Int = R.drawable.ic_app_icon,
        showHomeAsUp: Boolean = false
    ) {
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = ""
            setIcon(appIcon)
            setDisplayHomeAsUpEnabled(showHomeAsUp)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home)
            finish()
        return super.onOptionsItemSelected(item)
    }
}