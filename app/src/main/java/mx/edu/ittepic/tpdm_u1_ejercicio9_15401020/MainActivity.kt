package mx.edu.ittepic.tpdm_u1_ejercicio9_15401020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var valor1:EditText?=null
    var valor2:EditText?=null
    var calcular:Button?=null
    var tabla:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valor1 = findViewById(R.id.valor1)
        valor2 = findViewById(R.id.valor2)
        calcular = findViewById(R.id.calcular)
        tabla = findViewById(R.id.tabla)

        var cadena=""

        calcular?.setOnClickListener {
            cadena=""
            tabla?.setText("")
            var v1 = valor1?.text.toString().toInt()
            var v2 = valor2?.text.toString().toInt()

            (1..v2).forEach {
                var res = v1*it
                cadena = cadena + v1 + " x " + it + " = " +res + "\n"
            }
            tabla?.setText(cadena)

        }


    }
}
