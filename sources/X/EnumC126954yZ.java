package X;

/* renamed from: X.4yZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC126954yZ {
    SERVER_GAME_PLAY("effect_server"),
    CLIENT_GAME_PLAY("effect_client"),
    COMBINE_GAME_PLAY("effect_combine");

    public final String LJLIL;

    public static EnumC126954yZ valueOf(String str) {
        return (EnumC126954yZ) V0N.LJJJ(EnumC126954yZ.class, str);
    }

    public final String getTypeName() {
        return this.LJLIL;
    }

    EnumC126954yZ(String str) {
        this.LJLIL = str;
    }
}
