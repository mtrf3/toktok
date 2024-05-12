package X;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class EWF {
    public static final java.util.Map<String, Field> LIZ = new HashMap();

    public static Field LIZ(Class<?> cls, String str) {
        Field field;
        if (!TextUtils.isEmpty(str)) {
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
                    EWE.LIZ();
                    Field declaredField = cls.getDeclaredField(str);
                    if (declaredField != null) {
                        if (!declaredField.isAccessible()) {
                            declaredField.setAccessible(true);
                        }
                        java.util.Map<String, Field> map2 = LIZ;
                        synchronized (map2) {
                            continue;
                            ((HashMap) map2).put(str2, declaredField);
                        }
                    }
                    return declaredField;
                } catch (NoSuchFieldException unused) {
                    cls = cls.getSuperclass();
                }
            }
            return null;
        }
        throw new IllegalArgumentException("The field name must not be blank");
    }

    public static Object LIZIZ(Field field, Object obj) {
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field.get(obj);
        }
        throw new IllegalArgumentException("The field must not be null");
    }
}
