package com.ss.android.ugc.effectmanager.common.utils;

import X.C16880lQ;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* loaded from: classes2.dex */
public class ValueConvertUtil {
    public static long ConvertStringToLong(String str, long j) {
        if (str == null || str.isEmpty()) {
            return j;
        }
        try {
            j = CastLongProtector.valueOf(str).longValue();
            return j;
        } catch (NumberFormatException e) {
            C16880lQ.LLLLIIL(e);
            return j;
        }
    }
}
