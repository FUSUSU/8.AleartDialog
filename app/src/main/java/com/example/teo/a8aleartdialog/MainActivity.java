package com.example.teo.a8aleartdialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //Uncomment the below code to Set the message and title from the string.xml file
        //builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);

        //Setting message manually and performing action on button click
        builder.setMessage("Do you want to close this application?")
                .setCancelable(false) //Hủy
                //Tích cực thì hoàn thành
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        finish(); //Hoàn thành
                    }
                })
                //Tiêu cực thì thì out thôi
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Action for 'NO' Button
                        dialog.cancel(); //Kết thúc nè
                    }
                });
        //Creating dialog box
        //Tạo môt dialog từ nội dung của builder.
        AlertDialog alert = builder.create();
        //Setting the title manually
        //Cài đặt tiêu đề cho AlertDialog
        alert.setTitle("AlertDialogExample");
        alert.show();
        //Cái này mặc định khi tạo mới, set file xml hello
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
