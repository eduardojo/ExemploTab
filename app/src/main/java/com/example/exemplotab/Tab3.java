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

public class Tab3 extends Fragment {

    Button btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.tab3, container, false);

        btn = (Button) rootView.findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setarTexto(arg0);

            }
        });

        return rootView;
    }

    public void setarTexto(View view)
    {
        //Fazer operações
        Toast.makeText(getActivity(), "Não vou fazer nada :-p", Toast.LENGTH_LONG).show();
    }
}
