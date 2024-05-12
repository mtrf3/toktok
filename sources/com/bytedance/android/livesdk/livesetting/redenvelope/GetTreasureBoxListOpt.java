package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_treasurebox_interface_optimization")
/* loaded from: classes6.dex */
public final class GetTreasureBoxListOpt {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final GetTreasureBoxListOpt INSTANCE = new GetTreasureBoxListOpt();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GetTreasureBoxListOpt.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
