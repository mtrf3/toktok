package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C221108m2;
import X.C30155BsV;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("delay_widget_load_opt")
/* loaded from: classes6.dex */
public final class DelayWidgetLoadOptSetting {
    public static final DelayWidgetLoadOptSetting INSTANCE = new DelayWidgetLoadOptSetting();

    @Group(isDefault = true, value = "control_group")
    public static final DelayWidgetLoadConfig DEFAULT = new DelayWidgetLoadConfig();
    public static final C5H3 delayWidgetLoadConfig$delegate = C221108m2.LIZIZ(C30155BsV.LJLIL);

    private final DelayWidgetLoadConfig getDelayWidgetLoadConfig() {
        return (DelayWidgetLoadConfig) delayWidgetLoadConfig$delegate.getValue();
    }

    public final long getDelayTimeGiftInMills() {
        return getDelayWidgetLoadConfig().delayTimeGiftInSecond * 1000;
    }

    public final long getDelayTimeInMills() {
        return getDelayWidgetLoadConfig().delayTimeInSecond * 1000;
    }

    public final long getDelayTimeLikeInMills() {
        return getDelayWidgetLoadConfig().delayTimeLikeInSecond * 1000;
    }

    public final boolean getEnableDelay() {
        return getDelayWidgetLoadConfig().enableDelay;
    }
}
