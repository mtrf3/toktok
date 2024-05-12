package X;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.HashMap;

/* renamed from: X.EOv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36361EOv {
    public static final java.util.Map<String, Field> LIZ = new HashMap();
    public static boolean LIZIZ;

    static {
        new HashMap();
        new HashMap();
        LIZIZ = false;
    }

    public static Field LIZ(Class<?> cls, String str) {
        Field field;
        if (cls != null) {
            if (!TextUtils.isEmpty(str)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(cls.getName());
                LIZ2.append("#");
                LIZ2.append(str);
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                java.util.Map<String, Field> map = LIZ;
                synchronized (map) {
                    field = (Field) ((HashMap) map).get(LIZIZ2);
                }
                if (field != null) {
                    if (!field.isAccessible()) {
                        field.setAccessible(true);
                    }
                    return field;
                }
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    if (declaredField != null && !declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    if (declaredField != null) {
                        synchronized (map) {
                            ((HashMap) map).put(LIZIZ2, declaredField);
                        }
                    }
                    return declaredField;
                } catch (Throwable unused) {
                    return null;
                }
            }
            throw new IllegalArgumentException("The field name must not be blank !!!");
        }
        throw new IllegalArgumentException("The class must not be null !!!");
    }
}
