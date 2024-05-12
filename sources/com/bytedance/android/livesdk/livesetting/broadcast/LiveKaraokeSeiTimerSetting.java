package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_host_karaok_sei_timer_ms")
/* loaded from: classes6.dex */
public final class LiveKaraokeSeiTimerSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 200;
    public static final LiveKaraokeSeiTimerSetting INSTANCE = new LiveKaraokeSeiTimerSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveKaraokeSeiTimerSetting.class);
    }
}
