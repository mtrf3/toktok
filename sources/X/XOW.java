package X;

/* loaded from: classes16.dex */
public /* synthetic */ class XOW {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[XOX.values().length];
        try {
            iArr[XOX.PLAYBACK_STATE_PLAYING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[XOX.PLAYBACK_STATE_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[XOX.PLAYBACK_STATE_PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[XOX.PLAYBACK_STATE_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[XOX.PLAYBACK_STATE_STOPPED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
