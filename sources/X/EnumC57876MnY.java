package X;

import java.io.Serializable;

/* renamed from: X.MnY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC57876MnY implements Serializable {
    UNKNOWN(-1),
    SHARE_PANEL(1),
    AFTER_PERMISSION_POP_UP(2),
    VERSION_UPDATE(3),
    LOGIN_POPUP(4),
    FRIENDS_TAB_EMPTY(5),
    FYP_POPUP(6),
    INBOX_PROFILE_POPUP(7),
    FIND_FRIENDS(8),
    LEGACY_DM_LIST(9),
    OTHERS_PROFILE_PAGE(10),
    INBOX_PAGE(16),
    FOLLOWING_LIST(12),
    SUGGESTED_TAB_PAGE(13),
    HOMEPAGE_RECOMMEND(14),
    FEED_REC_USER_BIG_CARD(15),
    FYP_VIDEO(18),
    FRIENDS_TAB_VIDEO(19),
    TT_NOW_FEED(20),
    TT_NOW_FFP(21),
    TT_NOW_GUIDE_PAGE(22),
    TT_NOW_RED_DOT_PRELOAD(28),
    TT_INBOX_FRIENDS_LIST_TAB(32),
    TT_RELATION_PAGE_FRIENDS_LIST_TAB(33),
    TT_SEARCH_PAGE(36),
    MUTUAL_CONNECTION_RECOMMEND(37);

    public final int LJLIL;

    public static EnumC57876MnY valueOf(String str) {
        return (EnumC57876MnY) V0N.LJJJ(EnumC57876MnY.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC57876MnY(int i) {
        this.LJLIL = i;
    }
}
