package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("first_frame_success_rate_opt_in_feed")
/* loaded from: classes6.dex */
public final class LinkMicFirstFrameSuccessRateOpt {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicFirstFrameSuccessRateOpt INSTANCE = new LinkMicFirstFrameSuccessRateOpt();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicFirstFrameSuccessRateOpt.class);
    }
}
