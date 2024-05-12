package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes12.dex */
public final class P93 implements P95 {
    public final X509TrustManager LIZ;
    public final Method LIZIZ;

    public static Object LIZIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-6869783793009842280"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZ.hashCode();
    }

    @Override // X.P95
    public final X509Certificate LIZ(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) LIZIZ(this.LIZ, this.LIZIZ, new Object[]{x509Certificate});
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
        } catch (IllegalAccessException e) {
            throw PVA.LIZ(e, "unable to get issues and signature");
        } catch (InvocationTargetException unused) {
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P93)) {
            return false;
        }
        P93 p93 = (P93) obj;
        if (this.LIZ.equals(p93.LIZ) && this.LIZIZ.equals(p93.LIZIZ)) {
            return true;
        }
        return false;
    }

    public P93(X509TrustManager x509TrustManager, Method method) {
        this.LIZIZ = method;
        this.LIZ = x509TrustManager;
    }
}
