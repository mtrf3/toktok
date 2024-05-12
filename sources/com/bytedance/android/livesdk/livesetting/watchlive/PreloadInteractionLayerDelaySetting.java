package com.bytedance.android.livesdk.livesetting.watchlive;

import X.BB4;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("preload_interaction_layer_delay_time")
/* loaded from: classes6.dex */
public final class PreloadInteractionLayerDelaySetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 200;
    public static final PreloadInteractionLayerDelaySetting INSTANCE = new PreloadInteractionLayerDelaySetting();
    public static final C5H3 settings$delegate = C221108m2.LIZIZ(BB4.LJLIL);

    private final long getSettings() {
        return ((Number) settings$delegate.getValue()).longValue();
    }

    public final long delayMill() {
        return getSettings();
    }
}
