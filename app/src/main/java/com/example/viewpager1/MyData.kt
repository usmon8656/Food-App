package com.example.viewpager1

object MyData {
    val list = ArrayList<Users>()

    fun addUsers(){
        list.add(Users("Xush Kelibsiz", "Alisher Navoiy va dunyoning eng zo`r shoirlarining eng sara asarlarini o`qing yoki eshiting", R.drawable.img_1))
        list.add(Users("Hikoyalar Dunyosi", "Alisher Navoiy va dunyoning eng zo`r shoirlarining eng sara asarlarini o`qing yoki eshiting", R.drawable.img_2))
        list.add(Users("Kitob Ortidan...", "Alisher Navoiy va dunyoning eng zo`r shoirlarining eng sara asarlarini o`qing yoki eshiting", R.drawable.img_3))
        list.add(Users("Bizga Qo`shiling", "Alisher Navoiy va dunyoning eng zo`r shoirlarining eng sara asarlarini o`qing yoki eshiting", R.drawable.img))
    }
}