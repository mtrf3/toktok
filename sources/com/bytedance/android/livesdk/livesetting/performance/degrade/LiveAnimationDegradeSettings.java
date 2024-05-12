package com.bytedance.android.livesdk.livesetting.performance.degrade;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_animation_degrade")
/* loaded from: classes6.dex */
public final class LiveAnimationDegradeSettings {
    public static final LiveAnimationDegradeSettings INSTANCE = new LiveAnimationDegradeSettings();

    @Group(isDefault = true, value = "default group")
    public static final LiveAnimationDegrade DEFAULT = new LiveAnimationDegrade();

    public final LiveAnimationDegrade getValue() {
        LiveAnimationDegrade liveAnimationDegrade = (LiveAnimationDegrade) SettingsManager.INSTANCE.getValueSafely(LiveAnimationDegradeSettings.class);
        if (liveAnimationDegrade == null) {
            return DEFAULT;
        }
        return liveAnimationDegrade;
    }

    public final boolean disableEntranceAnim() {
        return !getValue().enableEntranceAnim;
    }

    public final boolean disableGuide() {
        return !getValue().enableGuide;
    }

    public final boolean disableMiniTopLives() {
        return !getValue().enableMiniTopLives;
    }

    public final LiveAnimationDegrade getDEFAULT() {
        return DEFAULT;
    }
}
