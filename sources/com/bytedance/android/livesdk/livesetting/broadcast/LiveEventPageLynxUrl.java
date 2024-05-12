package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C113554cx;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

@SettingsKey("live_event_page_url")
/* loaded from: classes6.dex */
public final class LiveEventPageLynxUrl {
    public static final LiveEventPageLynxUrl INSTANCE = new LiveEventPageLynxUrl();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, String> DEFAULT = C113554cx.LJJJLIIL();

    public final String getEventCardLynxUrl() {
        Map<String, String> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveEventPageLynxUrl.class);
        if (map == null) {
            map = DEFAULT;
        }
        String str = null;
        if (map.containsKey("event_card")) {
            str = map.get("event_card");
        }
        return str;
    }

    public final Map<String, String> getValue() {
        Map<String, String> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveEventPageLynxUrl.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    public final Map<String, String> getDEFAULT() {
        return DEFAULT;
    }
}
