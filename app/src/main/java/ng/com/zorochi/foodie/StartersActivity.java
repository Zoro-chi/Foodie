package ng.com.zorochi.foodie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);



        Dish[] dishes = {
                new Dish("Mushroom and tofu maki", "Mushy and nice", 999),
                new Dish("Egg and Avacado", "Pasta egg sauce", 1999),
                new Dish("Hamburger", "Cheese hamburger", 1000),
                new Dish("Pizza", "Pepperoni Pizza", 2000),
                new Dish("Yam and Egg", "Boiled yam and egg", 600),
                new Dish("Pounded yam", "poundo with egusi", 3000)

        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);

    }


}