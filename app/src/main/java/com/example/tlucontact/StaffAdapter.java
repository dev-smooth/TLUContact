package com.example.tlucontact;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tlucontact.models.Employees;
import com.example.tlucontact.databinding.FragmentItemEmployeesBinding;

import java.util.List;

/**
 *
 * TODO: Replace the implementation with code for your data type.
 */
public class StaffAdapter extends RecyclerView.Adapter<StaffAdapter.EmployeesViewHolder> {


    private Employees[] employees;


    public StaffAdapter(Employees[] employees) {
        this.employees = employees;
    }

    @Override
    public EmployeesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new EmployeesViewHolder(FragmentItemEmployeesBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final EmployeesViewHolder holder, int position) {
        holder.bind(employees[position]);
     /*   holder.mIdView.setText(mValues.get(position).id);
        holder.mContentView.setText(mValues.get(position).content);*/
    }

    @Override
    public int getItemCount() {
        return employees.length;
    }

    public static class EmployeesViewHolder extends RecyclerView.ViewHolder {
       /* public final TextView mIdView;
        public final TextView mContentView;*/
        public TextView tvName;
        public TextView tvPosition;

        public EmployeesViewHolder(FragmentItemEmployeesBinding binding) {
            super(binding.getRoot());

            tvName = binding.tvName;
            tvPosition = binding.tvPosition;
            /*mIdView = binding.itemNumber;
            mContentView = binding.content;*/
        }

        public void bind(Employees employees) {
            tvName.setText(employees.getName());
            tvPosition.setText(employees.getPosition());
        }

        /*@Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }*/
    }
}