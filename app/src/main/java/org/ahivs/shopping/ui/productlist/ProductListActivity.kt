package org.ahivs.shopping.ui.productlist

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import org.ahivs.shopping.common.BaseActivity
import org.ahivs.shopping.R

class ProductListActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        initToolBar(toolbar)
    }
}