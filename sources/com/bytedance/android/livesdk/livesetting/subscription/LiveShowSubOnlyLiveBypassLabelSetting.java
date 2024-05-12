package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_show_sub_only_live_bypass_label")
/* loaded from: classes6.dex */
public final class LiveShowSubOnlyLiveBypassLabelSetting {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final LiveShowSubOnlyLiveBypassLabelSetting INSTANCE = new LiveShowSubOnlyLiveBypassLabelSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveShowSubOnlyLiveBypassLabelSetting.class);
    }
}
