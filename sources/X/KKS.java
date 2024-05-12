package X;

/* loaded from: classes9.dex */
public /* synthetic */ class KKS {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[KKR.values().length];
        try {
            iArr[KKR.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KKR.SUCCESS_EMPTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KKR.FAILURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
