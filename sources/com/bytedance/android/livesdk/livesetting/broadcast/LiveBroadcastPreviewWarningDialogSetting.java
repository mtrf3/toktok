package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_preview_warning_dialog")
/* loaded from: classes6.dex */
public final class LiveBroadcastPreviewWarningDialogSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveBroadcastPreviewWarningDialogSetting INSTANCE = new LiveBroadcastPreviewWarningDialogSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBroadcastPreviewWarningDialogSetting.class);
    }
}
