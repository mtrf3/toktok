package X;

/* renamed from: X.Lbr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC54603Lbr {
    UNDEFINED(0),
    INBOX_TAB(1),
    FRIENDS_TAB(2),
    FOLLOW_TAB(3),
    GUIDE_CARD(4);

    public final long LJLIL;

    public static EnumC54603Lbr valueOf(String str) {
        return (EnumC54603Lbr) V0N.LJJJ(EnumC54603Lbr.class, str);
    }

    public final long getValue() {
        return this.LJLIL;
    }

    EnumC54603Lbr(long j) {
        this.LJLIL = j;
    }
}
