package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "permit_join_group_change_state_switch")
/* loaded from: classes6.dex */
public final class QuickPairChangeStateSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final QuickPairChangeStateSetting INSTANCE = new QuickPairChangeStateSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(QuickPairChangeStateSetting.class);
    }
}
