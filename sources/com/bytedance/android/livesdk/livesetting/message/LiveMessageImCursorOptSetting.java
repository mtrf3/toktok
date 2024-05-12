package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_im_cursor_opt")
/* loaded from: classes6.dex */
public final class LiveMessageImCursorOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveMessageImCursorOptSetting INSTANCE = new LiveMessageImCursorOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMessageImCursorOptSetting.class);
    }
}
