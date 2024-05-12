package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_multi_type_adapter_fix")
/* loaded from: classes11.dex */
public final class MultiGuestMultiTypeAdapterFix {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final MultiGuestMultiTypeAdapterFix INSTANCE = new MultiGuestMultiTypeAdapterFix();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestMultiTypeAdapterFix.class);
    }

    public final boolean isFix() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
