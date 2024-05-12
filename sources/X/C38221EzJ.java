package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.EzJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38221EzJ implements InvocationHandler {
    public Class<?> LIZ;
    public Object LIZIZ;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C38222EzK.LJFF.getClass();
        Object obj2 = this.LIZIZ;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj2, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-8493945855283659970"));
        if (LIZJ.LIZ) {
            return LIZJ.LIZIZ;
        }
        return method.invoke(obj2, objArr);
    }
}
