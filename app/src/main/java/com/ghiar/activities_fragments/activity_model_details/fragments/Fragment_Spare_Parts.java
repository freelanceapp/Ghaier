package com.ghiar.activities_fragments.activity_model_details.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.ghiar.R;
import com.ghiar.activities_fragments.activity_home.HomeActivity;
import com.ghiar.activities_fragments.activity_home.fragments.Fragment_Home;
import com.ghiar.activities_fragments.activity_model_details.ModelDetailsActivity;
import com.ghiar.databinding.FragmentHomeBinding;
import com.ghiar.databinding.FragmentSpareAccessoriesBinding;
import com.ghiar.models.UserModel;
import com.ghiar.preferences.Preferences;

import io.paperdb.Paper;

public class Fragment_Spare_Parts  extends Fragment {

    private ModelDetailsActivity activity;
    private FragmentSpareAccessoriesBinding binding;
    private Preferences preferences;
    private UserModel.User userModel;
    private String lang;


    public static Fragment_Spare_Parts newInstance() {

        return new Fragment_Spare_Parts();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_spare_accessories, container, false);
        initView();
        return binding.getRoot();
    }

    private void initView() {
        activity = (ModelDetailsActivity) getActivity();
        preferences = Preferences.getInstance();
        Paper.init(activity);
        lang = Paper.book().read("lang","ar");
        userModel = preferences.getUserData(activity);
        binding.setLang(lang);
    }











}

