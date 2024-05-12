package com.bytedance.android.livesdk.livesetting.feed;

import X.C113554cx;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

@SettingsKey("live_square_refresh_params")
/* loaded from: classes6.dex */
public final class LiveSquareRefreshParamsSetting {
    public static final LiveSquareRefreshParamsSetting INSTANCE = new LiveSquareRefreshParamsSetting();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, String> DEFAULT = C113554cx.LJJJLIIL();

    public final Map<String, String> getDEFAULT() {
        return DEFAULT;
    }

    public final String getValue(String str) {
        Map<String, String> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveSquareRefreshParamsSetting.class);
        if (map == null) {
            map = DEFAULT;
        }
        String str2 = map.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
