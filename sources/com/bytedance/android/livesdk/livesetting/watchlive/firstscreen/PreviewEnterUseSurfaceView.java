package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.o;

@SettingsKey("preview_enter_use_surfaceview")
/* loaded from: classes6.dex */
public final class PreviewEnterUseSurfaceView {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final PreviewEnterUseSurfaceView INSTANCE = new PreviewEnterUseSurfaceView();

    @Group("v1")
    public static final boolean ENABLE = true;

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }

    public final boolean isEnable(EnterRoomConfig config) {
        o.LJIIIZ(config, "config");
        if (SettingsManager.INSTANCE.getBooleanValue(PreviewEnterUseSurfaceView.class) && LiveSurfaceViewSceneSetting.INSTANCE.isEnableScene(config) && LiveUseSurfaceViewExperiment.INSTANCE.isEnable()) {
            return true;
        }
        return false;
    }
}
