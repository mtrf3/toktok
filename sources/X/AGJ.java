package X;

/* loaded from: classes5.dex */
public enum AGJ {
    SETTINGS_PRIVACY_PAGE("settings_privacy_page"),
    SETTINGS_NEWVERSION_FRAGMENT("setting_newversion_fragment"),
    SETTINGS_BETA_EMAIL_REGISTER_PAGE("setting_beta_email_register_page"),
    SETTINGS_VIDEO_GIFT_PAGE("setting_video_gift_page"),
    ACCOUNT_SIGNUP_OR_LOGIN("account_signup_or_login"),
    ACCOUNT_KIDS_SIGNUP("account_kids_signup"),
    ACCOUNT_RU_SIGNUP("account_ru_signup"),
    ACCOUNT_EMAIL_SIGNUP("account_email_signup"),
    ACCOUNT_AGE_GATE("account_age_gate_signup"),
    CONSENT_BOX_ROW("consent_box_row"),
    CONSENT_BOX_KR("consent_box_kr"),
    CONSENT_BOX_KR_OLD("consent_box_kr_old"),
    CONSENT_BOX_ROW_OLD("consent_box_row_old"),
    GIFT_RECHARGE_PAGE("gift_recharge_page"),
    KIDS_SETTINGS("kids_settings"),
    VIDEO_GIFT("video_gift"),
    AD_EXPLANATION("ad_explanation"),
    NON_USED("non_used");

    public final String LJLIL;

    public static AGJ valueOf(String str) {
        return (AGJ) V0N.LJJJ(AGJ.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    AGJ(String str) {
        this.LJLIL = str;
    }
}
