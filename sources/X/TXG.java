package X;

/* loaded from: classes14.dex */
public /* synthetic */ class TXG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[TXF.values().length];
        try {
            iArr[TXF.SEND_REQUEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TXF.GO_LIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TXF.SEND_RESERVATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TXF.RESERVING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
