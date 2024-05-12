package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C32518CpW;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_color_change_control")
/* loaded from: classes6.dex */
public final class LiveGiftColorSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftColorSetting INSTANCE = new LiveGiftColorSetting();
    public static final C5H3 stickValue$delegate = C221108m2.LIZIZ(C32518CpW.LJLIL);

    public final int getStickValue() {
        return ((Number) stickValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftColorSetting.class);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
