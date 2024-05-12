package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.QPn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66955QPn {
    public static C66955QPn LIZIZ;
    public SharedPreferences LIZ;

    public static C66955QPn LIZ() {
        if (LIZIZ == null) {
            synchronized (C66955QPn.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C66955QPn();
                }
            }
        }
        return LIZIZ;
    }

    public static String LIZIZ(String str) {
        return str;
    }

    public final void LIZJ(String str, long j) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("whatever")) {
            return;
        }
        try {
            String LIZIZ2 = LIZIZ(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expire_timing", j);
            jSONObject.put("cache_value", "whatever");
            if (this.LIZ == null) {
                this.LIZ = F9J.LIZIZ(QWR.LIZ(), 0, "com_bytedance_sdk_account_utils_common_request_cache_helper");
            }
            SharedPreferences sharedPreferences = this.LIZ;
            if (sharedPreferences == null || System.currentTimeMillis() >= j) {
                return;
            }
            sharedPreferences.edit().putString(LIZIZ2, jSONObject.toString()).apply();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
