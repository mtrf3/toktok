package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.Eau, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36708Eau implements InvocationHandler {
    public final Object LIZ;
    public final float LIZIZ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-2121091323138269358"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public C36708Eau(Object obj, float f) {
        this.LIZ = obj;
        this.LIZIZ = f;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if ("releaseSomeActivities".equals(method.getName())) {
            float f = this.LIZIZ;
            if (f > 0.0f) {
                if (f >= 1.0f) {
                    return null;
                }
                Runtime runtime = Runtime.getRuntime();
                if (((float) (runtime.totalMemory() - runtime.freeMemory())) <= ((float) runtime.maxMemory()) * this.LIZIZ) {
                    return null;
                }
                return LIZ(this.LIZ, method, objArr);
            }
        }
        return LIZ(this.LIZ, method, objArr);
    }
}
