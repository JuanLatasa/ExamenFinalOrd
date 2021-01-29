package tratamientojson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vaadinarchetypeapplication.data.entity.Pers;
import vaadinarchetypeapplication.data.service.PersRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class tratamientojson {

    @Autowired
    PersRepository PersonaRepository;

    public List<Pers> LecturadeJson() throws FileNotFoundException {
        //Creacion del objeto gson
        Gson gson = new Gson();
        //Realiza la lecutra del fichero peliculas.json
        List<Pers> Personas = null;
        try (Reader reader = new FileReader("LocalizaIP.json")) {
            //Conversion del fichero json a onjeto java
            Pers persona = gson.fromJson(reader, Pers.class);
            //Añadimos los objeto al array de peliculas
            Personas = new ArrayList<>();
            Personas = (List<Pers>) persona;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return Personas;
    }
}