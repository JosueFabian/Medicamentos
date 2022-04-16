package sv.edu.udb.farmaciamedica;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listaDatos;
    ArrayList<Datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos = (ListView) findViewById(R.id.lsDatos);
        Lista = new ArrayList<Datos>();

        Lista.add(new Datos(1, "Aspirina", "x1 $0.13", R.drawable.aspirina));
        Lista.add(new Datos(2, "Paracetamol", "x1 $0.28", R.drawable.paracetamol));
        Lista.add(new Datos(3, "Amoxicilina", "x1 $0.29", R.drawable.amoxicilina));
        Lista.add(new Datos(4, "Lansoprazol", "x1 $0.40", R.drawable.lansoprazol));
        Lista.add(new Datos(5, "Simvastatina", "x10 $7.99", R.drawable.simvastatina));
        Lista.add(new Datos(6, "Omeprazol", "x1 $0.75", R.drawable.omeprazol));
        Lista.add(new Datos(7, "Ramipril", "x30 $23.20", R.drawable.ramipril));
        Lista.add(new Datos(8, "Salbutamol", "x200 Dosis $5.50", R.drawable.salbutamol));
        Lista.add(new Datos(9, "Abrilar Jarabe", "$19.35", R.drawable.abrilar));
        Lista.add(new Datos(10, "Cerebrofos", "$9.09", R.drawable.cerebrofos));
        Lista.add(new Datos(11, "Fosfo B12", "$7.61", R.drawable.fosfo));

        Adaptador miadaptador = new Adaptador(getApplicationContext(),Lista);

        listaDatos.setAdapter(miadaptador);


    }
}