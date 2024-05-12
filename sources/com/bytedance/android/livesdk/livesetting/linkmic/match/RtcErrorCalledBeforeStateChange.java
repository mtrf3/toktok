package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("rtc_error_called_before_state_change")
/* loaded from: classes6.dex */
public final class RtcErrorCalledBeforeStateChange {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final RtcErrorCalledBeforeStateChange INSTANCE = new RtcErrorCalledBeforeStateChange();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(RtcErrorCalledBeforeStateChange.class);
    }
}
