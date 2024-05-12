package X;

/* loaded from: classes15.dex */
public /* synthetic */ class VR3 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VR0.values().length];
        LIZ = iArr;
        try {
            iArr[VR0.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[VR0.CANCELED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[VR0.PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[VR0.RUNNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
