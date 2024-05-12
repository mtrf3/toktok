package X;

/* renamed from: X.RGq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69272RGq {
    public static final boolean LIZ(Boolean bool, boolean z) {
        if (bool == null) {
            return z;
        }
        return bool.booleanValue();
    }

    public static final double LIZIZ(double d, Double d2) {
        if (d2 == null) {
            return d;
        }
        return d2.doubleValue();
    }

    public static final float LIZJ(float f, Double d) {
        if (d == null) {
            return f;
        }
        return (float) d.doubleValue();
    }

    public static final Float LIZLLL(Double d, Float f) {
        if (d == null) {
            return f;
        }
        return Float.valueOf((float) d.doubleValue());
    }

    public static final float LJ(float f, Float f2) {
        if (f2 == null) {
            return f;
        }
        return f2.floatValue();
    }

    public static final int LJFF(int i, Integer num) {
        if (num == null) {
            return i;
        }
        return num.intValue();
    }

    public static final long LJI(long j, Integer num) {
        if (num == null) {
            return j;
        }
        return num.intValue();
    }

    public static final boolean LJII(Integer num, boolean z) {
        if (num == null) {
            return z;
        }
        if (num.intValue() != 0) {
            return true;
        }
        return false;
    }

    public static final long LJIIIIZZ(long j, Long l) {
        if (l == null) {
            return j;
        }
        return l.longValue();
    }

    public static final String LJIIIZ(Long l, String str) {
        String l2;
        if (l == null || (l2 = l.toString()) == null) {
            return str;
        }
        return l2;
    }
}
