package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C28228B6a;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_gift_combo_moving_up")
/* loaded from: classes6.dex */
public final class LiveComboMovingUpAnimSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveComboMovingUpAnimSetting INSTANCE = new LiveComboMovingUpAnimSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C28228B6a.LJLIL);

    private final boolean getSettingValue() {
        return ((Boolean) settingValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getSettingValue();
    }
}
