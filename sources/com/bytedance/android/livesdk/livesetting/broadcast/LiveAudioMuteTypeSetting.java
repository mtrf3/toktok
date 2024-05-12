package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C30753C5d;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_audio_mute_type")
/* loaded from: classes6.dex */
public final class LiveAudioMuteTypeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveAudioMuteTypeSetting INSTANCE = new LiveAudioMuteTypeSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C30753C5d.LJLIL);

    public final int getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).intValue();
    }

    public final boolean canShowMuteMicLayout() {
        if (getSettingValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean canShowMuteMicPanel() {
        if (getSettingValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnableAnchorMuteMic() {
        if (canShowMuteMicLayout() || canShowMuteMicPanel()) {
            return true;
        }
        return false;
    }
}
