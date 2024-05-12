package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VAN {
    public C2058586b[] LIZ;
    public VAM LIZIZ;
    public String[] LIZJ;
    public int LIZLLL;
    public int LJ;

    public final String LJI() {
        VAM vam;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return null;
        }
        return vam.LIZLLL;
    }

    public final String LJII() {
        VAM vam = this.LIZIZ;
        if (vam == null) {
            return null;
        }
        return vam.LJIJJ;
    }

    public final java.util.Map<String, String> LJIIIIZZ() {
        VAM vam;
        JSONObject jSONObject;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null || (jSONObject = vam.LIZIZ) == null || !jSONObject.has("header")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(vam.LIZIZ, "header");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject2, next));
            }
            return hashMap;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final int LJIIIZ() {
        VAM vam;
        int i;
        int i2;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return -1;
        }
        int i3 = vam.LJJJJIZL;
        if (i3 >= 0) {
            return i3;
        }
        if (TextUtils.isEmpty(vam.LIZLLL)) {
            return -1;
        }
        try {
            String[] split = new JSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(vam.LIZ, vam.LIZLLL), "main").optString("sdk_params")).optString("resolution").split("x");
            if (split.length == 2) {
                try {
                    i = CastIntegerProtector.parseInt(split[0]);
                    try {
                        i2 = CastIntegerProtector.parseInt(split[1]);
                        if (i2 > 0 && i >= i2) {
                            vam.LJJJJIZL = 1;
                        }
                    } catch (NumberFormatException e) {
                        e = e;
                        C16880lQ.LLLLIIL(e);
                        i2 = 0;
                        if (i > 0) {
                            vam.LJJJJIZL = 0;
                        }
                        return vam.LJJJJIZL;
                    }
                } catch (NumberFormatException e2) {
                    e = e2;
                    i = 0;
                }
                if (i > 0 && i2 > i) {
                    vam.LJJJJIZL = 0;
                }
            }
        } catch (JSONException e3) {
            C16880lQ.LLLLIIL(e3);
        }
        return vam.LJJJJIZL;
    }

    public final C2058586b LJIIJJI() {
        C2058586b[] c2058586bArr = this.LIZ;
        if (c2058586bArr != null && c2058586bArr.length != 0) {
            for (C2058586b c2058586b : c2058586bArr) {
                if (c2058586b.LIZ != null) {
                    return c2058586b;
                }
            }
        }
        return null;
    }

    public final VAM LJIILLIIL() {
        VAM vam;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return null;
        }
        return vam;
    }

    public final boolean LJIL() {
        JSONObject jSONObject;
        VAM vam = this.LIZIZ;
        if (vam == null || (jSONObject = vam.LIZIZ) == null || !jSONObject.has("secret_key")) {
            return false;
        }
        vam.LJIJJ = vam.LIZIZ.optString("secret_key");
        return true;
    }

    public final String LIZIZ(String str) {
        VAM vam;
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str2 = null;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null || str == null) {
            return null;
        }
        vam.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("adaptationSet") && (jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "adaptationSet")) != null && jSONObject.has("representation") && (jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "representation")) != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    if (jSONObject3.has("defaultSelect") && jSONObject3.has("url") && jSONObject3.optInt("defaultSelect") == 1) {
                        str2 = JSONObjectProtectorUtils.getString(jSONObject3, "url");
                        return str2;
                    }
                }
                return null;
            }
            return null;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return str2;
        }
    }

    public final int LJIILL(String str) {
        VAM vam;
        JSONObject jSONObject;
        String[] split;
        int i = -1;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return -1;
        }
        vam.getClass();
        try {
            String optString = vam.LIZ.optString(str);
            if (TextUtils.isEmpty(optString)) {
                return -1;
            }
            JSONObject jSONObject2 = new JSONObject(optString);
            if (jSONObject2.has("main")) {
                jSONObject = new JSONObject(jSONObject2.optString("main"));
            } else {
                if (!jSONObject2.has("backup")) {
                    return -1;
                }
                jSONObject = new JSONObject(jSONObject2.optString("backup"));
            }
            String optString2 = new JSONObject(jSONObject.optString("sdk_params")).optString("resolution");
            if (!TextUtils.isEmpty(optString2) && optString2.contains("x") && (split = optString2.split("x")) != null && split.length >= 2) {
                i = Math.min(CastIntegerProtector.parseInt(split[0]), CastIntegerProtector.parseInt(split[1]));
                return i;
            }
            return -1;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return i;
        }
    }

    public final boolean LJIJJ(String str) {
        JSONObject jSONObject;
        VAM vam = this.LIZIZ;
        if (vam == null || (jSONObject = vam.LIZ) == null || jSONObject.length() <= 0) {
            return false;
        }
        int i = vam.LJI;
        if (i >= 0) {
            if (i != 1) {
                return false;
            }
        } else {
            vam.LJI = 1;
            Iterator<String> keys = vam.LIZ.keys();
            String str2 = null;
            String str3 = null;
            while (true) {
                if (!keys.hasNext()) {
                    break;
                }
                String next = keys.next();
                if (vam.LJ(next, false)) {
                    str3 = vam.LIZLLL(next, str);
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !str3.equals(str2)) {
                        vam.LJI = 0;
                        break;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    }
                }
            }
            if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2)) {
                vam.LJI = 0;
            }
            if (vam.LJI != 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJLI(int r9) {
        /*
            r8 = this;
            X.VAM r0 = r8.LIZIZ
            r7 = 0
            if (r0 != 0) goto L9
            X.C46496IMq.LIZJ()
            return r7
        L9:
            r5 = 1
            if (r9 != r5) goto L63
            com.ss.videoarch.live.LiveIOWrapper r1 = com.ss.videoarch.live.LiveIOWrapper.getInstance()
            r0 = 1100(0x44c, float:1.541E-42)
            java.lang.String r2 = r1.getStringValue(r0)
        L16:
            X.VAM r1 = r8.LIZIZ
            int r0 = r1.LJJIJ
            if (r0 != r5) goto L2a
            java.lang.String r1 = r1.LJJIIZI
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L2a
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L2b
        L2a:
            return r7
        L2b:
            java.lang.String r0 = "\\."
            java.lang.String[] r6 = r1.split(r0)
            java.lang.String[] r4 = r2.split(r0)
            int r1 = r6.length
            int r0 = r4.length
            int r3 = java.lang.Math.min(r1, r0)
            r2 = 0
        L3c:
            if (r2 >= r3) goto L5d
            r0 = r6[r2]
            int r1 = r0.length()
            r0 = r4[r2]
            int r0 = r0.length()
            int r1 = r1 - r0
            if (r1 != 0) goto L5a
            r1 = r6[r2]
            r0 = r4[r2]
            int r1 = r1.compareTo(r0)
            if (r1 != 0) goto L5a
            int r2 = r2 + 1
            goto L3c
        L5a:
            if (r1 <= 0) goto L2a
            goto L62
        L5d:
            int r1 = r6.length
            int r0 = r4.length
            int r1 = r1 - r0
            if (r1 <= 0) goto L2a
        L62:
            return r5
        L63:
            java.lang.String r2 = ""
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAN.LJIJJLI(int):boolean");
    }

    public final boolean LJJ(String str) {
        VAM vam;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return false;
        }
        return vam.LJ(str, false);
    }

    public final boolean LJJI(String str) {
        VAM vam;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return false;
        }
        return vam.LJI(str);
    }

    public final void LJJIFFI(String str) {
        VAM vam;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return;
        }
        if (vam.LJFF(str)) {
            str = vam.LIZLLL;
        }
        if (!vam.LJI(str)) {
            return;
        }
        vam.LIZLLL = str;
    }

    public final void LJJII(int i) {
        VAM vam = this.LIZIZ;
        if (vam == null) {
            return;
        }
        vam.LJJIII = i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setFastOpenDuration: ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        C46496IMq.LIZJ();
    }

    public final boolean LIZ(String str, String str2) {
        VAM vam = this.LIZIZ;
        if (vam == null || vam.LIZ == null || !vam.LJI(str) || !vam.LJI(str2)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("ld");
        arrayList.add("sd");
        arrayList.add("hd");
        arrayList.add("uhd");
        arrayList.add("origin");
        int indexOf = arrayList.indexOf(str);
        int indexOf2 = arrayList.indexOf(str2);
        if (indexOf == -1 || indexOf2 == -1 || indexOf <= indexOf2) {
            return false;
        }
        return true;
    }

    public final JSONObject LIZJ(int i, String str) {
        VAM vam;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return null;
        }
        JSONObject jSONObject = vam.LJIL;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = vam.LIZ;
        if (jSONObject2 == null || jSONObject2.length() <= 0) {
            return null;
        }
        Iterator<String> keys = vam.LIZ.keys();
        vam.LJIL = new JSONObject();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (i == 21 && !TextUtils.isEmpty(vam.LJJJJI)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("\"");
                    LIZ.append(next);
                    LIZ.append("\"");
                    if (!vam.LJJJJI.contains(X1D.LIZIZ(LIZ))) {
                    }
                }
                if (vam.LJ(next, false)) {
                    vam.LJIL.put(next, vam.LIZ(next, str));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return vam.LJIL;
    }

    public final long LIZLLL(String str, String str2) {
        VAM vam;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return 0L;
        }
        return vam.LIZ(str, str2);
    }

    public final int LJ(String str, String str2) {
        VAM vam;
        int i = -1;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return -1;
        }
        if (vam.LJFF(str)) {
            str = vam.LIZLLL;
        }
        if (!vam.LJI(str)) {
            return -1;
        }
        try {
            String LIZIZ = vam.LIZIZ(str, str2);
            if (LIZIZ == null) {
                return -1;
            }
            i = new JSONObject(LIZIZ).optInt("CheckSilenceInterval");
            return i;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return i;
        }
    }

    public final String LJFF(String str, String str2) {
        VAM vam;
        String str3 = null;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return null;
        }
        if (vam.LJFF(str)) {
            str = vam.LIZLLL;
        }
        if (!vam.LJI(str)) {
            return null;
        }
        try {
            str3 = new JSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(vam.LIZ, str), str2).optString("sdk_params")).optString("drType");
            return str3;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return str3;
        }
    }

    public final String LJIIJ(long j, String str) {
        VAM vam;
        JSONObject jSONObject;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null || (jSONObject = vam.LIZ) == null || jSONObject.length() <= 0) {
            return null;
        }
        Iterator<String> keys = vam.LIZ.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (vam.LJ(next, false) && j == vam.LIZ(next, str)) {
                return next;
            }
        }
        return null;
    }

    public final String LJIILJJIL(String str, String str2) {
        VAM vam;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return null;
        }
        return vam.LIZIZ(str, str2);
    }

    public final String LJIIZILJ(String str, String str2) {
        String str3;
        VAM vam = this.LIZIZ;
        if (vam == null) {
            return null;
        }
        if (vam.LJFF(str)) {
            str = vam.LIZLLL;
        }
        if (!vam.LJI(str)) {
            return null;
        }
        try {
            str3 = new JSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(vam.LIZ, str), str2).optString("sdk_params")).optString("SuggestFormat");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            str3 = null;
        }
        if (str3 == null || str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final String LJIJ(String str, String str2) {
        String str3;
        VAM vam = this.LIZIZ;
        if (vam == null) {
            return null;
        }
        if (vam.LJFF(str)) {
            str = vam.LIZLLL;
        }
        if (!vam.LJI(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(vam.LIZ, str), str2).optString("sdk_params"));
            str3 = jSONObject.optString("SuggestProtocol");
            vam.LJJIIZ = jSONObject.optInt("QuicDisableOnFreeFlow", 0);
            vam.LJJIIZI = jSONObject.optString("QuicPluginMinVersion", "1.0.105.5");
            vam.LJJIJ = jSONObject.optInt("EnableQuicPluginVersionCheck", 0);
            vam.LJJIJIIJI = jSONObject.optInt("EnableQuicDegradeInNonPreivew", 0);
            vam.LJJIJIIJIL = jSONObject.optInt("EnableQuicByUserSetQosConstraint", 0);
            vam.LJJIJL = jSONObject.optString("FastFirstFrameProtocol", "h2q");
            vam.LJJIJIL = jSONObject.optInt("EnableQuicDegradeInFaultFormat", 0);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            str3 = null;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("protocol:", str3, ", mDisableQuicOnFreeFlow: ");
        LIZIZ.append(vam.LJJIIZ);
        LIZIZ.append(", mQuicPluginMinVersion:");
        LIZIZ.append(vam.LJJIIZI);
        LIZIZ.append(", mEnableQuicDegradeInNonPreivew: ");
        LIZIZ.append(vam.LJJIJIIJI);
        LIZIZ.append(", mEnableQuicByUserSetQosConstraint: ");
        LIZIZ.append(vam.LJJIJIIJIL);
        LIZIZ.append(", mEnableQuicDegradeInFaultFormat: ");
        LIZIZ.append(vam.LJJIJIL);
        LIZIZ.append(", mFastFirstFrameProtocol: ");
        C64504PTg.LIZLLL(LIZIZ, vam.LJJIJL, LIZIZ);
        if (str3 == null || str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final String LJIJI(String str, String str2) {
        VAM vam;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return null;
        }
        return vam.LIZLLL(str, str2);
    }

    public final String LJIIL(String str, String str2, String str3) {
        VAM vam;
        if (this.LIZLLL != 2 || (vam = this.LIZIZ) == null) {
            return null;
        }
        return vam.LIZJ(str, str2, str3);
    }

    public final String LJIILIIL(String str, String str2, String str3) {
        String str4;
        String str5;
        if (this.LIZIZ == null) {
            return null;
        }
        if (("udpsdp".equals(str3) || "quicsdp".equals(str3)) && !"lls".equals(str)) {
            return null;
        }
        VAM vam = this.LIZIZ;
        if (vam.LIZIZ == null) {
            return null;
        }
        if (str.equals("rtmp")) {
            str4 = "rtmp_ports";
        } else {
            str4 = "http_ports";
        }
        try {
            str5 = new JSONObject(JSONObjectProtectorUtils.getJSONObject(vam.LIZIZ, str4).optString(str2)).optString(str3);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            str5 = null;
        }
        if (TextUtils.isEmpty(str5)) {
            return null;
        }
        return str5;
    }
}
