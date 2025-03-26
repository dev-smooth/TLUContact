package com.example.tlucontact;

import android.os.Bundle;

import com.example.tlucontact.models.Employees;
import com.example.tlucontact.models.Units;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tlucontact.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_employees, R.id.navigation_units)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);




        Units[] units = {
                new Units(1, "Khoa CNTT", "043525473", "Nhà C5"),
                new Units(2, "Khoa Toán", "043525474", "Nhà B3"),
                new Units(3, "Khoa Vật Lý", "043525475", "Nhà D2"),
                new Units(4, "Khoa Hóa Học", "043525476", "Nhà A1"),
                new Units(5, "Khoa Sinh Học", "043525477", "Nhà B2")
        };

        Employees[] employees = {
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
        /*RecyclerView rcvEmployees = (RecyclerView) findViewById(R.id.list);*/

       /* rcvEmployees.setLayoutManager(new GridLayoutManager(this,1));
        rcvEmployees.setAdapter(new StaffAdapter(employees));*/

    }

}