package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enter_delay_show_loading_time")
/* loaded from: classes6.dex */
public final class LiveEnterDelayShowLoadingTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 200;
    public static final LiveEnterDelayShowLoadingTimeSetting INSTANCE = new LiveEnterDelayShowLoadingTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveEnterDelayShowLoadingTimeSetting.class);
    }
}
