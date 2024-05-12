package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_apply_layout_opt")
/* loaded from: classes14.dex */
public final class LinkMicApplyLayoutOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LinkMicApplyLayoutOptSetting INSTANCE = new LinkMicApplyLayoutOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkMicApplyLayoutOptSetting.class);
    }
}
