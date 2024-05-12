package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_envelope")
/* loaded from: classes6.dex */
public final class RedEnvelopeLibraConfig {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final RedEnvelopeLibraConfig INSTANCE = new RedEnvelopeLibraConfig();

    public final boolean enableEnvelopeFunc() {
        return SettingsManager.INSTANCE.getBooleanValue(RedEnvelopeLibraConfig.class);
    }
}
