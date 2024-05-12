package X;

/* renamed from: X.0Nd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06450Nd {
    public static final float[] LIZ;

    static {
        float LIZ2;
        float f;
        float f2;
        float f3;
        float f4;
        float[] fArr = new float[101];
        LIZ = fArr;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i = 0;
        while (true) {
            float f7 = 1.0f;
            if (i < 100) {
                int i2 = i + 1;
                float f8 = i / 100;
                float f9 = 1.0f;
                while (true) {
                    LIZ2 = C1I0.LIZ(f9, f5, 2.0f, f5);
                    f = 3.0f;
                    f2 = f7 - LIZ2;
                    f3 = LIZ2 * 3.0f * f2;
                    f4 = LIZ2 * LIZ2 * LIZ2;
                    float LIZ3 = C1I1.LIZ(LIZ2, 0.35000002f, 0.175f * f2, f3) + f4;
                    if (Math.abs(LIZ3 - f8) < 1.0E-5d) {
                        break;
                    }
                    if (LIZ3 > f8) {
                        f9 = LIZ2;
                    } else {
                        f5 = LIZ2;
                    }
                    f7 = 1.0f;
                }
                float f10 = 0.5f;
                fArr[i] = (((f2 * 0.5f) + LIZ2) * f3) + f4;
                float f11 = 1.0f;
                float f12 = 2.0f;
                while (true) {
                    float LIZ4 = C1I0.LIZ(f11, f6, f12, f6);
                    float f13 = 1.0f - LIZ4;
                    float LIZ5 = C1I1.LIZ(f13, f10, LIZ4, f * LIZ4 * f13) + (LIZ4 * LIZ4 * LIZ4);
                    if (Math.abs(LIZ5 - f8) < 1.0E-5d) {
                        break;
                    }
                    if (LIZ5 > f8) {
                        f11 = LIZ4;
                    } else {
                        f6 = LIZ4;
                    }
                    f10 = 0.5f;
                    f12 = 2.0f;
                    f = 3.0f;
                }
                i = i2;
            } else {
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public static C06440Nc LIZ(float f) {
        float f2;
        float f3;
        float f4 = 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = LIZ;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = C06420Na.LIZIZ(f, f5, f3, f7);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new C06440Nc(f2, f3);
    }
}
