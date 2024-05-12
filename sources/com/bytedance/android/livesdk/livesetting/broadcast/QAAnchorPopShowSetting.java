package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_qa_anchor_show_tips")
/* loaded from: classes6.dex */
public final class QAAnchorPopShowSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final QAAnchorPopShowSetting INSTANCE = new QAAnchorPopShowSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(QAAnchorPopShowSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
