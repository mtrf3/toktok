package X;

/* loaded from: classes9.dex */
public /* synthetic */ class KHR {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[KHP.values().length];
        try {
            iArr[KHP.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KHP.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KHP.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
