package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C113554cx;
import X.C29256Be0;
import X.C38350F3i;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

@SettingsKey("live_event_area_unity_animation_config")
/* loaded from: classes6.dex */
public final class LiveUnityAnimationConfigSetting {
    public static final LiveUnityAnimationConfigSetting INSTANCE = new LiveUnityAnimationConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, Map<String, Object>> DEFAULT = C113554cx.LJJJLIIL();

    public static final Map<String, Object> getConfigMap() {
        return (Map) SettingsManager.INSTANCE.getValueSafely(LiveUnityAnimationConfigSetting.class);
    }

    public static final boolean enable() {
        Object obj;
        String obj2;
        Boolean LJZ;
        Map<String, Object> configMap = getConfigMap();
        if (configMap != null && (obj = configMap.get("enable")) != null && (obj2 = obj.toString()) != null && (LJZ = s.LJZ(obj2)) != null) {
            return LJZ.booleanValue();
        }
        return false;
    }

    public static final C29256Be0 getItemConfig(String bid) {
        Object obj;
        Map map;
        int i;
        int i2;
        String obj2;
        Integer LJJIL;
        String obj3;
        Integer LJJIL2;
        o.LJIIIZ(bid, "bid");
        Map<String, Object> configMap = getConfigMap();
        if (configMap != null) {
            obj = configMap.get(bid);
        } else {
            obj = null;
        }
        if (!(obj instanceof Map) || (map = (Map) obj) == null) {
            return null;
        }
        Object obj4 = map.get("priority");
        if (obj4 != null && (obj3 = obj4.toString()) != null && (LJJIL2 = C38350F3i.LJJIL(obj3)) != null) {
            i = LJJIL2.intValue();
        } else {
            i = 0;
        }
        Object obj5 = map.get("time_out");
        if (obj5 != null && (obj2 = obj5.toString()) != null && (LJJIL = C38350F3i.LJJIL(obj2)) != null) {
            i2 = LJJIL.intValue();
        } else {
            i2 = 30;
        }
        return new C29256Be0(i, i2);
    }
}
