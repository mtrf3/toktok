package X;

import java.util.LinkedHashMap;

/* renamed from: X.E4t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC35839E4t {
    HYBRID_AB_DRY_RUN_DATA(1002),
    PROGRESS_BAR_DATA(1003),
    VIDEO_TUTORIAL_DATA(1005),
    FIRST_LIKE_TOAST_DATA(1006),
    COHORT_SUBSCRIBE_DATA(1008),
    ON_BOARDING_FLOW_DATA(1009),
    SHORTCUTS_DATA(1011),
    REVERSE_NUJ_DATA(1014),
    PERSONALIZED_NUJ_V2_DATA(1015),
    NON_FORCED_REGION_QUICK_LOGIN(1019),
    PERSONALIZED_NUJ_PRELOAD_DATA(1020),
    REVERSE_IS_DATA(1021),
    CDID_TEST_DATA(1024),
    TOOLTIP_PROTECTION(1025),
    REMOVE_IS_DATA(1026),
    FLEXIBLE_REMOVE_NUJ_DATA(1027),
    PREDICT_SCORE_PROGRESS_BAR_DATA(1028),
    PREVIOUS_LOGIN_DATA(1029),
    COHORT_NEW_USER_MODE(1030),
    PROACTIVE_LOGIN_SINGLE_TRIGGER(1031),
    COHORT_PROACTIVE_LOGIN(1033),
    PROACTIVE_LOGIN_REPEATED_TRIGGER(1034),
    REFACTOR_NUJ_FRAMEWORK(1022003),
    FORCE_LOGIN(1022007),
    REDUCE_LOGIN_NOTIFICATION_PLUGIN(1022012),
    NUJ_NUDGE_FOR_NEW_INSTALL(1022013),
    SP_REMOVE_CONSENT(1022017),
    NUJ_POPUP_CLEAN(1022018),
    UB_TRACKING_CONFIG(1022023),
    SP_SIGNUP_NICKNAME_ANDROID(2000006),
    SP_UNLOGIN_DIGG_NEW_USER_V2(2000009),
    SIGNUP_AVATAR_ANDROID(3000001),
    SIGN_UP_REGION_ENTRANCE(4000006),
    CONSENT_BOX_IMPROVED(4000002),
    CONSENT_BOX_IGNORE_LIST(4000005),
    INCREASE_LOGIN_NOTIFY(1022029),
    SP_GOOGLE_ONE_TAP_EEA_ROW_DNU_DATA(2000010);

    public static final C35838E4s Companion = new C35838E4s();
    public static final java.util.Map<Integer, EnumC35839E4t> pluginMap;
    public final int LJLIL;

    public static EnumC35839E4t valueOf(String str) {
        return (EnumC35839E4t) V0N.LJJJ(EnumC35839E4t.class, str);
    }

    static {
        EnumC35839E4t[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (EnumC35839E4t enumC35839E4t : values) {
            linkedHashMap.put(Integer.valueOf(enumC35839E4t.LJLIL), enumC35839E4t);
        }
        pluginMap = linkedHashMap;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC35839E4t(int i) {
        this.LJLIL = i;
    }
}
