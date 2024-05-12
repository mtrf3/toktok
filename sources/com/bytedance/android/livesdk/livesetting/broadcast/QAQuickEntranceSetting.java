package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_quickQA_separate_entrance")
/* loaded from: classes6.dex */
public final class QAQuickEntranceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final QAQuickEntranceSetting INSTANCE = new QAQuickEntranceSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(QAQuickEntranceSetting.class) == 1) {
            return true;
        }
        return false;
    }
}