package X;

import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class EUN {
    public static final java.util.Map<String, Field> LIZ = new HashMap();

    public static Field LIZ(Class<?> cls, String str) {
        Field field;
        String str2 = cls.toString() + "#" + str;
        java.util.Map<String, Field> map = LIZ;
        synchronized (map) {
            field = (Field) ((HashMap) map).get(str2);
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                java.util.Map<String, Field> map2 = LIZ;
                synchronized (map2) {
                    continue;
                    ((HashMap) map2).put(str2, declaredField);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Object LIZIZ(Object obj, String str) {
        Field LIZ2 = LIZ(obj.getClass(), str);
        if (LIZ2 != null) {
            if (!LIZ2.isAccessible()) {
                LIZ2.setAccessible(true);
            }
            return LIZ2.get(obj);
        }
        return null;
    }
}
