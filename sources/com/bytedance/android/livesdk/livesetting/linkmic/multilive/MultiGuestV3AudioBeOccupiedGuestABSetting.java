package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_audio_be_occupied_guest_ab")
/* loaded from: classes14.dex */
public final class MultiGuestV3AudioBeOccupiedGuestABSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestV3AudioBeOccupiedGuestABSetting INSTANCE = new MultiGuestV3AudioBeOccupiedGuestABSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestV3AudioBeOccupiedGuestABSetting.class);
    }

    public final boolean showOccupied() {
        if (1 == getValue()) {
            return true;
        }
        return false;
    }
}
