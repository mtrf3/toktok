package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_popularity_card_url")
/* loaded from: classes6.dex */
public final class LivePopularityCardUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LivePopularityCardUrlSetting INSTANCE = new LivePopularityCardUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePopularityCardUrlSetting.class);
    }
}
