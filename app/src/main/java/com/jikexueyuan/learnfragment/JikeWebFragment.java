package com.jikexueyuan.learnfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class JikeWebFragment extends Fragment {


    public JikeWebFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_jike_web, container, false);

        WebView wv = (WebView) rootView.findViewById(R.id.wv);
        wv.loadUrl("http://www.jikexueyuan.com");

        return rootView;
    }

}
