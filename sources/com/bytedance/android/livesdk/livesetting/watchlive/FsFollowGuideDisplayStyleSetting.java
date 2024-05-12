package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "fs_follow_guide_display_style")
/* loaded from: classes6.dex */
public final class FsFollowGuideDisplayStyleSetting {

    @Group("bottom card")
    public static final int BOTTOM_CARD = 3;

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final FsFollowGuideDisplayStyleSetting INSTANCE = new FsFollowGuideDisplayStyleSetting();

    @Group("pin card")
    public static final int PIN_CARD = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(FsFollowGuideDisplayStyleSetting.class);
    }
}
