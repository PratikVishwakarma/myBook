package pratik.com.mybook.mybook.modal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import pratik.com.mybook.mybook.R;

/**
 * Created by prati on 26-Feb-17.
 */

public class FamilyAdapter extends ArrayAdapter<Family> {

    public List<Family> familyList;
    View currentView;
    Family family;

    public FamilyAdapter(Context context, int resource, List<Family> objects) {
        super(context, resource, objects);
        this.familyList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        currentView = convertView;

        currentView = LayoutInflater.from(getContext()).inflate(R.layout.family_list_item, parent, false);

        family = familyList.get(position);

        TextView family_list_item_name, family_list_item_age, family_list_item_address;
        ImageView family_list_item_image;

        family_list_item_name = (TextView) currentView.findViewById(R.id.family_list_item_name);
        family_list_item_address = (TextView) currentView.findViewById(R.id.family_list_item_address);
        family_list_item_age = (TextView) currentView.findViewById(R.id.family_list_item_age);
        family_list_item_image = (ImageView) currentView.findViewById(R.id.family_list_item_image);

        family_list_item_name.setText(family.getName());
        family_list_item_address.setText(family.getAddress());
        family_list_item_age.setText(family.getAge()+"");
        family_list_item_image.setImageResource(family.getImage());
        return currentView;
    }
}
