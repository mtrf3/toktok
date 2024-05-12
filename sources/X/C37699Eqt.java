package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMapKeySetIterator;
import com.bytedance.vmsdk.jsbridge.utils.ReadableType;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Eqt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37699Eqt {
    public static JavaOnlyArray LIZ(JSONArray jSONArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof JSONArray) {
                javaOnlyArray.add(LIZ((JSONArray) opt));
            } else if (opt instanceof JSONObject) {
                javaOnlyArray.add(LIZIZ((JSONObject) opt));
            } else {
                javaOnlyArray.add(opt);
            }
        }
        return javaOnlyArray;
    }

    public static JavaOnlyMap LIZIZ(JSONObject obj) {
        o.LJIIJ(obj, "obj");
        Iterator<String> keys = obj.keys();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = obj.opt(next);
            if (opt instanceof JSONObject) {
                javaOnlyMap.put(next, LIZIZ((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                javaOnlyMap.put(next, LIZ((JSONArray) opt));
            } else if (o.LJ(opt, JSONObject.NULL)) {
                javaOnlyMap.put(next, null);
            } else {
                javaOnlyMap.put(next, opt);
            }
        }
        return javaOnlyMap;
    }

    public static JSONArray LIZJ(JavaOnlyArray javaOnlyArray) {
        ReadableType type;
        JSONArray jSONArray = new JSONArray();
        int size = javaOnlyArray.size();
        for (int i = 0; i < size; i++) {
            Object obj = javaOnlyArray.get(i);
            try {
                type = javaOnlyArray.getType(i);
            } catch (Throwable unused) {
            }
            if (type != null) {
                int i2 = C37708Er2.LIZIZ[type.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            if (obj != null) {
                                jSONArray.put(LJ((Number) obj));
                            } else {
                                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
                            }
                        }
                    } else if (obj != null) {
                        jSONArray.put(LIZJ((JavaOnlyArray) obj));
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray");
                    }
                } else if (obj != null) {
                    jSONArray.put(LIZLLL((JavaOnlyMap) obj));
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap");
                }
            }
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    public static JSONObject LIZLLL(JavaOnlyMap javaOnlyMap) {
        ReadableType type;
        JSONObject jSONObject = new JSONObject();
        if (javaOnlyMap.isEmpty()) {
            return jSONObject;
        }
        ReadableMapKeySetIterator keySetIterator = javaOnlyMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Object obj = javaOnlyMap.get(nextKey);
            try {
                type = javaOnlyMap.getType(nextKey);
            } catch (Throwable unused) {
            }
            if (type != null) {
                int i = C37708Er2.LIZ[type.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (obj != null) {
                                jSONObject.put(nextKey, LJ((Number) obj));
                            } else {
                                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
                            }
                        }
                    } else if (obj != null) {
                        jSONObject.putOpt(nextKey, LIZLLL((JavaOnlyMap) obj));
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap");
                    }
                } else if (obj != null) {
                    jSONObject.putOpt(nextKey, LIZJ((JavaOnlyArray) obj));
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray");
                }
            }
            jSONObject.putOpt(nextKey, obj);
        }
        return jSONObject;
    }

    public static Number LJ(Number number) {
        Object LIZ;
        int i;
        Object LIZ2;
        double d;
        try {
            LIZ = Integer.valueOf(number.intValue());
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Object obj = null;
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Integer num = (Integer) LIZ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        try {
            LIZ2 = Double.valueOf(number.doubleValue());
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (!C3C5.m12isFailureimpl(LIZ2)) {
            obj = LIZ2;
        }
        Double d2 = (Double) obj;
        if (d2 != null) {
            d = d2.doubleValue();
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        if (Double.compare(i, d) == 0) {
            return Integer.valueOf(i);
        }
        long j = (long) d;
        if (Double.compare(d, j) == 0) {
            return Long.valueOf(j);
        }
        return Double.valueOf(d);
    }
}
