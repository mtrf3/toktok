package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_audience_feed_layout_config")
/* loaded from: classes6.dex */
public final class LiveAudienceFeedLayoutConfigSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("the same as other layout")
    public static final int FEED_LAYOUT_V1 = 1;

    @Group("the center in full screen")
    public static final int FEED_LAYOUT_V2 = 2;
    public static final LiveAudienceFeedLayoutConfigSetting INSTANCE = new LiveAudienceFeedLayoutConfigSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAudienceFeedLayoutConfigSetting.class);
    }

    public final boolean isFeedLayoutV1() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean isFeedLayoutV2() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
