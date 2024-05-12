package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.AuM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27722AuM {
    public static final java.util.Set<String> LIZ = C77275UUl.LJIIIIZZ("template_id", "enter_from_info", "traffic_source_list", "source", "source_info", "author_id", "room_id", "track_id", "chain_key");

    public static java.util.Map LIZ(java.util.Map map, Integer num, java.util.Map map2) {
        Object obj;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (LIZ.contains(entry.getKey())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.put("traffic_source", num);
        java.util.Map map3 = null;
        if (map != null) {
            obj = map.get("entrance_info");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str != null) {
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJIIIIZZ(java.util.Map.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LJI(Object.class)))));
                if (!(fromJson instanceof java.util.Map)) {
                    fromJson = null;
                }
                map3 = (java.util.Map) fromJson;
            } catch (s unused) {
            }
            if (map3 != null) {
                linkedHashMap.putAll(map3);
            }
        }
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }
}
