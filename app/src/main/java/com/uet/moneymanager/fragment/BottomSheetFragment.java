package com.uet.moneymanager.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.uet.moneymanager.R;


public class BottomSheetFragment extends BottomSheetDialogFragment {

    private BottomSheetListener mlistener;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false);
        TextView btnThisMonth = view.findViewById(R.id.btnThisMonth);
        btnThisMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mlistener.onItemClickListener("1");
                dismiss();
            }
        });
        TextView btnPrevMonth = view.findViewById(R.id.btnPrevMonth);
        btnPrevMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mlistener.onItemClickListener("2");
                dismiss();
            }
        });
        TextView btnCustomized = view.findViewById(R.id.btnCustomized);
        btnCustomized.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mlistener.onItemClickListener("3");
                dismiss();
            }
        });
        return view;
    }

    public interface BottomSheetListener {
        void onItemClickListener(String postion);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }
}