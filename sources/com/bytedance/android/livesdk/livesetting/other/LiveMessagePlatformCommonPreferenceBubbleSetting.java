package com.bytedance.android.livesdk.livesetting.other;

import X.C09650Zl;
import X.C30772C5w;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformBubbleConfig;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

@SettingsKey("live_message_platform_common_preference_bubble")
/* loaded from: classes6.dex */
public final class LiveMessagePlatformCommonPreferenceBubbleSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveMessagePlatformCommonPreferenceBubbleSetting INSTANCE = new LiveMessagePlatformCommonPreferenceBubbleSetting();
    public static Map<String, LiveMessagePlatformBubbleConfig> configMap;

    public final LiveMessagePlatformBubbleConfig getValue(String id) {
        o.LJIIIZ(id, "id");
        if (configMap == null) {
            try {
                Object LJII = C09650Zl.LIZIZ.LJII(SettingsManager.INSTANCE.getStringValue(LiveMessagePlatformCommonPreferenceBubbleSetting.class), new C30772C5w().getType());
                o.LJIIIIZZ(LJII, "gson.fromJson(\n         …}.type,\n                )");
                Map<String, LiveMessagePlatformBubbleConfig> map = (Map) LJII;
                Iterator<String> it = LiveBubbleBlockListSetting.INSTANCE.getValue().iterator();
                while (it.hasNext()) {
                    map.remove(it.next());
                }
                configMap = map;
            } catch (Exception unused) {
            }
        }
        Map<String, LiveMessagePlatformBubbleConfig> map2 = configMap;
        if (map2 != null) {
            return map2.get(id);
        }
        return null;
    }
}
