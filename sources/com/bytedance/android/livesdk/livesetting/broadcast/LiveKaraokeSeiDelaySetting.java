package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_host_karaok_sei_delay_ms")
/* loaded from: classes6.dex */
public final class LiveKaraokeSeiDelaySetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 200;
    public static final LiveKaraokeSeiDelaySetting INSTANCE = new LiveKaraokeSeiDelaySetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveKaraokeSeiDelaySetting.class);
    }
}
