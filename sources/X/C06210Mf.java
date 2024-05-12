package X;

/* renamed from: X.0Mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06210Mf {
    public static float LIZ(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float LIZIZ(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int LIZJ(float f, int i, int i2) {
        if (C03970Dp.LIZ && i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float LIZ = LIZ(((i >> 16) & 255) / 255.0f);
        float LIZ2 = LIZ(((i >> 8) & 255) / 255.0f);
        float LIZ3 = LIZ((i & 255) / 255.0f);
        float LIZ4 = LIZ(((i2 >> 16) & 255) / 255.0f);
        float LIZ5 = LIZ(((i2 >> 8) & 255) / 255.0f);
        float LIZ6 = LIZ((i2 & 255) / 255.0f);
        float LIZIZ = C06420Na.LIZIZ(((i2 >> 24) & 255) / 255.0f, f2, f, f2);
        float LIZIZ2 = C06420Na.LIZIZ(LIZ4, LIZ, f, LIZ);
        float LIZIZ3 = C06420Na.LIZIZ(LIZ5, LIZ2, f, LIZ2);
        float LIZIZ4 = C06420Na.LIZIZ(LIZ6, LIZ3, f, LIZ3);
        float LIZIZ5 = LIZIZ(LIZIZ2) * 255.0f;
        float LIZIZ6 = LIZIZ(LIZIZ3) * 255.0f;
        return Math.round(LIZIZ(LIZIZ4) * 255.0f) | (Math.round(LIZIZ5) << 16) | (Math.round(LIZIZ * 255.0f) << 24) | (Math.round(LIZIZ6) << 8);
    }
}
