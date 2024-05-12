package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_redesign_audience_enable")
/* loaded from: classes14.dex */
public final class LiveMatchReDesignAudienceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMatchReDesignAudienceSetting INSTANCE = new LiveMatchReDesignAudienceSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMatchReDesignAudienceSetting.class);
    }
}
