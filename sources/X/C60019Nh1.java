package X;

import android.webkit.WebView;

/* renamed from: X.Nh1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60019Nh1 extends AbstractC60015Ngx {
    public C60019Nh1(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.LIZ = new C60022Nh4(webView);
    }
}
