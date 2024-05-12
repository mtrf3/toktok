package com.ttnet.org.chromium.net;

import com.bytedance.mt.protector.impl.PatternProtector;

/* loaded from: classes2.dex */
public class TTPatternUtil {
    public static boolean isPatternStringValid(String str) {
        try {
            PatternProtector.compile(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
