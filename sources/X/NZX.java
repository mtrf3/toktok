package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* loaded from: classes11.dex */
public interface NZX {
    void LIZ(WebView webView, String str);

    void LJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void LJFF(WebView webView, int i, String str, String str2);

    void LJIIL(WebView webView, String str, Bitmap bitmap);

    void LJIILIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    boolean LJIILJJIL(WebView webView, String str, WebResourceRequest webResourceRequest, boolean z);

    void onPageCommitVisible(WebView webView, String str);

    void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);
}
