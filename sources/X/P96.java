package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes12.dex */
public final class P96 extends P97 {
    public final Object LIZ;
    public final Method LIZIZ;

    public static Object LIZIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-6869783793009842280"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return obj instanceof P96;
    }

    public P96(Object obj, Method method) {
        this.LIZ = obj;
        this.LIZIZ = method;
    }

    @Override // X.P97
    public final List LIZ(String str, List list) {
        try {
            Object[] array = list.toArray(new X509Certificate[list.size()]);
            return (List) LIZIZ(this.LIZ, this.LIZIZ, new Object[]{array, "RSA", str});
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }
}
