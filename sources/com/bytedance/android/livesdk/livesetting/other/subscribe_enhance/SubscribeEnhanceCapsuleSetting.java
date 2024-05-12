package com.bytedance.android.livesdk.livesetting.other.subscribe_enhance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscription_enhance_capsule")
/* loaded from: classes6.dex */
public final class SubscribeEnhanceCapsuleSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final SubscribeEnhanceCapsuleSetting INSTANCE = new SubscribeEnhanceCapsuleSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(SubscribeEnhanceCapsuleSetting.class);
    }
}
