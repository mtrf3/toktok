package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("subscription_new_user_faq_url_native")
/* loaded from: classes6.dex */
public final class LiveSubscribeUserFaqNative {
    public static final LiveSubscribeUserFaqNative INSTANCE = new LiveSubscribeUserFaqNative();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveSubscribeUserFaqNative.class);
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
