package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_interrupt_anchor_side_enable")
/* loaded from: classes6.dex */
public final class LiveGiftInterruptAnchorSideEnable {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftInterruptAnchorSideEnable INSTANCE = new LiveGiftInterruptAnchorSideEnable();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftInterruptAnchorSideEnable.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
