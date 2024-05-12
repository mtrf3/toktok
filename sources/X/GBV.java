package X;

/* loaded from: classes8.dex */
public /* synthetic */ class GBV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[GBW.values().length];
        try {
            iArr[GBW.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GBW.SINGLE_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GBW.SINGLE_TASK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
