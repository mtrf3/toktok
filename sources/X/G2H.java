package X;

/* loaded from: classes7.dex */
public enum G2H {
    SHOW_SLOGAN_PAGE("show_slogan_page"),
    EXIT_SLOGAN_PAGE("exit_slogan_page"),
    SHOW_INTEREST_SELECTION("show_interest_selection"),
    EXIT_INTEREST_SELECTION("exit_interest_selection"),
    SHOW_CONSENT_BOX("show_consent_box"),
    CONFIRM_CONSENT_BOX("confirm_consent_box"),
    SHOW_LANGUAGE_POPUP("show_language_popup"),
    CHOOSE_LANGUAGE_POPUP("choose_language_popup"),
    SHOW_CONTENT_LANGUAGE_POPUP("show_content_language_popup"),
    CHOOSE_CONTENT_LANGUAGE_POPUP("choose_content_language_popup"),
    SHOW_DEEPLINK("show_deeplink"),
    EXIT_DEEPLINK("exit_deeplink"),
    DEEPLINK_EMPTY("deeplink_empty"),
    SLOGAN_OPTIMIZE("slogan_optimize"),
    WELCOME_SCREEN_SHOW("welcomescreen_show"),
    START_WATCHING_BUTTON_SHOW("start_watching_button_show"),
    EXIT_WELCOME_SCREEN("exit_welcomescreen"),
    NEW_USER_GUIDE_SHOW("new_user_guide_show"),
    NEW_USER_GUIDE_DISAPPEAR("new_user_guide_disappear"),
    VIDEO_PLAY("video_play"),
    HYBRID_AB_EXPOSE("hybrid_ab_expose"),
    INTEREST_SELECTION_DID_LOAD("interest_selection_did_load"),
    INTEREST_SELECTION_DID_SHOW("interest_selection_did_show"),
    INTEREST_SELECTION_SCROLL_ACTIVITY("interest_selection_scroll_activity"),
    INTEREST_SELECTION_DONE_CLICK_IGNORE("interest_selection_done_click_ignore"),
    INTEREST_SELECTION_SKIP_CLICK_IGNORE("interest_selection_skip_click_ignore"),
    NUJ_FINISHED("nuj_finished"),
    NUJ_STEP_FLUENCY("nuj_step_fluency");

    public final String LJLIL;

    public static G2H valueOf(String str) {
        return (G2H) V0N.LJJJ(G2H.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }

    G2H(String str) {
        this.LJLIL = str;
    }
}
