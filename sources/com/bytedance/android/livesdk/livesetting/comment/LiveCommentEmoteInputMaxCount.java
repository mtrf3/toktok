package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sub_emote_limit")
/* loaded from: classes6.dex */
public final class LiveCommentEmoteInputMaxCount {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 4;
    public static final LiveCommentEmoteInputMaxCount INSTANCE = new LiveCommentEmoteInputMaxCount();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCommentEmoteInputMaxCount.class);
    }
}
