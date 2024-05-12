package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_leaf_refactor_post")
/* loaded from: classes6.dex */
public final class LiveGiftLeafPostSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveGiftLeafPostSettings INSTANCE = new LiveGiftLeafPostSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftLeafPostSettings.class);
    }
}
