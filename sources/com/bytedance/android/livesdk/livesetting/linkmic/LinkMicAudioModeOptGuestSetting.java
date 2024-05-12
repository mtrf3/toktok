package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58483MxL;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_audio_mode_opt_guest")
/* loaded from: classes11.dex */
public final class LinkMicAudioModeOptGuestSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicAudioModeOptGuestSetting INSTANCE = new LinkMicAudioModeOptGuestSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58483MxL.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicAudioModeOptGuestSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
