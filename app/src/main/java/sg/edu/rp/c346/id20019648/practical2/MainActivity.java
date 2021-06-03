package sg.edu.rp.c346.id20019648.practical2;
// Tan FangYi 20019648

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    ImageButton ibPhotography, ibSinging, ibCycling, ibCollection, ibBadminton, ibHandicraft;
    TextView tvPhotography, tvSinging, tvCycling, tvCollection, tvBadminton, tvHandicraft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibPhotography = findViewById(R.id.ibPhotography);
        ibCollection = findViewById(R.id.ibCollection);
        ibCycling = findViewById(R.id.ibCycling);
        ibBadminton = findViewById(R.id.ibBadminton);
        ibHandicraft = findViewById(R.id.ibHandicraft);
        ibSinging = findViewById(R.id.ibSinging);

        ibPhotography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, activity_photography.class);
                String name = "Photography";
                String description = "Photography is hobby that can be done by all ages. The skills can be learnt online or through tuition or workshops. Photography allows people to capture moments of their life that they want to keep.";

                i.putExtra(name, description);
                startActivity(i);
            }
        });

        ibCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, activity_collection.class);
                String name = "Collection";
                String description = "Collection is a hobby that can be done by all ages. It can made into memory to commemorate things such as your childhood. For the older peopl, the items collected can be like a trip down memory lane for them.";

                i.putExtra(name, description);
                startActivity(i);
            }
        });

        ibCycling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, activity_cycling.class);
                String name = "Cycling";
                String description = "Cycling is a hobby that brings you health benefits such as fat burning and you can relax. You can feel the wind go pass you s you are cycling and you can in turn feel calm.";
                i.putExtra(name, description);
                startActivity(i);
            }
        });

        ibBadminton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, activity_badminton.class);
                String name = "Badminton";
                String description = "Badminton beings you health benefits such as fat burning and enhances your agility. You are required to movev around and you can get to socialize with other people.";
                i.putExtra(name, description);
                startActivity(i);
            }
        });

        ibHandicraft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, activity_handicraft.class);
                String name = "Handicraft";
                String description = "Handicraft is a hobby that can help to improve your patience and is helpful in keeping you calm and spend time.";
                i.putExtra(name, description);
                startActivity(i);
            }
        });

        ibSinging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, activity_singing.class);
                String name = "Singing";
                String description = "Singing can help you to relax and destress because you can immerse yourself into the world of music. You can vent your emotions through music and get to relax eventually.";
                i.putExtra(name, description);
                startActivity(i);
            }
        });
    }
}