package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes12.dex */
public class P9A {
    public static final P9A LIZ;
    public static final Logger LIZIZ;

    public void LIZ(SSLSocket sSLSocket) {
    }

    public void LJ(SSLSocketFactory sSLSocketFactory) {
    }

    public void LJFF(SSLSocket sSLSocket, String str, List<EnumC64572PVw> list) {
    }

    public String LJIIIIZZ(SSLSocket sSLSocket) {
        return null;
    }

    public boolean LJIIJ(String str) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0157, code lost:
    
        if (0 != 0) goto L38;
     */
    static {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9A.<clinit>():void");
    }

    public SSLContext LJII() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public Object LJIIIZ() {
        if (LIZIZ.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public final String toString() {
        return C16880lQ.LJLLJ(getClass());
    }

    public static List<String> LIZIZ(List<EnumC64572PVw> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC64572PVw enumC64572PVw = (EnumC64572PVw) ListProtector.get(list, i);
            if (enumC64572PVw != EnumC64572PVw.HTTP_1_0) {
                arrayList.add(enumC64572PVw.toString());
            }
        }
        return arrayList;
    }

    public P97 LIZJ(X509TrustManager x509TrustManager) {
        return new P9B(LIZLLL(x509TrustManager));
    }

    public P95 LIZLLL(X509TrustManager x509TrustManager) {
        return new C64064PCi(x509TrustManager.getAcceptedIssuers());
    }

    public X509TrustManager LJIILJJIL(SSLSocketFactory sSLSocketFactory) {
        try {
            Object LJIILIIL = LJIILIIL(Class.forName("sun.security.ssl.SSLContextImpl"), "context", sSLSocketFactory);
            if (LJIILIIL == null) {
                return null;
            }
            return (X509TrustManager) LJIILIIL(X509TrustManager.class, "trustManager", LJIILIIL);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void LJIIL(Object obj, String str) {
        if (obj == null) {
            str = i0.LJFF(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        LJIIJJI(5, str, (Throwable) obj);
    }

    public static Object LJIILIIL(Class cls, String str, Object obj) {
        Object LJIILIIL;
        for (Class<?> cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null && cls.isInstance(obj2)) {
                    return cls.cast(obj2);
                }
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (NoSuchFieldException unused2) {
            }
        }
        if (str.equals("delegate") || (LJIILIIL = LJIILIIL(Object.class, "delegate", obj)) == null) {
            return null;
        }
        return LJIILIIL(cls, str, LJIILIIL);
    }

    public void LJI(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void LJIIJJI(int i, String str, Throwable th) {
        Level level;
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        LIZIZ.log(level, str, th);
    }
}
