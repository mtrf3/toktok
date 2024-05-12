package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multilive_guest_linkmic_route_reply")
/* loaded from: classes6.dex */
public final class MultiliveGuestLinkmicRouteReplySetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;

    @Group("audio link mic by default")
    public static final int GUEST_LINKMIC_ROUTE_REPLY_AUDIO = 2;

    @Group("video link mic by default")
    public static final int GUEST_LINKMIC_ROUTE_REPLY_VIDEO = 1;
    public static final MultiliveGuestLinkmicRouteReplySetting INSTANCE = new MultiliveGuestLinkmicRouteReplySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiliveGuestLinkmicRouteReplySetting.class);
    }
}
