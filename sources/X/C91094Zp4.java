package X;

/* renamed from: X.Zp4, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public /* synthetic */ class C91094Zp4 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC91305ZsT.values().length];
        try {
            iArr[EnumC91305ZsT.LOAD_STATE_STALLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC91305ZsT.LOAD_STATE_PLAYABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC91310ZsY.values().length];
        try {
            iArr2[EnumC91310ZsY.PLAYBACK_STATE_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC91310ZsY.PLAYBACK_STATE_PLAYING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC91310ZsY.PLAYBACK_STATE_PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC91310ZsY.PLAYBACK_STATE_STOPPED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC91310ZsY.PLAYBACK_STATE_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        LIZIZ = iArr2;
    }
}
