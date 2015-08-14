package com.busantoseoul.busan.adapter;

import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.busantoseoul.busan.R;
import com.busantoseoul.busan.model.Board;

import java.util.List;

/**
 * Created by NAVER on 2015-08-14.
 */
public class BoardAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater = null;
    private List<Board> mBoardList;
    private int mLayout;

    public BoardAdapter(Context context, int layout, List<Board> boardList) {
        mContext = context;
        mInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        mBoardList = boardList;
        mLayout = layout;
    }

    @Override
    public int getCount() {
        return mBoardList.size();
    }

    @Override
    public Board getItem(int position) {
        return mBoardList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(this.mLayout, parent, false);
        }

        TextView title = (TextView) convertView.findViewById(R.id.titleText);
        title.setText(mBoardList.get(position).getTitle());

        return convertView;
    }
}
