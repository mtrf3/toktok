package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_linkmic_preview_panel_default_video")
/* loaded from: classes6.dex */
public final class LinkMicMultiGuestPreviewPanelDefaultVideoSetting {

    @Group("store camera status across live rooms")
    public static final int ACROSS_LIVE_ROOMS = 1;

    @Group(isDefault = true, value = "use online logic")
    public static final int DEFAULT = 0;
    public static final LinkMicMultiGuestPreviewPanelDefaultVideoSetting INSTANCE = new LinkMicMultiGuestPreviewPanelDefaultVideoSetting();

    @Group("store camera status single live room")
    public static final int SINGLE_LIVE_ROOM = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkMicMultiGuestPreviewPanelDefaultVideoSetting.class);
    }

    public final boolean isControlGroup() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }
}
