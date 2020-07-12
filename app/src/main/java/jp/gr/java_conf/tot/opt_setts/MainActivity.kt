package jp.gr.java_conf.tot.opt_setts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_opt_sasaku -> {
                Toast.makeText(applicationContext, "リーダー（違いますキャプテンです）", Toast.LENGTH_SHORT).show()
            }
            R.id.menu_opt_sasami -> {
                Toast.makeText(applicationContext, "パンの鉄砲撃ちますよパンパンパン", Toast.LENGTH_SHORT).show()
            }
            R.id.menu_opt_settings -> {
                startActivity(Intent(applicationContext, SettingsActivity::class.java))
            }
        }
        return super.onOptionsItemSelected(item)
    }
}