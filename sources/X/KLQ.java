package X;

/* loaded from: classes9.dex */
public final class KLQ {
    public static boolean LIZ(float f, float f2, float f3, float f4, float f5, float f6) {
        if (f > f3 && f < f4 && Math.abs(f2 - f5) <= f6) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(float f, float f2, float f3, float f4, float f5, float f6) {
        if (Math.abs(f - f3) <= f6 && f2 > f4 && f2 < f5) {
            return true;
        }
        return false;
    }
}
