package android.example.recyclerview;

import static android.example.recyclerview.R.id.imageview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Timer;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;

    public Adapter(List<ModelClass> userList) {
        this.userList = userList;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.designui,parent,false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        //always try to give diff name here from model class to avoid confusion
        int imgres = userList.get(position).getImageview();
        String title =userList.get(position).getTexttitle();
        String timet = userList.get(position).getTime();
        String mess= userList.get(position).getMessage();
        String div = userList.get(position).getDivider();

        holder.setData(imgres,title,timet,mess,div);


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // here can use same name of model class  or not no prblm
        private ImageView imageview;
        private TextView texttitle;
        private TextView time;
        private  TextView message;
        private  TextView divider;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

      imageview = itemView.findViewById(R.id.imageview);
      texttitle = itemView.findViewById(R.id.texttitle);
      time = itemView.findViewById(R.id.time);
      message = itemView.findViewById(R.id.message);
      divider = itemView.findViewById(R.id.divider);

        }

        public void setData(int imgres, String title, String timet, String mess, String div) {

            imageview.setImageResource(imgres);
            texttitle.setText(title);
            time.setText(timet);
            message.setText(mess);
            divider.setText(div);

        }
    }
}
