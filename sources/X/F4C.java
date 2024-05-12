package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F4C implements K10 {
    public final /* synthetic */ WebView LIZ;
    public final /* synthetic */ WebResourceRequest LIZIZ;

    @Override // X.K10
    public final java.util.Map<String, String> getRequestHeaders() {
        java.util.Map<String, String> requestHeaders = this.LIZIZ.getRequestHeaders();
        o.LJFF(requestHeaders, "request.requestHeaders");
        return requestHeaders;
    }

    @Override // X.K10
    public final android.net.Uri getUrl() {
        android.net.Uri url = this.LIZIZ.getUrl();
        o.LJFF(url, "request.url");
        return url;
    }

    @Override // X.K10
    public final boolean isForMainFrame() {
        return this.LIZIZ.isForMainFrame();
    }

    @Override // X.K10
    public final WebView LIZ() {
        return this.LIZ;
    }

    public F4C(WebView webView, WebResourceRequest webResourceRequest) {
        this.LIZ = webView;
        this.LIZIZ = webResourceRequest;
    }
}
