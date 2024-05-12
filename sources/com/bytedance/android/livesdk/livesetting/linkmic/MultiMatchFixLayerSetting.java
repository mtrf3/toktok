package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;

@SettingsKey("multi_match_fix_layer_setting")
/* loaded from: classes6.dex */
public final class MultiMatchFixLayerSetting {
    public static final MultiMatchFixLayerSetting INSTANCE = new MultiMatchFixLayerSetting();

    @Group(isDefault = true, value = "default group")
    public static final HashMap<String, Integer> DEFAULT = C113554cx.LJJJLZIJ(new OSZ("enable1", 0), new OSZ("enable2", 1));

    public final Map<String, Integer> getValue() {
        Map<String, Integer> map = (Map) SettingsManager.INSTANCE.getValueSafely(MultiMatchFixLayerSetting.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    public final boolean enable1() {
        Integer num = getValue().get("enable1");
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean enable2() {
        Integer num = getValue().get("enable2");
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }
}
