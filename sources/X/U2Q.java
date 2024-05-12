package X;

/* loaded from: classes14.dex */
public /* synthetic */ class U2Q {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[U2O.values().length];
        try {
            iArr[U2O.BONUS_IN_PROCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[U2O.TASK_IN_PROCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[U2O.TASK_NOTICE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[U2O.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[U2O.TASK_FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[U2O.TASK_SUCCEED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[U2O.BONUS_FINISHED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        LIZ = iArr;
    }
}
