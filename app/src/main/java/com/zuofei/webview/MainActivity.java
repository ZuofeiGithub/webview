package com.zuofei.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView mWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebview = findViewById(R.id.web_view_id);
        mWebview.loadUrl("http://www.baidu.com"); //加载web网页
        mWebview.setWebViewClient(new WebViewClient()); //在本应用中打开网页
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
