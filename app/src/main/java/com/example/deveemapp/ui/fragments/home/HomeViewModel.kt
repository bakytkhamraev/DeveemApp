package com.example.deveemapp.ui.fragments.home

import androidx.lifecycle.ViewModel
import com.example.deveemapp.model.ItemModel

class HomeViewModel : ViewModel() {
    private val list: MutableList<ItemModel> = mutableListOf()

    fun getData(): MutableList<ItemModel> {
        list.add(
            ItemModel(
                "Продаю сухофрукты. Узгенские Вкусные. Упаковка 200с",
                25,
                500,
                200,
                "свежие и чистые как мои руки",
                "30 ноября 2021",
                "KGZ",
                "Ош",
                "за 2 кг",
                "https://avatars.mds.yandex.net/get-zen_doc/1898210/pub_5e005034e3062c00af9ed6fc_5e00ee7dd7859b00b1aaea48/scale_1200"
            )
        )
        list.add(
            ItemModel(
                "Продаю машину Mers",
                2,
                600,
                5000,
                "мерс серего цвета",
                "30 ноября 2021",
                "KGZ",
                "Бишкек",
                "за 5 кг",
                "https://img3.goodfon.ru/original/1024x1024/5/7f/amg-mercedes-benz-c-class-7676.jpg"
            )
        )
        list.add(
            ItemModel(
                "Продаю элитный дом",
                8,
                700,
                15000,
                "Трех этажный дом",
                "30 ноября 2021",
                "KGZ",
                "Токтогул",
                "за 5 кг",
                "https://www.zyxel.com/ru/ru/uploads/images/dom-20190619-600x600.jpg"
            )
        )
        list.add(
            ItemModel(
                "Продаю телефон Mi 8, 64 гб, камера 58 пикс, есть коробка, адрес Токтогула/Манас",
                3,
                5000,
                12000,
                "б/у, год назад покупал за 18000",
                "30 ноября 2021",
                "KGZ",
                "Ыссык-Куль",
                "за 9 кг",
                "https://ae01.alicdn.com/kf/HTB1_55.L7voK1RjSZPfq6xPKFXa3/Xiaomi-mi-8-Lite-6-GB-64-GB-Snapdragon-660-AIE-Octa.jpg_q50.jpg"
            )
        )
        list.add(
            ItemModel(
                "Продаю озеро, 10 процентов города Нарын",
                10,
                5999,
                20000,
                "озеро Иссык-Куль",
                "30 ноября 2021",
                "KGZ",
                "Ала-Тоо",
                "за 6 кг",
                "https://wallbox.ru/resize/1024x1024/wallpapers/main/201241/goroda-i-strany-40fcda24da3b.jpg"
            )
        )
        list.add(
            ItemModel(
                "Продаю ёлку",
                70,
                222,
                800,
                "высота 2 метра",
                "30 ноября 2021",
                "KGZ",
                "Ак-Орго",
                "за 9 кг",
                "https://cdn.wallpapersafari.com/3/66/qnRLpf.jpg"
            )
        )


        list.add(
            ItemModel(
                "Продаю сухофрукты. Узгенские Вкусные. Упаковка 200с",
                25,
                500,
                200,
                "свежие и чистые как мои руки",
                "30 ноября 2021",
                "KGZ",
                "Ош",
                "за 2 кг",
                "https://avatars.mds.yandex.net/get-zen_doc/1898210/pub_5e005034e3062c00af9ed6fc_5e00ee7dd7859b00b1aaea48/scale_1200"
            )
        )
        list.add(
            ItemModel(
                "Продаю машину Mers",
                2,
                600,
                5000,
                "мерс серего цвета",
                "30 ноября 2021",
                "KGZ",
                "Бишкек",
                "за 5 кг",
                "https://img3.goodfon.ru/original/1024x1024/5/7f/amg-mercedes-benz-c-class-7676.jpg"
            )
        )
        list.add(
            ItemModel(
                "Продаю элитный дом",
                8,
                700,
                15000,
                "Трех этажный дом",
                "30 ноября 2021",
                "KGZ",
                "Токтогул",
                "за 5 кг",
                "https://www.zyxel.com/ru/ru/uploads/images/dom-20190619-600x600.jpg"
            )
        )
        list.add(
            ItemModel(
                "Продаю телефон Mi 8, 64 гб, камера 58 пикс, есть коробка, адрес Токтогула/Манас",
                3,
                5000,
                12000,
                "б/у, год назад покупал за 18000",
                "30 ноября 2021",
                "KGZ",
                "Ыссык-Куль",
                "за 9 кг",
                "https://ae01.alicdn.com/kf/HTB1_55.L7voK1RjSZPfq6xPKFXa3/Xiaomi-mi-8-Lite-6-GB-64-GB-Snapdragon-660-AIE-Octa.jpg_q50.jpg"
            )
        )
        list.add(
            ItemModel(
                "Продаю озеро, 10 процентов города Нарын",
                10,
                5999,
                20000,
                "озеро Иссык-Куль",
                "30 ноября 2021",
                "KGZ",
                "Ала-Тоо",
                "за 6 кг",
                "https://wallbox.ru/resize/1024x1024/wallpapers/main/201241/goroda-i-strany-40fcda24da3b.jpg"
            )
        )
        list.add(
            ItemModel(
                "Продаю ёлку",
                70,
                222,
                800,
                "высота 2 метра",
                "30 ноября 2021",
                "KGZ",
                "Ак-Орго",
                "за 9 кг",
                "https://cdn.wallpapersafari.com/3/66/qnRLpf.jpg"
            )
        )


        list.add(
            ItemModel(
                "Продаю сухофрукты. Узгенские Вкусные. Упаковка 200с",
                25,
                500,
                200,
                "свежие и чистые как мои руки",
                "30 ноября 2021",
                "KGZ",
                "Ош",
                "за 2 кг",
                "https://avatars.mds.yandex.net/get-zen_doc/1898210/pub_5e005034e3062c00af9ed6fc_5e00ee7dd7859b00b1aaea48/scale_1200"
            )
        )
        list.add(
            ItemModel(
                "Продаю машину Mers",
                2,
                600,
                5000,
                "мерс серего цвета",
                "30 ноября 2021",
                "KGZ",
                "Бишкек",
                "за 5 кг",
                "https://img3.goodfon.ru/original/1024x1024/5/7f/amg-mercedes-benz-c-class-7676.jpg"
            )
        )
        list.add(
            ItemModel(
                "Продаю элитный дом",
                8,
                700,
                15000,
                "Трех этажный дом",
                "30 ноября 2021",
                "KGZ",
                "Токтогул",
                "за 5 кг",
                "https://www.zyxel.com/ru/ru/uploads/images/dom-20190619-600x600.jpg"
            )
        )
        list.add(
            ItemModel(
                "Продаю телефон Mi 8, 64 гб, камера 58 пикс, есть коробка, адрес Токтогула/Манас",
                3,
                5000,
                12000,
                "б/у, год назад покупал за 18000",
                "30 ноября 2021",
                "KGZ",
                "Ыссык-Куль",
                "за 9 кг",
                "https://ae01.alicdn.com/kf/HTB1_55.L7voK1RjSZPfq6xPKFXa3/Xiaomi-mi-8-Lite-6-GB-64-GB-Snapdragon-660-AIE-Octa.jpg_q50.jpg"
            )
        )
        list.add(
            ItemModel(
                "Продаю озеро, 10 процентов города Нарын",
                10,
                5999,
                20000,
                "озеро Иссык-Куль",
                "30 ноября 2021",
                "KGZ",
                "Ала-Тоо",
                "за 6 кг",
                "https://wallbox.ru/resize/1024x1024/wallpapers/main/201241/goroda-i-strany-40fcda24da3b.jpg"
            )
        )
        list.add(
            ItemModel(
                "Продаю ёлку",
                70,
                222,
                800,
                "высота 2 метра",
                "30 ноября 2021",
                "KGZ",
                "Ак-Орго",
                "за 9 кг",
                "https://cdn.wallpapersafari.com/3/66/qnRLpf.jpg"
            )
        )



        return list
    }
}