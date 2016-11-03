package com.example.sena.fragmentos_dinamicos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by sena on 05/04/2016.
 */
public class Fragmento1 extends Fragment {
    @Nullable

    private Button Calcular;
    private EditText n1,n2;
    private TextView Resultado;
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_main,container,false);
        Calcular=(Button)view.findViewById(R.id.Calcula);
        n1=(EditText)view.findViewById(R.id.num1);
        n2=(EditText)view.findViewById(R.id.num2);
        Resultado=(TextView)view.findViewById(R.id.resultado);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2,resultado;
                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());
                resultado=num1+num2;
                Resultado.setText(""+resultado);

            }
        });
        return view;
    }
}
