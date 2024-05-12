package X;

/* loaded from: classes16.dex */
public enum X6A {
    ENCODE_STANDARD_H264,
    ENCODE_STANDARD_ByteVC1,
    ENCODE_STANDARD_MPEG4,
    ENCODE_STANDARD_AUTO;

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static X6A swigToEnum(int i) {
        X6A[] x6aArr = (X6A[]) X6A.class.getEnumConstants();
        if (i < x6aArr.length && i >= 0) {
            X6A x6a = x6aArr[i];
            if (x6a.LJLIL == i) {
                return x6a;
            }
        }
        for (X6A x6a2 : x6aArr) {
            if (x6a2.LJLIL == i) {
                return x6a2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", X6A.class, " with value ", i));
    }

    public static X6A valueOf(String str) {
        return (X6A) V0N.LJJJ(X6A.class, str);
    }

    X6A() {
        int i = X6B.LIZ;
        X6B.LIZ = i + 1;
        this.LJLIL = i;
    }
}
