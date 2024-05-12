package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_layout_observer_setting")
/* loaded from: classes6.dex */
public final class LiveLayoutObserverSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("experiment_group")
    public static final boolean GROUP_EXPERIMENT = true;
    public static final LiveLayoutObserverSetting INSTANCE = new LiveLayoutObserverSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveLayoutObserverSetting.class);
    }
}
