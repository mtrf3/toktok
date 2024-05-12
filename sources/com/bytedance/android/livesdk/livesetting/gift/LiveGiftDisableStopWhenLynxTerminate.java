package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_disable_stop_when_lynx_terminate")
/* loaded from: classes6.dex */
public final class LiveGiftDisableStopWhenLynxTerminate {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftDisableStopWhenLynxTerminate INSTANCE = new LiveGiftDisableStopWhenLynxTerminate();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftDisableStopWhenLynxTerminate.class);
    }
}
