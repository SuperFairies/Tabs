package androighive.informed;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {

private TabFragment3 tabFragment3;
private List<News> newsList;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView title, text;

    public View itemView;


    public MyViewHolder(View view) {
        super(view);
        itemView = view;
        title = (TextView) view.findViewById(R.id.title);
        text = (TextView) view.findViewById(R.id.text);

    }
}


    public NewsAdapter(List<News> newsList, TabFragment3 tabFragment3) {
        this.newsList = newsList;
        this.tabFragment3 = tabFragment3;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        News news = newsList.get(position);
        holder.title.setText(news.getTitle());
        holder.text.setText(news.getText());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                NewsFragment1 newsFragment1 = new NewsFragment1();
                FragmentManager fragmentManager = tabFragment3.getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.title1, newsFragment1);
                fragmentTransaction.commit();
            }
        });



}

    @Override
    public int getItemCount() {
        return newsList.size();
    }
}
