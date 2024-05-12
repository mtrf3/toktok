package X;

/* loaded from: classes15.dex */
public /* synthetic */ class VXV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VXQ.values().length];
        LIZ = iArr;
        try {
            iArr[VXQ.PREPARED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[VXQ.PAUSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[VXQ.NOT_PREPARED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[VXQ.STOPPED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
