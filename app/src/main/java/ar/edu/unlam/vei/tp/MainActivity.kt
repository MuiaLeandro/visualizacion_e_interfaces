package ar.edu.unlam.vei.tp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val button = findViewById<Button>(R.id.btnRegister)

        button.setOnClickListener { goToRegister() }
    }

    private fun goToRegister() {
        val intent = Intent(this, UserRegisterActivity::class.java)
        startActivity(intent)
        finish()
    }
}

