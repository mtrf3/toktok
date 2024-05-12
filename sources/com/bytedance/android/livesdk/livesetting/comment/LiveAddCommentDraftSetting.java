package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_add_comment_draft")
/* loaded from: classes6.dex */
public final class LiveAddCommentDraftSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveAddCommentDraftSetting INSTANCE = new LiveAddCommentDraftSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAddCommentDraftSetting.class);
    }
}
