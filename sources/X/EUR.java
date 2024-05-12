package X;

import java.lang.reflect.Proxy;

/* loaded from: classes7.dex */
public final class EUR {
    public static <T> T LIZ(T t) {
        if (t == null) {
            return null;
        }
        try {
            Class<?> cls = t.getClass();
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces != null && interfaces.length > 0) {
                return (T) Proxy.newProxyInstance(cls.getClassLoader(), interfaces, new EUQ(t));
            }
            return t;
        } catch (Throwable unused) {
            return t;
        }
    }
}
