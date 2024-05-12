package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_host_linker_destroy_when_rtc_error")
/* loaded from: classes6.dex */
public final class MultiHostLeaveWhenRtcError {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiHostLeaveWhenRtcError INSTANCE = new MultiHostLeaveWhenRtcError();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiHostLeaveWhenRtcError.class);
    }
}
