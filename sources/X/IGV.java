package X;

/* loaded from: classes9.dex */
public /* synthetic */ class IGV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ILD.values().length];
        try {
            iArr[ILD.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ILD.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ILD.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ILD.PAUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ILD.PREPARED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ILD.BUFFERING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ILD.PLAYING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        LIZ = iArr;
    }
}
