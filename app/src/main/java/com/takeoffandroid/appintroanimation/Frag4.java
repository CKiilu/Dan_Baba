package com.takeoffandroid.appintroanimation;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardGridArrayAdapter;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.internal.CardThumbnail;
import it.gmariotti.cardslib.library.recyclerview.internal.BaseRecyclerViewAdapter;
import it.gmariotti.cardslib.library.recyclerview.internal.CardArrayRecyclerViewAdapter;
import it.gmariotti.cardslib.library.recyclerview.view.CardRecyclerView;
import it.gmariotti.cardslib.library.view.CardGridView;
import it.gmariotti.cardslib.library.view.CardViewNative;

/**
 * Created by chris on 3/15/16.
 */
public class Frag4 extends Fragment {
    private CardRecyclerView recyclerView;
    private MyAdapter myAdapter;

    public static List<MyFrag4Data> getData(){
        List<MyFrag4Data> data = new ArrayList<>();
        int[] images = {R.drawable.shopping, R.drawable.socialnetwork, R.drawable.offers, R.drawable.mobile};
        String[] titles = {"Shopping", "social", "Offers", "Mobile"};
        for(int x = 0; x < images.length && x < titles.length; x++){
            MyFrag4Data current = new MyFrag4Data();
            current.img = images[x];
            current.title = titles[x];

            data.add(current);
        }
        return data;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.f4, container, false);
        recyclerView = (CardRecyclerView) layout.findViewById(R.id.recycler);
        myAdapter = new MyAdapter(getActivity(), getData());
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return layout;


//        // Arraylist containing cards
//        ArrayList<Card> cards = new ArrayList<>();
//        // First card
//        Card card = new Card(getActivity());
//        // First card's header
//        CardHeader cardHeader = new CardHeader(getActivity());
//        CardThumbnail thumbnail = new CardThumbnail(getActivity());
//        thumbnail.setDrawableResource(R.drawable.shopping);
//        // First card's title and header set
//        cardHeader.setTitle("One");
//        card.setTitle("I see you!");
//        card.addCardHeader(cardHeader);
//        card.addCardThumbnail(thumbnail);
//        card.setCardElevation(3);
//        card.setShadow(true);
//        // Add card to Arraylist
//        cards.add(card);
//
//
//        // First card
//        Card card2 = new Card(getActivity());
//        // First card's header
//        CardHeader cardHeader2 = new CardHeader(getActivity());
//        CardThumbnail thumbnail2 = new CardThumbnail(getActivity());
//        thumbnail2.setDrawableResource(R.drawable.shopping);
//        // First card's title and header set
//        cardHeader2.setTitle("Two");
//        card2.setTitle("You see me!");
//        card2.addCardHeader(cardHeader2);
//        card2.setCardElevation(3);
//        card.addCardThumbnail(thumbnail2);
//        card2.setShadow(true);
//        // Add card to Arraylist
//        cards.add(card2);
//
//
//
//
//
//        CardArrayRecyclerViewAdapter recyclerViewAdapter = new CardArrayRecyclerViewAdapter(getActivity(), cards);
////        // Staggered grid view
//        CardRecyclerView cardRecyclerView = new CardRecyclerView(getActivity());
//        cardRecyclerView.setHasFixedSize(false);
//        cardRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//
//        // Set view
//        if (cardRecyclerView != null){
//            cardRecyclerView.setAdapter(recyclerViewAdapter);
//        }
//        return cardRecyclerView;

    }
}
