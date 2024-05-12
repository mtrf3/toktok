package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_open_moderator_pin_perks_cards")
/* loaded from: classes6.dex */
public final class LiveOpenModeratorPinPerksCardsSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveOpenModeratorPinPerksCardsSetting INSTANCE = new LiveOpenModeratorPinPerksCardsSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveOpenModeratorPinPerksCardsSetting.class) == 1) {
            return true;
        }
        return false;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
