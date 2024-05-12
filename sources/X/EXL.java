package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EXL extends C59862NeU {
    public EXL() {
        super(9);
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String url) {
        o.LJIIIZ(url, "url");
        EPI.LIZ(url);
        return super.shouldOverrideUrlLoading(webView, url);
    }
}
