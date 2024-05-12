package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_optimization_user_serialization_type")
/* loaded from: classes6.dex */
public final class LiveUserSerializationTypeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveUserSerializationTypeSetting INSTANCE = new LiveUserSerializationTypeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveUserSerializationTypeSetting.class);
    }
}
