package com.example.doanphanmem.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doanphanmem.Activity.MainActivity;
import com.example.doanphanmem.ui.Login;
import com.example.doanphanmem.R;

public class MainActivityAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admin);
    }

    public void AddProOnclick(View view) {
        Intent intent = new Intent(MainActivityAdmin.this, AddProduct.class);
        startActivity(intent);
    }

    public void LogOutAdminOnclick(View view) {
        Login.setLogin(0);
        Toast.makeText(MainActivityAdmin.this, "Đã đăng xuất", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivityAdmin.this, MainActivity.class);
        startActivity(intent);
    }

    public void ShowAllProOnclick(View view) {
        Intent intent = new Intent(MainActivityAdmin.this, AllProAdmin.class);
        startActivity(intent);
    }

    public void ViewAllOrderOnclick(View view) {
        Intent intent = new Intent(MainActivityAdmin.this, ListOrderForAdmin.class);
        startActivity(intent);
    }
}