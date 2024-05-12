package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_mute_comments_list")
/* loaded from: classes6.dex */
public final class LiveMuteCommentsListSetting {
    public static final LiveMuteCommentsListSetting INSTANCE = new LiveMuteCommentsListSetting();

    @Group(isDefault = true, value = "default group")
    public static final double[] DEFAULT = {5.0d, 30.0d, 60.0d, 300.0d, -1.0d};

    public final double[] getValue() {
        double[] dArr = (double[]) SettingsManager.INSTANCE.getValueSafely(LiveMuteCommentsListSetting.class);
        if (dArr == null) {
            return DEFAULT;
        }
        return dArr;
    }
}
