package X;

/* loaded from: classes13.dex */
public /* synthetic */ class STC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ST9.values().length];
        try {
            iArr[ST9.GENERATING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ST9.SUCCESSFUL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ST9.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ST9.IDLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ST9.IN_QUEUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
