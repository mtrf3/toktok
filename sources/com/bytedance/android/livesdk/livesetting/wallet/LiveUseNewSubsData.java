package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("use_new_subcription_query_data_structure")
/* loaded from: classes6.dex */
public final class LiveUseNewSubsData {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveUseNewSubsData INSTANCE = new LiveUseNewSubsData();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveUseNewSubsData.class);
    }
}
