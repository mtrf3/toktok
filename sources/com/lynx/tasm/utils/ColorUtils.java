package com.lynx.tasm.utils;

import android.text.TextUtils;

/* loaded from: classes15.dex */
public class ColorUtils {
    public static native int nativeParse(String str);

    public static native boolean nativeValidate(String str);

    public static int LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return nativeParse(str);
    }
}
