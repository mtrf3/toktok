package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import java.util.LinkedHashMap;

/* renamed from: X.FzB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC40761FzB {
    JOURNEY_STEP_BEFORE(-1, "splash"),
    JOURNEY_SLOGAN_ID(101, "slogan_page"),
    JOURNEY_INTERESTS_ID(102, "interest_selection"),
    JOURNEY_CONTENT_LANGUAGE_ID(104, "content_language_selection"),
    JOURNEY_APP_LANGUAGE_ID(105, "app_language_selection"),
    JOURNEY_SWIPE_UP_ID(106, "swipe_up"),
    JOURNEY_PRIVATE_ACCOUNT_TIPS_ID(107, "private_account"),
    JOURNEY_DEEPLINK_ID(109, "deeplink"),
    JOURNEY_ON_UPDATE_ADD_FB_FRIENDS_ID(110, "on_update_add_fb_friends"),
    JOURNEY_PRIVACY_HIGHLIGHTS_FOR_TEENS(113, "privacy_highlights"),
    JOURNEY_LYNX_EXPERIENCE_ID(114, "content_language_selection"),
    JOURNEY_SERVER_DELAY(115, "server_delay"),
    JOURNEY_SMART_LOCK_ID(116, "smart_lock"),
    JOURNEY_AGE_GATE_ID(117, "age_gate"),
    JOURNEY_LOGIN_ID(118, "login"),
    JOURNEY_SUBSCRIPTION_ID(119, "compliance_subscription"),
    JOURNEY_FREE_TRIAL_ID(LiveTryModeCountDownThresholdSetting.DEFAULT, "compliance_free_trail"),
    JOURNEY_AD_SUBSCRIPTION_AGE_GATE_ID(122, "ad_subscription_age_gate"),
    JOURNEY_CONSISTENT_CONTENT_AND_AD_CHOICES_ID(121, "consistent_content_and_ad_choices");

    public static final C40765FzF Companion = new C40765FzF();
    public static final java.util.Map<Integer, EnumC40761FzB> map;
    public final int LJLIL;
    public final String LJLILLLLZI;

    public static EnumC40761FzB valueOf(String str) {
        return (EnumC40761FzB) V0N.LJJJ(EnumC40761FzB.class, str);
    }

    static {
        EnumC40761FzB[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (EnumC40761FzB enumC40761FzB : values) {
            linkedHashMap.put(Integer.valueOf(enumC40761FzB.LJLIL), enumC40761FzB);
        }
        map = linkedHashMap;
    }

    public final String getDesc() {
        return this.LJLILLLLZI;
    }

    public final int getId() {
        return this.LJLIL;
    }

    EnumC40761FzB(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
