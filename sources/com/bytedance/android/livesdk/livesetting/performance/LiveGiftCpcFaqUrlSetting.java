package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C58493MxV;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_gift_cpc_faq_url")
/* loaded from: classes11.dex */
public final class LiveGiftCpcFaqUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveGiftCpcFaqUrlSetting INSTANCE = new LiveGiftCpcFaqUrlSetting();
    public static final C5H3 mSettingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C58493MxV.LJLIL);

    private final String getMSettingValue() {
        return (String) mSettingValue$delegate.getValue();
    }

    public final String getValue() {
        return getMSettingValue();
    }
}
