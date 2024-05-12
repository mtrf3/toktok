package com.bytedance.android.livesdk.livesetting.performance;

import X.B63;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_admin_status_dialog_change_setting")
/* loaded from: classes6.dex */
public final class LiveAdminStatusDialogChangeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveAdminStatusDialogChangeSetting INSTANCE = new LiveAdminStatusDialogChangeSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(B63.LJLIL);

    private final boolean getSettingValue() {
        return ((Boolean) settingValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getSettingValue();
    }
}
