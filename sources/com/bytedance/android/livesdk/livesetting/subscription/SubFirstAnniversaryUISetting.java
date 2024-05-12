package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscription_anniversray_ui")
/* loaded from: classes6.dex */
public final class SubFirstAnniversaryUISetting {

    @Group(isDefault = true, value = "default group: show anniversray_ui")
    public static final int DEFAULT = 0;
    public static final SubFirstAnniversaryUISetting INSTANCE = new SubFirstAnniversaryUISetting();

    public final boolean enableAnniversaryUI() {
        int intValue = SettingsManager.INSTANCE.getIntValue(SubFirstAnniversaryUISetting.class);
        if (intValue == DEFAULT || intValue == 2) {
            return true;
        }
        return false;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
