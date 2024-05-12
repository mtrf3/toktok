package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.PfV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65021PfV implements InvocationHandler {
    public final C65030Pfe LIZ = C65030Pfe.LIZ;
    public final Object[] LIZIZ = new Object[0];
    public final /* synthetic */ Class LIZJ;
    public final /* synthetic */ C65018PfS LIZLLL;

    public C65021PfV(C65018PfS c65018PfS, Class cls) {
        this.LIZLLL = c65018PfS;
        this.LIZJ = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.getDeclaringClass() == Object.class) {
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{this, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-2736076535941246205"));
            if (LIZJ.LIZ) {
                return LIZJ.LIZIZ;
            }
            return method.invoke(this, objArr);
        }
        if (this.LIZ.LJFF(method)) {
            return this.LIZ.LJ(method, this.LIZJ, obj, objArr);
        }
        AbstractC64951PeN<?> LIZJ2 = this.LIZLLL.LIZJ(method);
        if (objArr == null) {
            objArr = this.LIZIZ;
        }
        return LIZJ2.LIZ(objArr);
    }
}
