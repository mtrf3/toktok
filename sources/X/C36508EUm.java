package X;

import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.EUm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36508EUm {
    public static Field LIZ(Class<?> cls, String str) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 || (i == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
                field.setAccessible(true);
                return field;
            } catch (Throwable unused) {
                return null;
            }
        }
        return EUN.LIZ(cls, str);
    }

    public static Object LIZJ(Object obj, String str) {
        try {
            return LIZ(obj.getClass(), str).get(obj);
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static Method LIZIZ(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Throwable unused) {
            return null;
        }
    }
}
