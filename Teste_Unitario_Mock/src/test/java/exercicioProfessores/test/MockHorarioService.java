package exercicioProfessores.test;

import exercicioProfessores.HorarioService;

public class MockHorarioService implements HorarioService {

    @Override
    public String busca(int id) {

        if      (id == 10)  return HorarioConst.BRUNO;
        else if (id == 20)  return HorarioConst.CHRIS;
        else if (id == 30)  return HorarioConst.GUILHERME;
        else if (id == 40)  return HorarioConst.JOAO;
        else if (id == 50)  return HorarioConst.JORGE;
        else if (id == 60)  return HorarioConst.LUIZFELIPE;
        else if (id == 70)  return HorarioConst.MARCELO;
        else if (id == 80)  return HorarioConst.RENZO;
        else if (id == 90)  return HorarioConst.SONED;
        else if (id == 100) return HorarioConst.YVO;
        else                return HorarioConst.INEXISTENTE;

    }
}
