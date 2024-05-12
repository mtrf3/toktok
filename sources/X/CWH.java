package X;

/* loaded from: classes6.dex */
public /* synthetic */ class CWH {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CWI.values().length];
        try {
            iArr[CWI.StateIdl.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CWI.StateStart.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CWI.StateConnected.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CWI.StatePause.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CWI.StateEnd.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
