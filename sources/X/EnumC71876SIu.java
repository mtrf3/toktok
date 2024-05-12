package X;

/* renamed from: X.SIu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC71876SIu {
    SUCCESS(0, "success"),
    DATA_ERROR(10000, "data error"),
    LIVE_CARD_PAUSE(10001, "live card pause"),
    LIVE_CARD_STOP(10002, "live card stop"),
    LIVE_CARD_DETACH(10003, "live card detach"),
    LIVE_CARD_DESTROY(10004, "live card destroy");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static EnumC71876SIu valueOf(String str) {
        return (EnumC71876SIu) V0N.LJJJ(EnumC71876SIu.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    public final String getMsg() {
        return this.LJLILLLLZI;
    }

    EnumC71876SIu(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
