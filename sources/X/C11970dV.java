package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.0dV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11970dV implements Comparable<C11970dV> {
    public static final C11940dS LJLIL = new Object() { // from class: X.0dS
    };
    public static final float LJLILLLLZI;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0dS] */
    static {
        LIZJ(1.0f);
        LIZJ(-1.0f);
        LJLILLLLZI = Float.intBitsToFloat(1056964608);
    }

    public static short LIZJ(float f) {
        int i;
        LJLIL.getClass();
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i2 = floatToRawIntBits >>> 31;
        int i3 = (floatToRawIntBits >>> 23) & 255;
        int i4 = floatToRawIntBits & 8388607;
        int i5 = 31;
        int i6 = 0;
        if (i3 == 255) {
            if (i4 != 0) {
                i6 = 512;
            }
        } else {
            int i7 = (i3 - 127) + 15;
            if (i7 >= 31) {
                i5 = 49;
            } else if (i7 <= 0) {
                if (i7 >= -10) {
                    int i8 = (i4 | 8388608) >> (1 - i7);
                    if ((i8 & 4096) != 0) {
                        i8 += FileUtils.BUFFER_SIZE;
                    }
                    i6 = i8 >> 13;
                }
                i5 = 0;
            } else {
                i6 = i4 >> 13;
                if ((i4 & 4096) != 0) {
                    i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                    return (short) i;
                }
                i5 = i7;
            }
        }
        i = (i2 << 15) | (i5 << 10) | i6;
        return (short) i;
    }

    public static final float LIZLLL(short s) {
        int i;
        int i2;
        int i3 = s & 65535;
        int i4 = 32768 & i3;
        int i5 = (i3 >>> 10) & 31;
        int i6 = i3 & 1023;
        if (i5 == 0) {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - LJLILLLLZI;
                if (i4 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i2 = 0;
            i = 0;
        } else {
            i = i6 << 13;
            if (i5 == 31) {
                if (i != 0) {
                    i |= 4194304;
                }
                i2 = 255;
            } else {
                i2 = (i5 - 15) + 127;
            }
        }
        return Float.intBitsToFloat((i2 << 23) | (i4 << 16) | i);
    }
}
