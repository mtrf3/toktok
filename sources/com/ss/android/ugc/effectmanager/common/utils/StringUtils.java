package com.ss.android.ugc.effectmanager.common.utils;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public class StringUtils {
    public static boolean substringSafetyCheck(String str, int i, int i2) {
        if (TextUtils.isEmpty(str) || i < 0 || i2 < 0 || i >= i2 || i >= str.length() || i2 > str.length()) {
            return false;
        }
        return true;
    }
}
