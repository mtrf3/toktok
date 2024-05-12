package X;

/* loaded from: classes7.dex */
public /* synthetic */ class FAD {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[FAB.values().length];
        LIZ = iArr;
        try {
            iArr[FAB.WATCH_EXECUTE_TRANSACTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[FAB.WATCH_MAIN_FRAME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[FAB.WATCH_WINDOW_FOCUS_CHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[FAB.WATCH_UI_FRAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZ[FAB.DOUBLE_CHECK_WATCH_EXECUTE_TRANSACTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
