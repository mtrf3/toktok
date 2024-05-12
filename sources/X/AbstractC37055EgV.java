package X;

import Y.ARunnableS7S1100000_6;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.security.MessageDigest;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EgV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37055EgV {
    public final C37060Ega LJLIL;

    public static java.net.URL LIZIZ() {
        if (C73040SlY.LJLJJI.LIZJ.endsWith("/")) {
            StringBuilder LIZ = X1D.LIZ();
            return new java.net.URL(JBR.LJFF(LIZ, C73040SlY.LJLJJI.LIZJ, "api/verify/v1", LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return new java.net.URL(JBR.LJFF(LIZ2, C73040SlY.LJLJJI.LIZJ, "/api/verify/v1", LIZ2));
    }

    public final JSONObject LIZ() {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aid", this.LJLIL.LIZ);
        jSONObject.put(WM7.SCENE_SERVICE, this.LJLIL.LIZIZ);
        jSONObject.put("ts", this.LJLIL.LIZLLL);
        jSONObject.put("target", this.LJLIL.LIZJ);
        jSONObject.put("sync", this.LJLIL.LJ);
        if (this.LJLIL.LJFF < 3) {
            jSONObject.put("flag", true);
        } else {
            jSONObject.put("flag", false);
        }
        this.LJLIL.getClass();
        String str2 = this.LJLIL.LIZ + "|" + this.LJLIL.LIZIZ + "|" + this.LJLIL.LIZJ + "|" + this.LJLIL.LIZLLL + "|seclink_verify";
        if (str2 == null) {
            str = null;
        } else {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str2.getBytes());
                byte[] digest = messageDigest.digest();
                StringBuilder sb = new StringBuilder(digest.length * 2);
                for (byte b : digest) {
                    char[] cArr = C72083SQt.LJLIL;
                    char c = cArr[(b & 240) >> 4];
                    char c2 = cArr[b & 15];
                    sb.append(c);
                    sb.append(c2);
                }
                str = sb.toString();
            } catch (Exception unused) {
                str = "";
            }
        }
        jSONObject.put("token", str);
        return jSONObject;
    }

    public AbstractC37055EgV(C37060Ega c37060Ega) {
        this.LJLIL = c37060Ega;
    }

    public static void LIZJ(String str) {
        String type = EnumC35490DwM.Other.getType();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_type", type);
            jSONObject.put("error_code", -1);
            jSONObject.put("error_info", str);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        int i = C36849EdB.LIZLLL;
        if (i == 0) {
            C36849EdB.LIZLLL = 1;
            C36849EdB.LJ = System.currentTimeMillis();
        } else if (i < 3) {
            if (System.currentTimeMillis() - C36849EdB.LJ < 1800000) {
                C36849EdB.LIZLLL++;
            } else {
                C36849EdB.LIZLLL = 1;
                C36849EdB.LJ = System.currentTimeMillis();
            }
        }
        if (C36849EdB.LIZLLL >= 3) {
            C36849EdB.LIZLLL = 0;
            C36849EdB.LJ = 0L;
            C36849EdB.LJFF = System.currentTimeMillis();
        }
    }

    public static C37021Efx LIZLLL(String str) {
        JSONObject jSONObject = new JSONObject(str);
        C37021Efx c37021Efx = new C37021Efx();
        c37021Efx.LIZIZ = JSONObjectProtectorUtils.getInt(jSONObject, "risk");
        c37021Efx.LIZJ = JSONObjectProtectorUtils.getBoolean(jSONObject, "show_mid_page");
        c37021Efx.LIZLLL = JSONObjectProtectorUtils.getLong(jSONObject, "safe_duration");
        jSONObject.optBoolean("show_banner", false);
        jSONObject.optString("banner_text");
        c37021Efx.LIZ = true;
        return c37021Efx;
    }

    public final void LJ(C37021Efx c37021Efx) {
        long j = c37021Efx.LIZLLL;
        if (j > 0) {
            long j2 = j * 1000;
            C37056EgW LIZ = C37056EgW.LIZ();
            LIZ.getClass();
            if (j2 >= 0 && j2 != C37056EgW.LIZJ) {
                C37056EgW.LIZJ = j2;
                LIZ.LIZIZ.edit().putLong("valid_time", j2).apply();
            }
        }
        C37060Ega c37060Ega = this.LJLIL;
        InterfaceC37064Ege interfaceC37064Ege = c37060Ega.LJI;
        if (interfaceC37064Ege != null) {
            String str = c37060Ega.LIZJ;
            C37062Egc c37062Egc = (C37062Egc) interfaceC37064Ege;
            InterfaceC37063Egd interfaceC37063Egd = c37062Egc.LIZ.LJI;
            if (interfaceC37063Egd != null) {
                c37021Efx.LJ = str;
                interfaceC37063Egd.LIZ(c37021Efx);
            }
            if (c37021Efx.LIZJ) {
                c37062Egc.LIZ.LJII.post(new ARunnableS7S1100000_6(c37062Egc, str, 10));
            }
            c37062Egc.LIZ.LJFF = str;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSuccess url : ");
            LIZ2.append(str);
            LIZ2.append(", response : ");
            LIZ2.append(c37021Efx);
            X1D.LIZIZ(LIZ2);
        }
    }
}
