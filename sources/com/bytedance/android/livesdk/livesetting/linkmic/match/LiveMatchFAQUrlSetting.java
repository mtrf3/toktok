package com.bytedance.android.livesdk.livesetting.linkmic.match;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@SettingsKey("live_match_faq_config")
/* loaded from: classes6.dex */
public final class LiveMatchFAQUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveMatchFAQUrlSetting INSTANCE;
    public static final String liveMatchFAQUrl;
    public static final String liveMatchNewRule;
    public static final String liveMatchSpecificGiftRule;
    public static final String liveMatchStreakRule;

    static {
        LiveMatchFAQUrlSetting liveMatchFAQUrlSetting = new LiveMatchFAQUrlSetting();
        INSTANCE = liveMatchFAQUrlSetting;
        String optString = liveMatchFAQUrlSetting.getValue().optString("live_match_faq_url", "");
        o.LJIIIIZZ(optString, "getValue().optString(\"live_match_faq_url\", \"\")");
        liveMatchFAQUrl = optString;
        String optString2 = liveMatchFAQUrlSetting.getValue().optString("live_match_new_rule", "");
        o.LJIIIIZZ(optString2, "getValue().optString(\"live_match_new_rule\", \"\")");
        liveMatchNewRule = optString2;
        String optString3 = liveMatchFAQUrlSetting.getValue().optString("live_match_specific_gift_rule", "");
        o.LJIIIIZZ(optString3, "getValue().optString(\"li…_specific_gift_rule\", \"\")");
        liveMatchSpecificGiftRule = optString3;
        String optString4 = liveMatchFAQUrlSetting.getValue().optString("live_match_streak_rule", "");
        o.LJIIIIZZ(optString4, "getValue().optString(\"live_match_streak_rule\", \"\")");
        liveMatchStreakRule = optString4;
    }

    public final JSONObject getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        if (TextUtils.isEmpty(settingsManager.getStringValue(LiveMatchFAQUrlSetting.class))) {
            return new JSONObject();
        }
        return new JSONObject(settingsManager.getStringValue(LiveMatchFAQUrlSetting.class));
    }

    public final String getLiveMatchFAQUrl() {
        return liveMatchFAQUrl;
    }

    public final String getLiveMatchNewRule() {
        return liveMatchNewRule;
    }

    public final String getLiveMatchSpecificGiftRule() {
        return liveMatchSpecificGiftRule;
    }

    public final String getLiveMatchStreakRule() {
        return liveMatchStreakRule;
    }
}
