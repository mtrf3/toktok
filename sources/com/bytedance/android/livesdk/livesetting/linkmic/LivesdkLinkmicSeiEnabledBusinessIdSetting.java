package com.bytedance.android.livesdk.livesetting.linkmic;

import X.ORY;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;

@SettingsKey("livesdk_linkmic_sei_enabled_business_id")
/* loaded from: classes11.dex */
public final class LivesdkLinkmicSeiEnabledBusinessIdSetting {
    public static final LivesdkLinkmicSeiEnabledBusinessIdSetting INSTANCE = new LivesdkLinkmicSeiEnabledBusinessIdSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LivesdkLinkmicSeiEnabledBusinessIdSetting.class);
    }

    public final boolean isDisableAll() {
        if (getValue().length == 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnable(String businessId) {
        o.LJIIIZ(businessId, "businessId");
        return ORY.LJJIJIIJIL(businessId, getValue());
    }
}
