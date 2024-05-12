package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NJD extends NJH {
    @Override // X.InterfaceC39904FlM
    public final WebResourceResponse LIZIZ(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse LIZ;
        if (webResourceRequest != null) {
            String uri = webResourceRequest.getUrl().toString();
            o.LJIIIIZZ(uri, "webRequest.url.toString()");
            OIB oib = this.LIZIZ;
            if (oib != null) {
                synchronized (oib) {
                    LIZ = oib.LIZ(webView, uri);
                }
                return LIZ;
            }
        }
        return null;
    }
}
