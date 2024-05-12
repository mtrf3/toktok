package com.bytedance.mt.protector.impl.string2number;

import X.C65415Plr;
import X.C65858Pt0;

/* loaded from: classes12.dex */
public class CastByteProtector extends C65858Pt0<Byte> {
    public static byte parseByte(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Byte.parseByte(str);
            } catch (Throwable th) {
                Byte b = (Byte) C65858Pt0.tryProtect(th, Byte.class);
                if (b != null) {
                    return b.byteValue();
                }
                throw th;
            }
        }
        return Byte.parseByte(str);
    }

    public static Byte valueOf(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Byte.valueOf(str);
            } catch (Throwable th) {
                Byte b = (Byte) C65858Pt0.tryProtect(th, Byte.class);
                if (b != null) {
                    return b;
                }
                throw th;
            }
        }
        return Byte.valueOf(str);
    }

    public static byte parseByte(String str, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Byte.parseByte(str, i);
            } catch (Throwable th) {
                Byte b = (Byte) C65858Pt0.tryProtect(th, Byte.class);
                if (b != null) {
                    return b.byteValue();
                }
                throw th;
            }
        }
        return Byte.parseByte(str, i);
    }

    public static Byte valueOf(String str, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Byte.valueOf(str, i);
            } catch (Throwable th) {
                Byte b = (Byte) C65858Pt0.tryProtect(th, Byte.class);
                if (b != null) {
                    return b;
                }
                throw th;
            }
        }
        return Byte.valueOf(str, i);
    }
}
