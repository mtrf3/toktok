package com.livecore.base.tinyjson;

import X.C16880lQ;
import X.C76800UCe;
import X.X1D;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.lang.reflect.Field;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class DefinitionKt {
    public static final boolean isBoolean(Class<?> cls) {
        Class cls2 = Boolean.TYPE;
        if (o.LJ(cls, cls2) || o.LJ(cls, Boolean.class) || o.LJ(cls, cls2)) {
            return true;
        }
        return false;
    }

    public static final boolean isDirectType(Class<?> isDirectType) {
        o.LJIIIZ(isDirectType, "$this$isDirectType");
        if (isDirectType.isPrimitive() || isDirectType.isAssignableFrom(String.class) || isDirectType.isAssignableFrom(JSONObject.class) || isDirectType.isAssignableFrom(JSONArray.class) || o.LJ(isDirectType, Boolean.class) || o.LJ(isDirectType, Integer.class) || o.LJ(isDirectType, Float.class) || o.LJ(isDirectType, Long.class) || o.LJ(isDirectType, Double.class)) {
            return true;
        }
        return false;
    }

    public static final boolean isDouble(Class<?> cls) {
        if (o.LJ(cls, Double.TYPE) || o.LJ(cls, Double.class) || o.LJ(cls, Double.TYPE)) {
            return true;
        }
        return false;
    }

    public static final boolean isFloat(Class<?> cls) {
        Class cls2 = Float.TYPE;
        if (o.LJ(cls, cls2) || o.LJ(cls, Float.class) || o.LJ(cls, cls2)) {
            return true;
        }
        return false;
    }

    public static final boolean isInt(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        if (o.LJ(cls, cls2) || o.LJ(cls, Integer.class) || o.LJ(cls, cls2)) {
            return true;
        }
        return false;
    }

    public static final boolean isLong(Class<?> cls) {
        Class cls2 = Long.TYPE;
        if (o.LJ(cls, cls2) || o.LJ(cls, Long.class) || o.LJ(cls, cls2)) {
            return true;
        }
        return false;
    }

    public static final void onCastFailed(Object obj, Class<?> cls) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(obj);
        LIZ.append(" cannot cast to ");
        LIZ.append(cls.getName());
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R smartCastAs(T smartCastAs, Class<R> type) {
        R r;
        o.LJIIIZ(smartCastAs, "$this$smartCastAs");
        o.LJIIIZ(type, "type");
        if (smartCastAs instanceof String) {
            r = smartCastAs;
            if (!o.LJ(type, String.class)) {
                if (isInt(type)) {
                    r = (R) Integer.valueOf(CastIntegerProtector.parseInt((String) smartCastAs));
                } else if (isFloat(type)) {
                    r = (R) Float.valueOf(CastFloatProtector.parseFloat((String) smartCastAs));
                } else if (isLong(type)) {
                    r = (R) Long.valueOf(CastLongProtector.parseLong((String) smartCastAs));
                } else if (isDouble(type)) {
                    r = (R) Double.valueOf(CastDoubleProtector.parseDouble((String) smartCastAs));
                } else if (isBoolean(type)) {
                    r = (R) Boolean.valueOf(Boolean.parseBoolean((String) smartCastAs));
                } else {
                    onCastFailed(smartCastAs, type);
                    r = (R) C76800UCe.LIZ;
                }
            }
        } else if (smartCastAs instanceof Number) {
            if (isInt(type)) {
                r = (R) Integer.valueOf(((Number) smartCastAs).intValue());
            } else if (isFloat(type)) {
                r = (R) Float.valueOf(((Number) smartCastAs).floatValue());
            } else if (isLong(type)) {
                r = (R) Long.valueOf(((Number) smartCastAs).longValue());
            } else if (isDouble(type)) {
                r = (R) Double.valueOf(((Number) smartCastAs).doubleValue());
            } else {
                onCastFailed(smartCastAs, type);
                r = (R) C76800UCe.LIZ;
            }
        } else if (smartCastAs instanceof JSONObject) {
            r = smartCastAs;
            if (!o.LJ(type, JSONObject.class)) {
                if (o.LJ(type, String.class)) {
                    r = (R) smartCastAs.toString();
                } else {
                    r = smartCastAs;
                    if (!Map.class.isAssignableFrom(type)) {
                        onCastFailed(smartCastAs, type);
                        r = (R) C76800UCe.LIZ;
                    }
                }
            }
        } else if (smartCastAs instanceof Boolean) {
            r = smartCastAs;
            if (!isBoolean(type)) {
                if (o.LJ(type, String.class)) {
                    r = (R) smartCastAs.toString();
                } else {
                    onCastFailed(smartCastAs, type);
                    r = (R) C76800UCe.LIZ;
                }
            }
        } else {
            onCastFailed(smartCastAs, type);
            r = (R) C76800UCe.LIZ;
        }
        if (r instanceof Object) {
            return r;
        }
        return null;
    }

    public static final void safelySet(Field safelySet, Object obj, Object obj2) {
        o.LJIIIZ(safelySet, "$this$safelySet");
        o.LJIIIZ(obj, "obj");
        try {
            safelySet.set(obj, obj2);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TinyJson: Field.safelySet() occurs failure when set ");
            LIZ.append(String.valueOf(obj2));
            LIZ.append(" into ");
            LIZ.append(safelySet.getName());
            System.out.println((Object) X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            throw new RuntimeException("Tiny json set field failed", e);
        }
    }
}
