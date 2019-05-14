package com.zuofei.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView m_webview = findViewById(R.id.web_view_id);
        m_webview.loadUrl("http://www.baidu.com"); //加载web网页
        m_webview.setWebViewClient(new WebViewClient()); //在本应用中打开网页
    }
}
