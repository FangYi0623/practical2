package sg.edu.rp.c346.id20019648.practical2;
// Tan FangYi 20019648

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class activity_collection extends AppCompatActivity {
    TextView tvDescCol, tvColHeader, tvVenueCol, tvUrlCol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        tvColHeader = findViewById(R.id.tvColHeader);
        registerForContextMenu(tvColHeader);

        tvDescCol = findViewById(R.id.tvDescCol);
        registerForContextMenu(tvDescCol);

        tvVenueCol = findViewById(R.id.tvVenueCol);
        registerForContextMenu(tvVenueCol);

        tvUrlCol = findViewById(R.id.tvUrlCol);
        registerForContextMenu(tvUrlCol);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "English");
        menu.add(0, 1, 1, "French");
        menu.add(0, 2, 2, "Website");
        menu.add(0, 3, 3, "Details");

        if (v == tvUrlCol) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://modelartdisplay.com/blogs/blog-posts/the-7-ultimate-reasons-why-we-collect-why-it-s-the-best-hobby-ever"));
            startActivity(intent);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 0) {
            tvDescCol.setText("Collection is a hobby that can be done by all ages. It can made into memory to commemorate things such as your childhood. For the older peopl, the items collected can be like a trip down memory lane for them.");
            return true;

        } else if (item.getItemId() == 1) {
            tvDescCol.setText("La collecte est un passe-temps qui peut être pratiqué par tous les âges. Il peut être transformé en mémoire pour commémorer des choses telles que votre enfance. Pour les personnes plus âgées, les objets collectés peuvent être comme un voyage dans le passé pour eux.");
            return true;

        } else if (item.getItemId() == 2) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://modelartdisplay.com/blogs/blog-posts/the-7-ultimate-reasons-why-we-collect-why-it-s-the-best-hobby-ever"));
            startActivity(intent);
            return true;

        } else if (item.getItemId() == 3) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.littlestepsasia.com/singapore/shop/shops-for-parents/list-of-the-best-flea-markets/"));
            return true;
        }
        return super.onContextItemSelected(item);
    }
}