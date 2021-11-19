package com.example.catbti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseAdapter {

    ArrayList<RegisterContent> lists = new ArrayList<>();

    //public ListAdapter(List<Answer> data) {this.mData = data;}

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context c = parent.getContext();
        if(convertView == null){
            LayoutInflater li = (LayoutInflater) c.getSystemService((Context.LAYOUT_INFLATER_SERVICE);
            convertView = li.inflate(R.layout.boardlist, parent, false);
        }
        TextView boardText = convertView.findViewById(R.id.board_tv);

        RegisterContent l = lists.get(position);

        boardText.setText(l.getTitle());

        return convertView;
    }

    public void addList(String boardText){
        RegisterContent l = new RegisterContent();
        l.setTitle(boardText);
    }

}