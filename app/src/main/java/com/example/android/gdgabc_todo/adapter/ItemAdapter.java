package com.example.android.gdgabc_todo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.gdgabc_todo.R;
import com.example.android.gdgabc_todo.model.Tarefa;

import java.util.List;

/**
 * Created by wesleysilva on 10/15/16.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    private List<Tarefa> listaTarefas;

    public ItemAdapter(List<Tarefa> listaTarefas){

        this.listaTarefas = listaTarefas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.adapter_item,parent);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Tarefa tarefa = this.listaTarefas.get(position);
        holder.titulo.setText(tarefa.getTitulo());
        holder.data.setText(tarefa.getData().toString());

    }

    @Override
    public int getItemCount() {

        return this.listaTarefas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titulo;
        TextView data;
        LinearLayout background;

         public MyViewHolder(View view) {
             super(view);

             background = (LinearLayout) view.findViewById(R.id.ln_background);
             titulo = (TextView) background.findViewById(R.id.tv_titulo);
             data = (TextView) background.findViewById(R.id.tv_data);
         }
     }
}
