package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_live_player_log_instance")
/* loaded from: classes6.dex */
public final class MultiLivePlayerLogInstanceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiLivePlayerLogInstanceSetting INSTANCE = new MultiLivePlayerLogInstanceSetting();

    @Group("v1")
    public static final boolean V1 = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiLivePlayerLogInstanceSetting.class);
    }
}
