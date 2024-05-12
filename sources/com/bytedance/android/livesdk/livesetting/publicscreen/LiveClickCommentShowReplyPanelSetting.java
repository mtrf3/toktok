package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_click_comment_show_reply_panel_setting")
/* loaded from: classes6.dex */
public final class LiveClickCommentShowReplyPanelSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveClickCommentShowReplyPanelSetting INSTANCE = new LiveClickCommentShowReplyPanelSetting();
    public static final boolean enableClick = SettingsManager.INSTANCE.getBooleanValue(LiveClickCommentShowReplyPanelSetting.class);

    public static /* synthetic */ void getEnableClick$annotations() {
    }

    public static final boolean getEnableClick() {
        return enableClick;
    }
}
