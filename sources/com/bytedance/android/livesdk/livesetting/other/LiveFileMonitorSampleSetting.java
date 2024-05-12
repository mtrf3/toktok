package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C31825CeL;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@SettingsKey("live_file_monitor_sample")
/* loaded from: classes6.dex */
public final class LiveFileMonitorSampleSetting {
    public static final LiveFileMonitorSampleSetting INSTANCE = new LiveFileMonitorSampleSetting();

    @Group(isDefault = true, value = "default group")
    public static final JSONObject DEFAULT = new JSONObject();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C31825CeL.LJLIL);

    private final JSONObject getSettingValue() {
        return (JSONObject) settingValue$delegate.getValue();
    }

    public final int getSampleRate(String scene) {
        o.LJIIIZ(scene, "scene");
        JSONObject settingValue = getSettingValue();
        if (settingValue == null) {
            return -1;
        }
        return settingValue.optInt(scene, -1);
    }
}
