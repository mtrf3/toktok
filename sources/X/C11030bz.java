package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.0bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11030bz {
    public Object LIZ;

    public C11030bz(int i) {
        if (i != 2) {
            return;
        }
        this.LIZ = new ConcurrentHashMap(3);
    }

    public static java.util.Map LJJIIZ(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                hashMap.put(next, opt);
            }
        }
        return hashMap;
    }

    public final HashMap LJI(java.util.Map map) {
        java.util.Map map2;
        HashMap hashMap = new HashMap((ConcurrentHashMap) this.LIZ);
        HashMap hashMap2 = (HashMap) map;
        if (hashMap2.containsKey("label_usage")) {
            try {
                Object obj = hashMap2.get("label_usage");
                if (obj instanceof JSONObject) {
                    map2 = LJJIIZ((JSONObject) obj);
                } else if (obj instanceof java.util.Map) {
                    map2 = (java.util.Map) obj;
                } else {
                    TTVideoEngineLog.e("LabelUsage", "invalid parameter type");
                    map2 = null;
                }
                if (map2 != null) {
                    hashMap.putAll(map2);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return hashMap;
    }
}
