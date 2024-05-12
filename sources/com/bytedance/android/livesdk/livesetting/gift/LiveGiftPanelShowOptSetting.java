package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C32519CpX;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_panel_show_optimize")
/* loaded from: classes6.dex */
public final class LiveGiftPanelShowOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftPanelShowOptSetting INSTANCE = new LiveGiftPanelShowOptSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C32519CpX.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftPanelShowOptSetting.class);
    }
}
