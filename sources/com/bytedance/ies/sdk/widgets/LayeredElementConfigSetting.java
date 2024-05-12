package com.bytedance.ies.sdk.widgets;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;

@SettingsKey("layered_element_config")
/* loaded from: classes6.dex */
public final class LayeredElementConfigSetting {

    @Group(isDefault = true, value = "default group")
    public static final LayeredElementConfig DEFAULT;
    public static final LayeredElementConfigSetting INSTANCE = new LayeredElementConfigSetting();

    static {
        LayeredElementConfig createDefault = LayeredElementConfig.createDefault();
        o.LJIIIIZZ(createDefault, "createDefault()");
        DEFAULT = createDefault;
    }

    public static final LayeredElementConfig getValue() {
        LayeredElementConfig layeredElementConfig = (LayeredElementConfig) SettingsManager.INSTANCE.getValueSafely(LayeredElementConfigSetting.class);
        if (layeredElementConfig == null) {
            return DEFAULT;
        }
        return layeredElementConfig;
    }
}
