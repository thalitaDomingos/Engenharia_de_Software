package exercicioProfessores;

public class Horario {

    protected String nomeDoProfessor;
    protected String horarioDeAtendimento;
    protected int sala;
    protected int periodo;
    protected int predio[] = new int[5];

    public Horario(String nomeDoProfessor, String horarioDeAtendimento, int periodo, int sala, int predio) {

        this.nomeDoProfessor      = nomeDoProfessor;
        this.horarioDeAtendimento = horarioDeAtendimento;
        this.sala                 = sala;
        this.periodo              = periodo;

        if      (this.sala <= 5)  this.predio[0] = 1;
        else if (this.sala <= 10) this.predio[0] = 2;
        else if (this.sala <= 15) this.predio[0] = 3;
        else if (this.sala <= 20) this.predio[0] = 4;
        else if (this.sala <= 25) this.predio[0] = 6;
    }

    public String getNomeDoProfessor() { return nomeDoProfessor; }

    public String getHorarioDeAtendimento() { return horarioDeAtendimento; }

    public int getSala() { return sala; }

    public int getPeriodo() { return periodo; }

    public int getPredio() { return predio[0]; }
}
