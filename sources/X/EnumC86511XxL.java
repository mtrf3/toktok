package X;

/* renamed from: X.XxL, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC86511XxL {
    START(1000),
    DROP_BY_PERMISSION(1),
    DROP_BY_EXPIRATION(2),
    DROP_BY_DUPLICATION(3),
    DROP_BY_FREQUENCY(4),
    DROP_BY_NOTICE_READ(5),
    DROP_BY_BUSINESS(6),
    DISPLAY_IN_APP(10),
    DISPLAY_EXTERNAL_APP(11),
    CANCEL_BY_USER(12),
    DROP(13),
    WAIT(14),
    CLICK(15),
    DISAPPEAR(16),
    WAIT_TO_DROP(17);

    public final int LJLIL;

    public static EnumC86511XxL valueOf(String str) {
        return (EnumC86511XxL) V0N.LJJJ(EnumC86511XxL.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC86511XxL(int i) {
        this.LJLIL = i;
    }
}
