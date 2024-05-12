package X;

import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public class P8E implements P8F {
    public final Method LIZ;
    public final Object LIZIZ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-6020757847989068747"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public P8E(Object obj, Method method) {
        this.LIZ = method;
        this.LIZIZ = obj;
    }
}
