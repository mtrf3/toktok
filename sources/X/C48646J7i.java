package X;

/* renamed from: X.J7i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48646J7i {
    public static EnumC79954VZm LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return EnumC79954VZm.PLAYBACK_STATE_STOPPED;
                    }
                    return EnumC79954VZm.PLAYBACK_STATE_ERROR;
                }
                return EnumC79954VZm.PLAYBACK_STATE_PAUSED;
            }
            return EnumC79954VZm.PLAYBACK_STATE_PLAYING;
        }
        return EnumC79954VZm.PLAYBACK_STATE_STOPPED;
    }
}
