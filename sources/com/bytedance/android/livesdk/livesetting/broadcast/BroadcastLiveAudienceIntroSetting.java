package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_disable_audience_intro")
/* loaded from: classes6.dex */
public final class BroadcastLiveAudienceIntroSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final BroadcastLiveAudienceIntroSetting INSTANCE = new BroadcastLiveAudienceIntroSetting();

    public final boolean disable() {
        if (SettingsManager.INSTANCE.getIntValue(BroadcastLiveAudienceIntroSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
