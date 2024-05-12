package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.P9x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64001P9x {
    public static final String[] LIZ = {"aid", "app_version", "tt_data", "device_id", "bd_did"};

    public static void LIZIZ(StringBuilder sb, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (sb.toString().indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(str);
        sb.append("=");
        sb.append(android.net.Uri.encode(str2));
    }

    public static String LIZJ(String str, boolean z, InterfaceC64002P9y interfaceC64002P9y) {
        if (!TextUtils.isEmpty(str)) {
            android.net.Uri parse = UriProtector.parse(str);
            String query = parse.getQuery();
            ArrayList arrayList = new ArrayList();
            for (String str2 : LIZ) {
                String queryParameter = UriProtector.getQueryParameter(parse, str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    arrayList.add(new Pair(str2, queryParameter));
                }
            }
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.clearQuery();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                buildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
            }
            buildUpon.appendQueryParameter("tt_info", new String(Base64.encode(LJ(query, z, interfaceC64002P9y), 8)));
            return buildUpon.build().toString();
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0026, code lost:
    
        if (r2 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] LJ(java.lang.String r4, boolean r5, X.InterfaceC64002P9y r6) {
        /*
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r0 = 8192(0x2000, float:1.148E-41)
            r3.<init>(r0)
            java.lang.String r0 = "UTF-8"
            r2 = 0
            if (r5 == 0) goto L19
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L26
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L26
            byte[] r0 = r4.getBytes(r0)     // Catch: java.lang.Throwable -> L25
            r1.write(r0)     // Catch: java.lang.Throwable -> L25
            goto L21
        L19:
            byte[] r0 = r4.getBytes(r0)     // Catch: java.lang.Throwable -> L26
            r3.write(r0)     // Catch: java.lang.Throwable -> L26
            goto L22
        L21:
            r2 = r1
        L22:
            if (r2 == 0) goto L2b
            goto L28
        L25:
            r2 = r1
        L26:
            if (r2 == 0) goto L2b
        L28:
            r2.close()     // Catch: java.io.IOException -> L2b
        L2b:
            byte[] r1 = r3.toByteArray()
            if (r5 == 0) goto L38
            if (r6 == 0) goto L38
            int r0 = r1.length
            byte[] r1 = r6.LIZ(r0, r1)
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64001P9x.LJ(java.lang.String, boolean, X.P9y):byte[]");
    }

    public static boolean LIZ(PA0 pa0, String str, boolean z, InterfaceC64002P9y interfaceC64002P9y, boolean z2) {
        StringBuilder sb = new StringBuilder(str);
        HashMap hashMap = new HashMap();
        int i = !z2 ? 1 : 0;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("t=0;n=");
            LIZ2.append(i);
            hashMap.put("x-tt-request-tag", X1D.LIZIZ(LIZ2));
        } catch (Throwable unused) {
        }
        try {
            String str2 = pa0.get(LIZJ(sb.toString(), z, interfaceC64002P9y), hashMap);
            if (str2 != null) {
                try {
                    if ("success".equals(new JSONObject(str2).optString("message", ""))) {
                        return true;
                    }
                } catch (JSONException e) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Register#active parse json error ");
                    LIZ3.append(str2);
                    LIZ3.append(", ");
                    X1D.LIZIZ(LIZ3);
                    C16880lQ.LLLLIIL(e);
                }
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        return false;
    }

    public static JSONObject LIZLLL(PA0 pa0, String str, JSONObject jSONObject, boolean z, InterfaceC64002P9y interfaceC64002P9y, boolean z2) {
        String str2;
        HashMap hashMap = new HashMap(2);
        if (z) {
            hashMap.put("Content-Type", "application/octet-stream;tt-data=a");
        } else {
            hashMap.put("Content-Type", "application/json; charset=utf-8");
        }
        int i = !z2 ? 1 : 0;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("t=0;n=");
            LIZ2.append(i);
            hashMap.put("x-tt-request-tag", X1D.LIZIZ(LIZ2));
        } catch (Throwable unused) {
        }
        JSONObject jSONObject2 = null;
        try {
            byte[] LJ = LJ(jSONObject.toString(), z, interfaceC64002P9y);
            if (LJ != null && z) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str);
                LIZ3.append("&tt_data=a");
                str = X1D.LIZIZ(LIZ3);
            }
            str2 = pa0.post(str, hashMap, LJ);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        try {
            jSONObject2 = new JSONObject(str2);
            return jSONObject2;
        } catch (JSONException e2) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Register#doRegister parse json error ");
            LIZ4.append(str2);
            LIZ4.append(", ");
            X1D.LIZIZ(LIZ4);
            C16880lQ.LLLLIIL(e2);
            return jSONObject2;
        }
    }
}
