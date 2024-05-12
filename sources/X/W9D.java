package X;

import java.io.InputStream;

/* loaded from: classes15.dex */
public final class W9D {
    public static final Class<?> LIZ = W9D.class;

    public static int LIZ(InputStream inputStream, int i) {
        boolean z;
        int i2;
        int i3;
        boolean z2;
        C81844WAe c81844WAe = new C81844WAe();
        if (i > 8) {
            int LIZ2 = PUU.LIZ(inputStream, 4, false);
            int i4 = i - 4;
            Class<?> cls = LIZ;
            if (LIZ2 != 1229531648) {
                if (LIZ2 != 1296891946) {
                    W58.LIZLLL(cls, "Invalid TIFF header");
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            c81844WAe.LIZ = z;
            int LIZ3 = PUU.LIZ(inputStream, 4, z);
            c81844WAe.LIZIZ = LIZ3;
            i2 = i4 - 4;
            if (LIZ3 < 8 || LIZ3 - 8 > i2) {
                W58.LIZLLL(cls, "Invalid offset");
            }
            int i5 = c81844WAe.LIZIZ - 8;
            if (i2 == 0 && i5 <= i2) {
                inputStream.skip(i5);
                int i6 = i2 - i5;
                boolean z3 = c81844WAe.LIZ;
                if (i6 >= 14) {
                    int LIZ4 = PUU.LIZ(inputStream, 2, z3);
                    int i7 = i6 - 2;
                    while (true) {
                        int i8 = LIZ4 - 1;
                        if (LIZ4 <= 0 || i7 < 12) {
                            break;
                        }
                        i3 = i7 - 2;
                        if (PUU.LIZ(inputStream, 2, z3) == 274) {
                            break;
                        }
                        inputStream.skip(10L);
                        i7 = i3 - 10;
                        LIZ4 = i8;
                    }
                    z2 = c81844WAe.LIZ;
                    if (i3 >= 10 || PUU.LIZ(inputStream, 2, z2) != 3 || PUU.LIZ(inputStream, 4, z2) != 1) {
                        return 0;
                    }
                    int LIZ5 = PUU.LIZ(inputStream, 2, z2);
                    PUU.LIZ(inputStream, 2, z2);
                    return LIZ5;
                }
                i3 = 0;
                z2 = c81844WAe.LIZ;
                if (i3 >= 10) {
                    return 0;
                }
                int LIZ52 = PUU.LIZ(inputStream, 2, z2);
                PUU.LIZ(inputStream, 2, z2);
                return LIZ52;
            }
        }
        i2 = 0;
        int i52 = c81844WAe.LIZIZ - 8;
        return i2 == 0 ? 0 : 0;
    }
}
