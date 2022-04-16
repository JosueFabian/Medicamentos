package sv.edu.udb.farmaciamedica;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {

    Context contexto;
    List<Datos> ListaObjetos;

    public Adaptador(Context contexto, List<Datos> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;
    }


    @Override
    public int getCount() {
        return ListaObjetos.size();
    }

    @Override
    public Object getItem(int i) {
        return ListaObjetos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return ListaObjetos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vista = view;

        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista = inflate.inflate(R.layout.itemlistview, null);

        ImageView imagen = (ImageView) vista.findViewById(R.id.imageView);
        TextView nombre = (TextView) vista.findViewById(R.id.textView2);
        TextView precio = (TextView) vista.findViewById(R.id.textView);


        nombre.setText(ListaObjetos.get(i).getNombre().toString());
       precio.setText(ListaObjetos.get(i).getPrecio().toString());
        imagen.setImageResource(ListaObjetos.get(i).getImagen());


       return vista;
    }
}
