package com.example.droidcafedesserts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String cake="You don't choose cake";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }
    public void orderCake(View view){
        switch (view.getId()){
            case R.id.donut:
                Toast.makeText(this, R.string.donut_order_message, Toast.LENGTH_SHORT).show();
                cake = getString(R.string.donut_order_message);
            case R.id.froyo:
                Toast.makeText(this, R.string.froyo_order_message, Toast.LENGTH_SHORT).show();
                cake = getString(R.string.froyo_order_message);
            case R.id.ice_cream:
                Toast.makeText(this, R.string.ice_cream_order_message, Toast.LENGTH_SHORT).show();
                cake = getString(R.string.ice_cream_order_message);
            default:

        }
    }

    public void ClickCart(View view) {
        Intent i =new Intent(getApplicationContext(),OrderActivity.class);
        i.putExtra("cake",cake);
        startActivity(i);
    }
}

//echo "# Droid-Cafe-Desserts" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/SonHoang1002/Droid-Cafe-Desserts.git
//git push -u origin main