package ni.edu.uca.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import ni.edu.uca.login.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;
    val codigo:String = "Gabriel";
    val password:String = "1234";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);

        iniciar();
    }

    private fun iniciar() {
    binding.btnOk.setOnClickListener {
        val id: String = binding.etUsuario.text.toString();
        val pwd: String = binding.etPwd.text.toString();
        validarCredenciales(id, pwd)
    }
    }

    private fun validarCredenciales(id: String, pwd: String) {
        if(id.equals(codigo) && pwd.equals(password)) {
            Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "Error en credenciales", Toast.LENGTH_SHORT).show()
        }
    }
}