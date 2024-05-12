package com.bytedance.android.livesdk.livesetting.drawer;

import X.BZO;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_drawer_max_slide_control_opt")
/* loaded from: classes6.dex */
public final class DrawerMaxSlideControlSetting {
    public static final DrawerMaxSlideControlSetting INSTANCE = new DrawerMaxSlideControlSetting();

    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 1.0f;
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(BZO.LJLIL);

    private final float getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).floatValue();
    }

    public final float getValue() {
        return getSettingValue();
    }
}
