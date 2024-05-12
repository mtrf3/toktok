package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.IHttpService;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PBO {
    public static final HashMap<PBM, PBO> LJIIIZ = new HashMap<>();
    public static int LJIIJ;
    public String LIZ;
    public volatile boolean LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public Boolean LJ;
    public final List<String> LJFF;
    public PAN LJI;
    public PAO LJII;
    public final PBM LJIIIIZZ;

    public final String LIZLLL() {
        List<String> list = this.LJFF;
        if (!TextUtils.isEmpty(this.LIZ)) {
            if (list != null && list.size() > 0) {
                try {
                    java.net.URL url = new java.net.URL((String) ListProtector.get(list, 0));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("https://");
                    LIZ.append(this.LIZ);
                    LIZ.append(url.getPath());
                    return X1D.LIZIZ(LIZ);
                } catch (Throwable unused) {
                }
            }
            return null;
        }
        if (!TextUtils.isEmpty(this.LIZLLL)) {
            return this.LIZLLL;
        }
        if (this.LIZIZ) {
            this.LIZJ++;
        }
        int size = list.size();
        int i = this.LIZJ;
        if (size > i && i >= 0) {
            return (String) ListProtector.get(list, i);
        }
        this.LIZJ = 0;
        return (String) ListProtector.get(list, 0);
    }

    public PBO(PBM pbm) {
        this.LJIIIIZZ = pbm;
        this.LJFF = pbm.LIZ();
    }

    public static JSONObject LIZIZ(C36633EZh c36633EZh) {
        IApmAgent iApmAgent;
        InterfaceC64042PBm interfaceC64042PBm;
        try {
            JSONObject jSONObject = new JSONObject(new String(c36633EZh.LIZJ));
            try {
                String optString = jSONObject.optString("data");
                if (!optString.isEmpty()) {
                    jSONObject = new JSONObject(optString);
                }
                if (!C64055PBz.LIZIZ(jSONObject)) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("configs");
                    if (!C64055PBz.LIZIZ(optJSONObject) && (interfaceC64042PBm = (InterfaceC64042PBm) PGH.LIZ(InterfaceC64042PBm.class)) != null) {
                        interfaceC64042PBm.LIZ(optJSONObject);
                    }
                }
                return jSONObject;
            } catch (Throwable th) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                if ((th instanceof JSONException) && (iApmAgent = (IApmAgent) PGH.LIZ(IApmAgent.class)) != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("resp", jSONObject.toString());
                    iApmAgent.monitorEvent("apm_resp_err", null, null, jSONObject3);
                }
                return jSONObject2;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static PBO LIZJ(PBM pbm) {
        HashMap<PBM, PBO> hashMap = LJIIIZ;
        if (hashMap.containsKey(pbm)) {
            return hashMap.get(pbm);
        }
        hashMap.put(pbm, new PBO(pbm));
        return hashMap.get(pbm);
    }

    public final boolean LJ(byte[] bArr) {
        boolean equals;
        boolean z;
        Object LIZIZ;
        if (bArr == null || bArr.length == 0) {
            return true;
        }
        try {
            String LIZLLL = LIZLLL();
            boolean z2 = this.LJIIIIZZ instanceof PBS;
            if (!z2) {
                if (this.LJII == null) {
                    this.LJII = (PAO) PGH.LIZ(PAO.class);
                }
                if (this.LJII != null) {
                    try {
                        this.LJII.LIZ(new java.net.URL(LIZLLL).getHost());
                    } catch (MalformedURLException unused) {
                    }
                }
            }
            C44N LIZ = LIZ(LIZLLL, bArr, z2);
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("sendLog createRequest: origin Bytes=");
                LIZ2.append(bArr.length);
                LIZ2.append(" compressed Bytes=");
                LIZ2.append(((byte[]) LIZ.LIZJ).length);
                LIZ2.append(" url=");
                LIZ2.append((String) LIZ.LIZ);
                LIZ2.append(" headers=");
                LIZ2.append((java.util.Map) LIZ.LIZIZ);
                LIZ2.append(" body:");
                LIZ2.append(new JSONObject(new String(bArr)).toString());
                C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ2));
            }
            String str = (String) LIZ.LIZ;
            java.util.Map<String, String> map = (java.util.Map) LIZ.LIZIZ;
            C36633EZh doPost = ((IHttpService) PGH.LIZ(IHttpService.class)).doPost(str, (byte[]) LIZ.LIZJ, map);
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("http result:");
                if (doPost == null) {
                    LIZIZ = -1;
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(doPost.LIZ);
                    LIZ4.append(" header:");
                    LIZ4.append(doPost.LIZIZ);
                    LIZIZ = X1D.LIZIZ(LIZ4);
                }
                LIZ3.append(LIZIZ);
                C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ3));
            }
            if (this.LJIIIIZZ instanceof PBS) {
                return true;
            }
            this.LIZ = null;
            this.LIZLLL = null;
            if (doPost == null || doPost.LIZ <= 0) {
                this.LIZIZ = true;
                Boolean bool = this.LJ;
                if (bool != null && bool.booleanValue()) {
                    C64038PBi.LIZ.LIZLLL();
                }
                this.LJ = Boolean.TRUE;
                return false;
            }
            this.LIZIZ = false;
            int i = doPost.LIZ;
            if (500 <= i && i <= 600) {
                Boolean bool2 = this.LJ;
                if (bool2 != null && bool2.booleanValue()) {
                    C64038PBi.LIZ.LIZJ();
                }
                this.LJ = Boolean.TRUE;
                return false;
            }
            JSONObject LIZIZ2 = LIZIZ(doPost);
            if (LIZIZ2 == null || doPost.LIZ != 200) {
                this.LJ = Boolean.TRUE;
                return false;
            }
            String optString = LIZIZ2.optString("message");
            String optString2 = LIZIZ2.optString("redirect");
            long optLong = LIZIZ2.optLong("delay");
            if ("success".equals(optString)) {
                PBX pbx = C64038PBi.LIZ;
                pbx.LJIIIZ = true;
                pbx.LJIILIIL = false;
                pbx.LIZ = 0;
                pbx.LIZIZ = 0;
                pbx.LIZJ = 0;
                pbx.LIZLLL = 0;
                pbx.LJ = 0;
                pbx.LJIIJJI.set(0L);
                pbx.LJIIJ.set(0L);
                this.LIZLLL = LIZLLL;
                this.LJ = Boolean.FALSE;
                z = true;
                equals = false;
            } else {
                this.LJ = Boolean.TRUE;
                equals = "drop data".equals(optString);
                if (C78248UnM.LJIIJ()) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("responseMessage:");
                    LIZ5.append(optString);
                    C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ5));
                }
                z = false;
            }
            if (C78248UnM.LJIIJ()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("RESPONSE_DATA_URL", (String) LIZ.LIZ);
                if (doPost.LIZIZ != null) {
                    jSONObject.put("RESPONSE_DATA_HEADERS", new JSONObject(doPost.LIZIZ));
                }
                jSONObject.put("RESPONSE_DATA_BODY_TEXT", LIZIZ2);
                PBV.LIZJ(bArr, jSONObject);
            }
            JSONObject optJSONObject = LIZIZ2.optJSONObject("downgrade_rule");
            if (optJSONObject != null) {
                C64025PAv.LIZ.LIZIZ(C64024PAu.LIZ(optJSONObject), true);
            }
            this.LIZ = optString2;
            if (optLong > 0) {
                PBX pbx2 = C64038PBi.LIZ;
                pbx2.LJ = (int) (optLong * 1000);
                pbx2.LJIIIZ = false;
                pbx2.LJIIJ.set(System.currentTimeMillis());
            }
            if (equals) {
                PBX pbx3 = C64038PBi.LIZ;
                pbx3.LIZJ();
                pbx3.LJIILIIL = true;
                pbx3.LJIIJJI.set(System.currentTimeMillis());
                java.util.Map<String, String> map2 = doPost.LIZIZ;
                if (map2 != null) {
                    C61587OFb.LIZ.LIZLLL = map2.get("x-tt-logid");
                }
                C61587OFb.LIZ.LJ = System.currentTimeMillis();
            } else {
                C64038PBi.LIZ.LJIILIIL = false;
            }
            return z;
        } catch (Throwable th) {
            C64028PAy.LIZJ("APM-Slardar", "sendLog failed.", th);
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:3|(9:5|(1:7)|8|(2:10|(1:14))(2:42|(4:46|(1:48)|49|(1:55)))|15|(2:24|(3:41|21|22)(9:28|(1:30)|31|(1:33)|34|(1:36)|37|(1:39)|40))(1:19)|20|21|22)|56|57|58|59|60|61|(8:63|15|(1:17)|24|(1:26)|41|21|22)) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012a, code lost:
    
        X.C78685UuP.LJIIIIZZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0130, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0131, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0134, code lost:
    
        X.C78685UuP.LJIIIIZZ(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0137, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0129, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0133, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C44N LIZ(java.lang.String r11, byte[] r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PBO.LIZ(java.lang.String, byte[], boolean):X.44N");
    }
}
