package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PaO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64704PaO {
    public static volatile C64704PaO LJIIL;
    public boolean LJI;
    public Context LJIIIZ;
    public boolean LJIIJ;
    public InterfaceC64706PaQ LJIIJJI;
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public final List<String> LJII = new ArrayList();
    public final List<String> LJIIIIZZ = new ArrayList();

    public static C64704PaO LJFF() {
        if (LJIIL == null) {
            synchronized (C64704PaO.class) {
                if (LJIIL == null) {
                    LJIIL = new C64704PaO();
                }
            }
        }
        return LJIIL;
    }

    public final JSONObject LJ() {
        if (!this.LJIIJ) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("region", this.LIZ);
            jSONObject.put("source", this.LIZIZ);
            jSONObject.put("local_region", this.LIZLLL);
            jSONObject.put("update_region", this.LJ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public final void LJI() {
        SharedPreferences LIZIZ = F9J.LIZIZ(this.LJIIIZ, 0, "ttnet_store_region");
        this.LIZ = LIZIZ.getString("store_region", "");
        this.LIZIZ = LIZIZ.getString("store_region_src", "");
        this.LIZJ = LIZIZ.getString("store_sec_uid", "");
        this.LJ = LIZIZ.getString("update_region_info", "");
        this.LJI = LIZIZ.getBoolean("received_region_config", false);
        if (TextUtils.isEmpty(this.LIZ) && !TextUtils.isEmpty(this.LIZLLL)) {
            this.LIZ = this.LIZLLL;
            this.LIZIZ = "local";
        }
        InterfaceC64706PaQ interfaceC64706PaQ = this.LJIIJJI;
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        String str3 = this.LIZJ;
        interfaceC64706PaQ.getClass();
        C64707PaR.LIZ().LIZIZ("", str, str2, str3, "");
        Logger.debug();
    }

    public final void LJII() {
        if (!this.LJI) {
            this.LJI = true;
            SharedPreferences.Editor edit = F9J.LIZIZ(this.LJIIIZ, 0, "ttnet_store_region").edit();
            edit.putBoolean("received_region_config", true);
            edit.apply();
        }
    }

    public static Pair LIZJ(List list) {
        String str;
        String[] split;
        String[] split2;
        String[] split3;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        String str2 = "";
        String str3 = "";
        String str4 = "";
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (str5.toLowerCase().startsWith("store-country-code=")) {
                str3 = str5;
            } else if (str5.toLowerCase().startsWith("store-country-code-src=")) {
                str4 = str5;
            }
        }
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        String[] split4 = str3.split(";");
        if (split4 == null || split4.length <= 0 || (split3 = split4[0].trim().split("=")) == null || split3.length != 2) {
            str = "";
        } else {
            str = split3[1];
        }
        if (!TextUtils.isEmpty(str4) && (split = str4.split(";")) != null && split.length > 0 && (split2 = split[0].trim().split("=")) != null && split2.length == 2) {
            str2 = split2[1];
        }
        if (str.isEmpty()) {
            return null;
        }
        return new Pair(str, str2);
    }

    public final Request LIZ(Request request) {
        boolean z;
        String str;
        if (!this.LJIIJ || TextUtils.isEmpty(request.getHost())) {
            return null;
        }
        Iterator it = ((ArrayList) this.LJIIIIZZ).iterator();
        while (true) {
            if (it.hasNext()) {
                if (EZX.LIZIZ(request.getHost(), (String) it.next())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (!this.LJI && !TextUtils.isEmpty(this.LJFF)) {
            arrayList.add(new EJ6("x-tt-app-init-region", this.LJFF));
        } else if (!z) {
            return null;
        }
        if (request.getHeaders() != null) {
            arrayList.addAll(request.getHeaders());
        }
        C64908Pdg newBuilder = request.newBuilder();
        if (!TextUtils.isEmpty(request.getPath())) {
            if (!"/get_domains/v5/".equals(request.getPath())) {
                Iterator it2 = ((ArrayList) this.LJII).iterator();
                while (it2.hasNext()) {
                    if (EZX.LIZIZ(request.getPath(), (String) it2.next())) {
                        EZQ ezq = new EZQ(request.getUrl());
                        ezq.LIZJ("okhttp_version", "4.2.152.11-tiktok");
                        ezq.LIZJ("use_store_region_cookie", "1");
                        newBuilder.LIZJ(ezq.LIZLLL());
                    }
                }
            }
            newBuilder.LIZJ = arrayList;
            return newBuilder.LIZ();
        }
        if (!this.LIZ.isEmpty()) {
            str = this.LIZ;
        } else if (!this.LIZLLL.isEmpty()) {
            str = this.LIZLLL;
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            C77800Ug8.LJFF("x-tt-store-region", str, arrayList);
        }
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            arrayList.add(new EJ6("x-tt-store-region-src", this.LIZIZ));
        }
        newBuilder.LIZJ = arrayList;
        return newBuilder.LIZ();
    }

    public final boolean LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (it.hasNext()) {
            if (EZX.LIZIZ(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String LIZLLL(String str, java.util.Map map) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : map.keySet()) {
            if (str.equalsIgnoreCase(str2)) {
                List list = (List) map.get(str2);
                if (list == null || list.size() <= 0) {
                    return "";
                }
                return (String) C64504PTg.LIZIZ(list, -1, list);
            }
        }
        return "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:8|(1:41)|12|(4:(10:16|17|(2:19|(1:21)(1:22))|23|24|25|26|27|28|30)|27|28|30)|40|(0)|23|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f6, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.net.HttpURLConnection r17, byte[] r18, X.C73098SmU r19) {
        /*
            r16 = this;
            if (r17 == 0) goto L8
            r1 = r16
            boolean r0 = r1.LJIIJ
            if (r0 != 0) goto L9
        L8:
            return
        L9:
            java.net.URL r0 = r17.getURL()
            java.lang.String r0 = r0.getPath()
            boolean r0 = r1.LIZIZ(r0)
            if (r0 != 0) goto L18
            return
        L18:
            java.util.Map r4 = r17.getHeaderFields()
            java.lang.String r2 = "Set-Cookie"
            java.lang.Object r0 = r4.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L2c
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L36
        L2c:
            java.lang.String r0 = r2.toLowerCase()
            java.lang.Object r0 = r4.get(r0)
            java.util.List r0 = (java.util.List) r0
        L36:
            android.util.Pair r3 = LIZJ(r0)
            java.lang.String r0 = "x-tt-with-tnc"
            java.lang.String r1 = LIZLLL(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r6 = ""
            if (r0 != 0) goto L7f
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7b
            java.lang.String r0 = new java.lang.String     // Catch: org.json.JSONException -> L7b
            r2 = r18
            r0.<init>(r2)     // Catch: org.json.JSONException -> L7b
            r1.<init>(r0)     // Catch: org.json.JSONException -> L7b
            java.lang.String r0 = "tnc_data"
            java.lang.String r2 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: org.json.JSONException -> L7b
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: org.json.JSONException -> L7b
            java.lang.String r0 = "{\"data\": "
            r1.append(r0)     // Catch: org.json.JSONException -> L7b
            r1.append(r2)     // Catch: org.json.JSONException -> L7b
            java.lang.String r0 = "}"
            r1.append(r0)     // Catch: org.json.JSONException -> L7b
            java.lang.String r12 = X.X1D.LIZIZ(r1)     // Catch: org.json.JSONException -> L7b
            goto L80
        L7b:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L7f:
            r12 = r6
        L80:
            if (r3 != 0) goto L8e
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L89
            return
        L89:
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r6, r6)
        L8e:
            java.lang.String r0 = "x-tt-store-sec-uid"
            java.lang.String r14 = LIZLLL(r0, r4)
            java.lang.String r0 = "x-tt-logid"
            java.lang.String r15 = LIZLLL(r0, r4)
            java.lang.String r0 = "x-tt-tnc-attr"
            java.lang.String r9 = LIZLLL(r0, r4)
            java.lang.String r0 = "x-ss-etag"
            java.lang.String r10 = LIZLLL(r0, r4)
            java.lang.String r0 = "x-tt-tnc-config"
            java.lang.String r11 = LIZLLL(r0, r4)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.net.URL r0 = r17.getURL()     // Catch: org.json.JSONException -> Lf5
            java.lang.String r1 = r0.toString()     // Catch: org.json.JSONException -> Lf5
            java.net.URL r0 = r17.getURL()     // Catch: org.json.JSONException -> Lf5
            java.lang.String r6 = r0.getPath()     // Catch: org.json.JSONException -> Lf5
            java.lang.String r0 = "url"
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Lf5
            java.lang.String r5 = "store_region"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: org.json.JSONException -> Lf5
            java.lang.Object r0 = r3.first     // Catch: org.json.JSONException -> Lf5
            java.lang.String r0 = (java.lang.String) r0     // Catch: org.json.JSONException -> Lf5
            r1.append(r0)     // Catch: org.json.JSONException -> Lf5
            java.lang.String r0 = ","
            r1.append(r0)     // Catch: org.json.JSONException -> Lf5
            java.lang.Object r0 = r3.second     // Catch: org.json.JSONException -> Lf5
            java.lang.String r0 = (java.lang.String) r0     // Catch: org.json.JSONException -> Lf5
            r1.append(r0)     // Catch: org.json.JSONException -> Lf5
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: org.json.JSONException -> Lf5
            r2.put(r5, r0)     // Catch: org.json.JSONException -> Lf5
            java.lang.String r1 = "headers"
            java.lang.String r0 = r4.toString()     // Catch: org.json.JSONException -> Lf5
            r2.put(r1, r0)     // Catch: org.json.JSONException -> Lf5
            goto Lf9
        Lf5:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lf9:
            java.lang.Object r7 = r3.first
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r3.second
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r13 = r2.toString()
            X.C64693PaD.LJIILL(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L10a
            goto L8
        L10a:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64704PaO.LJIIIIZZ(java.net.HttpURLConnection, byte[], X.SmU):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.C64598PWw r14, java.lang.String r15, byte[] r16) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64704PaO.LJIIIZ(X.PWw, java.lang.String, byte[]):void");
    }
}
