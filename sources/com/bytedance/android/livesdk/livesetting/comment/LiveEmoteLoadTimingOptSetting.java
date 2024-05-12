package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_emote_load_timing_opt")
/* loaded from: classes6.dex */
public final class LiveEmoteLoadTimingOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveEmoteLoadTimingOptSetting INSTANCE = new LiveEmoteLoadTimingOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveEmoteLoadTimingOptSetting.class);
    }

    public final boolean preLoadEmote(boolean z, boolean z2) {
        int value = getValue();
        if (value == 0) {
            return true;
        }
        if (value != 1) {
            if (value != 2) {
                return true;
            }
        } else if (z || z2) {
            return true;
        }
        return false;
    }
}
