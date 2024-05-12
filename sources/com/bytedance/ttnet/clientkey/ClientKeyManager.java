package com.bytedance.ttnet.clientkey;

import X.C16880lQ;
import X.C36910EeA;
import X.C45243HpH;
import X.C45804HyK;
import X.C47135Ieh;
import X.EJ6;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import defpackage.i0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ClientKeyManager {
    public static volatile ClientKeyManager LJI = null;
    public static Keva LJII = null;
    public static volatile boolean LJIIIIZZ = false;
    public static boolean LJIIIZ = true;
    public static Map<String, String> LJIIJ;
    public final List<String> LIZ = new CopyOnWriteArrayList();
    public final List<String> LIZIZ = new CopyOnWriteArrayList();
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";

    static {
        C16880lQ.LJLLJ(ClientKeyManager.class);
    }

    public static ClientKeyManager LJFF() {
        if (LJI == null) {
            synchronized (ClientKeyManager.class) {
                if (LJI == null) {
                    LJI = new ClientKeyManager();
                }
            }
        }
        return LJI;
    }

    public static Map<String, String> getClientKeyHeaders() {
        if (LJII == null || !LJIIIIZZ) {
            return null;
        }
        if (LJIIIZ) {
            return LJIIJ;
        }
        return LJ(LJII.getString("client_key", ""), LJII.getString("kms_version", ""));
    }

    public final void LIZ(String str) {
        if (LJII == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject optJSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "data").optJSONObject("client_key_config");
            if (optJSONObject == null) {
                Logger.debug();
                LJIIIIZZ = false;
                LJII.clear();
            } else {
                String jSONObject = optJSONObject.toString();
                Logger.debug();
                LJII.storeString("client_key_config", jSONObject);
                LIZIZ(optJSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZIZ(JSONObject jSONObject) {
        boolean z;
        if (jSONObject.optInt("client_key_sign_enabled", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        LJIIIIZZ = z;
        if (!LJIIIIZZ) {
            Logger.debug();
            LJII.clear();
            return;
        }
        ((CopyOnWriteArrayList) this.LIZ).clear();
        String optString = jSONObject.optString("update_host_list", null);
        if (!TextUtils.isEmpty(optString)) {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                if (!TextUtils.isEmpty(string)) {
                    ((CopyOnWriteArrayList) this.LIZ).add(string);
                }
            }
        }
        ((CopyOnWriteArrayList) this.LIZIZ).clear();
        String optString2 = jSONObject.optString("update_path_list", null);
        if (!TextUtils.isEmpty(optString2)) {
            JSONArray jSONArray2 = new JSONArray(optString2);
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string2 = JSONArrayProtectorUtils.getString(jSONArray2, i2);
                if (!TextUtils.isEmpty(string2)) {
                    ((CopyOnWriteArrayList) this.LIZIZ).add(string2);
                }
            }
        }
    }

    public final void LIZJ(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(System.currentTimeMillis());
            LIZ.append("");
            jSONObject.put("report_time", X1D.LIZIZ(LIZ));
            jSONObject.put("cookie_line", str);
            jSONObject.put("session_id", this.LIZLLL);
            jSONObject.put("url", this.LJ);
            C45804HyK.LJJJJZI("cookie_mismatch", null, Integer.MAX_VALUE, jSONObject);
        } catch (Throwable unused) {
        }
    }

    public static String LIZLLL(C36910EeA c36910EeA, String str) {
        EJ6 LIZ = c36910EeA.LIZ(str);
        if (LIZ == null) {
            return "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(LIZ.toString());
        return i0.LJFF(X1D.LIZIZ(LIZ2), "; ");
    }

    public static Map<String, String> LJ(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return C45243HpH.LIZ("x-bd-client-key", str, "x-bd-kmsv", str2);
    }

    public static void LJI(int i, String str, String str2, String str3, String str4, String str5, String str6, C36910EeA c36910EeA, String str7) {
        JSONObject LJ = C47135Ieh.LJ("origin_sid", str, "sid", str2);
        LJ.put("origin_key", str3);
        LJ.put("key", str4);
        LJ.put("origin_kms", str5);
        LJ.put("kms", str6);
        String LIZLLL = LIZLLL(c36910EeA, "x-tt-token");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZLLL);
        LIZ.append(LIZLLL(c36910EeA, "x-tt-logid"));
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZIZ);
        LIZ2.append(LIZLLL(c36910EeA, "x-bd-lanusk"));
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZIZ2);
        LIZ3.append(LIZLLL(c36910EeA, "x-bd-lanusv"));
        String LIZIZ3 = X1D.LIZIZ(LIZ3);
        if (!TextUtils.isEmpty(LIZIZ3)) {
            LJ.put("headers", LIZIZ3);
        }
        C45804HyK.LJJJJZI("client_key", str7, i, LJ);
    }
}
