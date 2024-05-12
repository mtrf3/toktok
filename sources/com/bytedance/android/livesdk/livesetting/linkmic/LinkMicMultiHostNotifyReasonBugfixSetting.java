package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multi_host_notify_reason_bugfix")
/* loaded from: classes6.dex */
public final class LinkMicMultiHostNotifyReasonBugfixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicMultiHostNotifyReasonBugfixSetting INSTANCE = new LinkMicMultiHostNotifyReasonBugfixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMultiHostNotifyReasonBugfixSetting.class);
    }
}
