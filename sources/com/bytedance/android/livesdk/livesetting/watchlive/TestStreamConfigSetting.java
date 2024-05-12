package com.bytedance.android.livesdk.livesetting.watchlive;

import X.CN1;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.config.LiveStreamTestConfig;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@SettingsKey("test_stream_config")
/* loaded from: classes6.dex */
public final class TestStreamConfigSetting {
    public static final TestStreamConfigSetting INSTANCE = new TestStreamConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveStreamTestConfig DEFAULT = new LiveStreamTestConfig();

    public final LiveStreamTestConfig getValue() {
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
            LiveStreamTestConfig liveStreamTestConfig = (LiveStreamTestConfig) SettingsManager.INSTANCE.getValueSafely(TestStreamConfigSetting.class);
            if (liveStreamTestConfig == null) {
                return DEFAULT;
            }
            return liveStreamTestConfig;
        }
        return DEFAULT;
    }

    public final LiveStreamTestConfig getDEFAULT() {
        return DEFAULT;
    }

    public final String replaceSdkParams(Map<String, String> map, String json) {
        o.LJIIIZ(map, "map");
        o.LJIIIZ(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        JSONObject jSONObject2 = new JSONObject(JSONObjectProtectorUtils.getString(jSONObject, "PushBase"));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put("PushBase", jSONObject2);
        String jSONObject3 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject3, "jsonObject.toString()");
        return jSONObject3;
    }
}
