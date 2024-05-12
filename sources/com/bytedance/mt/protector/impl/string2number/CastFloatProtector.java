package com.bytedance.mt.protector.impl.string2number;

import X.C65415Plr;
import X.C65858Pt0;

/* loaded from: classes9.dex */
public class CastFloatProtector extends C65858Pt0<Float> {
    public static float parseFloat(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Float.parseFloat(str);
            } catch (Throwable th) {
                Float f = (Float) C65858Pt0.tryProtect(th, Float.class);
                if (f != null) {
                    return f.floatValue();
                }
                throw th;
            }
        }
        return Float.parseFloat(str);
    }

    public static Float valueOf(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Float.valueOf(str);
            } catch (Throwable th) {
                Float f = (Float) C65858Pt0.tryProtect(th, Float.class);
                if (f != null) {
                    return f;
                }
                throw th;
            }
        }
        return Float.valueOf(str);
    }
}
