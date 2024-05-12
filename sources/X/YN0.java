package X;

/* loaded from: classes16.dex */
public enum YN0 {
    HOMEPAGE_HOT("homepage_hot"),
    SEARCH_MIX("general_search"),
    SEARCH_USER("user_search"),
    SEARCH_VIDEO("video_search"),
    SHOOT_TWO_JUMPS("shoot_two_jumps"),
    USER_PAGE_VIDEO_TWO_JUMPS("user_page_video_two_jumps"),
    MUSIC_PAGE_VIDEO_TWO_JUMPS("music_page_video_two_jumps"),
    CREATION_SEARCH_MUSIC("creation_search_music"),
    CREATION_SEARCH_EFFECT("creation_search_effect"),
    FEED_SINGLE_SONG("single_song"),
    FEED_EFFECT_PAGE("prop_page"),
    OTHERS_HOMEPAGE("others_homepage");

    public final String LJLIL;

    public static YN0 valueOf(String str) {
        return (YN0) V0N.LJJJ(YN0.class, str);
    }

    public final String getScene() {
        return this.LJLIL;
    }

    YN0(String str) {
        this.LJLIL = str;
    }
}
