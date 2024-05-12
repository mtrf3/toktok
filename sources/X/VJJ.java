package X;

import com.lynx.tasm.base.LLog;

/* loaded from: classes15.dex */
public final class VJJ {
    public static float LIZIZ(float f) {
        if (f >= -3.4028235E38f && f <= Float.MAX_VALUE) {
            return f;
        }
        if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Invalid float property value: ");
        LIZ.append(f);
        LLog.LIZLLL(3, "lynx", X1D.LIZIZ(LIZ));
        return 0.0f;
    }

    public static boolean LIZ(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) && Float.isNaN(f2)) {
                return true;
            }
            return false;
        }
        if (Math.abs(f2 - f) < 1.0E-5f) {
            return true;
        }
        return false;
    }
}
