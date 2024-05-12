package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.2KM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2KM {
    public static final String LIZ(String str, String str2) {
        if (TextUtils.equals("homepage_hot", str) || TextUtils.equals("homepage_follow", str)) {
            return str2;
        }
        return "";
    }

    public static final java.util.Map<String, String> LIZIZ(String str, String str2) {
        HashMap hashMap = new HashMap();
        String LIZ = LIZ(str, str2);
        if (LIZ != null && LIZ.length() != 0) {
            hashMap.put("from_group_id", LIZ);
        }
        return hashMap;
    }
}
