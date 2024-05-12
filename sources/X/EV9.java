package X;

import X.C2K0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* loaded from: classes7.dex */
public final class EV9<T extends C2K0> implements InvocationHandler {
    public final java.util.Set<T> LIZ = new LinkedHashSet();

    public static Object LIZ(C2K0 c2k0, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{c2k0, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "3239144177041572972"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(c2k0, objArr);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        while (true) {
            Object obj2 = null;
            for (T t : this.LIZ) {
                if (objArr == null) {
                    if (method != null) {
                        obj2 = LIZ(t, method, new Object[0]);
                    }
                } else if (method != null) {
                    obj2 = LIZ(t, method, Arrays.copyOf(objArr, objArr.length));
                }
            }
            return obj2;
        }
    }
}
