package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;

@SettingsKey("live_random_linkmic")
/* loaded from: classes6.dex */
public final class LiveRandomLinkmicSetting {
    public static final LiveRandomLinkmicSetting INSTANCE = new LiveRandomLinkmicSetting();

    @Group(isDefault = true, value = "default group")
    public static final RandomLinkMicSetting DEFAULT = new RandomLinkMicSetting();

    public final RandomLinkMicSetting getValue() {
        RandomLinkMicSetting randomLinkMicSetting = (RandomLinkMicSetting) SettingsManager.INSTANCE.getValueSafely(LiveRandomLinkmicSetting.class);
        if (randomLinkMicSetting == null) {
            return DEFAULT;
        }
        return randomLinkMicSetting;
    }

    public final RandomLinkMicSetting getDEFAULT() {
        return DEFAULT;
    }
}
