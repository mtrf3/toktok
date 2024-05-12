package X;

/* renamed from: X.YMj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC87257YMj {
    MUSIC_FAVORITE("music_favorite"),
    MUSIC_FAVORITE_CANCEL("music_favorite_cancel"),
    MUSIC_CLICK_TRIM("music_click_trim"),
    MUSIC_PLAY_TIME("music_play_time"),
    MUSIC_TRIM_COMPLETE("music_trim_complete"),
    MUSIC_ADD("music_add"),
    MUSIC_SECOND_JUMP("music_second_jump"),
    EFFECT_SECOND_JUMP("effect_second_jump"),
    EFFECT_FAVORITE("effect_favorite"),
    EFFECT_FAVORITE_CANCEL("effect_favorite_cancel"),
    MUSIC_SHOOT("music_shoot"),
    EFFECT_SHOOT("effect_shoot"),
    CLICK("click"),
    SHOW("show"),
    LIKE("like"),
    LIKE_CANCEL("like_cancel"),
    FAVORITE("favorite"),
    FAVORITE_CANCEL("favorite_cancel"),
    COMMENT("comment"),
    FOLLOW("follow"),
    FOLLOW_CANCEL("follow_cancel"),
    PRODUCT_SHOW("product_show"),
    PLAY_TIME("playtime"),
    VIDEO_PLAY("video_play"),
    SHOOT("shoot"),
    VIDEO_CLICK("click");

    public final String LJLIL;

    public static EnumC87257YMj valueOf(String str) {
        return (EnumC87257YMj) V0N.LJJJ(EnumC87257YMj.class, str);
    }

    public final String getAct() {
        return this.LJLIL;
    }

    EnumC87257YMj(String str) {
        this.LJLIL = str;
    }
}
