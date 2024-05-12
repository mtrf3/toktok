package X;

/* loaded from: classes6.dex */
public /* synthetic */ class CWJ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CWI.values().length];
        try {
            iArr[CWI.StateConnected.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CWI.StateEnd.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CWI.StateStart.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CWI.StateIdl.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CWI.StatePause.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
