package com.bytedance.android.livesdk.livesetting.other.subscribe;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("guest_link_list_show_subscriber_tag")
/* loaded from: classes11.dex */
public final class SubscribeGuestSubscriberSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final SubscribeGuestSubscriberSetting INSTANCE = new SubscribeGuestSubscriberSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(SubscribeGuestSubscriberSetting.class);
    }
}
