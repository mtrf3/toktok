package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_tray_block_monitor_duration")
/* loaded from: classes6.dex */
public final class LiveGiftTrayBlockMonitorDuration {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 15;
    public static final LiveGiftTrayBlockMonitorDuration INSTANCE = new LiveGiftTrayBlockMonitorDuration();

    public final int getValue() {
        try {
            return SettingsManager.INSTANCE.getIntValue(LiveGiftTrayBlockMonitorDuration.class);
        } catch (Throwable unused) {
            return 15;
        }
    }
}
