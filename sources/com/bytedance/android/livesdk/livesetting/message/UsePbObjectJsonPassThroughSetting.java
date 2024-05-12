package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("use_pb_object_json_pass_through")
/* loaded from: classes11.dex */
public final class UsePbObjectJsonPassThroughSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final UsePbObjectJsonPassThroughSetting INSTANCE = new UsePbObjectJsonPassThroughSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(UsePbObjectJsonPassThroughSetting.class);
    }
}
