package X;

/* renamed from: X.5JT, reason: invalid class name */
/* loaded from: classes3.dex */
public enum C5JT {
    EDITOR_TIMERANGE_FLAG_BEFORE_SPEED(0),
    EDITOR_TIMERANGE_FLAG_AFTER_SPEED(1);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static C5JT swigToEnum(int i) {
        C5JT[] c5jtArr = (C5JT[]) C5JT.class.getEnumConstants();
        if (i < c5jtArr.length && i >= 0) {
            C5JT c5jt = c5jtArr[i];
            if (c5jt.LJLIL == i) {
                return c5jt;
            }
        }
        for (C5JT c5jt2 : c5jtArr) {
            if (c5jt2.LJLIL == i) {
                return c5jt2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", C5JT.class, " with value ", i));
    }

    public static C5JT valueOf(String str) {
        return (C5JT) V0N.LJJJ(C5JT.class, str);
    }

    C5JT(int i) {
        this.LJLIL = i;
    }
}
