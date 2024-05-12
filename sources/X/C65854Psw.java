package X;

/* renamed from: X.Psw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65854Psw<T> {
    public static Class[] typeClasses = {Byte.class, Double.class, Float.class, Integer.class, Long.class, Short.class, String.class};

    public static boolean isReturnMatch(Object obj, Class<?> cls) {
        for (Class<?> cls2 : typeClasses) {
            if (cls2.isInstance(obj) && cls == cls2) {
                return true;
            }
        }
        return false;
    }

    public static <T> T tryProtect(EnumC65856Psy enumC65856Psy, Throwable th, Class<?> cls) {
        PTF LIZ = C65415Plr.LIZ(enumC65856Psy, th);
        if (LIZ == null) {
            return null;
        }
        T t = (T) LIZ.LIZ;
        if (!isReturnMatch(t, cls)) {
            return null;
        }
        return t;
    }
}
