package com.bytedance.android.livesdk.livesetting.game;

import X.C221108m2;
import X.C5H3;
import X.C5U;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("ttlive_game_live_multi_device_interrupt_guide")
/* loaded from: classes6.dex */
public final class MultiDeviceInterruptGuideSetting {
    public static final MultiDeviceInterruptGuideSetting INSTANCE = new MultiDeviceInterruptGuideSetting();

    @Group(isDefault = true, value = "default group")
    public static final MultiDeviceInterruptGuideData DEFAULT = new MultiDeviceInterruptGuideData(null, null, null, 7, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C5U.LJLIL);

    private final MultiDeviceInterruptGuideData getSettingValue() {
        return (MultiDeviceInterruptGuideData) settingValue$delegate.getValue();
    }

    public final MultiDeviceInterruptGuideData getData() {
        return getSettingValue();
    }

    public final boolean isEnable() {
        Integer num = getData().enable;
        if (num == null || num.intValue() == 0) {
            return false;
        }
        return true;
    }
}
