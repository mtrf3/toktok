package X;

/* renamed from: X.6U2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6U2 {
    public static C6U1 LIZ(int i) {
        C6U1 c6u1 = C6U1.LARGER_WHITE;
        if (i == c6u1.getValue()) {
            return c6u1;
        }
        C6U1 c6u12 = C6U1.SMALLER_WHITE;
        if (i != c6u12.getValue()) {
            c6u12 = C6U1.SMALLER_BLACK;
            if (i != c6u12.getValue()) {
                c6u12 = C6U1.LARGER_BLACK;
                if (i != c6u12.getValue()) {
                    return c6u1;
                }
            }
        }
        return c6u12;
    }
}
