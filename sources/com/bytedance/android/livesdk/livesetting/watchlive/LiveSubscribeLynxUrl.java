package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@SettingsKey("live_subscription_lynx_url")
/* loaded from: classes6.dex */
public final class LiveSubscribeLynxUrl {
    public static LiveSubscribeLynxMap lynxMap;
    public static final LiveSubscribeLynxUrl INSTANCE = new LiveSubscribeLynxUrl();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";

    public final JSONObject getJsonValue() {
        return new JSONObject(SettingsManager.INSTANCE.getStringValue(LiveSubscribeLynxUrl.class));
    }

    public final LiveSubscribeLynxMap getValue() {
        if (lynxMap == null) {
            lynxMap = new LiveSubscribeLynxMap(SettingsManager.INSTANCE.getStringValue(LiveSubscribeLynxUrl.class));
        }
        LiveSubscribeLynxMap liveSubscribeLynxMap = lynxMap;
        o.LJI(liveSubscribeLynxMap);
        return liveSubscribeLynxMap;
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
