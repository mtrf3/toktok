package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes12.dex */
public final class P90 extends P9A {
    public final Method LIZJ;
    public final Method LIZLLL;
    public final Method LJ;
    public final Class<?> LJFF;
    public final Class<?> LJI;

    public static Object LJIILL(Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "2804186661747901078"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(null, objArr);
    }

    @Override // X.P9A
    public final void LIZ(SSLSocket sSLSocket) {
        try {
            LJIILL(this.LJ, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw PVA.LIZ(e, "unable to remove alpn");
        }
    }

    @Override // X.P9A
    public final String LJIIIIZZ(SSLSocket sSLSocket) {
        try {
            C63977P8z c63977P8z = (C63977P8z) Proxy.getInvocationHandler(LJIILL(this.LIZLLL, new Object[]{sSLSocket}));
            boolean z = c63977P8z.LIZIZ;
            if (!z && c63977P8z.LIZJ == null) {
                P9A.LIZ.LJIIJJI(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z) {
                return null;
            }
            return c63977P8z.LIZJ;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw PVA.LIZ(e, "unable to get selected protocol");
        }
    }

    @Override // X.P9A
    public final void LJFF(SSLSocket sSLSocket, String str, List<EnumC64572PVw> list) {
        try {
            LJIILL(this.LIZJ, new Object[]{sSLSocket, Proxy.newProxyInstance(P9A.class.getClassLoader(), new Class[]{this.LJFF, this.LJI}, new C63977P8z(P9A.LIZIZ(list)))});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw PVA.LIZ(e, "unable to set alpn");
        }
    }

    public P90(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.LIZJ = method;
        this.LIZLLL = method2;
        this.LJ = method3;
        this.LJFF = cls;
        this.LJI = cls2;
    }
}
