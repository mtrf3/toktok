package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_center_lynx_delay_load_setting")
/* loaded from: classes6.dex */
public final class LiveCenterDelayLoadSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 8000;
    public static final LiveCenterDelayLoadSetting INSTANCE = new LiveCenterDelayLoadSetting();

    public final int delayTime() {
        return SettingsManager.INSTANCE.getIntValue(LiveCenterDelayLoadSetting.class);
    }
}
