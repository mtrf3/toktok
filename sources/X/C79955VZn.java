package X;

/* renamed from: X.VZn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public /* synthetic */ class C79955VZn {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC79954VZm.values().length];
        try {
            iArr[EnumC79954VZm.PLAYBACK_STATE_PLAYING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC79954VZm.PLAYBACK_STATE_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC79954VZm.PLAYBACK_STATE_PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC79954VZm.PLAYBACK_STATE_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC79954VZm.PLAYBACK_STATE_STOPPED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
