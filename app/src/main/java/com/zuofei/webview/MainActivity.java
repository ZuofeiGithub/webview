package com.zuofei.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView mWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebview = findViewById(R.id.web_view_id);
        mWebview.setWebViewClient(new WebViewClient()); //在本应用中打开网页
        mWebview.loadUrl("http://www.baidu.com"); //加载web网页
        WebSettings webSettings = mWebview.getSettings();

        //设置缩放
        webSettings.setSupportZoom(false);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setDisplayZoomControls(false);

        //网页中的js可用
        webSettings.setJavaScriptEnabled(true);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == event.KEYCODE_BACK){
            if(mWebview.canGoBack()){
                mWebview.goBack();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
