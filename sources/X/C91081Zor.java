package X;

/* renamed from: X.Zor, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public /* synthetic */ class C91081Zor {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC91310ZsY.values().length];
        try {
            iArr[EnumC91310ZsY.PLAYBACK_STATE_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC91310ZsY.PLAYBACK_STATE_PLAYING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC91310ZsY.PLAYBACK_STATE_PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC91310ZsY.PLAYBACK_STATE_STOPPED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC91310ZsY.PLAYBACK_STATE_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
