package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ec_inner_opt_mode")
/* loaded from: classes6.dex */
public final class LiveEcommerceInnerSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEcommerceInnerSetting INSTANCE = new LiveEcommerceInnerSetting();

    /* renamed from: switch, reason: not valid java name */
    public final boolean m63switch() {
        return !SettingsManager.INSTANCE.getBooleanValue(LiveEcommerceInnerSetting.class);
    }
}
