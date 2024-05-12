package X;

import android.webkit.CookieManager;
import com.bytedance.retrofit2.client.Request;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FCn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38589FCn {
    public static final C5H3<C38589FCn> LIZIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C38592FCq.LJLIL);
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    public static String LIZ(CookieManager cookieManager, String str) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "2259264297375291217"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : cookieManager.getCookie(str);
    }

    public static void LIZIZ(Request request) {
        String str;
        try {
            List<EJ6> headers = request.getHeaders();
            EJ6 ej6 = null;
            if (headers != null) {
                ej6 = (EJ6) OJ4.LJJJIL(OJ4.LJJJJ(ORZ.LJLIIIL(headers), C38590FCo.LJLIL));
            }
            C198517qh c198517qh = new C198517qh();
            String path = request.getPath();
            String str2 = "";
            if (path == null) {
                path = "";
            }
            c198517qh.LIZ.put("URL", path);
            c198517qh.LIZ.put("errorCode", 8);
            if (ej6 != null && (str = ej6.LIZIZ) != null) {
                str2 = str;
            }
            c198517qh.LIZ.put("x-tt-logid", str2);
            JSONObject eventJson = c198517qh.LJ();
            o.LJIIIIZZ(eventJson, "eventJson");
            Q13.LIZIZ("request_force_logout_log", 0, eventJson);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (ujb.s.LJJJLZIJ(r1, "sessionid", false) == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[Catch: Exception -> 0x00c4, TryCatch #0 {Exception -> 0x00c4, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x0016, B:7:0x001e, B:9:0x0024, B:13:0x003b, B:19:0x0054, B:21:0x006e, B:23:0x007c, B:26:0x009e, B:28:0x00ab, B:29:0x00b3), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab A[Catch: Exception -> 0x00c4, TryCatch #0 {Exception -> 0x00c4, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x0016, B:7:0x001e, B:9:0x0024, B:13:0x003b, B:19:0x0054, B:21:0x006e, B:23:0x007c, B:26:0x009e, B:28:0x00ab, B:29:0x00b3), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.bytedance.retrofit2.client.Request r7) {
        /*
            java.lang.String r0 = r7.getUrl()     // Catch: java.lang.Exception -> Lc4
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Lc4
            if (r0 != 0) goto Lc8
            java.lang.String r0 = r7.getUrl()     // Catch: java.lang.Exception -> Lc4
            java.util.Map r6 = X.C66952QPk.LIZ(r0)     // Catch: java.lang.Exception -> Lc4
            r4 = 0
            r3 = 1
            if (r6 == 0) goto L3a
            java.util.Set r0 = r6.entrySet()     // Catch: java.lang.Exception -> Lc4
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> Lc4
        L1e:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lc4
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> Lc4
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "X-Tt-Token"
            java.lang.Object r0 = r0.getKey()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lc4
            boolean r0 = ujb.o.LJJJJIZL(r1, r0, r3)     // Catch: java.lang.Exception -> Lc4
            if (r0 == 0) goto L1e
            r5 = 1
            goto L3b
        L3a:
            r5 = 0
        L3b:
            java.lang.StringBuilder r2 = X.X1D.LIZ()     // Catch: java.lang.Exception -> Lc4
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = "http_cookie_error"
            r1.getClass()     // Catch: java.lang.Exception -> L52
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r3)     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L4f
            goto L52
        L4f:
            java.lang.String r0 = ""
            goto L54
        L52:
            java.lang.String r0 = "https://"
        L54:
            r2.append(r0)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r0 = "tiktokv.com"
            r2.append(r0)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = X.X1D.LIZIZ(r2)     // Catch: java.lang.Exception -> Lc4
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = LIZ(r0, r1)     // Catch: java.lang.Exception -> Lc4
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lc4
            if (r0 != 0) goto L7b
            java.lang.String r0 = "cookie"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r0 = "sessionid"
            boolean r0 = ujb.s.LJJJLZIJ(r1, r0, r4)     // Catch: java.lang.Exception -> Lc4
            if (r0 != 0) goto L7c
        L7b:
            r4 = 1
        L7c:
            X.7qh r3 = new X.7qh     // Catch: java.lang.Exception -> Lc4
            r3.<init>()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r2 = "path"
            java.lang.String r1 = r7.getPath()     // Catch: java.lang.Exception -> Lc4
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r3.LIZ     // Catch: java.lang.Exception -> Lc4
            r0.put(r2, r1)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r2 = "has_token"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> Lc4
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r3.LIZ     // Catch: java.lang.Exception -> Lc4
            r0.put(r2, r1)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r2 = "empty"
            if (r4 == 0) goto L9d
            r0 = 3
            goto L9e
        L9d:
            r0 = -1
        L9e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lc4
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r3.LIZ     // Catch: java.lang.Exception -> Lc4
            r0.put(r2, r1)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r2 = "size"
            if (r6 == 0) goto Lc2
            int r0 = r6.size()     // Catch: java.lang.Exception -> Lc4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lc4
        Lb3:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r3.LIZ     // Catch: java.lang.Exception -> Lc4
            r0.put(r2, r1)     // Catch: java.lang.Exception -> Lc4
            org.json.JSONObject r1 = r3.LJ()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r0 = "session_expired_dialog_show"
            X.FMX.LJIILJJIL(r0, r1)     // Catch: java.lang.Exception -> Lc4
            goto Lc8
        Lc2:
            r1 = 0
            goto Lb3
        Lc4:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38589FCn.LIZJ(com.bytedance.retrofit2.client.Request):void");
    }
}
