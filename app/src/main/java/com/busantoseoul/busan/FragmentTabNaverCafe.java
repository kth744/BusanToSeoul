package com.busantoseoul.busan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FragmentTabNaverCafe extends Fragment {

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment Fragment2.
     */
    public static FragmentTabNaverCafe newInstance() {
        return new FragmentTabNaverCafe();
    }

    public FragmentTabNaverCafe() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_navercafe, container, false);
    }

    WebView mWebView;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mWebView = (WebView) getActivity().findViewById(R.id.webView);
        mWebView.setWebViewClient(new WebClient()); // 응용프로그램에서 직접 url 처리

        String str = "안드로이드 한글 로딩";
        mWebView.loadData(str, "text/html", "UTF-8"); // Android 4.0 이하 버전
        mWebView.loadData(str, "text/html; charset=UTF-8", null); // Android 4.1 이상 버전

        WebSettings set = mWebView.getSettings();
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(false);

        mWebView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK) {
                    if (KeyEvent.ACTION_UP == event.getAction()) {
                        if (mWebView.canGoBack()) {
                            mWebView.goBack();
                        } else {
                            getActivity().finish();
                        }
                    }
                    return true;
                } else {
                    return false;
                }
            }
        });

        mWebView.loadUrl("http://m.cafe.naver.com/busantoseoul");
    }

    private class WebClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

}