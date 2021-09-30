package om.onmarkets.pwa.webview;


import android.util.Log;
import android.webkit.JavascriptInterface;

public class MyWebViewClient {

    static class MyJavaScriptInterface {
        @JavascriptInterface
        public void onUrlChange(String url) {
            Log.d("LOG", "current_url: " + url);
        }
    }

}