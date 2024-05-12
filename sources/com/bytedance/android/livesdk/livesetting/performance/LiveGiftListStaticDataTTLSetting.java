package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C58468Mx6;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_gift_list_static_data_ttl_days")
/* loaded from: classes11.dex */
public final class LiveGiftListStaticDataTTLSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 30;
    public static final LiveGiftListStaticDataTTLSetting INSTANCE = new LiveGiftListStaticDataTTLSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C58468Mx6.LJLIL);

    private final int getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return getSettingValue();
    }
}
