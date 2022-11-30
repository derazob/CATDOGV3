package com.santotomas.catdog;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class alumnos extends AppCompatActivity {

    private RecyclerView recyclerViewPersona;
    private RecyclerViewAdaptador adaptadorPersona;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumnos);

        recyclerViewPersona= findViewById(R.id.recyclerPersonas);
        recyclerViewPersona.setLayoutManager(new LinearLayoutManager(this));

        adaptadorPersona = new RecyclerViewAdaptador(obtenerPersonas());
        recyclerViewPersona.setAdapter(adaptadorPersona);
    }


    public List<PersonaModelo> obtenerPersonas(){
        List <PersonaModelo> persona = new ArrayList<>();
        persona.add(new PersonaModelo("obisinio"," ",R.drawable.abisinio));
        persona.add(new PersonaModelo("afgano"," ",R.drawable.afgano));
        persona.add(new PersonaModelo("akita"," ",R.drawable.akitajapones));
        persona.add(new PersonaModelo("americano"," ",R.drawable.americanopeloduro));
        persona.add(new PersonaModelo("asiatico"," ",R.drawable.asiatico));
        persona.add(new PersonaModelo("azulruso"," ",R.drawable.azulruso));
        persona.add(new PersonaModelo("basenji"," ",R.drawable.basenji));
        persona.add(new PersonaModelo("basseta"," ",R.drawable.bassetazuldegascuna));
        persona.add(new PersonaModelo("beagle"," ",R.drawable.beagle));
        persona.add(new PersonaModelo("birmano", " ",R.drawable.birmano));


        return persona;
    }
}