package com.example.homework24;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class OnBoardFragmentItem extends Fragment {
    TextView txtTitle,txtDescription;
    ImageView image;



    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";


    private String mTxtTitle;
    private String mTxtDescription;
    private int mImg;

    public OnBoardFragmentItem() {
    
    }


    // TODO: Rename and change types and number of parameters
    public static OnBoardFragmentItem newInstance(String title, String description, int img) {
        OnBoardFragmentItem fragment = new OnBoardFragmentItem();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, title);
        args.putString(ARG_PARAM2, description);
        args.putInt(ARG_PARAM3, img);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mTxtTitle = getArguments().getString(ARG_PARAM1);
            mTxtDescription = getArguments().getString(ARG_PARAM2);
            mImg = getArguments().getInt(ARG_PARAM3);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_on_board_item, container, false);
        txtTitle = view.findViewById(R.id.txt_title);
        txtDescription = view.findViewById(R.id.txt_description);
        image = view.findViewById(R.id.img_view);
        txtTitle.setText(mTxtTitle);
        txtDescription.setText(mTxtDescription);
        image.setImageResource(mImg);
        return view;
    }
}