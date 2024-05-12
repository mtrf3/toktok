package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.EgH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37041EgH implements InterfaceC37042EgI, InterfaceC37043EgJ, InterfaceC37044EgK {
    @Override // X.InterfaceC37042EgI
    public String LIZLLL(WebView webView, String str) {
        o.LJIIIZ(webView, "webView");
        if (LIZJ() == null) {
            return str;
        }
        InterfaceC37044EgK LIZJ = LIZJ();
        o.LJII(LIZJ, "null cannot be cast to non-null type com.ss.android.ugc.tiktok.security.processor.ILoadURLProcessor");
        String LIZLLL = ((InterfaceC37042EgI) LIZJ).LIZLLL(webView, str);
        if (LIZLLL == null) {
            return str;
        }
        return LIZLLL;
    }
}
