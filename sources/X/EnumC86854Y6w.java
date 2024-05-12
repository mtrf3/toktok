package X;

/* renamed from: X.Y6w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC86854Y6w {
    GET_CURRENT_STATE(0),
    SIGN_AGREEMENT(1),
    INIT_RECORD_TASK(2),
    RECORD_COMMAND(3),
    CHECK_AUDIO_QUAILITY(4),
    GET_TEXT_INFO(5),
    UPLOAD_COMMAND(6),
    PLAY_COMMAND(7),
    GET_PLAYER_PROGRESS(8),
    GET_SPEAKER_INFO(9),
    SET_PUBLIC_PRIVATE(10),
    INIT(11),
    GET_RECORDING_STATUS(12),
    PREPARE_PLAYER(13),
    DESTROY_ENGINE(14);

    public int LJLIL;

    public static EnumC86854Y6w valueOf(String str) {
        return (EnumC86854Y6w) V0N.LJJJ(EnumC86854Y6w.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    public final void setValue(int i) {
        this.LJLIL = i;
    }

    EnumC86854Y6w(int i) {
        this.LJLIL = i;
    }
}
