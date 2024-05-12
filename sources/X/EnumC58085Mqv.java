package X;

/* renamed from: X.Mqv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC58085Mqv {
    UNKNOWN(0),
    FIND_FRIENDS(1),
    SIGN_UP(2),
    LOGIN(3),
    NEW_VERSION(4),
    INBOX(5),
    USER_PROFILE(6),
    FOLLOWING_LIST(7),
    FRIENDS_TAB(8),
    INVITE_PANEL(9),
    PRIVACY_SETTING(10),
    SUGGEST_ACCOUNT(11),
    HOMEPAGE_FOLLOW(12),
    HOMEPAGE_HOT(13),
    COLD_START(20),
    SELF_PROFILE(6),
    OTHER_FOLLOWING_LIST(7);

    public final int LJLIL;

    public static EnumC58085Mqv valueOf(String str) {
        return (EnumC58085Mqv) V0N.LJJJ(EnumC58085Mqv.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC58085Mqv(int i) {
        this.LJLIL = i;
    }
}
