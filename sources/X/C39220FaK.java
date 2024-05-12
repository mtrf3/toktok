package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.util.ArrayMap;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.FaK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39220FaK {
    public static final Method LIZ;
    public static final Field LIZIZ;

    static {
        Field field;
        try {
            Method declaredMethod = BaseBundle.class.getDeclaredMethod("unparcel", new Class[0]);
            LIZ = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            Class superclass = Bundle.class.getSuperclass();
            if (superclass != null) {
                field = superclass.getDeclaredField("mMap");
            } else {
                field = null;
            }
            LIZIZ = field;
            if (field != null) {
                field.setAccessible(true);
            }
        } catch (Exception unused) {
        }
    }

    public static java.util.Map LIZ(boolean z, Bundle bundle) {
        Object obj;
        o.LJIIIZ(bundle, "bundle");
        Method method = LIZ;
        if (method != null) {
            method.invoke(bundle, new Object[0]);
        }
        Field field = LIZIZ;
        if (field != null) {
            obj = field.get(bundle);
        } else {
            obj = null;
        }
        if (!(obj instanceof ArrayMap)) {
            obj = null;
        }
        ArrayMap arrayMap = (ArrayMap) obj;
        if (arrayMap == null) {
            return null;
        }
        ArrayMap arrayMap2 = new ArrayMap();
        for (Map.Entry entry : arrayMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Bundle) {
                arrayMap2.put(key.toString(), LIZ(z, (Bundle) value));
            } else {
                String str = "*";
                if (value instanceof Object[]) {
                    String obj2 = key.toString();
                    if (!z) {
                        str = Arrays.toString((Object[]) value);
                    }
                    arrayMap2.put(obj2, str);
                } else if (value instanceof int[]) {
                    String obj3 = key.toString();
                    if (!z) {
                        str = Arrays.toString((int[]) value);
                        o.LJIIIIZZ(str, "java.util.Arrays.toString(this)");
                    }
                    arrayMap2.put(obj3, str);
                } else if (value instanceof float[]) {
                    String obj4 = key.toString();
                    if (!z) {
                        str = Arrays.toString((float[]) value);
                        o.LJIIIIZZ(str, "java.util.Arrays.toString(this)");
                    }
                    arrayMap2.put(obj4, str);
                } else if (value instanceof double[]) {
                    String obj5 = key.toString();
                    if (!z) {
                        str = Arrays.toString((double[]) value);
                        o.LJIIIIZZ(str, "java.util.Arrays.toString(this)");
                    }
                    arrayMap2.put(obj5, str);
                } else if (value instanceof char[]) {
                    String obj6 = key.toString();
                    if (!z) {
                        str = Arrays.toString((char[]) value);
                        o.LJIIIIZZ(str, "java.util.Arrays.toString(this)");
                    }
                    arrayMap2.put(obj6, str);
                } else if (value instanceof byte[]) {
                    String obj7 = key.toString();
                    if (!z) {
                        str = Arrays.toString((byte[]) value);
                        o.LJIIIIZZ(str, "java.util.Arrays.toString(this)");
                    }
                    arrayMap2.put(obj7, str);
                } else {
                    String obj8 = key.toString();
                    if (z) {
                        value = "*";
                    }
                    arrayMap2.put(obj8, value);
                }
            }
        }
        return arrayMap2;
    }
}
