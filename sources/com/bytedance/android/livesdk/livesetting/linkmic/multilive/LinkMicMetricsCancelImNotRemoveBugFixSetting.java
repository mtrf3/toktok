package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_metrics_cancel_im_not_remove_bugfix_enabled")
/* loaded from: classes11.dex */
public final class LinkMicMetricsCancelImNotRemoveBugFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicMetricsCancelImNotRemoveBugFixSetting INSTANCE = new LinkMicMetricsCancelImNotRemoveBugFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMetricsCancelImNotRemoveBugFixSetting.class);
    }
}
