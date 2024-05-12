package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("cohost_arch_version")
/* loaded from: classes6.dex */
public final class CohostServerOptVersionSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final CohostServerOptVersionSetting INSTANCE = new CohostServerOptVersionSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(CohostServerOptVersionSetting.class);
    }
}
