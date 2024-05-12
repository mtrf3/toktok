package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_beauty_degrade_setting")
/* loaded from: classes6.dex */
public final class LiveEffectDowngradeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveEffectDowngradeSetting INSTANCE = new LiveEffectDowngradeSetting();

    public final boolean downgrade() {
        if (SettingsManager.INSTANCE.getIntValue(LiveEffectDowngradeSetting.class) == 1) {
            return true;
        }
        return false;
    }

    public final boolean remove() {
        if (SettingsManager.INSTANCE.getIntValue(LiveEffectDowngradeSetting.class) == 2) {
            return true;
        }
        return false;
    }

    public final boolean enable() {
        if (downgrade() || remove()) {
            return true;
        }
        return false;
    }
}
