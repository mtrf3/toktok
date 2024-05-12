package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_cohost_layout_manager_metrics_bugfix")
/* loaded from: classes6.dex */
public final class LinkMicCohostLayoutManagerMetricsBugFix {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicCohostLayoutManagerMetricsBugFix INSTANCE = new LinkMicCohostLayoutManagerMetricsBugFix();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicCohostLayoutManagerMetricsBugFix.class);
    }
}
