package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58532My8;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_sound_wave_border")
/* loaded from: classes11.dex */
public final class MultiGuestSoundWaveBorderSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestSoundWaveBorderSetting INSTANCE = new MultiGuestSoundWaveBorderSetting();
    public static final C5H3 settingsValue$delegate = C221108m2.LIZIZ(C58532My8.LJLIL);

    private final int getSettingsValue() {
        return ((Number) settingsValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestSoundWaveBorderSetting.class);
    }

    public final boolean isBorderWithAvatarWave() {
        if (getSettingsValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isBorderWithoutAvatarWave() {
        if (getSettingsValue() == 1) {
            return true;
        }
        return false;
    }
}
