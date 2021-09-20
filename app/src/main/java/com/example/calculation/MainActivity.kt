package com.example.calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculation.databinding.ActivityMainBinding
import android.view.View
import androidx.core.content.ContextCompat
import org.mariuszgromada.math.mxparser.Expression
import java.lang.Exception
import java.text.DecimalFormat
import javax.xml.xpath.XPathExpression


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.clear.setOnClickListener {
            binding.input.text = ""
            binding.output.text = ""
        }

        binding.bracketLeft.setOnClickListener {
            binding.input.text = addToInput("(")
        }
        binding.bracketRight.setOnClickListener {
            binding.input.text = addToInput(")")
        }
        binding.divide.setOnClickListener {
            binding.input.text = addToInput("÷")
        }
        binding.one.setOnClickListener {
            binding.input.text = addToInput("1")
        }
        binding.two.setOnClickListener {
            binding.input.text = addToInput("2")
        }
        binding.three.setOnClickListener {
            binding.input.text = addToInput("3")
        }
        binding.multifly.setOnClickListener {
            binding.input.text = addToInput("x")
        }
        binding.four.setOnClickListener {
            binding.input.text = addToInput("4")
        }
        binding.five.setOnClickListener {
            binding.input.text = addToInput("5")
        }
        binding.six.setOnClickListener {
            binding.input.text = addToInput("6")
        }
        binding.subtruct.setOnClickListener {
            binding.input.text = addToInput("-")
        }
        binding.seven.setOnClickListener {
            binding.input.text = addToInput("7")
        }
        binding.eight.setOnClickListener {
            binding.input.text = addToInput("8")
        }
        binding.nine.setOnClickListener {
            binding.input.text = addToInput("9")
        }
        binding.add.setOnClickListener {
            binding.input.text = addToInput("+")
        }
        binding.exponent.setOnClickListener {
            binding.input.text = addToInput("^")
        }
        binding.rezo.setOnClickListener {
            binding.input.text = addToInput("0")
        }
        binding.point.setOnClickListener {
            binding.input.text = addToInput(".")
        }
        binding.equals.setOnClickListener {
            showResult()
        }
        binding.delete.setOnClickListener {
            binding.input.text = addToInput("(")
        }
    }

    private fun addToInput(btnValue: String): String {
        return "${binding.input.text}$btnValue"
    }

    private fun getInputExpression(): String {
        var expression = binding.input.text.replace(Regex("÷"), "/")
        expression = expression.replace(Regex("x"), "*")

        return expression
    }

    private fun showResult() {
        try {
            val expression = getInputExpression()
            val result = Expression(expression).calculate()
            if (result.isNaN()) {
                // Show error message
                binding.output.text = "Error"
                binding.output.setTextColor(ContextCompat.getColor(this, R.color.purple_200))
            } else {
                // Show result
                binding.output.text = DecimalFormat("0.######").format(result).toString()
                binding.output.setTextColor(ContextCompat.getColor(this, R.color.purple_200))
            }
        } catch (e: Exception) {
            binding.output.text = "Error"
            binding.output.setTextColor(ContextCompat.getColor(this, R.color.purple_200))
        }
    }
}