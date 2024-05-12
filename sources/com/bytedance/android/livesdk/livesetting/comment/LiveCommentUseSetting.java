package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_comment_use_setting")
/* loaded from: classes6.dex */
public final class LiveCommentUseSetting {
    public static final LiveCommentUseSetting INSTANCE = new LiveCommentUseSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCommentUseSetting.class);
    }

    public final boolean useCurSetting() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
