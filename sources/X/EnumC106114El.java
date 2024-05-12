package X;

/* renamed from: X.4El, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC106114El {
    UNKNOWN(0),
    NORMAL_EMOJI(1),
    STICKER(2),
    ANIMATED_EMOJI(3),
    VIDEO_SHARE(4),
    NUDGE(5),
    NUDGE_BACK(6),
    STICKER_STORE(7),
    SUGGESTED_QUERY(8),
    SUGGESTED_REPLY(9);

    public static final C106254Ez Companion = new Object() { // from class: X.4Ez
    };
    public final int LJLIL;

    public static EnumC106114El valueOf(String str) {
        return (EnumC106114El) V0N.LJJJ(EnumC106114El.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC106114El(int i) {
        this.LJLIL = i;
    }
}
