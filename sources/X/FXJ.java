package X;

import android.webkit.CookieManager;

/* loaded from: classes7.dex */
public final class FXJ {
    public static String LIZ(CookieManager cookieManager, String str) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "8151516234247497289"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : cookieManager.getCookie(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (com.bytedance.ies.abmock.SettingsManager.LIZ("http_cookie_error", true) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r5) {
        /*
            r2 = 1
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> L10
            java.lang.String r0 = "http_cookie_error"
            r1.getClass()     // Catch: java.lang.Exception -> L10
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r2)     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L1e
        L10:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r5.toLowerCase(r0)
            java.lang.String r0 = "https"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L7d
        L1e:
            android.webkit.CookieManager r1 = android.webkit.CookieManager.getInstance()
            java.lang.String r0 = com.ss.android.common.util.NetworkUtils.getShareCookieHost()
            java.lang.String r1 = LIZ(r1, r0)
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            r0.setAcceptCookie(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7c
            java.lang.String r0 = "; "
            java.lang.String[] r4 = r1.split(r0)
            int r3 = r4.length
            r2 = 0
        L3f:
            if (r2 >= r3) goto L7c
            r1 = r4[r2]
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            r0.setCookie(r5, r1)
            com.ss.android.ugc.aweme.app.host.AwemeHostApplication r0 = X.FKM.LIZ()
            boolean r0 = X.FCD.LJI(r0)
            if (r0 == 0) goto L79
            boolean r0 = X.FXL.LIZIZ()
            if (r0 == 0) goto L79
            android.webkit.CookieManager r1 = android.webkit.CookieManager.getInstance()
            java.lang.String r0 = X.C39099FWd.LIZIZ()
            java.lang.String r1 = LIZ(r1, r0)
            if (r1 == 0) goto L79
            java.lang.String r0 = X.C39099FWd.LIZ()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L79
            java.lang.String r0 = X.C39099FWd.LIZIZ()
            X.C39099FWd.LIZJ(r0, r1)
        L79:
            int r2 = r2 + 1
            goto L3f
        L7c:
            return
        L7d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cookie url must be https"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FXJ.LIZIZ(java.lang.String):void");
    }
}
