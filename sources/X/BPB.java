package X;

/* loaded from: classes6.dex */
public /* synthetic */ class BPB {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[BPA.values().length];
        try {
            iArr[BPA.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BPA.LOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BPA.UNLOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
