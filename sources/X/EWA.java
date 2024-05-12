package X;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class EWA {
    public static final java.util.Map<String, Field> LIZ = new HashMap();

    public static Field LIZ(Class<?> cls, String str) {
        Field field;
        Field declaredField;
        if (cls != null) {
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
                        if (EW9.LIZ()) {
                            declaredField = C78934UyQ.LJIIL(cls, str);
                            if (declaredField == null) {
                                declaredField = cls.getDeclaredField(str);
                            }
                        } else {
                            declaredField = cls.getDeclaredField(str);
                        }
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
            throw new IllegalArgumentException("The field name must not be blank");
        }
        throw new IllegalArgumentException("The class must not be null");
    }
}
