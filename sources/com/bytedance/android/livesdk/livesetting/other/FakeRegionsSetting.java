package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("fake_regions")
/* loaded from: classes6.dex */
public final class FakeRegionsSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final FakeRegionsSetting INSTANCE = new FakeRegionsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(FakeRegionsSetting.class);
    }
}
