package {{ cookiecutter.package_name }};

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Define o layout da UI para activity_main.xml
        setContentView(R.layout.activity_main)
    }
}
