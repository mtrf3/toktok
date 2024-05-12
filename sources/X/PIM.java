package X;

/* loaded from: classes12.dex */
public /* synthetic */ class PIM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[PIN.values().length];
        LIZ = iArr;
        try {
            iArr[PIN.PARALLEL_WRAPPER_MODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[PIN.SERIAL_WRAPPER_MODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
