package X;

/* loaded from: classes15.dex */
public /* synthetic */ class VCJ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VCK.values().length];
        try {
            iArr[VCK.LIVE_PLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VCK.BROADCAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
