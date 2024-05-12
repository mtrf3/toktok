package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_sdk_leave_when_idle")
/* loaded from: classes6.dex */
public final class LinkMicSdkLeaveWhenIdleSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicSdkLeaveWhenIdleSetting INSTANCE = new LinkMicSdkLeaveWhenIdleSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicSdkLeaveWhenIdleSetting.class);
    }
}
