package X;

import Y.ARunnableS1S2100000_6;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.TTHYBRIDXHR;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.WebViewInterceptReport;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Esa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37804Esa {
    public static String LIZ(WebView webView) {
        if (webView == null) {
            return null;
        }
        return (String) ((LinkedHashMap) TTHYBRIDXHR.LJ).get(Integer.valueOf(webView.hashCode()));
    }

    public static EnumC37807Esd LIZIZ(WebView webView) {
        o.LJIIIZ(webView, "webView");
        TTHYBRIDXHR LIZJ = LIZJ(webView);
        if (LIZJ != null) {
            return LIZJ.LIZLLL;
        }
        return null;
    }

    public static TTHYBRIDXHR LIZJ(WebView webView) {
        o.LJIIIZ(webView, "webView");
        TTHYBRIDXHR tthybridxhr = null;
        try {
            Object tag = webView.getTag(R.id.ni7);
            if (tag == null || !(tag instanceof TTHYBRIDXHR)) {
                return null;
            }
            tthybridxhr = (TTHYBRIDXHR) tag;
            return tthybridxhr;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            C3C5.m10exceptionOrNullimpl(LIZ);
            return tthybridxhr;
        }
    }

    public static boolean LJ(WebView webView) {
        o.LJIIIZ(webView, "webView");
        TTHYBRIDXHR LIZJ = LIZJ(webView);
        if (LIZJ != null) {
            return LIZJ.LIZJ;
        }
        return false;
    }

    public static void LIZLLL(WebView webView, String str) {
        if (LIZJ(webView) == null) {
            TTHYBRIDXHR tthybridxhr = new TTHYBRIDXHR(webView);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.addJavascriptInterface(tthybridxhr, "__TTHYBRIDXHR");
            webView.addJavascriptInterface(new WebViewInterceptReport(webView), "WIReport");
            webView.setTag(R.id.ni7, tthybridxhr);
        }
        if (C37794EsQ.LIZJ(str)) {
            LJFF(webView, str, "load_url");
            if (LIZIZ(webView) == EnumC37807Esd.PLANB) {
                System.currentTimeMillis();
                try {
                    C37819Esp ttUrlDispatch = TTNetInit.ttUrlDispatch(str);
                    TextUtils.isEmpty(ttUrlDispatch.LIZ);
                    String str2 = ttUrlDispatch.LIZ;
                    o.LJIIIIZZ(str2, "result.finalUrl");
                    str = str2;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            TTHYBRIDXHR.LJ.put(Integer.valueOf(webView.hashCode()), str);
        }
    }

    public static void LJFF(WebView webView, String url, String str) {
        C37806Esc c37806Esc;
        Boolean bool;
        EnumC37807Esd enumC37807Esd;
        o.LJIIIZ(webView, "webView");
        o.LJIIIZ(url, "url");
        FC2.LIZ.getClass();
        boolean z = false;
        EnumC37807Esd enumC37807Esd2 = null;
        if (((Boolean) FC2.LJFF.getValue()).booleanValue()) {
            if (C37805Esb.LIZIZ(url)) {
                c37806Esc = new C37806Esc(EnumC37807Esd.PLANB);
            }
            c37806Esc = null;
        } else if (C37805Esb.LIZIZ(url)) {
            c37806Esc = new C37806Esc(EnumC37807Esd.TTNET);
        } else {
            if (C37805Esb.LIZ(url)) {
                android.net.Uri parse = UriProtector.parse(url);
                String host = parse.getHost();
                if (host == null) {
                    host = "";
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(host);
                LIZ.append(parse.getPath());
                String LIZIZ = X1D.LIZIZ(LIZ);
                Iterator it = ((List) FC2.LIZLLL.getValue()).iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    if (ujb.o.LJJJLIIL(LIZIZ, (String) it.next(), false)) {
                        z2 = true;
                    }
                }
                if (z2) {
                    FC2.LIZ.getClass();
                    Iterator it2 = ((List) FC2.LIZJ.getValue()).iterator();
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (ujb.o.LJJJJ(host, (String) it2.next(), false)) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        FC2.LIZ.getClass();
                        Iterator it3 = ((List) FC2.LJI.getValue()).iterator();
                        while (it3.hasNext()) {
                            if (s.LJJJLZIJ(url, (String) it3.next(), false)) {
                                c37806Esc = new C37806Esc(EnumC37807Esd.PLANB);
                                break;
                            }
                        }
                    }
                }
            }
            c37806Esc = null;
        }
        TTHYBRIDXHR LIZJ = LIZJ(webView);
        if (LIZJ != null) {
            if (c37806Esc != null) {
                z = c37806Esc.LIZ;
            }
            LIZJ.LIZJ = z;
            if (c37806Esc != null) {
                enumC37807Esd = c37806Esc.LIZIZ;
            } else {
                enumC37807Esd = null;
            }
            LIZJ.LIZLLL = enumC37807Esd;
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("reset status, ", url, "; shouldHook = ");
        TTHYBRIDXHR LIZJ2 = LIZJ(webView);
        if (LIZJ2 != null) {
            bool = Boolean.valueOf(LIZJ2.LIZJ);
        } else {
            bool = null;
        }
        LIZIZ2.append(bool);
        LIZIZ2.append("; ttyType = ");
        TTHYBRIDXHR LIZJ3 = LIZJ(webView);
        if (LIZJ3 != null) {
            enumC37807Esd2 = LIZJ3.LIZLLL;
        }
        LIZIZ2.append(enumC37807Esd2);
        LIZIZ2.append(';');
        X1D.LIZIZ(LIZIZ2);
        webView.post(new ARunnableS1S2100000_6(webView, url, str, 1));
    }
}
