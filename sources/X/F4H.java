package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F4H extends C39586FgE {
    public final F4U LJLJLJ;

    public F4H(F49 f49) {
        super(7);
        this.LJLJLJ = f49;
    }

    @Override // X.C39586FgE
    public final void LJIIJ(String str) {
        F4U f4u = this.LJLJLJ;
        WebView webView = this.LJLJJI;
        o.LJIIIIZZ(webView, "webView");
        f4u.LIZLLL(webView, str);
        super.LJIIJ(str);
    }

    @Override // X.C39586FgE
    public final void LJIIJJI(String str, java.util.Map<String, String> map) {
        F4U f4u = this.LJLJLJ;
        WebView webView = this.LJLJJI;
        o.LJIIIIZZ(webView, "webView");
        f4u.LIZLLL(webView, str);
        super.LJIIJJI(str, map);
    }
}
