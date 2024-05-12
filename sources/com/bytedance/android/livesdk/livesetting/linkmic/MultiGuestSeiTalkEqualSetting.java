package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_sei_talk_equal")
/* loaded from: classes6.dex */
public final class MultiGuestSeiTalkEqualSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestSeiTalkEqualSetting INSTANCE = new MultiGuestSeiTalkEqualSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestSeiTalkEqualSetting.class);
    }

    public final boolean isDefault() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }
}
