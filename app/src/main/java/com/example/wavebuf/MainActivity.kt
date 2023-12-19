package com.mainer.wavebuf

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.example.wavebuf.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s1: EditText = findViewById(R.id.s1)
        val s2: EditText = findViewById(R.id.s2)
        val s3: EditText = findViewById(R.id.s3)
        val s4: EditText = findViewById(R.id.s4)
        val s5: EditText = findViewById(R.id.s5)

        val c1: EditText = findViewById(R.id.c1)
        val c2: EditText = findViewById(R.id.c2)
        val c3: EditText = findViewById(R.id.c3)
        val c4: EditText = findViewById(R.id.c4)
        val c5: EditText = findViewById(R.id.c5)

        val p1: EditText = findViewById(R.id.p1)
        val p2: EditText = findViewById(R.id.p2)
        val p3: EditText = findViewById(R.id.p3)
        val p4: EditText = findViewById(R.id.p4)
        val p5: EditText = findViewById(R.id.p5)

        val total: TextView = findViewById(R.id.totalc)
        val textgpa: TextView = findViewById(R.id.textgpa)

        val ok: Button = findViewById(R.id.ok)
        val clear: Button = findViewById(R.id.clear)

        ok.setOnClickListener {
            if (s1.text.toString() == "" || s2.text.toString() == "" || s3.text.toString() == ""
                || s4.text.toString() == "" || s5.text.toString() == "" || c1.text.toString() == ""
                || c2.text.toString() == "" || c3.text.toString() == "" || c4.text.toString() == ""
                || c5.text.toString() == "" || p1.text.toString() == "" || p2.text.toString() == ""
                || p3.text.toString() == "" || p4.text.toString() == "" || p5.text.toString() == ""
            ) {
                Toast.makeText(
                    this,
                    "Please input all space before OK!!",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else if (c1.text.toString().toInt() < 1 || c1.text.toString().toInt() > 3 ||
                c2.text.toString().toInt() < 1 || c2.text.toString().toInt() > 3 ||
                c3.text.toString().toInt() < 1 || c3.text.toString().toInt() > 3 ||
                c4.text.toString().toInt() < 1 || c4.text.toString().toInt() > 3 ||
                c5.text.toString().toInt() < 1 || c5.text.toString().toInt() > 3
            ) {
                Toast.makeText(
                    this,
                    "Please don't input credit '<1' and '>3'",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else if (p1.text.toString().toDouble() < 1 || p1.text.toString().toDouble() > 4 ||
                p2.text.toString().toDouble() < 1 || p2.text.toString().toDouble() > 4 ||
                p3.text.toString().toDouble() < 1 || p3.text.toString().toDouble() > 4 ||
                p4.text.toString().toDouble() < 1 || p4.text.toString().toDouble() > 4 ||
                p5.text.toString().toDouble() < 1 || p5.text.toString().toDouble() > 4
            ) {
                Toast.makeText(
                    this,
                    "Please don't input point '<1' and '>4'",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else {
                var c = c1.text.toString().toInt() + c2.text.toString().toInt() +
                        c3.text.toString().toInt() + c4.text.toString().toInt() +
                        c5.text.toString().toInt()
                total.setText(c.toString())

                var cmp1 = c1.text.toString().toDouble() * p1.text.toString().toDouble()
                var cmp2 = c2.text.toString().toDouble() * p2.text.toString().toDouble()
                var cmp3 = c3.text.toString().toDouble() * p3.text.toString().toDouble()
                var cmp4 = c4.text.toString().toDouble() * p4.text.toString().toDouble()
                var cmp5 = c5.text.toString().toDouble() * p5.text.toString().toDouble()

                var cmps = cmp1 + cmp2 + cmp3 + cmp4 + cmp5

                var gpa = cmps.toString().toDouble() / c.toString().toDouble()
                val gs = String.format("%.2f", gpa)

                textgpa.setText(gs)
            }
        }

        clear.setOnClickListener {

            s1.setText("")
            s2.setText("")
            s3.setText("")
            s4.setText("")
            s5.setText("")

            c1.setText("")
            c2.setText("")
            c3.setText("")
            c4.setText("")
            c5.setText("")

            p1.setText("")
            p2.setText("")
            p3.setText("")
            p4.setText("")
            p5.setText("")

            total.setText("")
            textgpa.setText("")
        }
    }
}