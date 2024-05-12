package X;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class P9O implements Runnable {
    public final java.net.URL LJLIL;
    public final /* synthetic */ C67277Qan LJLILLLLZI;
    public final OFW LJLJI;

    public static URLConnection LIZJ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-8261907262454631681"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008b, code lost:
    
        if (r7 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007a, code lost:
    
        if (r7 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r9 = this;
            X.Qan r0 = r9.LJLILLLLZI
            X.Qmz r0 = r0.LIZ
            X.Qau r0 = r0.LIZIZ()
            r0.LJIIIZ()
            r8 = 0
            r6 = 0
            java.net.URL r0 = r9.LJLIL     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L85
            java.net.URLConnection r7 = LIZ(r0)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L85
            boolean r0 = r7 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L85
            if (r0 == 0) goto L6c
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L85
            r7.setDefaultUseCaches(r8)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L85
            r0 = 60000(0xea60, float:8.4078E-41)
            r7.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L85
            r0 = 61000(0xee48, float:8.5479E-41)
            r7.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L85
            r7.setInstanceFollowRedirects(r8)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L85
            r0 = 1
            r7.setDoInput(r0)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L85
            int r5 = r7.getResponseCode()     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L88
            java.util.Map r4 = r7.getHeaderFields()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L60
            r3.<init>()     // Catch: java.lang.Throwable -> L60
            java.io.InputStream r2 = r7.getInputStream()     // Catch: java.lang.Throwable -> L60
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L5c
        L44:
            int r0 = r2.read(r1)     // Catch: java.lang.Throwable -> L5c
            if (r0 <= 0) goto L4e
            r3.write(r1, r8, r0)     // Catch: java.lang.Throwable -> L5c
            goto L44
        L4e:
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L5c
            r2.close()     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L8e
            r7.disconnect()
            r9.LIZLLL(r5, r6, r0, r4)
            return
        L5c:
            r0 = move-exception
            if (r2 == 0) goto L65
            goto L62
        L60:
            r0 = move-exception
            goto L65
        L62:
            r2.close()     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L8e
        L65:
            throw r0     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L8e
        L66:
            r0 = move-exception
            r4 = r6
            goto L7e
        L69:
            r0 = move-exception
            r4 = r6
            goto L8f
        L6c:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L85
            java.lang.String r0 = "Failed to obtain HTTP connection"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L85
            throw r1     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L85
        L74:
            r0 = move-exception
            r7 = r6
            goto L78
        L77:
            r0 = move-exception
        L78:
            r4 = r6
            r5 = 0
            if (r7 == 0) goto L81
            goto L7e
        L7d:
            r0 = move-exception
        L7e:
            r7.disconnect()
        L81:
            r9.LIZLLL(r5, r6, r6, r4)
            throw r0
        L85:
            r0 = move-exception
            r7 = r6
            goto L89
        L88:
            r0 = move-exception
        L89:
            r4 = r6
            r5 = 0
            if (r7 == 0) goto L92
            goto L8f
        L8e:
            r0 = move-exception
        L8f:
            r7.disconnect()
        L92:
            r9.LIZLLL(r5, r0, r6, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9O.LIZIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static URLConnection LIZ(java.net.URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return LIZJ(url);
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
            URLConnection LIZJ = LIZJ(url);
            if (LIZJ instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) LIZJ);
            } else {
                if (!(LIZJ instanceof HttpURLConnection)) {
                    return LIZJ;
                }
                pyu = new PYU((HttpURLConnection) LIZJ);
            }
            return pyu;
        }
        throw runtimeException;
    }

    public P9O(C67277Qan c67277Qan, String str, java.net.URL url, OFW ofw) {
        this.LJLILLLLZI = c67277Qan;
        QH7.LJI(str);
        this.LJLIL = url;
        this.LJLJI = ofw;
    }

    public final void LIZLLL(final int i, final Exception exc, final byte[] bArr, final java.util.Map map) {
        this.LJLILLLLZI.LIZ.LIZIZ().LJIILIIL(new Runnable() { // from class: X.QYn
            public final void LIZ() {
                List LJFF;
                P9O p9o = P9O.this;
                int i2 = i;
                Exception exc2 = exc;
                byte[] bArr2 = bArr;
                C68033Qmz c68033Qmz = (C68033Qmz) p9o.LJLJI.LIZ;
                c68033Qmz.getClass();
                if (i2 != 200 && i2 != 204) {
                    if (i2 == 304) {
                        i2 = 304;
                    }
                    c68033Qmz.LIZJ().LJIIIIZZ.LIZJ(Integer.valueOf(i2), exc2, "Network Request for Deferred Deep Link failed. response, exception");
                }
                if (exc2 == null) {
                    c68033Qmz.LJIILLIIL().LJIILLIIL.LIZ(true);
                    if (bArr2 == null || bArr2.length == 0) {
                        c68033Qmz.LIZJ().LJIIL.LIZ("Deferred Deep Link response empty.");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr2));
                        String optString = jSONObject.optString("deeplink", "");
                        String optString2 = jSONObject.optString("gclid", "");
                        double optDouble = jSONObject.optDouble("timestamp", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                        if (TextUtils.isEmpty(optString)) {
                            c68033Qmz.LIZJ().LJIIL.LIZ("Deferred Deep Link is empty.");
                        } else {
                            C68083Qnn LJIL = c68033Qmz.LJIL();
                            if (TextUtils.isEmpty(optString) || (LJFF = C68033Qmz.LJFF(LJIL.LIZ.LIZ.getPackageManager(), new Intent("android.intent.action.VIEW", UriProtector.parse(optString)))) == null || LJFF.isEmpty()) {
                                c68033Qmz.LIZJ().LJIIIIZZ.LIZJ(optString2, optString, "Deferred Deep Link validation failed. gclid, deep link");
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putString("gclid", optString2);
                                bundle.putString("_cis", "ddp");
                                c68033Qmz.LJIILL.LJIIL("auto", "_cmp", bundle);
                                C68083Qnn LJIL2 = c68033Qmz.LJIL();
                                if (!TextUtils.isEmpty(optString)) {
                                    try {
                                        SharedPreferences.Editor edit = F9J.LIZIZ(LJIL2.LIZ.LIZ, 0, "google.analytics.deferred.deeplink.prefs").edit();
                                        edit.putString("deeplink", optString);
                                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                        if (edit.commit()) {
                                            LJIL2.LIZ.LIZ.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                        }
                                    } catch (RuntimeException e) {
                                        LJIL2.LIZ.LIZJ().LJFF.LIZIZ(e, "Failed to persist Deferred Deep Link. exception");
                                    }
                                }
                            }
                        }
                        return;
                    } catch (JSONException e2) {
                        c68033Qmz.LIZJ().LJFF.LIZIZ(e2, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                c68033Qmz.LIZJ().LJIIIIZZ.LIZJ(Integer.valueOf(i2), exc2, "Network Request for Deferred Deep Link failed. response, exception");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
