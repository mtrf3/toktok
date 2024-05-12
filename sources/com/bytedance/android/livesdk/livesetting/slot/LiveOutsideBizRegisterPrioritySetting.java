package com.bytedance.android.livesdk.livesetting.slot;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_outside_biz_register_priority")
/* loaded from: classes6.dex */
public final class LiveOutsideBizRegisterPrioritySetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveOutsideBizRegisterPrioritySetting INSTANCE = new LiveOutsideBizRegisterPrioritySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveOutsideBizRegisterPrioritySetting.class);
    }
}
