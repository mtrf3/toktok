package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import X.AnonymousClass028;
import X.C03880Dg;
import X.C221108m2;
import X.C36910EeA;
import X.C39519Ff9;
import X.C40706FyI;
import X.C58655N0h;
import X.C58704N2e;
import X.C59273NOb;
import X.C62822Ol8;
import X.C64797Pbt;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78983UzD;
import X.E8L;
import X.EJ6;
import X.EKC;
import X.InterfaceC195747mE;
import X.InterfaceC30952CCu;
import X.InterfaceC37276Ek4;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ujb.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class CWebViewInterceptor {
    public static String LIZ;
    public static String LIZIZ;
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C40706FyI.LJLIL);

    /* loaded from: classes7.dex */
    public interface Api {
        @E8L
        @EKC({"x-tt-dataflow-id: 671088642"})
        InterfaceC37276Ek4<String> getResponse(@InterfaceC195747mE String str, @InterfaceC30952CCu Map<String, String> map);
    }

    public static String LIZ(CookieManager cookieManager, String str) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "-818595778491056896"));
        return LIZJ2.LIZ ? (String) LIZJ2.LIZIZ : cookieManager.getCookie(str);
    }

    public static String LIZIZ(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String LIZJ2 = AnonymousClass028.LIZJ("getDefault()", str, "this as java.lang.String).toLowerCase(locale)");
        if (s.LJJJLZIJ(LIZJ2, "js", false) || s.LJJJLZIJ(LIZJ2, "application/javascript", false) || s.LJJJLZIJ(LIZJ2, "javascript", false)) {
            return "application/x-javascript";
        }
        if (o.LJJJJ(LIZJ2, "text/css", false) || o.LJJJJ(LIZJ2, "css", false)) {
            return "text/css";
        }
        if (s.LJJJLZIJ(LIZJ2, "text/html", false) || s.LJJJLZIJ(LIZJ2, "html", false)) {
            return "text/html";
        }
        if (s.LJJJLZIJ(LIZJ2, "image", false)) {
            int LJJLIIIJL = s.LJJLIIIJL(LIZJ2, ";", 0, false, 6);
            if (LJJLIIIJL >= 0) {
                LIZJ2 = LIZJ2.substring(0, LJJLIIIJL);
                kotlin.jvm.internal.o.LJIIIIZZ(LIZJ2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
        } else {
            if (s.LJJJLZIJ(LIZJ2, "jpeg", false) || s.LJJJLZIJ(LIZJ2, "jpg", false)) {
                return "image/jpeg";
            }
            if (s.LJJJLZIJ(LIZJ2, "png", false)) {
                return "image/png";
            }
            if (s.LJJJLZIJ(LIZJ2, "gif", false)) {
                return "image/gif";
            }
            if (s.LJJJLZIJ(LIZJ2, "woff", false)) {
                return "font/woff";
            }
            if (s.LJJJLZIJ(LIZJ2, "svg", false)) {
                return "image/svg+xml";
            }
            if (s.LJJJLZIJ(LIZJ2, ".ttf", false)) {
                return "font/ttf";
            }
            int LJJLIIIJL2 = s.LJJLIIIJL(LIZJ2, ";", 0, false, 6);
            if (LJJLIIIJL2 >= 0) {
                LIZJ2 = LIZJ2.substring(0, LJJLIIIJL2);
                kotlin.jvm.internal.o.LJIIIIZZ(LIZJ2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
        }
        return LIZJ2;
    }

    public static final void LIZLLL(C59273NOb c59273NOb) {
        LIZIZ = LIZ;
        C58655N0h LJ = C58704N2e.LJ("landing_ad", "adx_ad_load_success", String.valueOf(c59273NOb.LIZ), c59273NOb.LJIIIIZZ, null);
        LJ.LIZIZ(LIZ, "web_url");
        LJ.LJI();
    }

    public static WebResourceResponse LIZJ(WebResourceRequest request, C59273NOb c59273NOb) {
        boolean z;
        C76800UCe c76800UCe;
        kotlin.jvm.internal.o.LJIIIZ(request, "request");
        WebResourceResponse webResourceResponse = null;
        if (request.getUrl() == null) {
            return null;
        }
        String uri = request.getUrl().toString();
        kotlin.jvm.internal.o.LJIIIIZZ(uri, "request.url.toString()");
        if (!s.LJJJLZIJ(uri, "https://securepubads.g.doubleclick.net/gampad/ads", false)) {
            return null;
        }
        boolean z2 = true;
        try {
            try {
                SettingsManager.LIZLLL().getClass();
                z = SettingsManager.LIZ("modify_xrw", true);
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                z = true;
            }
            if (!z) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, String> requestHeaders = request.getRequestHeaders();
            kotlin.jvm.internal.o.LJIIIIZZ(requestHeaders, "requestHeaders");
            String str = null;
            for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                if (kotlin.jvm.internal.o.LJ(entry.getKey(), "origin")) {
                    str = entry.getValue();
                }
                String key = entry.getKey();
                kotlin.jvm.internal.o.LJIIIIZZ(key, "requestHeader.key");
                String value = entry.getValue();
                kotlin.jvm.internal.o.LJIIIIZZ(value, "requestHeader.value");
                linkedHashMap.put(key, value);
            }
            String LIZ2 = LIZ(CookieManager.getInstance(), uri);
            if (LIZ2 != null) {
                if (LIZ2.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    linkedHashMap.put("cookie", LIZ2);
                }
            }
            C64797Pbt<String> execute = ((Api) LIZJ.getValue()).getResponse(o.LJJJJZ(s.LJZI(uri).toString(), "https://securepubads.g.doubleclick.net/", "", false), linkedHashMap).execute();
            if (!execute.LIZIZ()) {
                return null;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            List<EJ6> list = execute.LIZ.LIZLLL;
            kotlin.jvm.internal.o.LJIIIIZZ(list, "response.headers()");
            for (EJ6 ej6 : list) {
                String str2 = ej6.LIZ;
                kotlin.jvm.internal.o.LJIIIIZZ(str2, "it.name");
                String str3 = ej6.LIZIZ;
                kotlin.jvm.internal.o.LJIIIIZZ(str3, "it.value");
                linkedHashMap2.put(str2, str3);
            }
            String LIZIZ2 = LIZIZ((String) linkedHashMap2.get("content-type"));
            String str4 = (String) linkedHashMap2.get("content-encoding");
            if (str4 == null) {
                str4 = "utf-8";
            }
            C36910EeA c36910EeA = execute.LIZ;
            kotlin.jvm.internal.o.LJI(c36910EeA);
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(LIZIZ2, str4, c36910EeA.LJ.in());
            String str5 = str;
            if (str5 != null) {
                linkedHashMap2.put("Access-Control-Allow-Credentials", "true");
                linkedHashMap2.put("Access-Control-Allow-Origin", str5);
            }
            String str6 = LIZ;
            if (str6 != null) {
                String str7 = LIZIZ;
                if (str7 != null) {
                    if (!kotlin.jvm.internal.o.LJ(str7, str6)) {
                        LIZLLL(c59273NOb);
                    }
                    c76800UCe = C76800UCe.LIZ;
                } else {
                    c76800UCe = null;
                }
                if (c76800UCe == null) {
                    LIZLLL(c59273NOb);
                }
            }
            webResourceResponse2.setResponseHeaders(linkedHashMap2);
            webResourceResponse = webResourceResponse2;
            return webResourceResponse;
        } catch (Exception unused) {
            return webResourceResponse;
        }
    }
}
