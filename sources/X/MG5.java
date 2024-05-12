package X;

/* loaded from: classes10.dex */
public enum MG5 {
    DEFAULT(""),
    FULL_FEED("full_feed"),
    FOLLOW_FEED("follow_feed"),
    TAB_FRIENDS("tab_friends"),
    RECOMMEND_FEED("recommend_feed"),
    FANS("fans"),
    OTHER_FANS("other_fans"),
    OTHER_FOLLOWING("other_following"),
    SUGGESTED_LIST("suggested_list"),
    PUSH_SETTINGS("push_settings"),
    FIND_FRIENDS("find_friends"),
    PERSONAL_PUBLIC_TAB("personal_public_tab"),
    PERSONAL_FAVORITE_TAB("personal_favorite_tab"),
    PERSONAL_PRIVATE_TAB("personal_private_tab"),
    PERSONAL_REPOSTED_TAB("personal_reposted_tab"),
    PERSONAL_MUSIC_TAB("personal_music_tab"),
    PERSONAL_EFFECT_TAB("personal_effect_tab"),
    PERSONAL_COLLECTION_VIDEOS_TAB("personal_collection_videos_tab"),
    OTHERS_PUBLIC_TAB("others_public_tab"),
    OTHERS_FAVORITE_TAB("others_favorite_tab"),
    OTHERS_PRIVATE_TAB("others_private_tab"),
    OTHERS_MUSIC_TAB("others_music_tab"),
    OTHERS_EFFECT_TAB("others_effect_tab"),
    OTHERS_COLLECTION_VIDEOS_TAB("others_collection_videos_tab"),
    SHARE_PANEL("share_panel"),
    CHAT("chat"),
    GIPHY_BOTTOM_PANEL("giphy_bottom_panel"),
    GIPHY_EMBEDDED_PANEL("giphy_embedded_panel"),
    CHAT_GROUP_SELECT("chat_group_select"),
    CHAT_GROUP_EDIT("chat_group_edit"),
    CHAT_DETAILS("chat_details"),
    CHAT_GROUP_SHARE("chat_group_share"),
    CHAT_LIST("chat_list"),
    INBOX_NEW_FOLLOWER_FRIENDS_TAB("inbox_new_follower_friends_tab"),
    RELATION_PAGE_FRIENDS_TAB("relation_page_friends_tab"),
    MUTUAL_RELATION_TAB("mutual_relation_tab"),
    INBOX_ACTIVITY("inbox_activity"),
    LIVE_TAB("live_tab");

    public final String LJLIL;

    public static MG5 valueOf(String str) {
        return (MG5) V0N.LJJJ(MG5.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    MG5(String str) {
        this.LJLIL = str;
    }
}
