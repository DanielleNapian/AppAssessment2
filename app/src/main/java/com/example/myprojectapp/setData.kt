package com.example.myapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "Who bullies Ei ?",

           "Yae Miko",
           "Nahida",
           "Zhongli",
           "Venti",
           1
       )
       var question2 = QuestionData(
           2,
           "Who is looking after Klee ?",

           "Jean",
           "Lisa",
           "Kaeya",
           "Albedo",
           4
       )
       var question3 = QuestionData(
           3,
           "Who is Amber's Bestfriend?",

           "Collei",
           "Eula",
           "Lumine",
           "None of the above",
           1
       )
       var question4 = QuestionData(
           4,
           "What's the first element you obtain in the game?",

           "Anemo",
           "Geo",
           "Cryo",
           "Venti",
           1
       )

       var question5 = QuestionData(
           5,
           "Who was the first Character recrited in the team?",

           "Paimon",
           "Amber",
           "Aether",
           "Lisa",
           2
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}