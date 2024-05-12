package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.16k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C275816k {
    public boolean LIZ = true;

    public static boolean LIZ(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || TextUtils.isEmpty(str) || !jSONObject.has(str)) {
            return z;
        }
        if (jSONObject.optBoolean(str, z)) {
            C1JX.LJIIIIZZ("please replace True/False with 1/0 for setting :", str);
            return true;
        }
        if (jSONObject.optInt(str, z ? 1 : 0) == 1) {
            return true;
        }
        return false;
    }
}
