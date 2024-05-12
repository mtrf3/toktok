package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* loaded from: classes9.dex */
public final class J5L {
    public static final float LIZ = Float.intBitsToFloat(1056964608);

    public static void LIZ(String str, Float[] fArr, int i) {
        int i2;
        int i3;
        float intBitsToFloat;
        for (int i4 = 0; i4 < str.length() / 4 && i4 < i; i4++) {
            char[] cArr = new char[4];
            int i5 = i4 * 4;
            str.getChars(i5, i5 + 4, cArr, 0);
            int parseInt = CastIntegerProtector.parseInt(new String(cArr), 16) & 65535;
            int i6 = 32768 & parseInt;
            int i7 = (parseInt >>> 10) & 31;
            int i8 = parseInt & 1023;
            if (i7 == 0) {
                if (i8 != 0) {
                    intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - LIZ;
                    if (i6 != 0) {
                        intBitsToFloat = -intBitsToFloat;
                    }
                    fArr[i4] = Float.valueOf(intBitsToFloat);
                } else {
                    i2 = 0;
                    i3 = 0;
                }
            } else {
                i2 = i8 << 13;
                if (i7 == 31) {
                    i3 = 255;
                } else {
                    i3 = (i7 - 15) + 127;
                }
            }
            intBitsToFloat = Float.intBitsToFloat(i2 | (i6 << 16) | (i3 << 23));
            fArr[i4] = Float.valueOf(intBitsToFloat);
        }
    }
}
