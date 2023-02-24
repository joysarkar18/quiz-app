package com.example.quizapp

object constants{
    fun getQuestions():ArrayList<Questions>{
       var qns = ArrayList<Questions>()

        var q1 = Questions(1,"What country this flag belong to?" ,
            R.drawable.ic_flag_of_argentina,
            "Denmark",
            "Myanmar",
            "Argentina",
            "bangladesh",
            3
            )
        qns.add(q1)


        var q2 = Questions(2,"What country this flag belong to?" ,
            R.drawable.ic_flag_of_australia,
            "Australia",
            "Brazil",
            "India",
            "Argentina",
            1
        )
        qns.add(q2)


        var q3 = Questions(3,"What country this flag belong to?" ,
            R.drawable.ic_flag_of_india,
            "Australia",
            "India",
            "Bangladesh",
            "Brazil",
            2
        )
        qns.add(q3)

        var q4 = Questions(4,"What country this flag belong to?" ,
            R.drawable.ic_flag_of_belgium,

            "India",
            "New Zealand",
            "Germany",
            "Belgium",
            4
        )
        qns.add(q4)
        var q5 = Questions(5,"What country this flag belong to?" ,
            R.drawable.ic_flag_of_brazil,

            "Denmark",
            "Brazil",
            "Argentina",
            "bangladesh",
            2
        )
        qns.add(q5)



        var q6 = Questions(6,"What country this flag belong to?" ,
            R.drawable.ic_flag_of_fiji,

            "Fiji",
            "Kuwait",
            "India",
            "Brazil",
            1
        )
        qns.add(q6)


        var q7 = Questions(7,"What country this flag belong to?" ,
            R.drawable.ic_flag_of_new_zealand,

            "Uk",
            "Canada",
            "Mexico",
            "New Zealand",
            4
        )
        qns.add(q7)


        var q8 = Questions(8,"What country this flag belong to?" ,
            R.drawable.ic_flag_of_kuwait,

            "India",
            "Kuwait",
            "Germany",
            "Belgium",
            2
        )
        qns.add(q8)


        var q9= Questions(9,"What country this flag belong to?" ,
            R.drawable.ic_flag_of_denmark,

            "Denmark",
            "Brazil",
            "Argentina",
            "bangladesh",
            1

        )
        qns.add(q9)


        var q10= Questions(10,"What country this flag belong to?" ,
            R.drawable.ic_flag_of_germany,
            "India",
            "Kuwait",
            "Germany",
            "Belgium",
            3
        )
        qns.add(q10)



        return qns

    }
}