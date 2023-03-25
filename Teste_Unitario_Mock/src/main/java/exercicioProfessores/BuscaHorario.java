package exercicioProfessores;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaHorario {
    HorarioService horarioService;

    public BuscaHorario (HorarioService service){
        this.horarioService = service;
    }

    public Horario buscaHorario (int id) {

        // varJson -> retornou do serviço
        String varJson = horarioService.busca(id);

        // JsonObject -> objeto JSON gerado a partir da string de retorno
        JsonObject jsonObject = JsonParser.parseString(varJson).getAsJsonObject();

        return new Horario(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsInt(),
                jsonObject.get("sala").getAsInt(),
                jsonObject.get("predio").getAsInt());
    }
}
