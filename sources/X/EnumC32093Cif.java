package X;

/* renamed from: X.Cif, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC32093Cif {
    SELF_MESSAGE_DISABLE(1006, "Disable gifts not sent by yourself"),
    SERVER_NO_GIFT_MODEL(1002, "gift model convert fail"),
    STICKER_NO_TRAY(1008, "No tray for this sticker gift"),
    SCREEN_CLEAR_MODE(1001, "Screen clear mode"),
    MESSAGE_DISCARDED(2005, "The gift message is discarded due to gift tray being cleared when the user leaves the LIVE room");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static EnumC32093Cif valueOf(String str) {
        return (EnumC32093Cif) V0N.LJJJ(EnumC32093Cif.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    public final String getDesc() {
        return this.LJLILLLLZI;
    }

    EnumC32093Cif(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
