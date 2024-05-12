package X;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: X.Nnh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC60433Nnh {
    void LIZ(WebView webView, String str);

    void LIZIZ(WebView webView, String str);

    void LJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void LJFF(WebView webView, int i, String str, String str2);

    void LJI(WebView webView);

    boolean LJII(WebView webView, String str, WebResourceRequest webResourceRequest, Boolean bool);

    void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest);
}
