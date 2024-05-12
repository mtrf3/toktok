package X;

/* renamed from: X.VZq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC79958VZq {
    PLAYBACK_STATE_START("start"),
    PLAYBACK_STATE_PLAYING("play"),
    PLAYBACK_STATE_PAUSED("pause"),
    PLAYBACK_STATE_STOPPED("stop"),
    PLAYBACK_STATE_ENDED("ended"),
    PLAYBACK_STATE_ERROR("error");

    public final String LJLIL;

    public static EnumC79958VZq valueOf(String str) {
        return (EnumC79958VZq) V0N.LJJJ(EnumC79958VZq.class, str);
    }

    public final String getDesc() {
        return this.LJLIL;
    }

    EnumC79958VZq(String str) {
        this.LJLIL = str;
    }
}
