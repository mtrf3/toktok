package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.QCn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66617QCn<T> {
    public final InvocationHandler LIZ;
    public final Object LIZIZ;
    public final Method LIZJ;
    public final Object[] LIZLLL;

    public final T LIZ() {
        try {
            return (T) this.LIZ.invoke(this.LIZIZ, this.LIZJ, new Object[]{new C66616QCm(this.LIZLLL)});
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public C66617QCn(InvocationHandler invocationHandler, Object obj, Method method, Object[] objArr) {
        this.LIZ = invocationHandler;
        this.LIZIZ = obj;
        this.LIZJ = method;
        this.LIZLLL = objArr;
    }
}
