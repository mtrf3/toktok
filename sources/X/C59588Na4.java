package X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* renamed from: X.Na4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59588Na4 extends C59589Na5 {
    @Override // X.C59589Na5, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        FX8.LIZIZ(str);
    }

    @Override // X.C59589Na5, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C36922EeM.LJ("onRenderProcessGone");
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    @Override // X.C59589Na5, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        FX8.LIZIZ(str);
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
