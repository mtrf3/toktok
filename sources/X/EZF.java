package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EZF<T> {
    public final Class<?> LIZ;
    public final String LIZIZ;
    public final Class[] LIZJ;

    public static Object LIZLLL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "5011518793007608331"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if ((r2.getModifiers() & 1) == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.reflect.Method LIZ(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.String r1 = r4.LIZIZ
            r3 = 0
            if (r1 == 0) goto L24
            java.lang.Class[] r0 = r4.LIZJ
            java.lang.reflect.Method r2 = r5.getMethod(r1, r0)     // Catch: java.lang.NoSuchMethodException -> L13
            int r0 = r2.getModifiers()     // Catch: java.lang.NoSuchMethodException -> L14
            r0 = r0 & 1
            if (r0 != 0) goto L14
        L13:
            r2 = r3
        L14:
            if (r2 == 0) goto L25
            java.lang.Class<?> r1 = r4.LIZ
            if (r1 == 0) goto L25
            java.lang.Class r0 = r2.getReturnType()
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 != 0) goto L25
        L24:
            return r3
        L25:
            r3 = r2
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EZF.LIZ(java.lang.Class):java.lang.reflect.Method");
    }

    public final Object LIZIZ(T t, Object... objArr) {
        Method LIZ = LIZ(t.getClass());
        if (LIZ != null) {
            try {
                return LIZLLL(t, LIZ, objArr);
            } catch (IllegalAccessException e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Unexpectedly could not call: ");
                LIZ2.append(LIZ);
                AssertionError assertionError = new AssertionError(X1D.LIZIZ(LIZ2));
                assertionError.initCause(e);
                throw assertionError;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Method ");
        LIZ3.append(this.LIZIZ);
        LIZ3.append(" not supported for object ");
        LIZ3.append(t);
        throw new AssertionError(X1D.LIZIZ(LIZ3));
    }

    public final void LIZJ(Object obj, Object... objArr) {
        try {
            Method LIZ = LIZ(obj.getClass());
            if (LIZ != null) {
                try {
                    LIZLLL(obj, LIZ, objArr);
                } catch (IllegalAccessException unused) {
                }
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw targetException;
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public EZF(Class<?> cls, String str, Class... clsArr) {
        this.LIZ = cls;
        this.LIZIZ = str;
        this.LIZJ = clsArr;
    }
}
