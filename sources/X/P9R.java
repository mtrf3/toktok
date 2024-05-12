package X;

import android.text.TextUtils;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes12.dex */
public final class P9R implements PA0 {
    public static final String[] LIZ = {"GET", "POST"};

    public static URLConnection LIZLLL(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "4949500361624404324"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public static URLConnection LIZJ(java.net.URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return LIZLLL(url);
        }
        PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
        PPD ppd = LJFF.LJFF;
        if (ppd == PPD.INTERCEPT && (uRLConnection = LJFF.LIZIZ) != null) {
            URLConnection uRLConnection2 = uRLConnection;
            if (uRLConnection2 instanceof HttpsURLConnection) {
                pyu2 = new PYT((HttpsURLConnection) uRLConnection2);
            } else {
                if (!(uRLConnection2 instanceof HttpURLConnection)) {
                    return uRLConnection2;
                }
                pyu2 = new PYU((HttpURLConnection) uRLConnection2);
            }
            return pyu2;
        }
        if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
            URLConnection LIZLLL = LIZLLL(url);
            if (LIZLLL instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) LIZLLL);
            } else {
                if (!(LIZLLL instanceof HttpURLConnection)) {
                    return LIZLLL;
                }
                pyu = new PYU((HttpURLConnection) LIZLLL);
            }
            return pyu;
        }
        throw runtimeException;
    }

    @Override // X.PA0
    public final String LIZIZ(String str, byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty("application/json; charset=utf-8")) {
            hashMap.put("Content-Type", "application/json; charset=utf-8");
        }
        return post(str, hashMap, bArr);
    }

    @Override // X.PA0
    public final String get(String str, java.util.Map<String, String> map) {
        return LJ(0, str, (HashMap) map, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #0 {all -> 0x00e2, blocks: (B:48:0x00ce, B:51:0x00df, B:52:0x00e1), top: B:47:0x00ce }] */
    @Override // X.PA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] LIZ(java.lang.String r10, java.util.Map r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9R.LIZ(java.lang.String, java.util.Map, byte[]):byte[]");
    }

    @Override // X.PA0
    public final String post(String str, java.util.Map map, byte[] bArr) {
        return LJ(1, str, (HashMap) map, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126 A[Catch: all -> 0x0129, TRY_ENTER, TryCatch #5 {all -> 0x0129, blocks: (B:64:0x0117, B:73:0x0126, B:74:0x0128), top: B:63:0x0117 }] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(int r10, java.lang.String r11, java.util.HashMap<java.lang.String, java.lang.String> r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9R.LJ(int, java.lang.String, java.util.HashMap, byte[]):java.lang.String");
    }
}
