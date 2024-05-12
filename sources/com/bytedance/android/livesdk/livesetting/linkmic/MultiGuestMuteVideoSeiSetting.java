package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_mute_video_sei")
/* loaded from: classes6.dex */
public final class MultiGuestMuteVideoSeiSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestMuteVideoSeiSetting INSTANCE = new MultiGuestMuteVideoSeiSetting();

    @Group("set mute_video sei false")
    public static final int MUTE_VIDEO_FALSE = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestMuteVideoSeiSetting.class);
    }

    public final boolean isMuteVideoFalse() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
