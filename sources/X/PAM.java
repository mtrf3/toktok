package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.services.apm.api.IApmAgent;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PAM {
    public int LIZ;
    public PAN LIZIZ;
    public PAO LIZJ;
    public String LIZLLL;
    public volatile boolean LJ;
    public int LJFF;
    public String LJI;
    public Boolean LJII;

    public final String LIZIZ() {
        List<String> list;
        PAL pal = PAH.LIZ;
        if (C78915Uy7.LJIJJ(pal.LJFF)) {
            list = C121014oz.LIZ;
        } else {
            list = pal.LJFF;
        }
        if (!TextUtils.isEmpty(this.LIZLLL)) {
            if (list != null && list.size() > 0) {
                try {
                    java.net.URL url = new java.net.URL((String) ListProtector.get(list, 0));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("https://");
                    LIZ.append(this.LIZLLL);
                    LIZ.append(url.getPath());
                    return X1D.LIZIZ(LIZ);
                } catch (Throwable unused) {
                }
            }
            return null;
        }
        if (!TextUtils.isEmpty(this.LJI)) {
            return this.LJI;
        }
        if (this.LJ) {
            this.LJFF++;
        }
        if (list == null) {
            return null;
        }
        int size = list.size();
        int i = this.LJFF;
        if (size > i && i >= 0) {
            return (String) ListProtector.get(list, i);
        }
        this.LJFF = 0;
        return (String) ListProtector.get(list, 0);
    }

    public static JSONObject LIZ(C36633EZh c36633EZh) {
        IApmAgent iApmAgent;
        try {
            JSONObject jSONObject = new JSONObject(new String(c36633EZh.LIZJ));
            try {
                String optString = jSONObject.optString("data");
                if (!optString.isEmpty()) {
                    jSONObject = new JSONObject(new String(optString.getBytes()));
                    return jSONObject;
                }
                return jSONObject;
            } catch (Throwable th) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                if ((th instanceof JSONException) && (iApmAgent = (IApmAgent) C171096nZ.LIZ(IApmAgent.class)) != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("resp", jSONObject.toString());
                    iApmAgent.monitorEvent("sdkm_resp_err", null, null, jSONObject3);
                }
                return jSONObject2;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean LIZLLL(byte[] bArr) {
        boolean equals;
        boolean z;
        if (bArr != null && bArr.length != 0) {
            try {
                String LIZIZ = LIZIZ();
                C36633EZh LIZJ = LIZJ(LIZIZ, bArr);
                this.LIZLLL = null;
                this.LJI = null;
                if (LIZJ == null || LIZJ.LIZ <= 0) {
                    this.LJ = true;
                    Boolean bool = this.LJII;
                    if (bool != null && bool.booleanValue()) {
                        PAH.LIZ.LJ();
                    }
                    this.LJII = Boolean.TRUE;
                    return false;
                }
                this.LJ = false;
                int i = LIZJ.LIZ;
                if (500 <= i && i <= 600) {
                    Boolean bool2 = this.LJII;
                    if (bool2 != null && bool2.booleanValue()) {
                        PAH.LIZ.LIZJ();
                    }
                    this.LJII = Boolean.TRUE;
                    return false;
                }
                JSONObject LIZ = LIZ(LIZJ);
                if (LIZ == null || LIZJ.LIZ != 200) {
                    this.LJII = Boolean.TRUE;
                    return false;
                }
                String optString = LIZ.optString("message");
                String optString2 = LIZ.optString("redirect");
                long optLong = LIZ.optLong("delay");
                if ("success".equals(optString)) {
                    PAL pal = PAH.LIZ;
                    pal.LJI = true;
                    pal.LJIIJJI = false;
                    pal.LIZ = 0;
                    pal.LIZIZ = 0;
                    pal.LIZJ = 0;
                    pal.LIZLLL = 0;
                    pal.LJ = 0;
                    pal.LJIIIIZZ.set(0L);
                    pal.LJII.set(0L);
                    this.LJI = LIZIZ;
                    this.LJII = Boolean.FALSE;
                    equals = false;
                    z = true;
                } else {
                    this.LJII = Boolean.TRUE;
                    equals = "drop data".equals(optString);
                    z = false;
                }
                JSONObject optJSONObject = LIZ.optJSONObject("downgrade_rule");
                if (optJSONObject != null) {
                    PAJ.LIZ.LIZ(C64006PAc.LIZ(optJSONObject), true);
                }
                this.LIZLLL = optString2;
                if (optLong > 0) {
                    PAL pal2 = PAH.LIZ;
                    pal2.LJ = (int) (optLong * 1000);
                    pal2.LJI = false;
                    pal2.LJII.set(System.currentTimeMillis());
                }
                if (equals) {
                    PAL pal3 = PAH.LIZ;
                    pal3.LIZJ();
                    pal3.LJIIJJI = true;
                    pal3.LJIIIIZZ.set(System.currentTimeMillis());
                } else {
                    PAH.LIZ.LJIIJJI = false;
                }
                return z;
            } catch (Throwable th) {
                PAU.LIZIZ("sendLog failed.", th);
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(1:5)|6|(2:8|(2:10|(1:12))(2:25|(4:27|(1:29)|30|(6:36|14|(2:16|(1:18)(3:23|20|21))(1:24)|19|20|21))))|37|38|(6:40|14|(0)(0)|19|20|21)) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0047, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C36633EZh LIZJ(java.lang.String r11, byte[] r12) {
        /*
            r10 = this;
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            java.util.Map r0 = X.C63985P9h.LIZIZ()
            r5.<init>(r0)
            java.lang.String r0 = "Accept-Encoding"
            java.lang.String r8 = "gzip"
            r3.put(r0, r8)
            int r1 = r12.length
            r0 = 128(0x80, float:1.8E-43)
            r2 = 0
            if (r1 <= r0) goto L49
            X.PAN r0 = r10.LIZIZ
            if (r0 != 0) goto L29
            java.lang.Class<X.PAN> r0 = X.PAN.class
            java.lang.Object r0 = X.C171096nZ.LIZ(r0)
            X.PAN r0 = (X.PAN) r0
            r10.LIZIZ = r0
        L29:
            X.PAN r9 = r10.LIZIZ
            java.lang.String r7 = "Content-Encoding"
            if (r9 == 0) goto Lb8
            int r1 = r10.LIZ
            r0 = 1
            java.lang.String r6 = "Content-Encoding-Level"
            r4 = 15
            if (r1 != r0) goto L4b
            byte[] r2 = r9.LIZ(r12)
            if (r2 == 0) goto L44
            java.lang.String r0 = "zstd"
            X.C116484hg.LIZIZ(r3, r7, r0, r4, r6)
        L44:
            if (r2 != 0) goto L74
            goto Lb8
        L47:
            if (r2 != 0) goto L74
        L49:
            r2 = r12
            goto L74
        L4b:
            r0 = 2
            if (r1 != r0) goto Lb8
            X.PAO r0 = r10.LIZJ
            if (r0 != 0) goto L5c
            java.lang.Class<X.PAO> r0 = X.PAO.class
            java.lang.Object r0 = X.C171096nZ.LIZ(r0)
            X.PAO r0 = (X.PAO) r0
            r10.LIZJ = r0
        L5c:
            X.PAO r0 = r10.LIZJ
            if (r0 == 0) goto Lb8
            byte[] r1 = r0.get()
            if (r1 == 0) goto Lb8
            X.PAN r0 = r10.LIZIZ
            byte[] r2 = r0.LIZIZ(r12, r1)
            if (r2 == 0) goto Lb8
            java.lang.String r0 = "zstd/dict_monitor"
            X.C116484hg.LIZIZ(r3, r7, r0, r4, r6)
        L74:
            java.lang.String r4 = "Content-Type"
            java.lang.String r0 = "application/json; charset=utf-8"
            r3.put(r4, r0)
            X.PAL r0 = X.PAH.LIZ
            boolean r0 = r0.LJIIJ
            if (r0 == 0) goto Lb3
            int r0 = r2.length
            byte[] r2 = com.bytedance.frameworks.encryptor.EncryptorUtil.LIZ(r0, r2)
            if (r2 == 0) goto Lae
            java.lang.String r1 = "tt_data"
            java.lang.String r0 = "a"
            r5.put(r1, r0)
            java.lang.String r1 = X.EZT.LIZ(r11, r5)
            java.lang.String r0 = "application/octet-stream;tt-data=a"
            r3.put(r4, r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String r1 = X.EZU.LJFF(r1, r0)
            java.util.Map r0 = X.C78915Uy7.LJJ(r0)
            r3.putAll(r0)
        La8:
            r12 = r2
        La9:
            X.EZh r0 = X.C63985P9h.LIZ(r1, r3, r12)
            return r0
        Lae:
            java.lang.String r1 = X.EZT.LIZ(r11, r5)
            goto La9
        Lb3:
            java.lang.String r1 = X.EZT.LIZ(r11, r5)
            goto La8
        Lb8:
            byte[] r2 = X.P9Y.LIZJ(r12, r3)     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto L49
            r3.put(r7, r8)     // Catch: java.lang.Exception -> L47
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PAM.LIZJ(java.lang.String, byte[]):X.EZh");
    }
}
