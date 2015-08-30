package com.busantoseoul.busan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.busantoseoul.busan.adapter.BoardAdapter;
import com.busantoseoul.busan.model.Board;

import java.util.ArrayList;
import java.util.List;

public class FragmentTabBoard extends Fragment {

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment Fragment2.
     */
    public static FragmentTabBoard newInstance() {
        return new FragmentTabBoard();
    }

    public FragmentTabBoard() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_board, container, false);
    }

    private List<Board> boardList = new ArrayList<>();

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        for (int i = 0; i < 20; i++) {
            Board board = new Board();
            board.setTitle("제목" + i + "입니다.");

            boardList.add(board);
        }

        BoardAdapter adapter = new BoardAdapter(getActivity(), R.layout.tab_board_item, boardList);

        ListView listView = (ListView) getActivity().findViewById(R.id.listView);
        listView.setAdapter(adapter);

        /*
        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 액티비티 전환
//                Intent intent = new Intent(getActivity(), FragmentTabBoardRead.class);
//                intent.putExtra("text", String.valueOf(editText.getText())); // 파라메터 전달
//                startActivity(intent);

                // 프래그먼트 전환
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction fragmentTransaction = fm.beginTransaction();
//                fragmentTransaction.replace(R.id.tab_board_read, new FragmentTabBoardRead());
//                fragmentTransaction.commit();
            }
        });
        */
    }
}