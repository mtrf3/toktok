package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* renamed from: X.Pn1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65487Pn1 implements InvocationHandler {
    public static final C65574PoQ LIZIZ;
    public final C65485Pmz<?> LIZ;

    public static Object LIZ(C65485Pmz c65485Pmz, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{c65485Pmz, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-5529326625908671509"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(c65485Pmz, objArr);
    }

    static {
        C65534Pnm builder = AbstractC65564PoG.builder();
        for (Method method : C65485Pmz.class.getMethods()) {
            if (method.getDeclaringClass().equals(C65485Pmz.class)) {
                try {
                    method.setAccessible(true);
                } catch (AccessControlException unused) {
                }
                builder.LIZIZ(method.getName(), method);
            }
        }
        LIZIZ = builder.LIZ();
    }

    public C65487Pn1(C65485Pmz<?> c65485Pmz) {
        this.LIZ = c65485Pmz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Method method2 = (Method) LIZIZ.get(name);
        if (method2 != null) {
            try {
                return LIZ(this.LIZ, method2, objArr);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
        throw new UnsupportedOperationException(name);
    }
}
