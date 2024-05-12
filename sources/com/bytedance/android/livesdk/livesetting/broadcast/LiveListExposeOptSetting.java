package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_list_expose_report_opt")
/* loaded from: classes6.dex */
public final class LiveListExposeOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveListExposeOptSetting INSTANCE = new LiveListExposeOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveListExposeOptSetting.class);
    }
}
