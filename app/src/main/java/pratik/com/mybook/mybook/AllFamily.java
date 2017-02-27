package pratik.com.mybook.mybook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import pratik.com.mybook.mybook.modal.FamilyAdapter;
import pratik.com.mybook.mybook.modal.Family;

public class AllFamily extends AppCompatActivity {

    ListView listView;
    ArrayList<Family> familyList = new ArrayList();
    FamilyAdapter familyAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_family);

        listView = (ListView) findViewById(R.id.listView_all_family);

        Family family;
        family = new Family("Minnie", 20 ,"Minnie's Address", R.drawable.friends_minnie);
        familyList.add(family);
        family = new Family("Goofy", 19 ,"Goofy's Address", R.drawable.friends_goofy);
        familyList.add(family);
        family = new Family("Donald Duck", 20 ,"Donald's Address", R.drawable.friends_donaldduck);
        familyList.add(family);
        family = new Family("Daisy Duck", 20 ,"Daisy's Address", R.drawable.friends_duck);
        familyList.add(family);
        family = new Family("Pikachu", 20 ,"Pikachu's Address", R.drawable.friends_pikachu);
        familyList.add(family);
        family = new Family("Minnie", 20 ,"Minnie's Address", R.drawable.face_micky_mouse);
        familyList.add(family);

        familyAdapter = new FamilyAdapter(this, R.layout.family_list_item, familyList);
        listView.setAdapter(familyAdapter);
        familyAdapter.notifyDataSetChanged();
    }
}
