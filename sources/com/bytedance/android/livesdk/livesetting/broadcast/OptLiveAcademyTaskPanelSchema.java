package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_academy_task_panel_schema")
/* loaded from: classes6.dex */
public final class OptLiveAcademyTaskPanelSchema {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_lynx%2Ffundamental%2Fpages%2Flive-center%2Facademy-task-panel%2Ftemplate.js&gravity=bottom&height=484&show_mask=1&mask_bg_color=0C0C0C80&transition_animation=auto";
    public static final OptLiveAcademyTaskPanelSchema INSTANCE = new OptLiveAcademyTaskPanelSchema();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(OptLiveAcademyTaskPanelSchema.class);
    }
}
