package X;

/* loaded from: classes11.dex */
public /* synthetic */ class NGO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[NGM.values().length];
        try {
            iArr[NGM.DATA_LOAD_FAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NGM.LOAD_TIME_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NGM.RENDER_SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
