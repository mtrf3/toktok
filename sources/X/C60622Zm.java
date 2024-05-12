package X;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2Zm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60622Zm {
    public static final java.util.Map<String, Bundle> LIZ = new ConcurrentHashMap();

    public static final String LIZ(String str, String str2) {
        BaseBundle baseBundle;
        if (str == null || str.length() == 0 || str2.length() == 0) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        if (!concurrentHashMap.containsKey(str) || (baseBundle = (BaseBundle) concurrentHashMap.get(str)) == null) {
            return null;
        }
        return baseBundle.getString(str2);
    }

    public static final void LIZIZ(String str, String str2, String str3) {
        if (str == null || str.length() == 0 || str2.length() == 0 || str3 == null || str3.length() == 0) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        if (concurrentHashMap.containsKey(str)) {
            BaseBundle baseBundle = (BaseBundle) concurrentHashMap.get(str);
            if (baseBundle == null) {
                return;
            }
            baseBundle.putString(str2, str3);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(str2, str3);
        concurrentHashMap.put(str, bundle);
    }
}
