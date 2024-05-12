package com.ss.ttlivestreamer.core.utils;

import X.C16880lQ;
import X.C48690J9a;
import X.X1D;
import defpackage.a1;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class MiscUtils {
    public static AtomicInteger mUUIDSuffix = new AtomicInteger(0);

    public static String getUUID(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(System.currentTimeMillis());
        LIZ.append("-");
        LIZ.append(mUUIDSuffix.incrementAndGet());
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (str != null) {
            return a1.LJ(str, "-", LIZIZ);
        }
        return LIZIZ;
    }

    public static boolean chooseBestResolution(int i, int i2, int i3, int i4, int[] iArr) {
        char c;
        int i5;
        int i6;
        int i7;
        int i8;
        char c2;
        if (iArr == null || iArr.length < 2) {
            return false;
        }
        int i9 = iArr[0];
        int i10 = iArr[1];
        if (i10 > 1 && i9 > 1) {
            AVLog.iod("MiscUtils", C48690J9a.LJIIJJI("Using default adapted resolution(", i9, "x", i10, ")"));
            return true;
        }
        if (i < 1 || i2 < 1) {
            if (i3 < 1 || i4 < 1) {
                return false;
            }
        } else {
            if (i3 >= 1) {
                if (i4 < 1) {
                    c2 = 0;
                }
            } else {
                c2 = 0;
            }
            iArr[c2] = i;
            iArr[1] = i2;
            AVLog.iod("MiscUtils", C48690J9a.LJIIJJI("Using source resolution as adapted resolution(", i, "x", i2, ")"));
            return true;
        }
        if (i >= 1) {
            if (i2 < 1) {
                c = 0;
            } else {
                int max = Math.max(i, i2);
                int min = Math.min(i, i2);
                while (true) {
                    i5 = max;
                    max = min;
                    if (min == 0) {
                        break;
                    }
                    min = i5 % min;
                }
                int i11 = i / i5;
                int i12 = i2 / i5;
                int i13 = i4 * i3;
                float f = ((i3 * 1.0f) / i4) / ((i * 1.0f) / i2);
                if (f >= 1.0f) {
                    i6 = i3 / i11;
                } else {
                    i6 = i4 / i12;
                }
                while (true) {
                    if (i6 <= i5) {
                        i7 = i11 * i6;
                        i8 = i12 * i6;
                        if (i7 * i8 >= i13 && ((f >= 1.0f && i7 >= i3) || (f <= 1.0f && i8 >= i4))) {
                            break;
                        }
                        i6++;
                    } else {
                        if (i6 < i5) {
                            return false;
                        }
                        i7 = i;
                        i8 = i2;
                    }
                }
                int i14 = ((i7 + 1) / 2) * 2;
                int i15 = ((i8 + 1) / 2) * 2;
                iArr[0] = i14;
                iArr[1] = i15;
                String LLLZ = C16880lQ.LLLZ("adapted resolution(%dx%d) aspect(%dx%d) cap(%dx%d) ref(%dx%d)", new Object[]{Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Find best ");
                LIZ.append(LLLZ);
                AVLog.iod("MiscUtils", X1D.LIZIZ(LIZ));
                return true;
            }
        } else {
            c = 0;
        }
        iArr[c] = i3;
        iArr[1] = i4;
        AVLog.iod("MiscUtils", C48690J9a.LJIIJJI("Using reference resolution as adapted resolution(", i3, "x", i4, ")"));
        return true;
    }

    public static boolean cropAndScaleResolution(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int[] iArr3) {
        if (i < 1 || i2 < 1 || i4 < 1 || i3 < 1) {
            return false;
        }
        float f = i;
        float f2 = i2;
        float f3 = (f * 1.0f) / f2;
        float f4 = (i3 * 1.0f) / i4;
        iArr3[0] = i3;
        iArr3[1] = i4;
        if (f3 == f4) {
            iArr[1] = 0;
            iArr[0] = 0;
            iArr2[0] = i;
            iArr2[1] = i2;
            return true;
        }
        if (f3 > f4) {
            int i5 = (int) (f4 * f2);
            iArr2[0] = i5;
            iArr2[1] = i2;
            iArr[0] = (i - i5) / 2;
            iArr[1] = 0;
        } else {
            iArr2[0] = i;
            int i6 = (int) (f / f4);
            iArr2[1] = i6;
            iArr[0] = 0;
            iArr[1] = (i2 - i6) / 2;
        }
        return true;
    }
}
