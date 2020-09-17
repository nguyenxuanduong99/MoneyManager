package com.uet.moneymanager.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.uet.moneymanager.R;
import com.uet.moneymanager.database.DatabaseAccess;


public class StatisticFragment extends Fragment implements BottomSheetFragment.BottomSheetListener {
    TextView tvStartDate, tvEndDate, tvMoneyBegin, tvMoneyEnd;
    private PieChart pieChart;
    private long monthTotalIncoming;
    private long monthTotalOutGoing;
    SwipeRefreshLayout swipeRefreshLayout;
    ImageView btnShowModal;
    DatabaseAccess databaseAccess;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_statistic, container, false);
        findView(view);
        databaseAccess = new DatabaseAccess(getActivity());
        return view;
    }
    public void findView(View view){
        pieChart = view.findViewById(R.id.pieChart1);

        swipeRefreshLayout = view.findViewById(R.id.srlReporting);

        btnShowModal = view.findViewById(R.id.btnShowModal);

        tvStartDate = view.findViewById(R.id.tvReportStartDate);
        tvEndDate = view.findViewById(R.id.tvReportEndDate);
        tvMoneyBegin = view.findViewById(R.id.tvMoneyInTheBegin);
        tvMoneyEnd = view.findViewById(R.id.tvMoneyInTheEnd);
    }

    @Override
    public void onItemClickListener(String postion) {

    }
}