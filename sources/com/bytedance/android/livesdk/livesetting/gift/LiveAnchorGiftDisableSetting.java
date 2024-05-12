package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_gift_disable")
/* loaded from: classes6.dex */
public final class LiveAnchorGiftDisableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveAnchorGiftDisableSetting INSTANCE = new LiveAnchorGiftDisableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAnchorGiftDisableSetting.class);
    }
}