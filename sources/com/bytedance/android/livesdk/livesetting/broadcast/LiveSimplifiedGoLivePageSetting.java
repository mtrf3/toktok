package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_simplified_go_live_page")
/* loaded from: classes6.dex */
public final class LiveSimplifiedGoLivePageSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSimplifiedGoLivePageSetting INSTANCE = new LiveSimplifiedGoLivePageSetting();

    public final boolean enableSimplifiedGoLivePageV1orV2() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        if (settingsManager.getIntValue(LiveSimplifiedGoLivePageSetting.class) == 1 || settingsManager.getIntValue(LiveSimplifiedGoLivePageSetting.class) == 2) {
            return true;
        }
        return false;
    }

    public final boolean enableSimplifiedGoLivePageV2() {
        if (SettingsManager.INSTANCE.getIntValue(LiveSimplifiedGoLivePageSetting.class) == 2) {
            return true;
        }
        return false;
    }
}
