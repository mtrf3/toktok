package X;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.EUa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36496EUa {
    public static Field LIZ(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable unused) {
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
