package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_show_toast_comment_banned")
/* loaded from: classes6.dex */
public final class EnableShowToastCommentBannedSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EnableShowToastCommentBannedSetting INSTANCE = new EnableShowToastCommentBannedSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(EnableShowToastCommentBannedSetting.class) > 0) {
            return true;
        }
        return false;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(EnableShowToastCommentBannedSetting.class);
    }
}
