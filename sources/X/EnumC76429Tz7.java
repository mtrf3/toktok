package X;

/* renamed from: X.Tz7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC76429Tz7 {
    MATCH_HEALTH_BAR("match_score_bar"),
    MATCH_TITLE_BAR("match_title_bar"),
    CONTRIBUTE_ENTRANCE("match_contribute_entrance"),
    START_ANIMATION("match_start_animation"),
    PERSONAL_SCORE("match_personal_score"),
    RESULT_ANIMATION("match_result_animation"),
    REMATCH_BUTTON("match_rematch_button");

    public final String LJLIL;

    public static EnumC76429Tz7 valueOf(String str) {
        return (EnumC76429Tz7) V0N.LJJJ(EnumC76429Tz7.class, str);
    }

    public final String getScene() {
        return this.LJLIL;
    }

    EnumC76429Tz7(String str) {
        this.LJLIL = str;
    }
}
