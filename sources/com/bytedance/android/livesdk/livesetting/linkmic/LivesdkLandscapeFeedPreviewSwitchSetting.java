package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_landscape_feed_preview_switch")
/* loaded from: classes6.dex */
public final class LivesdkLandscapeFeedPreviewSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LivesdkLandscapeFeedPreviewSwitchSetting INSTANCE = new LivesdkLandscapeFeedPreviewSwitchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivesdkLandscapeFeedPreviewSwitchSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
