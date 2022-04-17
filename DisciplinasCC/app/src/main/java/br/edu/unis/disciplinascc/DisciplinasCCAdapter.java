package br.edu.unis.disciplinascc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DisciplinasCCAdapter extends RecyclerView.Adapter<DisciplinasCCAdapter.ViewHolder> {

    private List<DisciplinasCC> disciplinas;

    public DisciplinasCCAdapter(List<DisciplinasCC> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @NonNull
    @Override
    public DisciplinasCCAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.disciplinas_itens, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DisciplinasCC disciplina = this.disciplinas.get(position);
        holder.bind(disciplina);
    }

    @Override
    public int getItemCount() {
        return this.disciplinas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(DisciplinasCC discipline) {
            TextView txtName = itemView.findViewById(R.id.txt_disciplinas_name);
            TextView txtCourse = itemView.findViewById(R.id.txt_disciplinas_course);
            TextView txtStage = itemView.findViewById(R.id.txt_disciplinas_stage);
            LinearLayout linearLayout = itemView.findViewById(R.id.linear_disciplinas_item);

            txtName.setText(discipline.getName());
            txtCourse.setText(discipline.getCourse());
            txtStage.setText(discipline.getStage());
            linearLayout.setBackgroundResource(discipline.getBackgroundColor());
        }
    }
}
