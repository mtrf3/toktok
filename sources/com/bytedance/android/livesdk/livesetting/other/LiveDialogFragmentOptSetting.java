package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_dialog_fragment_opt")
/* loaded from: classes6.dex */
public final class LiveDialogFragmentOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveDialogFragmentOptSetting INSTANCE = new LiveDialogFragmentOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveDialogFragmentOptSetting.class);
    }
}
