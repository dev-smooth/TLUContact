package com.example.tlucontact.ui.units;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tlucontact.databinding.FragmentUnitsBinding;

public class UnitsFragment extends Fragment {

    private FragmentUnitsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        UnitsViewModel dashboardViewModel =
                new ViewModelProvider(this).get(UnitsViewModel.class);

        binding = FragmentUnitsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textUnits;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}