package X;

/* renamed from: X.7uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC201127uu {
    SLIDE_RIGHT("swipe_right_from_page"),
    SLIDE_RIGHT_FROM_IMAGE("swipe_right_from_photo"),
    PULL_DOWN("pull_down"),
    SWIPE_DOWN("swipe_down"),
    PULL_UP("swipe_up"),
    BACK("click_back_button"),
    BACK_USE_SWIPE_ANIM("click_back_button"),
    BACK_USE_FADE_OUT_ANIM("back_fade_out_anim");

    public final String LJLIL;

    public static EnumC201127uu valueOf(String str) {
        return (EnumC201127uu) V0N.LJJJ(EnumC201127uu.class, str);
    }

    public final String getMobValue() {
        return this.LJLIL;
    }

    EnumC201127uu(String str) {
        this.LJLIL = str;
    }
}
