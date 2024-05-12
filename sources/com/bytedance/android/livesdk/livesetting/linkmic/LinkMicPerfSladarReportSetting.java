package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_perf_event_to_sladar_conf")
/* loaded from: classes6.dex */
public final class LinkMicPerfSladarReportSetting {
    public static final LinkMicPerfSladarReportSetting INSTANCE = new LinkMicPerfSladarReportSetting();

    @Group(isDefault = true, value = "default group")
    public static final LinkMicPerfSladarEventReportConf DEFAULT = new LinkMicPerfSladarEventReportConf(0, 1, null);

    public final LinkMicPerfSladarEventReportConf getValue() {
        LinkMicPerfSladarEventReportConf linkMicPerfSladarEventReportConf = (LinkMicPerfSladarEventReportConf) SettingsManager.INSTANCE.getValueSafely(LinkMicPerfSladarReportSetting.class);
        if (linkMicPerfSladarEventReportConf == null) {
            return DEFAULT;
        }
        return linkMicPerfSladarEventReportConf;
    }
}
