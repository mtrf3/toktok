package X;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class N3C {
    public final int LIZ;
    public final java.util.Set<String> LIZIZ;
    public final java.util.Map<String, List<java.util.Set<String>>> LIZJ;
    public final java.util.Map<String, List<java.util.Map<String, Object>>> LIZLLL;

    public abstract boolean LIZJ(N3H n3h);

    public final int LIZ() {
        int i = this.LIZ;
        if (i <= 0) {
            return -1;
        }
        if (i >= 10000) {
            return 1;
        }
        return 0;
    }

    public final boolean LIZIZ(String str, JSONObject jSONObject) {
        List<java.util.Map<String, Object>> list;
        List<java.util.Set<String>> list2;
        HashSet hashSet = new HashSet();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        java.util.Map<String, List<java.util.Set<String>>> map = this.LIZJ;
        if (map != null && map.containsKey(str) && (list2 = this.LIZJ.get(str)) != null && !list2.isEmpty()) {
            for (java.util.Set<String> set : list2) {
                if (set != null && !set.isEmpty() && hashSet.containsAll(set)) {
                    return true;
                }
            }
        }
        java.util.Map<String, List<java.util.Map<String, Object>>> map2 = this.LIZLLL;
        if (map2 != null && map2.containsKey(str) && (list = this.LIZLLL.get(str)) != null && !list.isEmpty()) {
            for (java.util.Map<String, Object> map3 : list) {
                if (map3 != null && !map3.isEmpty() && hashSet.containsAll(map3.keySet())) {
                    for (Map.Entry<String, Object> entry : map3.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!TextUtils.isEmpty(key) && value != null && value.equals(jSONObject.opt(key))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public N3C(int i, java.util.Map map, java.util.Map map2, java.util.Set set) {
        this.LIZ = i;
        this.LIZIZ = set;
        this.LIZJ = map;
        this.LIZLLL = map2;
    }
}
