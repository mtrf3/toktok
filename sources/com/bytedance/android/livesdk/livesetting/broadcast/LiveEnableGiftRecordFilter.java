package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_gift_record_filter")
/* loaded from: classes6.dex */
public final class LiveEnableGiftRecordFilter {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("experiment_group")
    public static final int ENABLE = 1;
    public static final LiveEnableGiftRecordFilter INSTANCE = new LiveEnableGiftRecordFilter();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveEnableGiftRecordFilter.class) == 1) {
            return true;
        }
        return false;
    }
}
