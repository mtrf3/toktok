package X;

/* loaded from: classes13.dex */
public /* synthetic */ class ST3 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ST4.values().length];
        try {
            iArr[ST4.FAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ST4.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ST4.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
