package com.example.tlucontact;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tlucontact.models.Employees;
import com.example.tlucontact.models.Units;

/**
 * A fragment representing a list of Items.
 */
public class StaffFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 2;

    private Units[] units = {
            new Units(1, "Khoa CNTT", "043525473", "Nhà C5"),
            new Units(2, "Khoa Toán", "043525474", "Nhà B3"),
            new Units(3, "Khoa Vật Lý", "043525475", "Nhà D2"),
            new Units(4, "Khoa Hóa Học", "043525476", "Nhà A1"),
            new Units(5, "Khoa Sinh Học", "043525477", "Nhà B2")
    };

    private Employees[] employees = {
            new Employees(1, "Minh", "Admin", "0123456789", "minh@gmail.com", units[0]),
            new Employees(2, "Lan", "Nhân Viên", "0987654321", "lan@gmail.com", units[1]),
            new Employees(3, "Hải", "Kỹ Thuật", "0912345678", "hai@gmail.com", units[2]),
            new Employees(4, "An", "Kinh Doanh", "0934567890", "an@gmail.com", units[3]),
            new Employees(5, "Bình", "Giáo Viên", "0967890123", "binh@gmail.com", units[4]),
            new Employees(6, "Duy", "Trưởng Phòng", "0978901234", "duy@gmail.com", units[0]),
            new Employees(7, "Phước", "Quản Lý", "0989012345", "phuoc@gmail.com", units[1]),
            new Employees(8, "Hảo", "Hỗ Trợ", "0990123456", "hao@gmail.com", units[2]),
            new Employees(9, "Thanh", "Nhân Viên", "0901234567", "thanh@gmail.com", units[3]),
            new Employees(10, "Hải", "Giáo Viên", "0912345678", "hai2@gmail.com", units[4]),
            new Employees(11, "Tùng", "Admin", "0923456789", "tung@gmail.com", units[0]),
            new Employees(12, "Phong", "Nhân Viên", "0934567890", "phong@gmail.com", units[1]),
            new Employees(13, "Khánh", "Kỹ Thuật", "0945678901", "khanh@gmail.com", units[2]),
            new Employees(14, "Linh", "Kinh Doanh", "0956789012", "linh@gmail.com", units[3]),
            new Employees(15, "Thắng", "Giáo Viên", "0967890123", "thang@gmail.com", units[4]),
            new Employees(16, "Dũng", "Trưởng Phòng", "0978901234", "dung@gmail.com", units[0]),
            new Employees(17, "Sơn", "Quản Lý", "0989012345", "son@gmail.com", units[1]),
            new Employees(18, "Toàn", "Hỗ Trợ", "0990123456", "toan@gmail.com", units[2]),
            new Employees(19, "Ngọc", "Nhân Viên", "0901234567", "ngoc@gmail.com", units[3]),
            new Employees(20, "Tài", "Giáo Viên", "0912345678", "tai@gmail.com", units[4])
    };


    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public StaffFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static StaffFragment newInstance(int columnCount) {
        StaffFragment fragment = new StaffFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);


        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            recyclerView.setAdapter(new StaffAdapter(employees));
        }
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}