package X;

/* loaded from: classes8.dex */
public /* synthetic */ class GWA {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[GWB.values().length];
        try {
            iArr[GWB.NOT_RETRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GWB.RETRY_BY_USER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GWB.RETRY_BY_PUBLISHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
