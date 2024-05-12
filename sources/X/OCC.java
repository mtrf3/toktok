package X;

import Y.ARunnableS29S0200000_10;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.ttnet.TTNetInit;
import java.net.CookieManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OCC extends CookieManager {
    public final android.webkit.CookieManager LIZ;
    public volatile OCG LIZIZ;
    public final Pattern LIZJ = PatternProtector.compile("(?<=Domain=)([^;]*)", 2);
    public final OCF LIZLLL;
    public final ArrayList<String> LJ;

    public static String LIZIZ(android.webkit.CookieManager cookieManager, String str) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "-7273522912298540038"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : cookieManager.getCookie(str);
    }

    public static java.util.Map LIZJ(List list, java.util.Map map) {
        java.util.Map emptyMap = Collections.emptyMap();
        if (map != null) {
            List LIZLLL = LIZLLL("Cookie", map);
            if (LIZLLL == null || LIZLLL.isEmpty()) {
                return Collections.singletonMap("Cookie", list);
            }
            return emptyMap;
        }
        return Collections.singletonMap("Cookie", list);
    }

    public static List LIZLLL(String str, java.util.Map map) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return (List) map.get(str.toLowerCase());
        }
        return list;
    }

    public final boolean LJ(java.net.URI uri, String str) {
        if (uri == null || C38354F3m.LJ(str)) {
            return false;
        }
        try {
            String lowerCase = uri.getHost().toLowerCase();
            String str2 = "";
            Matcher matcher = this.LIZJ.matcher(str);
            if (matcher.find()) {
                str2 = matcher.group().toLowerCase();
            }
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            if (!lowerCase.endsWith(str2)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d8, code lost:
    
        if (r1.size() <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00da, code lost:
    
        r3.put("Cookie", r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.net.CookieManager, java.net.CookieHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map get(java.net.URI r20, java.util.Map r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OCC.get(java.net.URI, java.util.Map):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00fb A[SYNTHETIC] */
    @Override // java.net.CookieManager, java.net.CookieHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void put(java.net.URI r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OCC.put(java.net.URI, java.util.Map):void");
    }

    public static void LIZ(android.webkit.CookieManager cookieManager, String str, String str2) {
        String LIZIZ;
        cookieManager.setCookie(str, str2);
        if (FCD.LJI(FKM.LIZ()) && FXL.LIZIZ() && (LIZIZ = LIZIZ(android.webkit.CookieManager.getInstance(), C39099FWd.LIZIZ())) != null && !TextUtils.equals(LIZIZ, C39099FWd.LIZ())) {
            C39099FWd.LIZJ(C39099FWd.LIZIZ(), LIZIZ);
        }
    }

    public final void LJFF(JSONObject jSONObject, String str, boolean z) {
        if (this.LIZLLL != null && z) {
            try {
                jSONObject.put("return", str);
            } catch (JSONException unused) {
            }
            this.LIZLLL.getClass();
            if (TTNetInit.cookieLogReportEnabled()) {
                TTNetInit.getTTNetDepend().LIZLLL();
            }
        }
    }

    public OCC(Context context, int i, android.webkit.CookieManager cookieManager, ArrayList arrayList, OCE oce) {
        if (i > 0) {
            C38016Ew0.LIZLLL.schedule(new ARunnableS29S0200000_10(context, this, 73), i, TimeUnit.SECONDS);
        } else {
            this.LIZIZ = new OCG(new OJZ(context));
        }
        this.LIZ = cookieManager;
        this.LJ = arrayList;
        this.LIZLLL = oce;
        try {
            new JSONObject().put("init", "success");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (this.LIZLLL != null && TTNetInit.cookieLogReportEnabled()) {
            TTNetInit.getTTNetDepend().LIZLLL();
        }
    }
}
