package X;

import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QH8 {
    public static final List<String> LIZLLL = Collections.singletonList("Api");
    public static final String[] LJ = {"GET", "POST"};
    public JSONObject LIZ;
    public final QI3 LIZIZ;
    public final QDS LIZJ;

    public static URLConnection LIZIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "4285356575524298824"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public QH8(QI3 qi3) {
        this.LIZIZ = qi3;
        this.LIZJ = new QDS(qi3);
    }

    public static URLConnection LIZ(java.net.URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return LIZIZ(url);
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
            URLConnection LIZIZ = LIZIZ(url);
            if (LIZIZ instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) LIZIZ);
            } else {
                if (!(LIZIZ instanceof HttpURLConnection)) {
                    return LIZIZ;
                }
                pyu = new PYU((HttpURLConnection) LIZIZ);
            }
            return pyu;
        }
        throw runtimeException;
    }

    public final void LJIIJJI(JSONObject jSONObject) {
        try {
            long optLong = jSONObject.optLong("server_time");
            if (optLong > 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("server_time", optLong);
                jSONObject2.put("local_time", System.currentTimeMillis() / 1000);
                this.LIZ = jSONObject2;
                QI0.LIZIZ("server_time_sync", new QB1(this, jSONObject2));
            }
        } catch (Exception unused) {
        }
    }

    public static String LJ(String str, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        android.net.Uri parse = UriProtector.parse(str);
        HashMap hashMap = new HashMap(strArr.length);
        for (String str2 : strArr) {
            String queryParameter = UriProtector.getQueryParameter(parse, str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                hashMap.put(str2, queryParameter);
            }
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (String str3 : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str3, (String) hashMap.get(str3));
        }
        return buildUpon.build().toString();
    }

    public final JSONObject LIZJ(String str, JSONObject jSONObject) {
        String str2;
        JSONObject jSONObject2;
        HashMap LJFF = LJFF(-1, null, false);
        String uuid = UUID.randomUUID().toString();
        LJIIIZ(str, uuid, jSONObject, 1, LJFF);
        try {
            str2 = this.LIZIZ.LJFF().post(this.LIZJ.LIZJ(str), LJFF, this.LIZJ.LJI(jSONObject.toString()));
        } catch (Throwable th) {
            this.LIZIZ.LIZLLL.LJ(QIQ.register, QIK.f_net);
            this.LIZIZ.LJJIZ.LIZJ(11, "Send event to et failed", th, new Object[0]);
            str2 = null;
        }
        if (str2 != null) {
            try {
                jSONObject2 = new JSONObject(str2);
            } catch (Throwable th2) {
                th = th2;
                jSONObject2 = null;
            }
            try {
                LJIIJJI(jSONObject2);
                LJIIIIZZ(200, uuid, null, jSONObject2.toString().getBytes("UTF-8"));
            } catch (Throwable th3) {
                th = th3;
                this.LIZIZ.LJJIZ.LIZJ(11, "Parse et response failed", th, new Object[0]);
                LJIIIIZZ(-1, uuid, "Parse et response failed", null);
                return jSONObject2;
            }
            return jSONObject2;
        }
        this.LIZIZ.LIZLLL.LJ(QIQ.register, QIK.f_resp_error);
        this.LIZIZ.LJJIZ.LIZLLL(11, null, "Et response invalid", new Object[0]);
        LJIIIIZZ(-1, uuid, "Empty et response", null);
        return null;
    }

    public final void LIZLLL(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        try {
            if (z) {
                this.LIZIZ.getClass();
                if (this.LIZIZ.LJJ) {
                    jSONObject.put("event_sampling", 1);
                    QI3 qi3 = this.LIZIZ;
                    QHQ qhq = null;
                    if (qi3.LJIILIIL != null && qi3.LJIILIIL.LJZI != null && (optJSONObject = jSONObject.optJSONObject("header")) != null) {
                        QI3 qi32 = this.LIZIZ;
                        if (qi32.LJIILIIL != null) {
                            qhq = qi32.LJIILIIL.LJZI;
                        }
                        optJSONObject.put("event_sampling_version", qhq.LIZ.LIZ);
                        jSONObject.put("header", optJSONObject);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.LIZIZ.LJ() != null) {
                this.LIZIZ.LJ().getClass();
            }
        } catch (JSONException e) {
            this.LIZIZ.LJJIZ.LJIIJ(11, LIZLLL, "fillKeyIvForEncryptResp error", e, new Object[0]);
        }
    }

    public final HashMap LJFF(int i, String str, boolean z) {
        HashMap hashMap = new HashMap(2);
        if (this.LIZIZ.LJIJI) {
            hashMap.put("Content-Type", "application/octet-stream;tt-data=a");
        } else {
            hashMap.put("Content-Type", "application/json; charset=utf-8");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            } catch (Throwable unused) {
                if (i == 0) {
                    hashMap.put("log-encode-type", "gzip");
                } else if (i == 1 || i == 2) {
                    C116484hg.LIZIZ(hashMap, "log-encode-type", "zstd", 0, "log-encode-token");
                }
            }
        }
        if (!z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("t=0;n=");
            LIZ.append(0);
            hashMap.put("x-tt-request-tag", X1D.LIZIZ(LIZ));
        }
        return hashMap;
    }

    public final void LJIIJ(C66758QHy c66758QHy, C66750QHq c66750QHq, QHC qhc) {
        JSONObject jSONObject;
        int i;
        byte[] bytes;
        if (c66750QHq.LJLLLLLL == 0 || qhc == null) {
            return;
        }
        String LIZ = qhc.LIZ();
        if (TextUtils.isEmpty(LIZ)) {
            return;
        }
        HashMap LJFF = LJFF(c66750QHq.LLIILZL, c66750QHq.LLIIZ, true);
        String uuid = UUID.randomUUID().toString();
        if (this.LIZIZ.LJJJ) {
            try {
                jSONObject = new JSONObject(new String(c66750QHq.LL));
            } catch (Throwable unused) {
                jSONObject = null;
            }
            LJIIIZ(LIZ, uuid, jSONObject, 1, LJFF);
        }
        try {
            String post = this.LIZIZ.LJFF().post(LIZ, LJFF, c66750QHq.LL);
            this.LIZIZ.LJJIZ.LJIJI(11, LIZLLL, "trySendForward resp:{} ", post);
            if (TextUtils.isEmpty(post)) {
                i = -1;
            } else {
                i = 200;
            }
            if (TextUtils.isEmpty(post)) {
                bytes = null;
            } else {
                bytes = post.getBytes("UTF-8");
            }
            LJIIIIZZ(i, uuid, null, bytes);
        } catch (Throwable th) {
            this.LIZIZ.LJJIZ.LJIIJ(11, LIZLLL, "trySendForward failed ", th, new Object[0]);
            this.LIZIZ.LIZLLL.LJ(QIQ.log_send, QIK.f_forward_err);
            LJIIIIZZ(-1, uuid, "Send forward log error", null);
        }
        c66750QHq.LJLLLLLL = 0;
        if (c66758QHy == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("forward", (Integer) 0);
        long j = c66750QHq.LJLIL;
        if (j < 0) {
            return;
        }
        try {
            c66758QHy.LIZIZ.getWritableDatabase().update("pack", contentValues, "_id = ?", new String[]{String.valueOf(j)});
        } catch (Throwable th2) {
            c66758QHy.LJIILLIIL(th2);
            c66758QHy.LJI().LIZJ(5, "update pack failed", th2, new Object[0]);
        }
    }

    public final void LJIIIIZZ(int i, String str, String str2, byte[] bArr) {
        QI0.LIZIZ("do_request_end", new PPM(this, str, i, bArr, str2, System.currentTimeMillis()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021c A[Catch: all -> 0x021f, TRY_ENTER, TryCatch #6 {all -> 0x021f, blocks: (B:78:0x0200, B:81:0x021c, B:82:0x021e), top: B:77:0x0200 }] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.PA4 LJI(int r14, java.lang.String r15, java.util.HashMap<java.lang.String, java.lang.String> r16, byte[] r17, int r18) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QH8.LJI(int, java.lang.String, java.util.HashMap, byte[], int):X.PA4");
    }

    public final void LJIIIZ(String str, String str2, JSONObject jSONObject, int i, java.util.Map<String, String> map) {
        QI0.LIZIZ("do_request_begin", new PPK(this, map, str2, str, jSONObject, i, System.currentTimeMillis()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0153, code lost:
    
        if (r14 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0155, code lost:
    
        r2.getClass();
        r2.LJIIIZ = r9.optLong("batch_event_interval", 0) * 1000;
        r7 = r2.LJIIL.LJJIZ;
        r6 = X.QH9.LJIILJJIL;
        r5 = X.X1D.LIZ();
        r5.append("parseCommonConfigFromResp mEventIntervalFromLogResp: ");
        r5.append(r2.LJIIIZ);
        r7.LJIJI(0, r6, X.X1D.LIZIZ(r5), new java.lang.Object[0]);
        r22.LIZIZ.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x018c, code lost:
    
        if (r22.LIZIZ.LJJ == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x018e, code lost:
    
        r25.LJZI = new X.QHQ(r25, X.C59163NJv.LIZIZ(r25.LJLJI.LJIIJ, X.C66745QHl.LIZIZ(r22.LIZIZ, "sampling_list"), r9.optJSONObject("sampling_list"), r25.LJZI.LIZ));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01b1, code lost:
    
        if (r22.LIZIZ.LJJI == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01b3, code lost:
    
        r7 = r22.LIZIZ;
        r1 = r9.optJSONObject("priority_list");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01c2, code lost:
    
        if (r1 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01d6, code lost:
    
        r6 = new X.QHA();
        r6.LIZ = r1.optInt("priority_version", 0);
        r6.LIZIZ = r1.optInt("base_interval", 5);
        r5 = r1.optJSONArray("priorities");
        X.QHB.LIZ(r7, r2, r6, r5);
        r3 = r2.LJIIJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f6, code lost:
    
        if (r6.LIZ() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f8, code lost:
    
        if (r3 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01fe, code lost:
    
        if (r6.LIZ <= r3.LIZ) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0200, code lost:
    
        r2.LJ(r6, true);
        r1 = X.F9J.LIZIZ(r2.LIZ, 0, X.C66745QHl.LIZIZ(r7, "priority_list")).edit();
        r1.putInt("priority_version", r6.LIZ);
        r1.putInt("base_interval", r6.LIZIZ);
        r1.putString("priorities", r5.toString());
        r1.apply();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0228, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0229, code lost:
    
        r7.LJJIZ.LJIILL(X.QHB.LIZ, "parseEventPriorityFromServer", r6, new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJII(java.lang.String[] r23, byte[] r24, X.QI4 r25, java.lang.String[] r26, int r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QH8.LJII(java.lang.String[], byte[], X.QI4, java.lang.String[], int, java.lang.String):int");
    }
}
