package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_toast_method_using_hybird_view_as_context")
/* loaded from: classes6.dex */
public final class LiveBroadcaseToastMethodPositionSetting {

    @Group(isDefault = true, value = "Default")
    public static final boolean DEFAULT = false;

    @Group("replace topActivity with context.getHybridView")
    public static final boolean HYBRID_VIEW_CONTEXT = true;
    public static final LiveBroadcaseToastMethodPositionSetting INSTANCE = new LiveBroadcaseToastMethodPositionSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBroadcaseToastMethodPositionSetting.class);
    }

    public static final boolean toastMethodWithHybridViewContext() {
        if (INSTANCE.getValue()) {
            return true;
        }
        return false;
    }
}
