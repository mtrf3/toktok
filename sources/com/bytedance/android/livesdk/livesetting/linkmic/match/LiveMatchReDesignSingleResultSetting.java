package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_redesign_single_result")
/* loaded from: classes14.dex */
public final class LiveMatchReDesignSingleResultSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveMatchReDesignSingleResultSetting INSTANCE = new LiveMatchReDesignSingleResultSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMatchReDesignSingleResultSetting.class);
    }
}
