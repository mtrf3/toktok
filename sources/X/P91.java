package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes12.dex */
public final class P91 extends P9A {
    public final Method LIZJ;
    public final Method LIZLLL;

    public static Object LJIILL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-5583425934244827995"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.P9A
    public final String LJIIIIZZ(SSLSocket sSLSocket) {
        try {
            String str = (String) LJIILL(sSLSocket, this.LIZLLL, new Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e) {
            throw PVA.LIZ(e, "failed to get ALPN selected protocol");
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw PVA.LIZ(e2, "failed to get ALPN selected protocol");
        }
    }

    @Override // X.P9A
    public final X509TrustManager LJIILJJIL(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    public P91(Method method, Method method2) {
        this.LIZJ = method;
        this.LIZLLL = method2;
    }

    @Override // X.P9A
    public final void LJFF(SSLSocket sSLSocket, String str, List<EnumC64572PVw> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = (ArrayList) P9A.LIZIZ(list);
            LJIILL(sSLParameters, this.LIZJ, new Object[]{arrayList.toArray(new String[arrayList.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw PVA.LIZ(e, "unable to set ssl parameters");
        }
    }
}
