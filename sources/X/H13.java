package X;

/* loaded from: classes8.dex */
public /* synthetic */ class H13 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[H14.values().length];
        try {
            iArr[H14.PREPARED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[H14.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[H14.DECODING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[H14.UPLOADING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[H14.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[H14.FAILED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
