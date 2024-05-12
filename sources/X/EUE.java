package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EUE {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ() {
        java.util.Set<String> LJJIZ;
        java.util.Map<String, ConfigItem> map = KUZ.LIZ;
        o.LJIIIIZZ(map, "getConfigMap()");
        m mVar = new m();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            LIZLLL(mVar, (String) entry.getKey(), LIZ((String) entry.getKey()));
        }
        java.util.Map<String, Object> map2 = C38873FNl.LIZ;
        if (map2 != null) {
            for (Map.Entry entry2 : ((HashMap) map2).entrySet()) {
                Object key = entry2.getKey();
                o.LJIIIIZZ(key, "entry.key");
                LIZLLL(mVar, (String) key, entry2.getValue());
            }
        }
        m LIZ2 = FH3.LIZLLL.LIZ();
        if (LIZ2 != null && (LJJIZ = LIZ2.LJJIZ()) != null) {
            for (String key2 : LJJIZ) {
                o.LJIIIIZZ(key2, "key");
                LIZLLL(mVar, key2, FH3.LIZLLL.LIZIZ(key2));
            }
        }
        String jVar = mVar.toString();
        o.LJIIIIZZ(jVar, "jsonObject.toString()");
        return jVar;
    }

    public static java.util.Map LIZJ() {
        java.util.Set<String> LJJIZ;
        java.util.Map<String, ConfigItem> map = KUZ.LIZ;
        o.LJIIIIZZ(map, "getConfigMap()");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            linkedHashMap.put(entry.getKey(), LIZ((String) entry.getKey()));
        }
        java.util.Map<String, Object> map2 = C38873FNl.LIZ;
        if (map2 != null) {
            for (Map.Entry entry2 : ((HashMap) map2).entrySet()) {
                Object key = entry2.getKey();
                o.LJIIIIZZ(key, "entry.key");
                linkedHashMap.put(key, entry2.getValue());
            }
        }
        m LIZ2 = FH3.LIZLLL.LIZ();
        if (LIZ2 != null && (LJJIZ = LIZ2.LJJIZ()) != null) {
            for (String key2 : LJJIZ) {
                o.LJIIIIZZ(key2, "key");
                linkedHashMap.put(key2, FH3.LIZLLL.LIZIZ(key2));
            }
        }
        return linkedHashMap;
    }

    public static Object LIZ(String key) {
        o.LJIIIZ(key, "key");
        FHD.LIZLLL().getClass();
        return FHD.LJIIJ(key, false);
    }

    public static void LIZLLL(m mVar, String key, Object obj) {
        j pVar;
        o.LJIIIZ(key, "key");
        if (obj instanceof Number) {
            mVar.LJJIIJ(key, (Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            mVar.LJJIII((Boolean) obj, key);
            return;
        }
        if (obj instanceof String) {
            mVar.LJJIIZ(key, (String) obj);
            return;
        }
        if (obj instanceof Character) {
            if (obj == null) {
                pVar = l.LJLIL;
            } else {
                pVar = new p(obj);
            }
            mVar.LJJII(key, pVar);
            return;
        }
        if (obj instanceof j) {
            mVar.LJJII(key, (j) obj);
        } else {
            if (obj != null) {
                return;
            }
            mVar.LJJII(key, null);
        }
    }
}
