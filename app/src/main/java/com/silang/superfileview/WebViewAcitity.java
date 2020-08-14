package com.silang.superfileview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewAcitity extends AppCompatActivity {
    private WebView myWebView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        init();
    }

    public void init(){
        myWebView = (WebView) findViewById(R.id.web_view);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
TLog.d("jambo",url);

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myWebView.loadUrl(url);
    }
}
