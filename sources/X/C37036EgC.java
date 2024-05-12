package X;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.tiktok.security.settings.WebViewHttpsGuardSettings;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.EgC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37036EgC extends AbstractC37041EgH {
    @Override // X.InterfaceC37044EgK
    public final InterfaceC37044EgK LIZJ() {
        return null;
    }

    public static boolean LIZIZ(Context context, String str) {
        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
        if (localTestApi == null || !localTestApi.enableWebHttps()) {
            return false;
        }
        android.net.Uri parse = UriProtector.parse(str);
        if (!o.LJ(parse.getScheme(), "http")) {
            return false;
        }
        Iterator it = ((ArrayList) C64734Pas.LJIIIZ(context).LJIIJ()).iterator();
        while (it.hasNext()) {
            String host = (String) it.next();
            String host2 = parse.getHost();
            o.LJIIIIZZ(host, "host");
            if (LJ(host2, host)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJ(String str, String str2) {
        if (o.LJ(str, str2)) {
            return true;
        }
        if (str != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('.');
            LIZ.append(str2);
            if (ujb.o.LJJJJ(str, X1D.LIZIZ(LIZ), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:11:0x0026, B:13:0x002c, B:16:0x0034, B:20:0x003d, B:23:0x0051, B:26:0x005b, B:27:0x006a, B:29:0x0077, B:30:0x0082, B:32:0x008e, B:35:0x0096, B:36:0x009a, B:38:0x00a0, B:42:0x00cd, B:45:0x00d8, B:49:0x00b2, B:51:0x00b9, B:52:0x00c8), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:11:0x0026, B:13:0x002c, B:16:0x0034, B:20:0x003d, B:23:0x0051, B:26:0x005b, B:27:0x006a, B:29:0x0077, B:30:0x0082, B:32:0x008e, B:35:0x0096, B:36:0x009a, B:38:0x00a0, B:42:0x00cd, B:45:0x00d8, B:49:0x00b2, B:51:0x00b9, B:52:0x00c8), top: B:10:0x0026 }] */
    @Override // X.InterfaceC37043EgJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ LIZ(X.VNS r13, java.lang.String r14) {
        /*
            r12 = this;
            com.bytedance.ies.security.settings.LynxSecSettings$LynxSecConfig r0 = com.bytedance.ies.security.settings.LynxSecSettings.LIZ()
            boolean r0 = r0.enable
            if (r0 == 0) goto L1e
            X.Eh5 r0 = X.C37090Eh4.LIZ
            com.ss.android.ugc.aweme.local_test.LocalTestApi r0 = r0.LIZ
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L1e
            boolean r0 = r0.enableLynxSec()
            if (r0 != r3) goto L1e
            if (r14 == 0) goto L1e
            boolean r0 = ujb.o.LJJJJJL(r14)
            if (r0 == 0) goto L26
        L1e:
            X.OSZ r1 = new X.OSZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.<init>(r14, r0)
            return r1
        L26:
            android.net.Uri r11 = com.bytedance.mt.protector.impl.UriProtector.parse(r14)     // Catch: java.lang.Throwable -> Le0
            if (r11 == 0) goto Le0
            java.lang.String r0 = r11.getScheme()     // Catch: java.lang.Throwable -> Le0
            java.lang.String r2 = "http"
            if (r0 == 0) goto Le0
            boolean r0 = ujb.o.LJJJLIIL(r0, r2, r4)     // Catch: java.lang.Throwable -> Le0
            if (r0 != r3) goto Le0
            r7 = 0
            if (r3 == 0) goto Le0
            X.EAu r9 = X.C35995EAt.LIZ(r11)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = r11.getScheme()     // Catch: java.lang.Throwable -> Le0
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r8 = "query"
            java.lang.String r6 = "path"
            java.lang.String r10 = "url"
            if (r0 == 0) goto L59
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le0
            r1.<init>()     // Catch: java.lang.Throwable -> Le0
            if (r9 == 0) goto L6a
            goto L5b
        L59:
            r2 = r14
            goto L82
        L5b:
            java.lang.String r0 = r9.LIZ     // Catch: java.lang.Throwable -> Le0
            r1.put(r10, r0)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> Le0
            r1.put(r6, r0)     // Catch: java.lang.Throwable -> Le0
            java.util.Set<java.lang.String> r0 = r9.LIZJ     // Catch: java.lang.Throwable -> Le0
            r1.put(r8, r0)     // Catch: java.lang.Throwable -> Le0
        L6a:
            java.lang.String r0 = "lynx_sec_force_https"
            X.C09900aA.LJI(r0, r1, r7, r7)     // Catch: java.lang.Throwable -> Le0
            com.bytedance.ies.security.settings.LynxSecSettings$LynxSecConfig r0 = com.bytedance.ies.security.settings.LynxSecSettings.LIZ()     // Catch: java.lang.Throwable -> Le0
            boolean r0 = r0.forceHttps     // Catch: java.lang.Throwable -> Le0
            if (r0 == 0) goto L59
            X.OJD r1 = new X.OJD     // Catch: java.lang.Throwable -> Le0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = "https"
            java.lang.String r2 = r1.replaceFirst(r14, r0)     // Catch: java.lang.Throwable -> Le0
        L82:
            com.bytedance.ies.security.settings.LynxSecSettings$LynxSecConfig r0 = com.bytedance.ies.security.settings.LynxSecSettings.LIZ()     // Catch: java.lang.Throwable -> Le0
            java.util.List<java.lang.String> r1 = r0.whiteList     // Catch: java.lang.Throwable -> Le0
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> Le0
            if (r0 == 0) goto L96
            X.OSZ r1 = new X.OSZ     // Catch: java.lang.Throwable -> Le0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le0
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Le0
            return r1
        L96:
            java.util.Iterator r5 = r1.iterator()     // Catch: java.lang.Throwable -> Le0
        L9a:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> Le0
            if (r0 == 0) goto Lb2
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> Le0
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = r11.getHost()     // Catch: java.lang.Throwable -> Le0
            boolean r0 = LJ(r0, r1)     // Catch: java.lang.Throwable -> Le0
            if (r0 == 0) goto L9a
            r4 = 1
            goto Lcd
        Lb2:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le0
            r1.<init>()     // Catch: java.lang.Throwable -> Le0
            if (r9 == 0) goto Lc8
            java.lang.String r0 = r9.LIZ     // Catch: java.lang.Throwable -> Le0
            r1.put(r10, r0)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> Le0
            r1.put(r6, r0)     // Catch: java.lang.Throwable -> Le0
            java.util.Set<java.lang.String> r0 = r9.LIZJ     // Catch: java.lang.Throwable -> Le0
            r1.put(r8, r0)     // Catch: java.lang.Throwable -> Le0
        Lc8:
            java.lang.String r0 = "lynx_sec_url_not_white"
            X.C09900aA.LJI(r0, r1, r7, r7)     // Catch: java.lang.Throwable -> Le0
        Lcd:
            X.OSZ r1 = new X.OSZ     // Catch: java.lang.Throwable -> Le0
            com.bytedance.ies.security.settings.LynxSecSettings$LynxSecConfig r0 = com.bytedance.ies.security.settings.LynxSecSettings.LIZ()     // Catch: java.lang.Throwable -> Le0
            boolean r0 = r0.intercept     // Catch: java.lang.Throwable -> Le0
            if (r0 == 0) goto Ld8
            r3 = r4
        Ld8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> Le0
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Le0
            return r1
        Le0:
            X.OSZ r1 = new X.OSZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.<init>(r14, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37036EgC.LIZ(X.VNS, java.lang.String):X.OSZ");
    }

    @Override // X.AbstractC37041EgH, X.InterfaceC37042EgI
    public final String LIZLLL(WebView webView, String str) {
        WebViewHttpsGuardSettings.HttpsGuardConfig httpsGuardConfig;
        String str2;
        o.LJIIIZ(webView, "webView");
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            httpsGuardConfig = WebViewHttpsGuardSettings.LIZ;
            WebViewHttpsGuardSettings.HttpsGuardConfig httpsGuardConfig2 = (WebViewHttpsGuardSettings.HttpsGuardConfig) LIZLLL.LJIIIIZZ("webview_loadurl_force_https", WebViewHttpsGuardSettings.HttpsGuardConfig.class, httpsGuardConfig);
            if (httpsGuardConfig2 != null) {
                httpsGuardConfig = httpsGuardConfig2;
            }
        } catch (Throwable unused) {
            httpsGuardConfig = WebViewHttpsGuardSettings.LIZ;
        }
        if (httpsGuardConfig.enable) {
            try {
                if (LIZIZ(webView.getContext(), str)) {
                    C35996EAu LIZIZ = C35995EAt.LIZIZ(str);
                    if (LIZIZ == null || (str2 = LIZIZ.LIZ()) == null) {
                        str2 = "";
                    }
                    C37023Efz.LIZ(new C37024Eg0(10005, str2, ""));
                    if (str != null) {
                        str = new OJD("http").replaceFirst(str, "https");
                    } else {
                        str = null;
                    }
                }
            } catch (Exception unused2) {
            }
            return super.LIZLLL(webView, str);
        }
        return super.LIZLLL(webView, str);
    }
}
