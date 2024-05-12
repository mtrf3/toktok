package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_business_user_manager_use_disposable_map")
/* loaded from: classes6.dex */
public final class MultiGuestBusinessUserManagerUseDisposableMapSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final MultiGuestBusinessUserManagerUseDisposableMapSetting INSTANCE = new MultiGuestBusinessUserManagerUseDisposableMapSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestBusinessUserManagerUseDisposableMapSetting.class);
    }

    public final boolean isOpt() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
