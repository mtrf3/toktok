package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("setting_manager_custom_type_opt")
/* loaded from: classes6.dex */
public final class SettingManagerCustomTypeOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final SettingManagerCustomTypeOptSetting INSTANCE = new SettingManagerCustomTypeOptSetting();

    public static final boolean enableOpt() {
        return SettingsManager.INSTANCE.enableCustomTypeOpt();
    }
}
