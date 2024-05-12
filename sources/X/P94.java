package X;

import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public final class P94 {
    public final Method LIZ;
    public final Method LIZIZ;
    public final Method LIZJ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-6869783793009842280"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public P94(Method method, Method method2, Method method3) {
        this.LIZ = method;
        this.LIZIZ = method2;
        this.LIZJ = method3;
    }
}
