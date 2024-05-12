package X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: X.UuV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78691UuV extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        J8Y j8y = C78688UuS.LJLJI;
        if (j8y != null) {
            j8y.LIZ(webView, renderProcessGoneDetail);
        }
        return true;
    }
}
