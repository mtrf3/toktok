package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0TZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TZ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "{}")) {
            try {
                return new JSONObject(str).optBoolean(str2, z);
            } catch (JSONException unused) {
                return false;
            }
        }
        return z;
    }
}
