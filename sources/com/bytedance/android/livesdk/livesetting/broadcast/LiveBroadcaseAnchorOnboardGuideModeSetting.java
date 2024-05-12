package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_onboard_guide_mode")
/* loaded from: classes6.dex */
public final class LiveBroadcaseAnchorOnboardGuideModeSetting {

    @Group(isDefault = true, value = "Default")
    public static final int DEFAULT = 0;
    public static final LiveBroadcaseAnchorOnboardGuideModeSetting INSTANCE = new LiveBroadcaseAnchorOnboardGuideModeSetting();

    @Group("1 broadcast image + 4 safe education")
    public static final int MODE1 = 1;

    @Group("4 broadcast image + 1 safe education")
    public static final int MODE2 = 2;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveBroadcaseAnchorOnboardGuideModeSetting.class);
    }

    public final boolean showMode1() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean showMode2() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
