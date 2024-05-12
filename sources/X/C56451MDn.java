package X;

/* renamed from: X.MDn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56451MDn {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(int i) {
        if (i < 10) {
            return C169696lJ.LIZIZ('0', i);
        }
        return String.valueOf(i);
    }

    public static int LIZJ(int i) {
        if (i <= 0) {
            return 0;
        }
        return i / 1000;
    }

    public static String LIZ(int i, boolean z) {
        if (i < 3600) {
            if (z) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("00:");
                LIZ2.append(LIZIZ(i / 60));
                LIZ2.append(':');
                LIZ2.append(LIZIZ(i % 60));
                return X1D.LIZIZ(LIZ2);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZIZ(i / 60));
            LIZ3.append(':');
            LIZ3.append(LIZIZ(i % 60));
            return X1D.LIZIZ(LIZ3);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(LIZIZ(i / 3600));
        LIZ4.append(':');
        LIZ4.append(LIZ(i % 3600, false));
        return X1D.LIZIZ(LIZ4);
    }

    public static CharSequence LIZLLL(float f, int i) {
        boolean z;
        int i2 = (int) ((f * i) / 100);
        if (i >= 3600) {
            z = true;
        } else {
            z = false;
        }
        return LIZ(i2, z);
    }
}
