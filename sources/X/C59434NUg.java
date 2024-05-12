package X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.o;

/* renamed from: X.NUg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59434NUg extends WebViewClient {
    public NJM LIZ = null;

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C59161NJt.LJFF = System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        String str2;
        NJM njm;
        WebResourceResponse LIZ;
        if (webResourceRequest != null) {
            str = webResourceRequest.getMethod();
        } else {
            str = null;
        }
        if (!o.LJ(str, "GET")) {
            return null;
        }
        android.net.Uri url = webResourceRequest.getUrl();
        if (url != null) {
            str2 = url.toString();
        } else {
            str2 = null;
        }
        if ((!URLUtil.isHttpUrl(str2) && !URLUtil.isHttpsUrl(str2)) || (njm = this.LIZ) == null || (LIZ = njm.LIZ(str2)) == null) {
            return null;
        }
        return LIZ;
    }
}
