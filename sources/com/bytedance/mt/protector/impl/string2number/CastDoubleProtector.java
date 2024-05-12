package com.bytedance.mt.protector.impl.string2number;

import X.C65415Plr;
import X.C65858Pt0;

/* loaded from: classes9.dex */
public class CastDoubleProtector extends C65858Pt0<Double> {
    public static double parseDouble(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Double.parseDouble(str);
            } catch (Throwable th) {
                Double d = (Double) C65858Pt0.tryProtect(th, Double.class);
                if (d != null) {
                    return d.doubleValue();
                }
                throw th;
            }
        }
        return Double.parseDouble(str);
    }

    public static Double valueOf(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Double.valueOf(str);
            } catch (Throwable th) {
                Double d = (Double) C65858Pt0.tryProtect(th, Double.class);
                if (d != null) {
                    return d;
                }
                throw th;
            }
        }
        return Double.valueOf(str);
    }
}
