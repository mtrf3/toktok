package X;

import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* renamed from: X.EZm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36638EZm {
    public static final Method LIZ;

    static {
        Method method;
        Method[] throwableMethods = Throwable.class.getMethods();
        o.LJIIIIZZ(throwableMethods, "throwableMethods");
        int length = throwableMethods.length;
        int i = 0;
        while (true) {
            method = null;
            Class<?> cls = null;
            if (i >= length) {
                break;
            }
            Method method2 = throwableMethods[i];
            if (o.LJ(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                o.LJIIIIZZ(parameterTypes, "it.parameterTypes");
                if (parameterTypes.length == 1) {
                    cls = parameterTypes[0];
                }
                if (o.LJ(cls, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        LIZ = method;
        int length2 = throwableMethods.length;
        for (int i2 = 0; i2 < length2 && !o.LJ(throwableMethods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
