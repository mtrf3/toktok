package X;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class EUQ<T> implements InvocationHandler {
    public final WeakReference<T> LIZ;

    public EUQ(T t) {
        this.LIZ = new WeakReference<>(t);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        T t = this.LIZ.get();
        if (t == null) {
            return null;
        }
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{t, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "6504177073834739068"));
        if (LIZJ.LIZ) {
            return LIZJ.LIZIZ;
        }
        return method.invoke(t, objArr);
    }
}
