package X;

/* renamed from: X.5SK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5SK {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        if (i < 3600) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ(i / 60));
            LIZ2.append(':');
            LIZ2.append(LIZIZ(i % 60));
            return X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZIZ(i / 3600));
        LIZ3.append(':');
        LIZ3.append(LIZ(i % 3600));
        return X1D.LIZIZ(LIZ3);
    }

    public static String LIZIZ(int i) {
        if (i < 10) {
            return C169696lJ.LIZIZ('0', i);
        }
        return String.valueOf(i);
    }
}
