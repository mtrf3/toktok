package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_notice_voice")
/* loaded from: classes6.dex */
public final class LinkMicEnableNoticeVoice {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicEnableNoticeVoice INSTANCE = new LinkMicEnableNoticeVoice();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicEnableNoticeVoice.class);
    }
}
