package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = true, value = "inner_push_stream_url_exp")
/* loaded from: classes6.dex */
public final class InnerPushStreamUrlExp {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final InnerPushStreamUrlExp INSTANCE = new InnerPushStreamUrlExp();

    @Group("v2")
    public static final boolean V2 = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(InnerPushStreamUrlExp.class);
    }
}
