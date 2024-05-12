package com.bytedance.android.livesdk.livesetting.clientai;

import X.BFQ;
import X.BFR;
import X.C113554cx;
import X.C141335gf;
import X.C221108m2;
import X.C2NN;
import X.C32I;
import X.C3C4;
import X.C3C5;
import X.C5H3;
import X.C61878OQg;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SettingsKey("client_trigger_params")
/* loaded from: classes6.dex */
public final class LiveClientTriggerParamsSettings {
    public static final LiveClientTriggerParamsSettings INSTANCE = new LiveClientTriggerParamsSettings();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, Map<String, Object>> DEFAULT = C113554cx.LJJJLIIL();
    public static final C5H3 params$delegate = C221108m2.LIZ(EnumC221088m0.NONE, BFQ.LJLIL);

    private final Map<String, Map<String, Object>> getParams() {
        return (Map) params$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.LinkedHashMap, java.lang.Object, java.util.HashMap] */
    public final Map<String, C2NN> getTriggerConfigs() {
        C3C4 c3c4;
        Map map;
        List<Map> list;
        String str;
        String str2;
        String str3;
        String str4;
        try {
            ?? linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Map<String, Object>> entry : INSTANCE.getParams().entrySet()) {
                Object obj = entry.getValue().get("ab_params");
                C61878OQg c61878OQg = null;
                if (obj instanceof Map) {
                    map = (Map) obj;
                } else {
                    map = null;
                }
                Object obj2 = entry.getValue().get("trigger_configs");
                if (obj2 instanceof List) {
                    list = (List) obj2;
                } else {
                    list = null;
                }
                if (list != null) {
                    ?? arrayList = new ArrayList(C32I.LJJL(list, 10));
                    for (Map map2 : list) {
                        Object obj3 = map2.get("trigger_type");
                        if (obj3 instanceof String) {
                            str = (String) obj3;
                        } else {
                            str = null;
                        }
                        String str5 = "";
                        if (str == null) {
                            str = "";
                        }
                        Object obj4 = map2.get("rule_name");
                        if (obj4 instanceof String) {
                            str2 = (String) obj4;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        Object obj5 = map2.get("rules_pkg_name");
                        if (obj5 instanceof String) {
                            str3 = (String) obj5;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        Object obj6 = map2.get("algo_pkg_name");
                        if (obj6 instanceof String) {
                            str4 = (String) obj6;
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                            str5 = str4;
                        }
                        arrayList.add(new BFR(str, str2, str3, str5));
                    }
                    c61878OQg = arrayList;
                }
                String key = entry.getKey();
                if (c61878OQg == null) {
                    c61878OQg = C61878OQg.INSTANCE;
                }
                if (map == null) {
                    map = C113554cx.LJJJLIIL();
                }
                linkedHashMap.put(key, new C2NN(c61878OQg, map));
            }
            C3C5.m7constructorimpl(linkedHashMap);
            c3c4 = linkedHashMap;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            c3c4 = LIZ;
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(c3c4);
        Object obj7 = c3c4;
        if (m10exceptionOrNullimpl != null) {
            obj7 = C113554cx.LJJJLIIL();
        }
        return (Map) obj7;
    }
}
