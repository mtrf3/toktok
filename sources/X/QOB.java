package X;

/* loaded from: classes12.dex */
public /* synthetic */ class QOB {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[QOC.values().length];
        try {
            iArr[QOC.CONNECTION_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QOC.CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QOC.CONNECT_FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[QOC.CONNECT_CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[QOC.CONNECTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
