package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_audio_be_occupied_settings")
/* loaded from: classes11.dex */
public final class MultiGuestV3AudioBeOccupiedSettings {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestV3AudioBeOccupiedSettings INSTANCE = new MultiGuestV3AudioBeOccupiedSettings();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestV3AudioBeOccupiedSettings.class);
    }
}
