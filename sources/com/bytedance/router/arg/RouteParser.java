package com.bytedance.router.arg;

import X.C16880lQ;
import com.bytedance.mt.protector.impl.string2number.CastByteProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.mt.protector.impl.string2number.CastShortProtector;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RouteParser {
    public static final RouteParser INSTANCE = new RouteParser();

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T parse(Object obj, Class<T> cls) {
        Number number;
        String str;
        o.LJIIIZ(cls, "cls");
        if (obj != 0) {
            try {
                if (!(obj instanceof Number)) {
                    number = null;
                } else {
                    number = obj;
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (number != null) {
                if (o.LJ(cls, String.class)) {
                    return (T) ((Number) obj);
                }
                if (o.LJ(cls, Integer.class)) {
                    return (T) Integer.valueOf(((Number) obj).intValue());
                }
                if (o.LJ(cls, Short.class)) {
                    return (T) Short.valueOf(((Number) obj).shortValue());
                }
                if (o.LJ(cls, Long.class)) {
                    return (T) Long.valueOf(((Number) obj).longValue());
                }
                if (o.LJ(cls, Float.class)) {
                    return (T) Float.valueOf(((Number) obj).floatValue());
                }
                if (o.LJ(cls, Double.class)) {
                    return (T) Double.valueOf(((Number) obj).doubleValue());
                }
                if (o.LJ(cls, Byte.class)) {
                    return (T) Byte.valueOf(((Number) obj).byteValue());
                }
                return (T) ((Number) obj);
            }
            if (!(obj instanceof String)) {
                str = null;
            } else {
                str = obj;
            }
            if (str != null) {
                if (!o.LJ(cls, String.class)) {
                    if (o.LJ(cls, Integer.class)) {
                        return (T) Integer.valueOf(CastIntegerProtector.parseInt((String) obj));
                    }
                    if (o.LJ(cls, Boolean.class)) {
                        return (T) Boolean.valueOf(Boolean.parseBoolean((String) obj));
                    }
                    if (o.LJ(cls, Short.class)) {
                        return (T) Short.valueOf(CastShortProtector.parseShort((String) obj));
                    }
                    if (o.LJ(cls, Long.class)) {
                        return (T) Long.valueOf(CastLongProtector.parseLong((String) obj));
                    }
                    if (o.LJ(cls, Float.class)) {
                        return (T) Float.valueOf(CastFloatProtector.parseFloat((String) obj));
                    }
                    if (o.LJ(cls, Double.class)) {
                        return (T) Double.valueOf(CastDoubleProtector.parseDouble((String) obj));
                    }
                    if (o.LJ(cls, Byte.class)) {
                        return (T) Byte.valueOf(CastByteProtector.parseByte((String) obj));
                    }
                    try {
                        return (T) new Gson().LJI((String) obj, cls);
                    } catch (Throwable unused) {
                        return null;
                    }
                }
                return obj;
            }
            if (cls.isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        return null;
    }
}
