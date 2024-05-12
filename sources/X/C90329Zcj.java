package X;

/* renamed from: X.Zcj, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90329Zcj {
    public static void LIZ(int i, int i2) {
        String LIZ;
        if (i < 0 || i >= i2) {
            if (i >= 0) {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                LIZ = C90337Zcr.LIZ("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                LIZ = C90337Zcr.LIZ("%s (%s) must not be negative", "index", Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(LIZ);
        }
    }

    public static void LIZIZ(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(LIZLLL(i, i2, "index"));
        }
    }

    public static void LIZJ(int i, int i2, int i3) {
        String LIZLLL;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i >= 0 && i <= i3) {
                if (i2 < 0 || i2 > i3) {
                    LIZLLL = LIZLLL(i2, i3, "end index");
                } else {
                    LIZLLL = C90337Zcr.LIZ("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                }
            } else {
                LIZLLL = LIZLLL(i, i3, "start index");
            }
            throw new IndexOutOfBoundsException(LIZLLL);
        }
    }

    public static String LIZLLL(int i, int i2, String str) {
        if (i < 0) {
            return C90337Zcr.LIZ("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C90337Zcr.LIZ("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
