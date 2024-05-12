package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FoE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40082FoE {
    public static final C40081FoD LIZ = C40081FoD.LJLIL;

    public static final Object LIZLLL(java.util.Map map, Object obj) {
        Object obj2 = ((ConcurrentHashMap) map).get(obj);
        if (obj2 != null) {
            return obj2;
        }
        return null;
    }

    public static Object LJ(JSONObject getAny, String key) {
        o.LJIIJ(getAny, "$this$getAny");
        o.LJIIJ(key, "key");
        Object opt = getAny.opt(key);
        if (opt != null) {
            return opt;
        }
        return null;
    }

    public static final void LJFF(String str, JSONObject increment) {
        o.LJIIJ(increment, "$this$increment");
        try {
            C3C5.m7constructorimpl(increment.put(str, increment.optLong(str, 0L) + 1));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final JSONObject LJI(JSONObject jSONObject, JSONObject into) {
        o.LJIIJ(into, "into");
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Object opt = jSONObject.opt(key);
                if (opt instanceof JSONObject) {
                    o.LJFF(key, "key");
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject optJSONObject = jSONObject.optJSONObject(key);
                    if (optJSONObject != null) {
                        jSONObject2 = optJSONObject;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject optJSONObject2 = into.optJSONObject(key);
                    if (optJSONObject2 != null) {
                        jSONObject3 = optJSONObject2;
                    }
                    LJI(jSONObject2, jSONObject3);
                    LJIIIIZZ(into, key, jSONObject3);
                } else {
                    if (opt instanceof Boolean) {
                        opt = opt.toString();
                    }
                    o.LJFF(key, "key");
                    LJIIIIZZ(into, key, opt);
                }
            }
            C3C5.m7constructorimpl(into);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return into;
    }

    public static final void LJII(JSONObject mergeFrom, Object... objArr) {
        o.LJIIJ(mergeFrom, "$this$mergeFrom");
        for (Object obj : objArr) {
            if (obj != null && (obj instanceof JSONObject)) {
                LJI((JSONObject) obj, mergeFrom);
            }
        }
    }

    public static final void LJIIJJI(JSONObject transform, InterfaceC88471Ynr... interfaceC88471YnrArr) {
        o.LJIIJ(transform, "$this$transform");
        try {
            for (InterfaceC88471Ynr interfaceC88471Ynr : interfaceC88471YnrArr) {
                Iterator<String> keys = transform.keys();
                o.LJFF(keys, "keys()");
                while (keys.hasNext()) {
                    String k = keys.next();
                    o.LJFF(k, "k");
                    LJIIIIZZ(transform, k, interfaceC88471Ynr.invoke(transform, k));
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final Long LIZ(Long l, Object obj, Object obj2) {
        if (obj != null && obj2 != null && (obj instanceof Number) && (obj2 instanceof Number)) {
            return Long.valueOf(((Number) obj).longValue() - ((Number) obj2).longValue());
        }
        return l;
    }

    public static final Long LIZIZ(java.util.Map duration, Object obj, Object obj2) {
        o.LJIIJ(duration, "$this$duration");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) duration;
        return LIZ(null, concurrentHashMap.get(obj), concurrentHashMap.get(obj2));
    }

    public static Long LIZJ(JSONObject jSONObject, String str, String str2) {
        return LIZ(0L, LJ(jSONObject, str), LJ(jSONObject, str2));
    }

    public static final void LJIIIIZZ(JSONObject putAny, String str, Object obj) {
        o.LJIIJ(putAny, "$this$putAny");
        try {
            C3C5.m7constructorimpl(putAny.put(str, obj));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void LJIIJ(JSONObject putIfNotNull, String str, Object obj) {
        o.LJIIJ(putIfNotNull, "$this$putIfNotNull");
        if (obj == null) {
            return;
        }
        try {
            C3C5.m7constructorimpl(putIfNotNull.put(str, obj));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void LJIIIZ(JSONObject jSONObject, Boolean bool, String str, Object obj) {
        if (bool != null && bool.booleanValue()) {
            LJIIIIZZ(jSONObject, str, obj);
        }
    }
}
