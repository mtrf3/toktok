package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_multi_adater_anr_1_fix")
/* loaded from: classes11.dex */
public final class MtCoHostMultiAdatperFixAnr1Setting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final MtCoHostMultiAdatperFixAnr1Setting INSTANCE = new MtCoHostMultiAdatperFixAnr1Setting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCoHostMultiAdatperFixAnr1Setting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
