package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_redesign_anchor_enable")
/* loaded from: classes14.dex */
public final class LiveMatchReDesignAnchorSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMatchReDesignAnchorSetting INSTANCE = new LiveMatchReDesignAnchorSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMatchReDesignAnchorSetting.class);
    }
}
