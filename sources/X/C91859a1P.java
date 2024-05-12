package X;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.o;

/* renamed from: X.a1P, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91859a1P extends WebViewClient {
    public final /* synthetic */ InterfaceC35811ar<Boolean> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<String, Boolean> LIZIZ;
    public final /* synthetic */ C68322mC<String> LIZJ;
    public final /* synthetic */ InterfaceC88472Yns<WebView, C76800UCe> LIZLLL;

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.LIZ.setValue(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        android.net.Uri url;
        android.net.Uri uri = null;
        if (webResourceRequest == null) {
            url = null;
        } else {
            url = webResourceRequest.getUrl();
        }
        o.LJIILLIIL(url, "webview redirect url: ");
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        }
        String valueOf = String.valueOf(uri);
        if (valueOf.length() == 0) {
            return false;
        }
        return this.LIZIZ.invoke(valueOf).booleanValue();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.LIZ.setValue(Boolean.FALSE);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        android.net.Uri url;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest == null) {
            url = null;
        } else {
            url = webResourceRequest.getUrl();
        }
        if (o.LJ(String.valueOf(url), this.LIZJ.element)) {
            this.LIZLLL.invoke(webView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C91859a1P(InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC88472Yns<? super String, Boolean> interfaceC88472Yns, C68322mC<String> c68322mC, InterfaceC88472Yns<? super WebView, C76800UCe> interfaceC88472Yns2) {
        this.LIZ = interfaceC35811ar;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = c68322mC;
        this.LIZLLL = interfaceC88472Yns2;
    }
}
