package X;

/* loaded from: classes16.dex */
public enum Y26 {
    CLICK_SEE_TRANSLATION("click_see_translation"),
    LAND_ON_ITEM("land_on_item"),
    TOOLTIP("tooltip"),
    TRANSLATION_TOGGLE_MASTER("translation_toggle_master"),
    TRANSLATION_TOGGLE_STICKER("translation_toggle_sticker"),
    TRANSLATION_TOGGLE_DESC("translation_toggle_desc"),
    DO_NOT_TRANSLATE_CHANGED("do_not_translate_changed"),
    UNKNOWN("unknown");

    public final String LJLIL;

    public static Y26 valueOf(String str) {
        return (Y26) V0N.LJJJ(Y26.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    Y26(String str) {
        this.LJLIL = str;
    }
}
