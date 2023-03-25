package exercicioProfessores.test;

import exercicioProfessores.BuscaHorario;
import exercicioProfessores.Horario;
import exercicioProfessores.HorarioService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaHorario {
    HorarioService service;
    BuscaHorario buscaHorario;

    @Before
    public void setup() {
        service = new MockHorarioService();
        buscaHorario = new BuscaHorario(service);
    }


    // ---------------------------- CENARIOS DE SUCESSO ----------------------------


    @Test
    public void buscaProfessorValidoBruno() {
        Horario professorBruno = buscaHorario.buscaHorario(10);

        assertEquals(professorBruno.getNomeDoProfessor(), "Bruno");
        assertEquals(professorBruno.getHorarioDeAtendimento(), "17:30");
        assertEquals(professorBruno.getPeriodo(), 3);
        assertEquals(professorBruno.getSala(), 2);
        assertEquals(professorBruno.getPredio(), 1);
    }


    @Test
    public void buscaProfessorValidoChris() {
        Horario professorChris = buscaHorario.buscaHorario(20);

        assertEquals(professorChris.getNomeDoProfessor(), "Chris");
        assertEquals(professorChris.getHorarioDeAtendimento(), "17:00");
        assertEquals(professorChris.getPeriodo(), 8);
        assertEquals(professorChris.getSala(), 5);
        assertEquals(professorChris.getPredio(), 1);
    }


    @Test
    public void buscaProfessorValidoGuilherme() {
        Horario professorGuilherme = buscaHorario.buscaHorario(30);

        assertEquals(professorGuilherme.getNomeDoProfessor(), "Guilherme");
        assertEquals(professorGuilherme.getHorarioDeAtendimento(), "17:30");
        assertEquals(professorGuilherme.getPeriodo(), 1);
        assertEquals(professorGuilherme.getSala(), 7);
        assertEquals(professorGuilherme.getPredio(), 2);
    }


    @Test
    public void buscaProfessorValidoJoao() {
        Horario professorJoao = buscaHorario.buscaHorario(40);

        assertEquals(professorJoao.getNomeDoProfessor(), "Joao Pedro");
        assertEquals(professorJoao.getHorarioDeAtendimento(), "10:00");
        assertEquals(professorJoao.getPeriodo(), 5);
        assertEquals(professorJoao.getSala(), 8);
        assertEquals(professorJoao.getPredio(), 2);
    }


    @Test
    public void buscaProfessorValidoJorge() {
        Horario professorJorge = buscaHorario.buscaHorario(50);

        assertEquals(professorJorge.getNomeDoProfessor(), "Jorge");
        assertEquals(professorJorge.getHorarioDeAtendimento(), "17:30");
        assertEquals(professorJorge.getPeriodo(), 6);
        assertEquals(professorJorge.getSala(), 13);
        assertEquals(professorJorge.getPredio(), 3);
    }


    @Test
    public void buscaProfessorValidoLuizFelipe() {
        Horario professorLuizFelipe = buscaHorario.buscaHorario(60);

        assertEquals(professorLuizFelipe.getNomeDoProfessor(), "Luiz Felipe");
        assertEquals(professorLuizFelipe.getHorarioDeAtendimento(), "17:30");
        assertEquals(professorLuizFelipe.getPeriodo(), 2);
        assertEquals(professorLuizFelipe.getSala(), 12);
        assertEquals(professorLuizFelipe.getPredio(), 3);
    }


    @Test
    public void buscaProfessorValidoMarcelo() {
        Horario professorMarcelo = buscaHorario.buscaHorario(70);

        assertEquals(professorMarcelo.getNomeDoProfessor(), "Marcelo");
        assertEquals(professorMarcelo.getHorarioDeAtendimento(), "19:30");
        assertEquals(professorMarcelo.getPeriodo(), 7);
        assertEquals(professorMarcelo.getSala(), 19);
        assertEquals(professorMarcelo.getPredio(), 4);
    }


    @Test
    public void buscaProfessorValidoRenzo() {
        Horario professorRenzo = buscaHorario.buscaHorario(80);

        assertEquals(professorRenzo.getNomeDoProfessor(), "Renzo");
        assertEquals(professorRenzo.getHorarioDeAtendimento(), "17:30");
        assertEquals(professorRenzo.getPeriodo(), 5);
        assertEquals(professorRenzo.getSala(), 18);
        assertEquals(professorRenzo.getPredio(), 4);
    }


    @Test
    public void buscaProfessorValidoSoned() {
        Horario professorSoned = buscaHorario.buscaHorario(90);

        assertEquals(professorSoned.getNomeDoProfessor(), "Soned");
        assertEquals(professorSoned.getHorarioDeAtendimento(), "17:30");
        assertEquals(professorSoned.getPeriodo(), 1);
        assertEquals(professorSoned.getSala(), 24);
        assertEquals(professorSoned.getPredio(), 6);
    }


    @Test
    public void buscaProfessorValidoYvo() {
        Horario professorYvo = buscaHorario.buscaHorario(100);

        assertEquals(professorYvo.getNomeDoProfessor(), "Yvo");
        assertEquals(professorYvo.getHorarioDeAtendimento(), "15:30");
        assertEquals(professorYvo.getPeriodo(), 6);
        assertEquals(professorYvo.getSala(), 22);
        assertEquals(professorYvo.getPredio(), 6);
    }


    // ---------------------------- CENARIOS DE FALHA ----------------------------


    @Test
    public void buscaProfessorInValidoBruno() {
        Horario professorBruno = buscaHorario.buscaHorario(10);

        assertEquals(professorBruno.getNomeDoProfessor(), "Bruno");
        assertNotEquals(professorBruno.getHorarioDeAtendimento(), "00:00");
        assertEquals(professorBruno.getPeriodo(), 3);
        assertEquals(professorBruno.getSala(), 2);
        assertEquals(professorBruno.getPredio(), 1);
    }


    @Test
    public void buscaProfessorInValidoChris() {

        Horario professorChris = buscaHorario.buscaHorario(20);

        assertNotEquals(professorChris.getNomeDoProfessor(), "Renzo");
        assertEquals(professorChris.getHorarioDeAtendimento(), "17:00");
        assertEquals(professorChris.getPeriodo(), 8);
        assertEquals(professorChris.getSala(), 5);
        assertEquals(professorChris.getPredio(), 1);
    }


    @Test
    public void buscaProfessorInValidoGuilherme() {
        Horario professorGuilherme = buscaHorario.buscaHorario(30);

        assertEquals(professorGuilherme.getNomeDoProfessor(), "Guilherme");
        assertEquals(professorGuilherme.getHorarioDeAtendimento(), "17:30");
        assertNotEquals(professorGuilherme.getPeriodo(), 10);
        assertEquals(professorGuilherme.getSala(), 7);
        assertEquals(professorGuilherme.getPredio(), 2);
    }


    @Test
    public void buscaProfessorInValidoJoao() {
        Horario professorJoao = buscaHorario.buscaHorario(40);

        assertEquals(professorJoao.getNomeDoProfessor(), "Joao Pedro");
        assertEquals(professorJoao.getHorarioDeAtendimento(), "10:00");
        assertEquals(professorJoao.getPeriodo(), 5);
        assertNotEquals(professorJoao.getSala(), 9999);
        assertEquals(professorJoao.getPredio(), 2);
    }


    @Test
    public void buscaProfessorInValidoJorge() {
        Horario professorJorge = buscaHorario.buscaHorario(50);

        assertEquals(professorJorge.getNomeDoProfessor(), "Jorge");
        assertEquals(professorJorge.getHorarioDeAtendimento(), "17:30");
        assertEquals(professorJorge.getPeriodo(), 6);
        assertEquals(professorJorge.getSala(), 13);
        assertNotEquals(professorJorge.getPredio(), 5);
    }


    @Test
    public void buscaProfessorInValidoLuizFelipe() {
        Horario professorLuizFelipe = buscaHorario.buscaHorario(60);

        assertNotEquals(professorLuizFelipe.getNomeDoProfessor(), "Soned");
        assertEquals(professorLuizFelipe.getHorarioDeAtendimento(), "17:30");
        assertEquals(professorLuizFelipe.getPeriodo(), 2);
        assertEquals(professorLuizFelipe.getSala(), 12);
        assertEquals(professorLuizFelipe.getPredio(), 3);
    }


    @Test
    public void buscaProfessorInValidoMarcelo() {
        Horario professorMarcelo = buscaHorario.buscaHorario(70);

        assertEquals(professorMarcelo.getNomeDoProfessor(), "Marcelo");
        assertNotEquals(professorMarcelo.getHorarioDeAtendimento(), "17:30");
        assertEquals(professorMarcelo.getPeriodo(), 7);
        assertEquals(professorMarcelo.getSala(), 19);
        assertEquals(professorMarcelo.getPredio(), 4);
    }


    @Test
    public void buscaProfessorInValidoRenzo() {
        Horario professorRenzo = buscaHorario.buscaHorario(80);

        assertEquals(professorRenzo.getNomeDoProfessor(), "Renzo");
        assertEquals(professorRenzo.getHorarioDeAtendimento(), "17:30");
        assertNotEquals(professorRenzo.getPeriodo(), 1);
        assertEquals(professorRenzo.getSala(), 18);
        assertEquals(professorRenzo.getPredio(), 4);
    }


    @Test
    public void buscaProfessorInValidoSoned() {
        Horario professorSoned = buscaHorario.buscaHorario(90);

        assertEquals(professorSoned.getNomeDoProfessor(), "Soned");
        assertEquals(professorSoned.getHorarioDeAtendimento(), "17:30");
        assertEquals(professorSoned.getPeriodo(), 1);
        assertNotEquals(professorSoned.getSala(), 55);
        assertEquals(professorSoned.getPredio(), 6);
    }


    @Test
    public void buscaProfessorInValidoYvo() {
        Horario professorYvo = buscaHorario.buscaHorario(100);

        assertNotEquals(professorYvo.getNomeDoProfessor(), "Joao Pedro");
        assertEquals(professorYvo.getHorarioDeAtendimento(), "15:30");
        assertEquals(professorYvo.getPeriodo(), 6);
        assertEquals(professorYvo.getSala(), 22);
        assertEquals(professorYvo.getPredio(), 6);
    }
}