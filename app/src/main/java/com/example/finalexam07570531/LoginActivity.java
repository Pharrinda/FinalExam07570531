package com.example.finalexam07570531;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.finalexam07570531.database.LeaderUser;
import com.example.finalexam07570531.database.UserItem;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText username_edit_text = findViewById(R.id.username_edit_text);
                EditText password_edit_text = findViewById(R.id.password_edit_text);

                String Username = username_edit_text.getText().toString();
                String Password = password_edit_text.getText().toString();

                Auth auth = new Auth(Username, Password);

                boolean result = auth.check();

                if (result) {
                    Toast.makeText(
                            LoginActivity.this,
                            "Login Success",
                            Toast.LENGTH_SHORT
                    ).show();

                } else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage("Invalid username or password");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //โค้ดที่ให้ทำงาน เมื่อ user กดปุ่ม ok
                            //todo;

                           Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                           intent.putExtra(" ", " ");
                           startActivity(intent);

                        }
                    });
                    dialog.show();
                }
            }
        });

        Button expenseButton = findViewById(R.id.register_button);
        expenseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                intent.putExtra(" ", " ");
                startActivity(intent);
            }
        });
    }
//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        reloadData(); // กรณีเก็บข้อมูลในฐานข้อมูล SQLite บนมือถือ
//        //reloadServerData(); // กรณีเก็บข้อมูลในฐานข้อมูล MySQL (MariaDB) บน server
//    }

//    private void reloadData() {
//        LeaderUser repo = new LeaderUser(LoginActivity.this);
//
//        repo.getLedger(new LeaderUser().Callback() {
//            @Override
//            public void onGetLedger(List< UserItem > ) {
//                int totalAmount = 0;
//
//                for (UserItem item : itemList) {
////                    totalAmount += item.amount;
//                }
//
//                TextView balanceTextView = findViewById(R.id.balance_text_view);
//                balanceTextView.setText("คงเหลือ ".concat(String.valueOf(totalAmount)).concat(" บาท"));
//
//                RecyclerView recyclerView = findViewById(R.id.ledger_recycler_view);
//                LedgerRecyclerViewAdapter adapter = new LedgerRecyclerViewAdapter(
//                        LoginActivity.this,
//                        R.layout.item_ledger,
//                        itemList
//                );
//                recyclerView.setLayoutManager(new LinearLayoutManager(LoginActivity.this));
//                recyclerView.setAdapter(adapter);
//            }
//        });
//    }



}