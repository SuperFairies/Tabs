package androighive.informed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class TabFragment3 extends Fragment {
    private List<News> newsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private NewsAdapter mAdapter;
    private TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_3, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        return view;


    }

    @Override
    public void onResume() {
        super.onResume();
        prepareNewsData();
        NewsAdapter mAdapter = new NewsAdapter(newsList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

    }



    private void prepareNewsData() {

;

        News news1 = new News("Древній Китай ", "Китайська цивілізація - одна із древніх, " +
                "яка існує в сучасному світі." +
                " Багато віків цією державою првили різні династії - сім'ї правителів, " +
                "всередені яких влада передавалась спадково." +
                "Перша силина держава утворилась,про яку відому, утворилась на берегах Жовтої ріки " +
                "приблизно 1500 р до н.е." +
                "Нею правили королі із династії Шан.  ");
        newsList.add(news1);

        News news2 = new News("Що таке піксель?", "Вперше слово піксель ми почули у 1965р" +
                " в одній із лабораторій " +
                "реактивного руху космічних апаратів.Його використав Фредерік Біллінгсом, а точніше " +
                "в цей час конкретного слова <піксель> не було, а було <пікс>, " +
                "яке використовували в якості абревіатури. Піксель є маленькою деталлю, або точкою" +
                " на екранах наших телефонів, планшетів і т.д. Пікселі бувають кольоровими,чорно-білими, та навіть прозорими." +
                " їх колір залежиться від зображення, а саме , чим більше пікселей тим краща якість. ");
        newsList.add(news2);

        News news3 = new News("Великий Андронний Колайдер", "ВАК - прискорювач заряджених частинок," +
                " призначений для розаняння протонів та іонів." +
                "Колайдер побудований в ЦЕРНе, який знаходиться біля Жиневи, на кордоні Франції та Швейцарії. " +
                "Вак є найбільшою експерементальною установкою в світі");
        newsList.add(news3);


    }
}

