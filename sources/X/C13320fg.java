package X;

/* renamed from: X.0fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13320fg {
    public static float LIZ(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        if (f7 < 0.0f) {
            return -f7;
        }
        return f7;
    }

    public static boolean LIZIZ(double d, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        if (Math.abs(((Number) interfaceC88472Yns.invoke(Double.valueOf(d))).doubleValue() - ((Number) interfaceC88472Yns2.invoke(Double.valueOf(d))).doubleValue()) <= 0.001d) {
            return true;
        }
        return false;
    }
}
