package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C221108m2;
import X.C58525My1;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_linkmic_audio_mute_punish")
/* loaded from: classes11.dex */
public final class MultiGuestV3PunishSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3PunishSetting INSTANCE = new MultiGuestV3PunishSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58525My1.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3PunishSetting.class);
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
