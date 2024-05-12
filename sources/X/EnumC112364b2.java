package X;

/* renamed from: X.4b2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC112364b2 {
    INBOX_TOP("inbox_top"),
    CHAT_CELL("chat_cell"),
    CHAT_ROOM("chat_room"),
    PROFILE_PAGE("profile_page"),
    SHARE_PANEL("share_panel"),
    LONG_PRESS_PANEL("long_press_panel"),
    MORE_PANEL("more_panel"),
    MENTION_PANEL("mention_panel"),
    VIEW_LIST("view_list"),
    LIKE_LIST("like_list"),
    LIKE_NOTIFICATION_SUBPAGE("like_notification_subpage"),
    INNER_PUSH("inner_push"),
    DM_INNER_PUSH("dm_inner_push"),
    PROFILE_VISITOR_LIST("profile_visitor_list"),
    GROUP_CHAT_RECOMMENDATION_PANEL("create_group_chat_panel");

    public final String LJLIL;

    public static EnumC112364b2 valueOf(String str) {
        return (EnumC112364b2) V0N.LJJJ(EnumC112364b2.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC112364b2(String str) {
        this.LJLIL = str;
    }
}
