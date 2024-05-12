package com.bytedance.mt.protector.impl.string2number;

import X.C65415Plr;
import X.C65858Pt0;

/* loaded from: classes12.dex */
public class CastShortProtector extends C65858Pt0<Short> {
    public static short parseShort(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Short.parseShort(str);
            } catch (Throwable th) {
                Short sh = (Short) C65858Pt0.tryProtect(th, Short.class);
                if (sh != null) {
                    return sh.shortValue();
                }
                throw th;
            }
        }
        return Short.parseShort(str);
    }

    public static Short valueOf(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Short.valueOf(str);
            } catch (Throwable th) {
                Short sh = (Short) C65858Pt0.tryProtect(th, Short.class);
                if (sh != null) {
                    return sh;
                }
                throw th;
            }
        }
        return Short.valueOf(str);
    }

    public static short parseShort(String str, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Short.parseShort(str, i);
            } catch (Throwable th) {
                Short sh = (Short) C65858Pt0.tryProtect(th, Short.class);
                if (sh != null) {
                    return sh.shortValue();
                }
                throw th;
            }
        }
        return Short.parseShort(str, i);
    }

    public static Short valueOf(String str, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Short.valueOf(str, i);
            } catch (Throwable th) {
                Short sh = (Short) C65858Pt0.tryProtect(th, Short.class);
                if (sh != null) {
                    return sh;
                }
                throw th;
            }
        }
        return Short.valueOf(str, i);
    }
}
