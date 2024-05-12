package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Evu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38010Evu {
    public static final C38010Evu LIZ = new C38010Evu();

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

    public static Number LIZJ(Number number) {
        Object LIZ2;
        int i;
        Object LIZ3;
        double d;
        try {
            LIZ2 = Integer.valueOf(number.intValue());
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Object obj = null;
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        Integer num = (Integer) LIZ2;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        try {
            LIZ3 = Double.valueOf(number.doubleValue());
            C3C5.m7constructorimpl(LIZ3);
        } catch (Throwable th2) {
            LIZ3 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ3);
        }
        if (!C3C5.m12isFailureimpl(LIZ3)) {
            obj = LIZ3;
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

    public static JSONArray LIZLLL(JavaOnlyArray javaOnlyArray) {
        ReadableType type;
        JSONArray jSONArray = new JSONArray();
        int size = javaOnlyArray.size();
        for (int i = 0; i < size; i++) {
            Object obj = javaOnlyArray.get(i);
            try {
                type = javaOnlyArray.getType(i);
            } catch (Throwable th) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("revertJavaOnlyArray2JSONArray ");
                LIZ2.append(th);
                C37887Etv.LIZIZ("BridgeConverter", X1D.LIZIZ(LIZ2));
            }
            if (type != null) {
                int i2 = F4Y.LIZIZ[type.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            if (obj != null) {
                                jSONArray.put(LIZJ((Number) obj));
                            } else {
                                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
                            }
                        }
                    } else if (obj != null) {
                        jSONArray.put(LIZLLL((JavaOnlyArray) obj));
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type com.lynx.react.bridge.JavaOnlyArray");
                    }
                } else if (obj != null) {
                    jSONArray.put(LJ((JavaOnlyMap) obj));
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type com.lynx.react.bridge.JavaOnlyMap");
                }
            }
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    public static JSONObject LJ(JavaOnlyMap javaOnlyMap) {
        boolean z;
        ReadableType type;
        JSONObject jSONObject = new JSONObject();
        if (javaOnlyMap == null || javaOnlyMap.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return jSONObject;
        }
        ReadableMapKeySetIterator keySetIterator = javaOnlyMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Object obj = javaOnlyMap.get(nextKey);
            try {
                type = javaOnlyMap.getType(nextKey);
            } catch (Throwable th) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("revertJavaOnlyMap2JSONObject ");
                LIZ2.append(th);
                C37887Etv.LIZIZ("BridgeConverter", X1D.LIZIZ(LIZ2));
            }
            if (type != null) {
                int i = F4Y.LIZ[type.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (obj != null) {
                                jSONObject.put(nextKey, LIZJ((Number) obj));
                            } else {
                                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
                            }
                        }
                    } else if (obj != null) {
                        jSONObject.putOpt(nextKey, LJ((JavaOnlyMap) obj));
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type com.lynx.react.bridge.JavaOnlyMap");
                    }
                } else if (obj != null) {
                    jSONObject.putOpt(nextKey, LIZLLL((JavaOnlyArray) obj));
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type com.lynx.react.bridge.JavaOnlyArray");
                }
            }
            jSONObject.putOpt(nextKey, obj);
        }
        return jSONObject;
    }
}
