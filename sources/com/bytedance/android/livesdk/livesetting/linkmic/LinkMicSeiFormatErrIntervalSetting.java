package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_sei_format_err_end_layout")
/* loaded from: classes11.dex */
public final class LinkMicSeiFormatErrIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 5000;
    public static final LinkMicSeiFormatErrIntervalSetting INSTANCE = new LinkMicSeiFormatErrIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LinkMicSeiFormatErrIntervalSetting.class);
    }
}
