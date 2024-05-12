package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_pip_default_open")
/* loaded from: classes6.dex */
public final class LivePipDefaultOpenSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivePipDefaultOpenSetting INSTANCE = new LivePipDefaultOpenSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePipDefaultOpenSetting.class);
    }
}
