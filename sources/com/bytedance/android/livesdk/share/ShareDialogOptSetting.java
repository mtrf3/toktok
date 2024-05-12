package com.bytedance.android.livesdk.share;

import X.C221108m2;
import X.C29875Bnz;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("broadcast_share_dialog_opt")
/* loaded from: classes6.dex */
public final class ShareDialogOptSetting {
    public static final ShareDialogOptSetting INSTANCE = new ShareDialogOptSetting();

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C29875Bnz.LJLIL);

    private final boolean getSettingValue() {
        return ((Boolean) settingValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getSettingValue();
    }
}
