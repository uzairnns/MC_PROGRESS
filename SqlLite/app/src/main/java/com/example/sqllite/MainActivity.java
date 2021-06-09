package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button addButton, viewButton, deleteButton;
    EditText editName, editAge ,deleteID;
    Switch isActive;
    ListView listViewPersonDetails;
    ArrayAdapter<Customer> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addButton=findViewById(R.id.addButton);
        viewButton=findViewById(R.id.viewRecord);
        editName=findViewById(R.id.editPersonName);
        editAge= findViewById(R.id.editPersonAge);
        //isActive= findViewById(R.id.switch1);
        listViewPersonDetails=findViewById(R.id.listViewCustomer);




        RefreshData();


        addButton.setOnClickListener( new View.OnClickListener() {
            Customer customerModel;

            @Override
            public void onClick(View v) {


                try {
                    customerModel = new Customer(editName.getText().toString(), Integer.parseInt(editAge.getText().toString()), isActive.isChecked(), 1);



                    RefreshData();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
                DBHelper dbHelper = new DBHelper(MainActivity.this);
                boolean b = dbHelper.addCustomer(customerModel);


            }
        });

        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                RefreshData();
            }
        });



    }

    private void RefreshData() {
        DBHelper dbHelper= new DBHelper(MainActivity.this);
        List<Customer> allCustomers= dbHelper.getAllRecords();

        arrayAdapter=new ArrayAdapter<Customer>(MainActivity.this, android.R.layout.simple_list_item_1,allCustomers);
        listViewPersonDetails.setAdapter(arrayAdapter);
    }


    public void Delete(View view) {

        DBHelper dbHelper= new DBHelper(MainActivity.this);
        dbHelper.deleteCustomer(deleteID.getText().toString());
    }
}