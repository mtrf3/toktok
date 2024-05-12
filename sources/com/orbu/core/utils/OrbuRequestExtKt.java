package com.orbu.core.utils;

import X.C17N;
import X.X1D;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class OrbuRequestExtKt {
    public static final String dataFlowId2Hex(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "null";
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("0x");
            int parseInt = CastIntegerProtector.parseInt(str);
            C17N.LJIIJ(16);
            String num = Integer.toString(parseInt, 16);
            o.LJIIIIZZ(num, "toString(this, checkRadix(radix))");
            LIZ.append(num);
            return X1D.LIZIZ(LIZ);
        } catch (Exception unused) {
            return "Exception";
        }
    }
}
