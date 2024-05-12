package X;

/* loaded from: classes9.dex */
public /* synthetic */ class KHO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[KHP.values().length];
        try {
            iArr[KHP.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KHP.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KHP.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[KHP.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
