package X;

/* loaded from: classes12.dex */
public /* synthetic */ class QXO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[QXM.values().length];
        try {
            iArr[QXM.RECONNECT_WS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QXM.PUSH_RECEIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QXM.IMSDK_RECEIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[QXM.MIX_CHAIN_FIX.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[QXM.LOGOUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[QXM.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
