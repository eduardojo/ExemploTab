package com.example.exemplotab;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

public class Tab1 extends Fragment{

    Button btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView =inflater.inflate(R.layout.tab1, container, false);

        btn = (Button) rootView.findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setarTexto(arg0);

            }
        });

        return rootView;
    }

    //Método para executar no click do botão
    public void setarTexto(View view)
    {
        Calendar data = Calendar.getInstance();
        int horas = data.get(Calendar.HOUR_OF_DAY);
        int minutos = data.get(Calendar.MINUTE);
        int segundos = data.get(Calendar.SECOND);
        String horatexto = "HORA ATUAL: " + horas + ":" + minutos + ":" + segundos;
        Toast.makeText(getActivity(), horatexto, Toast.LENGTH_LONG).show();
    }

}
