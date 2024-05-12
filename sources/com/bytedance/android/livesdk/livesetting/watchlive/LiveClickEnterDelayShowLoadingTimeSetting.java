package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_click_enter_delay_show_loading_time")
/* loaded from: classes6.dex */
public final class LiveClickEnterDelayShowLoadingTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveClickEnterDelayShowLoadingTimeSetting INSTANCE = new LiveClickEnterDelayShowLoadingTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveClickEnterDelayShowLoadingTimeSetting.class);
    }
}
