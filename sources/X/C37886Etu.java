package X;

import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ujb.o;

/* renamed from: X.Etu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37886Etu {
    public static final ConcurrentHashMap<WebView, ConcurrentHashMap<String, C37888Etw>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<WebView, Boolean> LIZIZ = new ConcurrentHashMap<>();

    public static boolean LIZLLL(String str) {
        Iterator<String> it = C37905EuD.LJIILJJIL.iterator();
        while (it.hasNext()) {
            if (o.LJJJLIIL(str, it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static String LIZ(WebView webview, String token) {
        C37888Etw c37888Etw;
        kotlin.jvm.internal.o.LJIIJ(token, "token");
        kotlin.jvm.internal.o.LJIIJ(webview, "webview");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getWebViewRealUrl with token = ");
        LIZ2.append(token);
        LIZ2.append(", webview = ");
        LIZ2.append(webview);
        C37887Etv.LIZ("WebViewTokenManager", X1D.LIZIZ(LIZ2));
        ConcurrentHashMap<String, C37888Etw> concurrentHashMap = LIZ.get(webview);
        if (concurrentHashMap != null && (c37888Etw = concurrentHashMap.get(token)) != null) {
            return c37888Etw.LIZ;
        }
        return null;
    }

    public static boolean LIZIZ(WebView webview, String url) {
        Matcher matcher;
        kotlin.jvm.internal.o.LJIIJ(url, "url");
        kotlin.jvm.internal.o.LJIIJ(webview, "webview");
        android.net.Uri parse = UriProtector.parse(url);
        kotlin.jvm.internal.o.LJFF(parse, "Uri.parse(url)");
        String host = parse.getHost();
        if (host == null) {
            return false;
        }
        Iterator<String> it = C37876Etk.LIZIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                String next = it.next();
                if (kotlin.jvm.internal.o.LJ(host, next)) {
                    break;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('.');
                LIZ2.append(next);
                if (o.LJJJJ(host, X1D.LIZIZ(LIZ2), false)) {
                    break;
                }
            } else {
                Iterator<Map.Entry<String, C37874Eti>> it2 = C37876Etk.LIZ.entrySet().iterator();
                while (it2.hasNext()) {
                    C37874Eti value = it2.next().getValue();
                    value.getClass();
                    String host2 = C37874Eti.LIZ(parse.getHost());
                    String uri = parse.toString();
                    kotlin.jvm.internal.o.LJFF(uri, "uri.toString()");
                    if (host2 != null && host2.length() != 0) {
                        kotlin.jvm.internal.o.LJIIJ(host2, "host");
                        List list = (List) ((LinkedHashMap) value.LIZ).get(host2);
                        if (list != null) {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                Pattern pattern = ((C37878Etm) it3.next()).LJLIL;
                                if (pattern == null || (matcher = pattern.matcher(uri)) == null || !matcher.find()) {
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean LIZJ(C37960Ev6 authReportModel, String currentWebUrl, WebView webview) {
        kotlin.jvm.internal.o.LJIIJ(authReportModel, "authReportModel");
        kotlin.jvm.internal.o.LJIIJ(currentWebUrl, "currentWebUrl");
        kotlin.jvm.internal.o.LJIIJ(webview, "webview");
        Boolean bool = Boolean.TRUE;
        authReportModel.LIZLLL = bool;
        if (LIZLLL(currentWebUrl)) {
            authReportModel.LJIIL = "isNoTokenPass";
        }
        if (C37905EuD.LJIIL) {
            authReportModel.LJIIL = kotlin.jvm.internal.o.LJIILLIIL("|noTokenUseUrl", authReportModel.LJIIL);
        }
        ConcurrentHashMap<WebView, Boolean> concurrentHashMap = LIZIZ;
        if (kotlin.jvm.internal.o.LJ(concurrentHashMap.get(webview), bool)) {
            authReportModel.LJIIL = kotlin.jvm.internal.o.LJIILLIIL("|webviewWasMarked", authReportModel.LJIIL);
            authReportModel.LJIILIIL = "wasMarked";
        } else {
            authReportModel.LJIILIIL = "noMarked";
        }
        String str = authReportModel.LJIIL;
        if (str != null) {
            authReportModel.LIZJ = bool;
            C37887Etv.LIZ("WebViewTokenManager", str);
        }
        if (LIZLLL(currentWebUrl) || C37905EuD.LJIIL || kotlin.jvm.internal.o.LJ(concurrentHashMap.get(webview), bool)) {
            return true;
        }
        return false;
    }
}
