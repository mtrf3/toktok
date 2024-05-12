package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("frisbee_task_icon_show")
/* loaded from: classes6.dex */
public final class FrisbeeTaskIconShowSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final FrisbeeTaskIconShowSetting INSTANCE = new FrisbeeTaskIconShowSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(FrisbeeTaskIconShowSetting.class);
    }
}
