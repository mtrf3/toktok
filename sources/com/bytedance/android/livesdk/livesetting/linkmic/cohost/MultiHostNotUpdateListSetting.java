package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_host_not_call_update_list_setting")
/* loaded from: classes6.dex */
public final class MultiHostNotUpdateListSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiHostNotUpdateListSetting INSTANCE = new MultiHostNotUpdateListSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiHostNotUpdateListSetting.class);
    }
}
