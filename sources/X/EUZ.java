package X;

import android.os.Build;
import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class EUZ {
    public static final java.util.Map<String, Field> LIZ = new HashMap();

    public static Field LIZ(Class<?> cls, String str) {
        boolean z;
        Field field;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 || (i == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                Field field2 = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
                field2.setAccessible(true);
                return field2;
            } catch (Throwable unused) {
                return null;
            }
        }
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
            } catch (NoSuchFieldException unused2) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }
}
