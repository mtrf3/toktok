package X;

/* renamed from: X.XxS, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC86518XxS {
    COLD_START(1),
    WARM_START(2),
    HOT_START(3),
    ACCOUNT_LOGIN(4),
    FRONTIER(5),
    INBOX_BADGE_UPDATE(6),
    POLL(7);

    public final int LJLIL;

    public static EnumC86518XxS valueOf(String str) {
        return (EnumC86518XxS) V0N.LJJJ(EnumC86518XxS.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC86518XxS(int i) {
        this.LJLIL = i;
    }
}
