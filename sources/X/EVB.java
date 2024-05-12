package X;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public final class EVB {
    public static Class LIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            return Class.forName(str);
        }
        throw new Exception("pluginName or/and className is empty");
    }
}
