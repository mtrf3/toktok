package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.0fY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13240fY {
    public static final float[] LIZ;
    public static final float[] LIZIZ;
    public static final C1RU LIZJ;
    public static final C1RU LIZLLL;
    public static final C1RU LJ;
    public static final C1RU LJFF;
    public static final C1RU LJI;
    public static final C1RU LJII;
    public static final C1RU LJIIIIZZ;
    public static final C1RU LJIIIZ;
    public static final C1RU LJIIJ;
    public static final C1RU LJIIJJI;
    public static final C1RU LJIIL;
    public static final C1RU LJIILIIL;
    public static final C1RU LJIILJJIL;
    public static final C1RU LJIILL;
    public static final C1RX LJIILLIIL;
    public static final C1RS LJIIZILJ;
    public static final C1RU LJIJ;
    public static final C1RT LJIJI;
    public static final AbstractC13230fX[] LJIJJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.1RT] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.1RS] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.1RX] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        LIZ = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        LIZIZ = fArr2;
        C1RV c1rv = new C1RV(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1RV c1rv2 = new C1RV(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1RW c1rw = C13270fb.LIZLLL;
        C1RU c1ru = new C1RU("sRGB IEC61966-2.1", fArr, c1rw, c1rv, 0);
        LIZJ = c1ru;
        C1RU c1ru2 = new C1RU("sRGB IEC61966-2.1 (Linear)", fArr, c1rw, 1.0d, 0.0f, 1.0f, 1);
        LIZLLL = c1ru2;
        C1RU c1ru3 = new C1RU("scRGB-nl IEC 61966-2-2:2003", fArr, c1rw, null, AnonymousClass212.LJLIL, AnonymousClass213.LJLIL, -0.799f, 2.399f, c1rv, 2);
        LJ = c1ru3;
        C1RU c1ru4 = new C1RU("scRGB IEC 61966-2-2:2003", fArr, c1rw, 1.0d, -0.5f, 7.499f, 3);
        LJFF = c1ru4;
        C1RU c1ru5 = new C1RU("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c1rw, new C1RV(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        LJI = c1ru5;
        C1RU c1ru6 = new C1RU("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c1rw, new C1RV(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        LJII = c1ru6;
        C1RU c1ru7 = new C1RU("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C1RW(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        LJIIIIZZ = c1ru7;
        C1RU c1ru8 = new C1RU("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c1rw, c1rv, 7);
        LJIIIZ = c1ru8;
        C1RU c1ru9 = new C1RU("NTSC (1953)", fArr2, C13270fb.LIZ, new C1RV(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        LJIIJ = c1ru9;
        C1RU c1ru10 = new C1RU("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c1rw, new C1RV(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        LJIIJJI = c1ru10;
        C1RU c1ru11 = new C1RU("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c1rw, 2.2d, 0.0f, 1.0f, 10);
        LJIIL = c1ru11;
        C1RU c1ru12 = new C1RU("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, C13270fb.LIZIZ, new C1RV(1.8d, 1.0d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0.0625d, 0.031248d), 11);
        LJIILIIL = c1ru12;
        C1RW c1rw2 = C13270fb.LIZJ;
        C1RU c1ru13 = new C1RU("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c1rw2, 1.0d, -65504.0f, 65504.0f, 12);
        LJIILJJIL = c1ru13;
        C1RU c1ru14 = new C1RU("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c1rw2, 1.0d, -65504.0f, 65504.0f, 13);
        LJIILL = c1ru14;
        ?? r5 = new AbstractC13230fX() { // from class: X.1RX
            @Override // X.AbstractC13230fX
            public final float LIZIZ(int i) {
                return 2.0f;
            }

            @Override // X.AbstractC13230fX
            public final float LIZJ(int i) {
                return -2.0f;
            }

            {
                long j = C13210fV.LIZIZ;
            }

            public static float LJFF(float f) {
                return C78842Uww.LJIIJJI(f, -2.0f, 2.0f);
            }

            @Override // X.AbstractC13230fX
            public final float[] LIZ(float[] v) {
                o.LJIIIZ(v, "v");
                v[0] = LJFF(v[0]);
                v[1] = LJFF(v[1]);
                v[2] = LJFF(v[2]);
                return v;
            }

            @Override // X.AbstractC13230fX
            public final float[] LJ(float[] fArr3) {
                fArr3[0] = LJFF(fArr3[0]);
                fArr3[1] = LJFF(fArr3[1]);
                fArr3[2] = LJFF(fArr3[2]);
                return fArr3;
            }
        };
        LJIILLIIL = r5;
        ?? r3 = new AbstractC13230fX() { // from class: X.1RS
            @Override // X.AbstractC13230fX
            public final float LIZIZ(int i) {
                return i == 0 ? 100.0f : 128.0f;
            }

            @Override // X.AbstractC13230fX
            public final float LIZJ(int i) {
                return i == 0 ? 0.0f : -128.0f;
            }

            {
                long j = C13210fV.LIZJ;
            }

            @Override // X.AbstractC13230fX
            public final float[] LIZ(float[] v) {
                float f;
                float f2;
                float f3;
                o.LJIIIZ(v, "v");
                float f4 = v[0];
                float[] fArr3 = C13270fb.LJ;
                float f5 = f4 / fArr3[0];
                float f6 = v[1] / fArr3[1];
                float f7 = v[2] / fArr3[2];
                if (f5 > 0.008856452f) {
                    f = (float) Math.pow(f5, 0.33333334f);
                } else {
                    f = (f5 * 7.787037f) + 0.13793103f;
                }
                if (f6 > 0.008856452f) {
                    f2 = (float) Math.pow(f6, 0.33333334f);
                } else {
                    f2 = (f6 * 7.787037f) + 0.13793103f;
                }
                if (f7 > 0.008856452f) {
                    f3 = (float) Math.pow(f7, 0.33333334f);
                } else {
                    f3 = (f7 * 7.787037f) + 0.13793103f;
                }
                v[0] = C78842Uww.LJIIJJI((116.0f * f2) - 16.0f, 0.0f, 100.0f);
                v[1] = C78842Uww.LJIIJJI((f - f2) * 500.0f, -128.0f, 128.0f);
                v[2] = C78842Uww.LJIIJJI((f2 - f3) * 200.0f, -128.0f, 128.0f);
                return v;
            }

            @Override // X.AbstractC13230fX
            public final float[] LJ(float[] fArr3) {
                float f;
                float f2;
                float f3;
                fArr3[0] = C78842Uww.LJIIJJI(fArr3[0], 0.0f, 100.0f);
                fArr3[1] = C78842Uww.LJIIJJI(fArr3[1], -128.0f, 128.0f);
                float LJIIJJI2 = C78842Uww.LJIIJJI(fArr3[2], -128.0f, 128.0f);
                fArr3[2] = LJIIJJI2;
                float f4 = (fArr3[0] + 16.0f) / 116.0f;
                float f5 = (fArr3[1] * 0.002f) + f4;
                float f6 = f4 - (LJIIJJI2 * 0.005f);
                if (f5 > 0.20689656f) {
                    f = f5 * f5 * f5;
                } else {
                    f = (f5 - 0.13793103f) * 0.12841855f;
                }
                if (f4 > 0.20689656f) {
                    f2 = f4 * f4 * f4;
                } else {
                    f2 = (f4 - 0.13793103f) * 0.12841855f;
                }
                if (f6 > 0.20689656f) {
                    f3 = f6 * f6 * f6;
                } else {
                    f3 = 0.12841855f * (f6 - 0.13793103f);
                }
                float[] fArr4 = C13270fb.LJ;
                fArr3[0] = f * fArr4[0];
                fArr3[1] = f2 * fArr4[1];
                fArr3[2] = f3 * fArr4[2];
                return fArr3;
            }
        };
        LJIIZILJ = r3;
        C1RU c1ru15 = new C1RU("None", fArr, c1rw, c1rv2, 16);
        LJIJ = c1ru15;
        ?? r2 = new AbstractC13230fX() { // from class: X.1RT
            public static final float[] LIZLLL;
            public static final float[] LJ;
            public static final float[] LJFF;
            public static final float[] LJI;

            @Override // X.AbstractC13230fX
            public final float LIZIZ(int i) {
                return i == 0 ? 1.0f : 0.5f;
            }

            @Override // X.AbstractC13230fX
            public final float LIZJ(int i) {
                return i == 0 ? 0.0f : -0.5f;
            }

            static {
                float[] LJJJJZ = C79146V4k.LJJJJZ(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C79146V4k.LJJ(AbstractC13190fT.LIZIZ.LIZ, C13270fb.LIZIZ.L(), C13270fb.LIZLLL.L()));
                LIZLLL = LJJJJZ;
                float[] fArr3 = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
                LJ = fArr3;
                LJFF = C79146V4k.LJJIL(LJJJJZ);
                LJI = C79146V4k.LJJIL(fArr3);
            }

            {
                long j = C13210fV.LIZJ;
            }

            @Override // X.AbstractC13230fX
            public final float[] LIZ(float[] v) {
                o.LJIIIZ(v, "v");
                C79146V4k.LJJJLIIL(LIZLLL, v);
                double d = 0.33333334f;
                v[0] = Math.signum(v[0]) * ((float) Math.pow(Math.abs(v[0]), d));
                v[1] = Math.signum(v[1]) * ((float) Math.pow(Math.abs(v[1]), d));
                v[2] = Math.signum(v[2]) * ((float) Math.pow(Math.abs(v[2]), d));
                C79146V4k.LJJJLIIL(LJ, v);
                return v;
            }

            @Override // X.AbstractC13230fX
            public final float[] LJ(float[] fArr3) {
                fArr3[0] = C78842Uww.LJIIJJI(fArr3[0], 0.0f, 1.0f);
                fArr3[1] = C78842Uww.LJIIJJI(fArr3[1], -0.5f, 0.5f);
                fArr3[2] = C78842Uww.LJIIJJI(fArr3[2], -0.5f, 0.5f);
                C79146V4k.LJJJLIIL(LJI, fArr3);
                float f = fArr3[0];
                fArr3[0] = f * f * f;
                float f2 = fArr3[1];
                fArr3[1] = f2 * f2 * f2;
                float f3 = fArr3[2];
                fArr3[2] = f3 * f3 * f3;
                C79146V4k.LJJJLIIL(LJFF, fArr3);
                return fArr3;
            }
        };
        LJIJI = r2;
        LJIJJ = new AbstractC13230fX[]{c1ru, c1ru2, c1ru3, c1ru4, c1ru5, c1ru6, c1ru7, c1ru8, c1ru9, c1ru10, c1ru11, c1ru12, c1ru13, c1ru14, r5, r3, c1ru15, r2};
    }
}
