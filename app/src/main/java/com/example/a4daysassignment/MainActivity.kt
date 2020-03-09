package com.example.a4daysassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.a4daysassignment.adapter.ShoeAdapter
import com.example.a4daysassignment.model.Shoe
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var shoeArray = ArrayList<Shoe>()
        shoeArray.add(Shoe(1, "Nike Superfly 6 Elite FG", 799, R.drawable.black_shoe))
        shoeArray.add(Shoe(2, "Air Vapermax Flyknit", 1280, R.drawable.blue_shoe))
        shoeArray.add(Shoe(3, "Air Jordan 14 Retro Se", 2400, R.drawable.gold_shoe))
        shoeArray.add(Shoe(4, "LeBron XVI Low EP", 1099, R.drawable.green_black_shoe))
        shoeArray.add(Shoe(5, "Jordan Why Not Zer0.2 PF", 2699, R.drawable.green_blue_shoe))
        shoeArray.add(Shoe(6, "LeBron XVI SB EP", 1280, R.drawable.green_purple_shoe))
        shoeArray.add(Shoe(7, "LeBron 7 QS", 999, R.drawable.red_grey_shoe))
        shoeArray.add(Shoe(8, "Nike Zoom Rival 5.9", 899, R.drawable.red_white_shoe))

        var shoeAdapter = ShoeAdapter(shoeArray)
        shoe_recyclerview.layoutManager = GridLayoutManager(this, 2)
        shoe_recyclerview.adapter = shoeAdapter
    }
}
