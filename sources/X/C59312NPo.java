package X;

import android.webkit.WebView;
import com.ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.NPo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59312NPo implements InterfaceC37042EgI {
    public static final C59312NPo LIZ = new C59312NPo();

    public static boolean LIZIZ(WebView webView) {
        o.LJIIIZ(webView, "webView");
        return SecLinkServiceImpl.LIZ().LJII(webView);
    }

    public static boolean LJ(WebView webView) {
        o.LJIIIZ(webView, "webView");
        return SecLinkServiceImpl.LIZ().LJ(webView);
    }

    public static boolean LJFF(WebView webView, String str) {
        o.LJIIIZ(webView, "webView");
        Boolean LJIIIIZZ = SecLinkServiceImpl.LIZ().LJIIIIZZ(webView, str);
        if (LJIIIIZZ != null) {
            return LJIIIIZZ.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC37042EgI
    public final String LIZLLL(WebView webView, String str) {
        o.LJIIIZ(webView, "webView");
        return SecLinkServiceImpl.LIZ().LIZLLL(webView, str);
    }
}
