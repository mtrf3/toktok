package com.bytedance.android.livesdk.livesetting.slot;

import X.C113554cx;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

@SettingsKey("live_barrage_show_map")
/* loaded from: classes6.dex */
public final class LiveBarrageShowMapSetting {
    public static final LiveBarrageShowMapSetting INSTANCE = new LiveBarrageShowMapSetting();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, Boolean> DEFAULT = C113554cx.LJJJLIIL();

    public final Map<String, Boolean> getValue() {
        Map<String, Boolean> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveBarrageShowMapSetting.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }
}
