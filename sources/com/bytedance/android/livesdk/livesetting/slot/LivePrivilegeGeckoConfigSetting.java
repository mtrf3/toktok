package com.bytedance.android.livesdk.livesetting.slot;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_privilege_gecko_config")
/* loaded from: classes6.dex */
public final class LivePrivilegeGeckoConfigSetting {
    public static final LivePrivilegeGeckoConfigSetting INSTANCE = new LivePrivilegeGeckoConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final GeckoContent[] DEFAULT = new GeckoContent[0];

    public final GeckoContent[] getPrivilegeGeckoConfig() {
        GeckoContent[] geckoContentArr = (GeckoContent[]) SettingsManager.INSTANCE.getValueSafely(LivePrivilegeGeckoConfigSetting.class);
        if (geckoContentArr == null) {
            return DEFAULT;
        }
        return geckoContentArr;
    }
}
