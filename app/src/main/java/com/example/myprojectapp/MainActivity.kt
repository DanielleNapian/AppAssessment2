package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val dropdownlist1= arrayOf("Pyro", "Hydro", "Cryo", "Electro", "Dendro", "Anemo", "Geo")
    val dropdownlist2= arrayOf("Pyro", "Hydro", "Cryo", "Electro", "Dendro", "Anemo", "Geo")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist1)
        val adapter2=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist2)

        var b1=findViewById(R.id.button) as Button
        var b2=findViewById<Button>(R.id.takequiz) as Button
        b2.setOnClickListener{
            val Intent = Intent(this, MainActivity2 :: class.java)
            startActivity(Intent)
        }

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        //setting the 1st spinner
        Element1.adapter=adapter
        Element1.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long)
            {
                if(Element1.selectedItemPosition==0)
                {
                    textView.setText(" " + Element1.selectedItem)

                }
                if(Element1.selectedItemPosition==1)
                {
                    textView.setText(" " + Element1.selectedItem)

                }

                if(Element1.selectedItemPosition==2)
                {
                    textView.setText(" " + Element1.selectedItem)

                }

                if(Element1.selectedItemPosition==3)
                {
                    textView.setText(" " + Element1.selectedItem)

                }
                if(Element1.selectedItemPosition==4)
                {
                    textView.setText(" " + Element1.selectedItem)

                }
                if(Element1.selectedItemPosition==5)
                {
                    textView.setText(" " + Element1.selectedItem)

                }
                if(Element1.selectedItemPosition==6)
                {
                    textView.setText(" " + Element1.selectedItem)

                }
            }
        }

        //setting the 2nd spinner
        Element2.adapter=adapter2
        Element2.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long)
            {
                if(Element2.selectedItemPosition==0)
                {
                    textView2.setText(" " + Element2.selectedItem)

                }
                if(Element2.selectedItemPosition==1)
                {
                    textView2.setText(" " + Element2.selectedItem)

                }
                if(Element2.selectedItemPosition==2)
                {
                    textView2.setText(" " + Element2.selectedItem)

                }
                if(Element2.selectedItemPosition==3)
                {
                    textView2.setText(" " + Element2.selectedItem)

                }
                if(Element2.selectedItemPosition==4)
                {
                    textView2.setText(" " + Element2.selectedItem)

                }
                if(Element2.selectedItemPosition==5)
                {
                    textView2.setText(" " + Element2.selectedItem)

                }
                if(Element2.selectedItemPosition==6)
                {
                    textView2.setText(" " + Element2.selectedItem)

                }
            }
        }

        //Once the user clicks the button, following text should be displayed based on the selected //items position in relevant array
        b1.setOnClickListener{
            //pyro = 0
            //hydro = 1
            //cryo = 2
            //electro = 3
            //dendro = 4
            //anemo = 5
            //geo = 6

            // all pyro reactions
            if(Element1.selectedItemPosition==0 && Element2.selectedItemPosition==0)
            {
                textView3.setText("Immune")//Pyro + Pyro
            }
            if(Element1.selectedItemPosition==0 && Element2.selectedItemPosition==1)
            {
                textView3.setText("Vaporize")//pyro + Hydro
            }
            if(Element1.selectedItemPosition==0 && Element2.selectedItemPosition==2)
            {
                textView3.setText("Melt")//Pyro + Cryo
            }
            if(Element1.selectedItemPosition==0 && Element2.selectedItemPosition==3)
            {
                textView3.setText("Overloaded")//Pyro + Electro
            }
            if(Element1.selectedItemPosition==0 && Element2.selectedItemPosition==4)
            {
                textView3.setText("Burning")//Pyro + Dendro
            }
            if(Element1.selectedItemPosition==0 && Element2.selectedItemPosition==5)
            {
                textView3.setText("Swirl")//Pyro + anemo
            }
            if(Element1.selectedItemPosition==0 && Element2.selectedItemPosition==6)
            {
                textView3.setText("Crystallize")//Pyro + geo
            }

            //all hydro reactions
            if(Element1.selectedItemPosition==1 && Element2.selectedItemPosition==1)
            {
                textView3.setText("Immune")//Hydro + Hydro
            }
            if(Element1.selectedItemPosition==1 && Element2.selectedItemPosition==0)
            {
                textView3.setText("Vaporize")//Hydro + pyro
            }
            if(Element1.selectedItemPosition==1 && Element2.selectedItemPosition==2)
            {
                textView3.setText("Frozen")//Hydro + cryo
            }
            if(Element1.selectedItemPosition==1 && Element2.selectedItemPosition==3)
            {
                textView3.setText("Electro-charged")//Hydro + electro
            }
            if(Element1.selectedItemPosition==1 && Element2.selectedItemPosition==4)
            {
                textView3.setText("Bloom")//Hydro + dendro
            }
            if(Element1.selectedItemPosition==1 && Element2.selectedItemPosition==5)
            {
                textView3.setText("Swirl")//Hydro + anemo
            }
            if(Element1.selectedItemPosition==1 && Element2.selectedItemPosition==6)
            {
                textView3.setText("Crystallize")//Hydro + geo
            }

            //all cryo reactions
            if(Element1.selectedItemPosition==2 && Element2.selectedItemPosition==0)
            {
                textView3.setText("Melt")//cryo + pyro
            }
            if(Element1.selectedItemPosition==2 && Element2.selectedItemPosition==1)
            {
                textView3.setText("Frozen")//cryo + hydro
            }
            if(Element1.selectedItemPosition==2 && Element2.selectedItemPosition==2)
            {
                textView3.setText("Immune")//cryo + cryo
            }
            if(Element1.selectedItemPosition==2 && Element2.selectedItemPosition==3)
            {
                textView3.setText("Super-conduct")//cryo + electro
            }
            if(Element1.selectedItemPosition==2 && Element2.selectedItemPosition==4)
            {
                textView3.setText("invalid")//cryo + dendro
            }
            if(Element1.selectedItemPosition==2 && Element2.selectedItemPosition==5)
            {
                textView3.setText("Swirl")//cryo + anemo
            }
            if(Element1.selectedItemPosition==2 && Element2.selectedItemPosition==6)
            {
                textView3.setText("Crystallize")//cryo + geo
            }

            //all electro reactions
            if(Element1.selectedItemPosition==3 && Element2.selectedItemPosition==0)
            {
                textView3.setText("Overloaded")//electro + pryo
            }
            if(Element1.selectedItemPosition==3 && Element2.selectedItemPosition==1)
            {
                textView3.setText("Electro-charged")//electro + hydro
            }
            if(Element1.selectedItemPosition==3 && Element2.selectedItemPosition==2)
            {
                textView3.setText("Super-conduct")//electro + cryo
            }
            if(Element1.selectedItemPosition==3 && Element2.selectedItemPosition==3)
            {
                textView3.setText("Immune")//electro + electro
            }
            if(Element1.selectedItemPosition==3 && Element2.selectedItemPosition==4)
            {
                textView3.setText("Quicken")//electro + dendro
            }
            if(Element1.selectedItemPosition==3 && Element2.selectedItemPosition==5)
            {
                textView3.setText("Swirl")//electro + anemo
            }
            if(Element1.selectedItemPosition==3 && Element2.selectedItemPosition==6)
            {
                textView3.setText("Crystallize")//electro + geo
            }

            //all dendro reactions
            if(Element1.selectedItemPosition==4 && Element2.selectedItemPosition==0)
            {
                textView3.setText("Burning")//dendro + pryo
            }
            if(Element1.selectedItemPosition==4 && Element2.selectedItemPosition==1)
            {
                textView3.setText("Bloom")//dendro + hydro
            }
            if(Element1.selectedItemPosition==4 && Element2.selectedItemPosition==2)
            {
                textView3.setText("invalid")//dendro + cryo
            }
            if(Element1.selectedItemPosition==4 && Element2.selectedItemPosition==3)
            {
                textView3.setText("Quicken")//dendro + electro
            }
            if(Element1.selectedItemPosition==4 && Element2.selectedItemPosition==4)
            {
                textView3.setText("Immune")//dendro + dendro
            }
            if(Element1.selectedItemPosition==4 && Element2.selectedItemPosition==5)
            {
                textView3.setText("invalid")//dendro + anemo
            }
            if(Element1.selectedItemPosition==4 && Element2.selectedItemPosition==6)
            {
                textView3.setText("invalid")//dendro + geo
            }


        }



    }
}