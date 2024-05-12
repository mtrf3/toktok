package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_sei_identify")
/* loaded from: classes11.dex */
public final class LiveCohostSeiIdentifyOptEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveCohostSeiIdentifyOptEnableSetting INSTANCE = new LiveCohostSeiIdentifyOptEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveCohostSeiIdentifyOptEnableSetting.class);
    }
}
