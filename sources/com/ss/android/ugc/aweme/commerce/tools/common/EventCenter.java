package com.ss.android.ugc.aweme.commerce.tools.common;

import X.C113554cx;
import X.C58096Mr6;
import X.C72818Shy;
import X.C76052yf;
import X.C78983UzD;
import X.F15;
import X.ORZ;
import com.ss.android.ugc.aweme.commerce.tools.promote.IEventCenter;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class EventCenter implements IEventCenter {
    public final F15 LIZ = new F15();

    public static IEventCenter LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IEventCenter.class, false);
        if (LIZ != null) {
            return (IEventCenter) LIZ;
        }
        if (C58096Mr6.LLLFFI == null) {
            synchronized (IEventCenter.class) {
                if (C58096Mr6.LLLFFI == null) {
                    C58096Mr6.LLLFFI = new EventCenter();
                }
            }
        }
        return C58096Mr6.LLLFFI;
    }

    public EventCenter() {
        new ConcurrentHashMap();
        new ReferenceQueue();
    }

    public static void LIZJ(List list, JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                list.add(linkedHashMap);
                LIZLLL(linkedHashMap, (JSONObject) obj);
            } else if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                list.add(arrayList);
                LIZJ(arrayList, (JSONArray) obj);
            } else {
                Object obj2 = jSONArray.get(i);
                o.LJIIIIZZ(obj2, "value.get(idx)");
                list.add(obj2);
            }
        }
        ORZ.LLJI(list);
    }

    public static Map LIZLLL(Map map, JSONObject jSONObject) {
        if (map == null) {
            map = new LinkedHashMap();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object v = jSONObject.get(key);
            if (v instanceof JSONObject) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                o.LJIIIIZZ(key, "key");
                map.put(key, linkedHashMap);
                LIZLLL(linkedHashMap, (JSONObject) v);
            } else if (v instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                o.LJIIIIZZ(key, "key");
                map.put(key, arrayList);
                LIZJ(arrayList, (JSONArray) v);
            } else {
                o.LJIIIIZZ(key, "key");
                o.LJIIIIZZ(v, "v");
                map.put(key, v);
            }
        }
        return C113554cx.LJJLIIIJLLLLLLLZ(map);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.promote.IEventCenter
    public final void LIZ(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            long currentTimeMillis = System.currentTimeMillis();
            F15 f15 = this.LIZ;
            Map LIZLLL = LIZLLL(null, jSONObject);
            f15.getClass();
            C72818Shy.LIZ(new C76052yf(currentTimeMillis, F15.LIZLLL(LIZLLL), str));
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
    }
}
