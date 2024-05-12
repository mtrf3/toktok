package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_one_tap_golive_entrance")
/* loaded from: classes6.dex */
public final class TTliveOneTapGoliveEntranceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TTliveOneTapGoliveEntranceSetting INSTANCE = new TTliveOneTapGoliveEntranceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(TTliveOneTapGoliveEntranceSetting.class);
    }
}
