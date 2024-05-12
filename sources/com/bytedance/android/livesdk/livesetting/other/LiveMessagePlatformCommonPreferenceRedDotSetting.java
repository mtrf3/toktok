package com.bytedance.android.livesdk.livesetting.other;

import X.C09650Zl;
import X.C0NB;
import X.C30449BxF;
import X.EnumC30410Bwc;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformRedDotConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

@SettingsKey("live_message_platform_common_preference_red_dot")
/* loaded from: classes6.dex */
public final class LiveMessagePlatformCommonPreferenceRedDotSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveMessagePlatformCommonPreferenceRedDotSetting INSTANCE = new LiveMessagePlatformCommonPreferenceRedDotSetting();
    public static Map<String, LiveMessagePlatformRedDotConfig> configMap;

    public final void initConfig() {
        if (configMap == null) {
            try {
                Object LJII = C09650Zl.LIZIZ.LJII(SettingsManager.INSTANCE.getStringValue(LiveMessagePlatformCommonPreferenceRedDotSetting.class), new C30449BxF().getType());
                o.LJIIIIZZ(LJII, "gson.fromJson(\n         …}.type,\n                )");
                Map<String, LiveMessagePlatformRedDotConfig> map = (Map) LJII;
                Iterator<String> it = LiveRedDotBlockListSetting.INSTANCE.getValue().iterator();
                while (it.hasNext()) {
                    map.remove(it.next());
                }
                configMap = map;
            } catch (Exception e) {
                C0NB.LJI("LiveMessagePlatformCommonPreferenceRedDotSetting", e);
            }
        }
    }

    public final LiveMessagePlatformRedDotConfig getValue(EnumC30410Bwc redDot) {
        LiveMessagePlatformRedDotConfig liveMessagePlatformRedDotConfig;
        int i;
        int i2;
        LiveMessagePlatformRedDotConfig liveMessagePlatformRedDotConfig2;
        LiveMessagePlatformRedDotConfig liveMessagePlatformRedDotConfig3;
        o.LJIIIZ(redDot, "redDot");
        initConfig();
        String[] ids = redDot.getIds();
        ArrayList arrayList = new ArrayList();
        int length = ids.length;
        int i3 = 0;
        while (true) {
            liveMessagePlatformRedDotConfig = null;
            if (i3 >= length) {
                break;
            }
            String str = ids[i3];
            Map<String, LiveMessagePlatformRedDotConfig> map = configMap;
            if (map != null && map.get(str) != null) {
                arrayList.add(str);
            }
            i3++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Map<String, LiveMessagePlatformRedDotConfig> map2 = configMap;
                if (map2 != null && (liveMessagePlatformRedDotConfig3 = map2.get(next)) != null) {
                    i = liveMessagePlatformRedDotConfig3.getPriority();
                } else {
                    i = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it.next();
                    Map<String, LiveMessagePlatformRedDotConfig> map3 = configMap;
                    if (map3 != null && (liveMessagePlatformRedDotConfig2 = map3.get(next2)) != null) {
                        i2 = liveMessagePlatformRedDotConfig2.getPriority();
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    if (i > i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
            String str2 = (String) next;
            Map<String, LiveMessagePlatformRedDotConfig> map4 = configMap;
            if (map4 != null) {
                liveMessagePlatformRedDotConfig = map4.get(str2);
            }
            redDot.setCurrentId(str2);
            if (liveMessagePlatformRedDotConfig != null) {
                redDot.setLiveMessagePlatformRedDotConfig(liveMessagePlatformRedDotConfig);
            }
            return liveMessagePlatformRedDotConfig;
        }
        throw new NoSuchElementException();
    }

    public final LiveMessagePlatformRedDotConfig getValue(String id) {
        o.LJIIIZ(id, "id");
        initConfig();
        Map<String, LiveMessagePlatformRedDotConfig> map = configMap;
        if (map != null) {
            return map.get(id);
        }
        return null;
    }
}
