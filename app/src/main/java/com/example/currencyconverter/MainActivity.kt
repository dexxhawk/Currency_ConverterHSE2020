package com.example.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun convertCurrency(view: View){
        val inputText: EditText = findViewById(R.id.inputValue)
        var inpText = inputText.text.toString()

        if (inpText == "") {
            inpText = "0"
            Toast.makeText(this, "Введите значение!", Toast.LENGTH_LONG).show()
        }

        val inpValue: Double = inpText.toDouble()

        val selected: Spinner = findViewById(R.id.spinner)
        val selectedCurrency:String = spinner.getSelectedItem().toString()
        when (selectedCurrency){
            "Рубль --> Доллар" -> {Toast.makeText(this,"${inpValue} RUB = ${inpValue/74} USD",Toast.LENGTH_LONG).show()
                                    textViewRes.setText("${inpValue/74}")}

            "Доллар --> Рубль" ->  {Toast.makeText(this,"${inpValue} USD = ${inpValue*74} RUB",Toast.LENGTH_LONG).show()
                                   textViewRes.setText("${inpValue*74}")}

            "Рубль --> Евро" -> {Toast.makeText(this,"${inpValue} RUB = ${inpValue/80} EUR",Toast.LENGTH_LONG).show()
                                 textViewRes.setText("${inpValue/80}")}

            "Евро --> Рубль" -> {Toast.makeText(this,"${inpValue} EUR = ${inpValue*80} RUB",Toast.LENGTH_LONG).show()
                                 textViewRes.setText("${inpValue*80}")}

            "Рубль --> Фунт" -> {Toast.makeText(this,"${inpValue} RUB = ${inpValue/87.7} GBT",Toast.LENGTH_LONG).show()
                                textViewRes.setText("${inpValue/87.7}")}

            "Фунт --> Рубль" -> {Toast.makeText(this,"${inpValue} GBT = ${inpValue*87.7} RUB",Toast.LENGTH_LONG).show()
                                 textViewRes.setText("${inpValue*87.7}")}

            "Рубль --> Гривна" -> {Toast.makeText(this,"${inpValue} RUB = ${inpValue/2.5} UAH",Toast.LENGTH_LONG).show()
                                  textViewRes.setText("${inpValue/2.5}")}

            "Гривна --> Рубль" -> {Toast.makeText(this,"${inpValue} UAH = ${inpValue*2.5} RUB",Toast.LENGTH_LONG).show()
                                   textViewRes.setText("${inpValue*2.5}")}

            "Рубль --> Юань" -> {Toast.makeText(this,"${inpValue} RUB = ${inpValue/10} CNY",Toast.LENGTH_LONG).show()
                                 textViewRes.setText("${inpValue/10}")}

            "Юань --> Рубль" -> {Toast.makeText(this,"${inpValue} CNY = ${inpValue*10} RUB",Toast.LENGTH_LONG).show()
                                textViewRes.setText("${inpValue*10}")}

                else -> return




        }

           }
}