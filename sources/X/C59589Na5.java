package X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: X.Na5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59589Na5 extends WebViewClient {
    public C38049EwX LJLIL;

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        C38049EwX c38049EwX = this.LJLIL;
        if (c38049EwX != null) {
            c38049EwX.LIZIZ(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C38049EwX c38049EwX;
        if (C59312NPo.LJFF(webView, str) || ((c38049EwX = this.LJLIL) != null && c38049EwX.LIZJ(str))) {
            return true;
        }
        return false;
    }
}
