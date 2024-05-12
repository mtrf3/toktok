package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_screenshot_enable")
/* loaded from: classes6.dex */
public final class LiveAnchorScreenshotEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveAnchorScreenshotEnableSetting INSTANCE = new LiveAnchorScreenshotEnableSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveAnchorScreenshotEnableSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
