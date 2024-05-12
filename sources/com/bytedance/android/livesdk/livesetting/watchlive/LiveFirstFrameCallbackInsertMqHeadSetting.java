package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.FirstScreenOptSwitcher;

@SettingsKey("live_first_frame_callback_insert_mq_head")
/* loaded from: classes6.dex */
public final class LiveFirstFrameCallbackInsertMqHeadSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveFirstFrameCallbackInsertMqHeadSetting INSTANCE = new LiveFirstFrameCallbackInsertMqHeadSetting();

    public final boolean getValue() {
        if (SettingsManager.INSTANCE.getBooleanValue(LiveFirstFrameCallbackInsertMqHeadSetting.class) && FirstScreenOptSwitcher.INSTANCE.getValue()) {
            return true;
        }
        return false;
    }
}
