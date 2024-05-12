package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multilive_link_panel_style")
/* loaded from: classes6.dex */
public final class MultiLiveLinkPanelStyle {

    @Group(isDefault = true, value = "new panel without video")
    public static final int DEFAULT = 1;
    public static final MultiLiveLinkPanelStyle INSTANCE = new MultiLiveLinkPanelStyle();

    @Group("new panel with video")
    public static final int USE_NEW_PANEL_WITH_VIDEO = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiLiveLinkPanelStyle.class);
    }
}
