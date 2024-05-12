package X;

/* loaded from: classes12.dex */
public /* synthetic */ class Q9Z {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Q9T.values().length];
        LIZ = iArr;
        try {
            iArr[Q9T.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[Q9T.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[Q9T.INTERNAL_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
