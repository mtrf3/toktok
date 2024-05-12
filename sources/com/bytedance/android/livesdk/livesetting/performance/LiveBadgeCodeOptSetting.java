package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_badge_code_opt_config")
/* loaded from: classes6.dex */
public final class LiveBadgeCodeOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveBadgeCodeOptSetting INSTANCE = new LiveBadgeCodeOptSetting();

    public final boolean useOpt() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBadgeCodeOptSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
