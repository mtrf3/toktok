package com.bytedance.android.livesdk.livesetting.subscription;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;

@SettingsKey("live_subscription_tricks_gift_url")
/* loaded from: classes6.dex */
public final class LiveAnchorSubGiftSchemaSetting {
    public static final LiveAnchorSubGiftSchemaSetting INSTANCE = new LiveAnchorSubGiftSchemaSetting();

    @Group(isDefault = true, value = "default group")
    public static final HashMap<String, String> DEFAULT = C113554cx.LJJJLZIJ(new OSZ("gift_management", "sslocal://webcast_lynxview?type=fullscreen&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_sub_tricks%2Fpages%2Fgift-management%2Ftemplate.js&hide_nav_bar=1&hide_status_bar=0&use_spark=1&container_bg_color=F5F5F5&status_font_mode=dark"));

    public final Map<String, String> getValue() {
        Map<String, String> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveAnchorSubGiftSchemaSetting.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    public final String getGiftSubFaqSchema() {
        return getValue().get("gift_faq");
    }

    public final String getLiveCommunityGiftSubSchema() {
        return getValue().get("gift_management_live");
    }

    public final String getSubSettingGiftSubSchema() {
        return getValue().get("gift_management");
    }
}
