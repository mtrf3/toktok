package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_preview_sr_support")
/* loaded from: classes6.dex */
public final class LivePreviewCardEnableSrSetting {

    @Group(isDefault = true, value = "control_group")
    public static final int DEFAULT = -1;

    @Group("experimental_group")
    public static final int ENABLE = 1;
    public static final LivePreviewCardEnableSrSetting INSTANCE = new LivePreviewCardEnableSrSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(LivePreviewCardEnableSrSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
