package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_moderator_faq_url_livesheet")
/* loaded from: classes6.dex */
public final class LiveModeratorFaqUrlLiveSheetSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveModeratorFaqUrlLiveSheetSetting INSTANCE = new LiveModeratorFaqUrlLiveSheetSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveModeratorFaqUrlLiveSheetSetting.class);
    }
}
