package com.lynx.tasm;

import X.C16880lQ;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.base.LLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class LynxError {
    public final int LIZ;
    public final String LIZIZ;
    public final JSONObject LIZJ;
    public String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final Map<String, Object> LJII;

    public final String LIZ() {
        if (TextUtils.isEmpty(this.LIZLLL)) {
            if (!TextUtils.isEmpty(this.LJ)) {
                JSONObject jSONObject = new JSONObject();
                String str = null;
                try {
                    jSONObject.put("error_code", this.LIZ);
                    LIZIZ("url", null, jSONObject);
                    LIZIZ("error", this.LJ, jSONObject);
                    LIZIZ("card_version", null, jSONObject);
                    LynxEnv.LJIIIZ().getClass();
                    LIZIZ("sdk", "2.10.16-rc.10", jSONObject);
                    LIZIZ("level", this.LJFF, jSONObject);
                    LIZIZ("fix_suggestion", this.LJI, jSONObject);
                    LIZIZ("error_stack", null, jSONObject);
                    Map<String, Object> map = this.LJII;
                    if (map != null) {
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                    }
                    str = jSONObject.toString();
                } catch (JSONException e) {
                    LLog.LIZLLL(4, "LynxError", e.getMessage());
                }
                if (str == null) {
                    str = "";
                }
                this.LIZLLL = str;
            } else {
                JSONObject jSONObject2 = this.LIZJ;
                if (jSONObject2 != null) {
                    this.LIZLLL = jSONObject2.toString();
                } else {
                    String str2 = this.LIZIZ;
                    if (str2 != null) {
                        this.LIZLLL = str2;
                    }
                }
            }
        }
        String str3 = this.LIZLLL;
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{\"code\": ");
        LIZ.append(this.LIZ);
        LIZ.append(",\"msg\":");
        LIZ.append(LIZ());
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public LynxError(int i, JSONObject jSONObject) {
        this.LIZIZ = "";
        this.LIZJ = jSONObject;
        this.LIZ = i;
        try {
            if (jSONObject.has("error")) {
                this.LIZIZ = JSONObjectProtectorUtils.getString(jSONObject, "error");
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public LynxError(String str, int i) {
        this.LIZIZ = "";
        this.LIZ = i;
        this.LIZIZ = str;
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            jSONObject.put(str, str2);
        }
    }

    public LynxError(int i, String str, String str2, String str3, Map map) {
        this.LIZIZ = "";
        this.LIZ = i;
        this.LJ = str;
        this.LJI = str2;
        this.LJFF = str3;
        this.LJII = map;
    }

    public static LynxError createLynxError(int i, String str, String str2, String str3, JavaOnlyMap javaOnlyMap) {
        return new LynxError(i, str, str2, str3, javaOnlyMap);
    }
}
