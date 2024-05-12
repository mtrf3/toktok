package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.0cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11520cm {
    public /* synthetic */ C11520cm() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode((float[]) null);
    }

    public static float[] LIZ() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public final String toString() {
        throw null;
    }

    public static final void LIZLLL(float[] fArr) {
        float f;
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            do {
                if (i == i2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[(i2 * 4) + i] = f;
                i2++;
            } while (i2 < 4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11520cm) {
            obj.getClass();
            if (o.LJ(null, null)) {
                return true;
            }
        }
        return false;
    }

    public static final long LIZIZ(float[] fArr, long j) {
        float LIZLLL = C10370av.LIZLLL(j);
        float LJ = C10370av.LJ(j);
        float f = 1 / (((fArr[7] * LJ) + (fArr[3] * LIZLLL)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        return C78923UyF.LIZ(((fArr[4] * LJ) + (fArr[0] * LIZLLL) + fArr[12]) * f, ((fArr[5] * LJ) + (fArr[1] * LIZLLL) + fArr[13]) * f);
    }

    public static final void LIZJ(float[] fArr, C10350at c10350at) {
        long LIZIZ = LIZIZ(fArr, C78923UyF.LIZ(c10350at.LIZ, c10350at.LIZIZ));
        long LIZIZ2 = LIZIZ(fArr, C78923UyF.LIZ(c10350at.LIZ, c10350at.LIZLLL));
        long LIZIZ3 = LIZIZ(fArr, C78923UyF.LIZ(c10350at.LIZJ, c10350at.LIZIZ));
        long LIZIZ4 = LIZIZ(fArr, C78923UyF.LIZ(c10350at.LIZJ, c10350at.LIZLLL));
        c10350at.LIZ = Math.min(Math.min(C10370av.LIZLLL(LIZIZ), C10370av.LIZLLL(LIZIZ2)), Math.min(C10370av.LIZLLL(LIZIZ3), C10370av.LIZLLL(LIZIZ4)));
        c10350at.LIZIZ = Math.min(Math.min(C10370av.LJ(LIZIZ), C10370av.LJ(LIZIZ2)), Math.min(C10370av.LJ(LIZIZ3), C10370av.LJ(LIZIZ4)));
        c10350at.LIZJ = Math.max(Math.max(C10370av.LIZLLL(LIZIZ), C10370av.LIZLLL(LIZIZ2)), Math.max(C10370av.LIZLLL(LIZIZ3), C10370av.LIZLLL(LIZIZ4)));
        c10350at.LIZLLL = Math.max(Math.max(C10370av.LJ(LIZIZ), C10370av.LJ(LIZIZ2)), Math.max(C10370av.LJ(LIZIZ3), C10370av.LJ(LIZIZ4)));
    }

    public static void LJ(float[] fArr, float f, float f2) {
        float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = (fArr[11] * 0.0f) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }
}
