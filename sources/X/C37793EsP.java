package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.EsP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37793EsP extends C39586FgE {
    public C37793EsP() {
        super(7);
    }

    @Override // X.C39586FgE
    public final void LJIIJ(String str) {
        if (C37794EsQ.LIZJ(str)) {
            WebView webView = this.LJLJJI;
            o.LJIIIIZZ(webView, "webView");
            if (str == null) {
                str = "";
            }
            C37804Esa.LIZLLL(webView, str);
            str = C37804Esa.LIZ(this.LJLJJI);
        }
        super.LJIIJ(str);
    }

    @Override // X.C39586FgE
    public final void LJIIJJI(String str, java.util.Map<String, String> map) {
        if (C37794EsQ.LIZJ(str)) {
            WebView webView = this.LJLJJI;
            o.LJIIIIZZ(webView, "webView");
            if (str == null) {
                str = "";
            }
            C37804Esa.LIZLLL(webView, str);
            str = C37804Esa.LIZ(this.LJLJJI);
        }
        super.LJIIJJI(str, map);
    }
}
