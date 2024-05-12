package org.eclipse.mat.json;

import X.C16880lQ;
import X.X1D;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;

/* loaded from: classes12.dex */
public class JSON {
    public static double checkDouble(double d) {
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            return d;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Forbidden numeric value: ");
        LIZ.append(d);
        throw new JSONException(X1D.LIZIZ(LIZ));
    }

    public static Boolean toBoolean(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj);
        }
        return null;
    }

    public static Double toDouble(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return CastDoubleProtector.valueOf((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static Integer toInteger(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf((int) CastDoubleProtector.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static Long toLong(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf((long) CastDoubleProtector.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String toString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public static JSONException typeMismatch(Object obj, String str) {
        if (obj == null) {
            throw new JSONException("Value is null.");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Value ");
        LIZ.append(obj);
        LIZ.append(" of type ");
        LIZ.append(obj.getClass().getName());
        LIZ.append(" cannot be converted to ");
        LIZ.append(str);
        throw new JSONException(X1D.LIZIZ(LIZ));
    }

    public static void put(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject == null || str == null || str.length() == 0) {
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static JSONException typeMismatch(Object obj, Object obj2, String str) {
        if (obj2 == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Value at ");
            LIZ.append(obj);
            LIZ.append(" is null.");
            throw new JSONException(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Value ");
        LIZ2.append(obj2);
        LIZ2.append(" at ");
        LIZ2.append(obj);
        LIZ2.append(" of type ");
        LIZ2.append(obj2.getClass().getName());
        LIZ2.append(" cannot be converted to ");
        LIZ2.append(str);
        throw new JSONException(X1D.LIZIZ(LIZ2));
    }
}
