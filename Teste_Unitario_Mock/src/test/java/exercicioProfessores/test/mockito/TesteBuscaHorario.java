package exercicioProfessores.test.mockito;

import exercicioProfessores.BuscaHorario;
import exercicioProfessores.Horario;
import exercicioProfessores.HorarioService;
import exercicioProfessores.test.HorarioConst;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaHorario {

    @Mock
    private HorarioService service;
    private BuscaHorario buscaHorario;

    @Before
    public void setup(){
        buscaHorario = new BuscaHorario(service);
    }

    @Test
    public void testeBuscaHorarioChris(){
        Mockito.when(service.busca(10)).thenReturn(HorarioConst.CHRIS);

        Horario chris = buscaHorario.buscaHorario(10);
        //Faz assertion
        assertEquals("Chris", chris.getNomeDoProfessor());
        assertEquals("14:30", chris.getHorarioDeAtendimento());
        assertEquals(4, chris.getSala());
        assertEquals(8, chris.getPeriodo());
        assertEquals(1, chris.getPredio());
    }

    @Test
    public void testeBuscaHorarioMarcelo(){
        Mockito.when(service.busca(20)).thenReturn(HorarioConst.MARCELO);

        Horario marcelo = buscaHorario.buscaHorario(20);
        //Faz assertion
        assertEquals("Marcelo", marcelo.getNomeDoProfessor());
        assertEquals("17:00", marcelo.getHorarioDeAtendimento());
        assertEquals(6, marcelo.getSala());
        assertEquals(2, marcelo.getPeriodo());
        assertEquals(2, marcelo.getPredio());
    }

    @Test
    public void testeBuscaHorarioYvo(){
        Mockito.when(service.busca(30)).thenReturn(HorarioConst.YVO);

        Horario yvo = buscaHorario.buscaHorario(30);
        //Faz assertion
        assertEquals("Yvo", yvo.getNomeDoProfessor());
        assertEquals("18:30", yvo.getHorarioDeAtendimento());
        assertEquals(12, yvo.getSala());
        assertEquals(5, yvo.getPeriodo());
        assertEquals(3, yvo.getPredio());
    }

    @Test
    public void testeBuscaHorarioInexistente(){
        Mockito.when(service.busca(5)).thenReturn(HorarioConst.INEXISTENTE);

        Horario inexistente = buscaHorario.buscaHorario(5);
        //Faz assertion
        assertEquals("Inexistente", inexistente.getNomeDoProfessor());
        assertEquals("Inexistente", inexistente.getHorarioDeAtendimento());
        assertEquals(0, inexistente.getSala());
        assertEquals(0, inexistente.getPeriodo());
        assertEquals(1, inexistente.getPredio());
    }
}
