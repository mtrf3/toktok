package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EXC {
    public static EXC LIZIZ;
    public final Object LIZ;

    public static EXC LIZ() {
        if (LIZIZ == null) {
            synchronized (EXC.class) {
                if (LIZIZ == null) {
                    LIZIZ = new EXC();
                }
            }
        }
        return LIZIZ;
    }

    public EXC() {
        try {
            Constructor<?> declaredConstructor = Class.forName("android.os.SystemProperties").getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            this.LIZ = declaredConstructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        } catch (IllegalAccessException e2) {
            C16880lQ.LLLLIIL(e2);
        } catch (InstantiationException e3) {
            C16880lQ.LLLLIIL(e3);
        } catch (NoSuchMethodException e4) {
            C16880lQ.LLLLIIL(e4);
        } catch (InvocationTargetException e5) {
            C16880lQ.LLLLIIL(e5);
        }
    }

    public final String LIZIZ(String str) {
        Object obj = this.LIZ;
        if (obj == null) {
            return "";
        }
        try {
            Method method = obj.getClass().getMethod("get", String.class);
            method.setAccessible(true);
            String str2 = (String) method.invoke(this.LIZ, str);
            if (str2 == null) {
                return "";
            }
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }
}
