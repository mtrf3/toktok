package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multilive_guest_linkmic_route_apply")
/* loaded from: classes6.dex */
public final class MultiliveGuestLinkmicRouteApplySetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;

    @Group("audio link mic by default")
    public static final int GUEST_LINKMIC_ROUTE_APPLY_AUDIO = 2;

    @Group("video link mic by default")
    public static final int GUEST_LINKMIC_ROUTE_APPLY_VIDEO = 1;
    public static final MultiliveGuestLinkmicRouteApplySetting INSTANCE = new MultiliveGuestLinkmicRouteApplySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiliveGuestLinkmicRouteApplySetting.class);
    }
}
