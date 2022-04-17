package br.edu.unis.disciplinascc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DisciplinasCCActivity extends AppCompatActivity{

    RecyclerView rvDisciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplinas);

        rvDisciplinas = findViewById(R.id.rv_disciplinas);
        rvDisciplinas.setLayoutManager(new LinearLayoutManager(this));

        List<DisciplinasCC> disciplinas = new ArrayList<>();
        disciplinas.add(new DisciplinasCC("Computação", "Ciência da Computação", "1º período", R.color.teal_200));
        disciplinas.add(new DisciplinasCC("Comunicação e Expressão", "Ciência da Computação", "1º período", R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Gestão de Projetos", "Ciência da Computação", "1º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Lógica para Computação", "Ciência da Computação", "1º período", R.color.teal_200));
        disciplinas.add(new DisciplinasCC("Probabilidade e Estatística", "Ciência da Computação", "1º período", R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Projeto Interdisciplinar de Curso - Desenvolvimento de Projetos", "Ciência da Computação", "1º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Segurança e Auditoria de Sistemas", "Ciência da Computação", "1º período",R.color.teal_200));

        disciplinas.add(new DisciplinasCC("Algoritmo e Programação", "Ciência da Computação", "2º período", R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Análise e Projeto de Sistemas", "Ciência da Computação", "2º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Arquitetura e Organização de Computadores", "Ciência da Computação", "2º período",R.color.teal_200));
        disciplinas.add(new DisciplinasCC("Gestão da Inovação e Criatividade", "Ciência da Computação", "2º período", R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Interface Homem Máquina", "Ciência da Computação", "2º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Matemática Discreta", "Ciência da Computação", "2º período",R.color.teal_200));
        disciplinas.add(new DisciplinasCC("Projeto Interdisciplinar de Curso - Resolução de Problemas", "Ciência da Computação", "2º período", R.color.purple_500));

        disciplinas.add(new DisciplinasCC("Cálculo Diferencial e Integral", "Ciência da Computação", "3º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Design e Desenvolvimento de Banco de Dados", "Ciência da Computação", "3º período",R.color.teal_200));
        disciplinas.add(new DisciplinasCC("Engenharia de Software", "Ciência da Computação", "3º período", R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Estrutura de Dados", "Ciência da Computação", "3º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Gestão Empreendedora", "Ciência da Computação", "3º período",R.color.teal_200));
        disciplinas.add(new DisciplinasCC("Programação Orientada a Objetos", "Ciência da Computação", "3º período", R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Projeto Interdisciplinar de Curso - Desenvolvimento Estruturado de Sistemas", "Ciência da Computação", "3º período", R.color.purple_700));

        disciplinas.add(new DisciplinasCC("Business Inteligence e Big Data", "Ciência da Computação", "4º período",R.color.teal_200));
        disciplinas.add(new DisciplinasCC("Direito Empresarial e Digital", "Ciência da Computação", "4º período", R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Ética e Sociedade", "Ciência da Computação", "4º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Infraestrutura e Conectividade de Redes", "Ciência da Computação", "4º período",R.color.teal_200));
        disciplinas.add(new DisciplinasCC("Programação para Web", "Ciência da Computação", "4º período", R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Projeto Interdisciplinar de Curso I", "Ciência da Computação", "4º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Sistemas Operacionais", "Ciência da Computação", "4º período",R.color.teal_200));

        disciplinas.add(new DisciplinasCC("Aplicações Móveis", "Ciência da Computação", "5º período",R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Circuitos Eletrônicos", "Ciência da Computação", "5º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Design Thinking e Startups", "Ciência da Computação", "5º período", R.color.teal_200));
        disciplinas.add(new DisciplinasCC("Internet das Coisas", "Ciência da Computação", "5º período",R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Projeto Interdisciplinar de Curso II", "Ciência da Computação", "5º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Sistemas Embarcados", "Ciência da Computação", "5º período", R.color.teal_200));

        disciplinas.add(new DisciplinasCC("Análise de Algoritmos e Complexidade", "Ciência da Computação", "6º período",R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Automação e Robótica", "Ciência da Computação", "6º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Computação Cognitiva", "Ciência da Computação", "6º período", R.color.teal_200));
        disciplinas.add(new DisciplinasCC("Optativa", "Ciência da Computação", "6º período",R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Projeto Interdisciplinar de Curso III", "Ciência da Computação", "6º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Simulação Gerencial", "Ciência da Computação", "6º período", R.color.teal_200));

        disciplinas.add(new DisciplinasCC("Álgebra Linear", "Ciência da Computação", "7º período",R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Desenvolvimento de Jogos", "Ciência da Computação", "7º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Fundamentos de Física para a Computação", "Ciência da Computação", "7º período", R.color.teal_200));
        disciplinas.add(new DisciplinasCC("Metodologia Científica", "Ciência da Computação", "7º período",R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Projeto Interdisciplinar de Curso IV", "Ciência da Computação", "7º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Sistemas Distribuídos e Computação em Nuvem", "Ciência da Computação", "7º período", R.color.teal_200));

        disciplinas.add(new DisciplinasCC("Compiladores", "Ciência da Computação", "8º período",R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Computação Gráfica e Visão Computacional", "Ciência da Computação", "8º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Governança de TI", "Ciência da Computação", "8º período", R.color.teal_200));
        disciplinas.add(new DisciplinasCC("Marketing Digital", "Ciência da Computação", "8º período",R.color.purple_500));
        disciplinas.add(new DisciplinasCC("Projeto Interdisciplinar de Curso V", "Ciência da Computação", "8º período", R.color.purple_700));
        disciplinas.add(new DisciplinasCC("Tópicos Avançados em Computação", "Ciência da Computação", "8º período", R.color.teal_200));

        DisciplinasCCAdapter adapter = new DisciplinasCCAdapter(disciplinas);
        rvDisciplinas.setAdapter(adapter);
    }
}
