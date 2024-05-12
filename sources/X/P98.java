package X;

import android.os.Build;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes12.dex */
public class P98 extends P9A {
    public final Class<?> LIZJ;
    public final EZF<Socket> LIZLLL;
    public final EZF<Socket> LJ;
    public final EZF<Socket> LJFF;
    public final EZF<Socket> LJI;
    public final P94 LJII;

    @Override // X.P9A
    public final SSLContext LJII() {
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    @Override // X.P9A
    public final Object LJIIIZ() {
        P94 p94 = this.LJII;
        Method method = p94.LIZ;
        if (method == null) {
            return null;
        }
        try {
            Object LIZ = P94.LIZ(null, method, new Object[0]);
            P94.LIZ(LIZ, p94.LIZIZ, new Object[]{"response.body().close()"});
            return LIZ;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.P9A
    public final P97 LIZJ(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new P96(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.LIZJ(x509TrustManager);
        }
    }

    @Override // X.P9A
    public final P95 LIZLLL(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new P93(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.LIZLLL(x509TrustManager);
        }
    }

    @Override // X.P9A
    public String LJIIIIZZ(SSLSocket sSLSocket) {
        boolean z;
        EZF<Socket> ezf = this.LJFF;
        if (ezf == null) {
            return null;
        }
        if (ezf.LIZ(sSLSocket.getClass()) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        EZF<Socket> ezf2 = this.LJFF;
        Object[] objArr = new Object[0];
        ezf2.getClass();
        try {
            byte[] bArr = (byte[]) ezf2.LIZIZ(sSLSocket, objArr);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, PVA.LJIIIIZZ);
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

    @Override // X.P9A
    public final boolean LJIIJ(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return LJIILL(cls, str, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e) {
            e = e;
            throw PVA.LIZ(e, "unable to determine cleartext support");
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw PVA.LIZ(e, "unable to determine cleartext support");
        } catch (InvocationTargetException e3) {
            e = e3;
            throw PVA.LIZ(e, "unable to determine cleartext support");
        }
    }

    @Override // X.P9A
    public final X509TrustManager LJIILJJIL(SSLSocketFactory sSLSocketFactory) {
        Object LJIILIIL = P9A.LJIILIIL(this.LIZJ, "sslParameters", sSLSocketFactory);
        if (LJIILIIL == null) {
            try {
                LJIILIIL = P9A.LJIILIIL(Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters", sSLSocketFactory);
            } catch (ClassNotFoundException unused) {
                return super.LJIILJJIL(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) P9A.LJIILIIL(X509TrustManager.class, "x509TrustManager", LJIILIIL);
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return (X509TrustManager) P9A.LJIILIIL(X509TrustManager.class, "trustManager", LJIILIIL);
    }

    @Override // X.P9A
    public final void LJIIL(Object obj, String str) {
        P94 p94 = this.LJII;
        p94.getClass();
        if (obj != null) {
            try {
                P94.LIZ(obj, p94.LIZJ, new Object[0]);
                return;
            } catch (Exception unused) {
                if (0 != 0) {
                    return;
                }
            }
        }
        LJIIJJI(5, str, null);
    }

    public static boolean LJIILL(Class cls, String str, Object obj) {
        try {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
            } catch (NoSuchMethodException unused) {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
            }
        } catch (NoSuchMethodException unused2) {
            return true;
        }
    }

    @Override // X.P9A
    public void LJFF(SSLSocket sSLSocket, String str, List<EnumC64572PVw> list) {
        if (str != null) {
            this.LIZLLL.LIZJ(sSLSocket, Boolean.TRUE);
            this.LJ.LIZJ(sSLSocket, str);
        }
        EZF<Socket> ezf = this.LJI;
        if (ezf != null && ezf.LIZ(sSLSocket.getClass()) != null) {
            Object[] objArr = new Object[1];
            C64533PUj c64533PUj = new C64533PUj();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                EnumC64572PVw enumC64572PVw = (EnumC64572PVw) ListProtector.get(list, i);
                if (enumC64572PVw != EnumC64572PVw.HTTP_1_0) {
                    c64533PUj.LJJIII(enumC64572PVw.toString().length());
                    c64533PUj.LJJJI(enumC64572PVw.toString());
                }
            }
            objArr[0] = c64533PUj.LLLLIIL();
            EZF<Socket> ezf2 = this.LJI;
            ezf2.getClass();
            try {
                ezf2.LIZIZ(sSLSocket, objArr);
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
    }

    @Override // X.P9A
    public final void LJI(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (PVA.LJIILLIIL(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    @Override // X.P9A
    public final void LJIIJJI(int i, String str, Throwable th) {
        if (th != null) {
            StringBuilder LJFF = C72972SkS.LJFF(str, '\n');
            LJFF.append(android.util.Log.getStackTraceString(th));
            str = X1D.LIZIZ(LJFF);
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int indexOf = str.indexOf(10, i2);
            if (indexOf == -1) {
                indexOf = length;
            }
            do {
                i2 = Math.min(indexOf, i2 + LivePlayerResourceReleaseSetting.ENABLE);
            } while (i2 < indexOf);
            i2++;
        }
    }

    public P98(Class<?> cls, EZF<Socket> ezf, EZF<Socket> ezf2, EZF<Socket> ezf3, EZF<Socket> ezf4) {
        Method method;
        Method method2;
        Method method3;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            method = cls2.getMethod("get", new Class[0]);
            method3 = cls2.getMethod("open", String.class);
            method2 = cls2.getMethod("warnIfOpen", new Class[0]);
        } catch (Exception unused) {
            method = null;
            method2 = null;
            method3 = null;
        }
        this.LJII = new P94(method, method3, method2);
        this.LIZJ = cls;
        this.LIZLLL = ezf;
        this.LJ = ezf2;
        this.LJFF = ezf3;
        this.LJI = ezf4;
    }
}
