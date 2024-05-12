package X;

import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public final class VFV {
    public Object LIZ;
    public Method LIZIZ;
    public Method LIZJ;
    public Method LIZLLL;
    public Method LJ;
    public final int LJFF;
    public int LJI;

    public static Object LIZIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8764831985263317108"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public VFV(int i) {
        this.LJFF = -1;
        this.LJFF = i;
        C48284IxE.LIZ(2, i, "AdaptiveGradingWrapper", "new AdaptiveGradingWrapper");
    }

    public final Object LIZ(Object obj, Method method, Object... objArr) {
        if (method != null && obj != null) {
            try {
                return LIZIZ(obj, method, objArr);
            } catch (Exception e) {
                C48284IxE.LIZ(6, this.LJFF, "AdaptiveGradingWrapper", e.toString());
                return null;
            }
        }
        return null;
    }
}
