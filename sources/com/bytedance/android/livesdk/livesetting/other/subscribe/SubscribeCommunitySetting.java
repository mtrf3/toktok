package com.bytedance.android.livesdk.livesetting.other.subscribe;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("tikcast_sub_community")
/* loaded from: classes6.dex */
public final class SubscribeCommunitySetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final SubscribeCommunitySetting INSTANCE = new SubscribeCommunitySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(SubscribeCommunitySetting.class);
    }
}
