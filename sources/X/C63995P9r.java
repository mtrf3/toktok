package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.P9r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63995P9r extends SSLSocketFactory {
    public static final String[] LJ = {"RC4", "DES", "PSK", "_DHE_"};
    public final SSLSocketFactory LIZ;
    public final boolean LIZIZ;
    public final Class<?> LIZJ;
    public final Method LIZLLL;

    public static void LIZLLL(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "416020080825483810")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return LIZ(this.LIZ.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        if (this.LIZIZ) {
            return LIZJ(this.LIZ.getDefaultCipherSuites());
        }
        return this.LIZ.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        if (this.LIZIZ) {
            return LIZJ(this.LIZ.getSupportedCipherSuites());
        }
        return this.LIZ.getSupportedCipherSuites();
    }

    public C63995P9r(SSLSocketFactory sSLSocketFactory) {
        this.LIZIZ = true;
        this.LIZ = sSLSocketFactory;
        this.LIZIZ = true;
        try {
            try {
                this.LIZJ = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused) {
                this.LIZJ = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            }
            this.LIZLLL = this.LIZJ.getMethod("setHostname", String.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
    }

    public static String[] LIZJ(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        for (String str : strArr) {
            for (String str2 : LJ) {
                if (str.contains(str2)) {
                    arrayList.remove(str);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final Socket LIZ(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
            if (this.LIZIZ) {
                sSLSocket.setEnabledCipherSuites(LIZJ(sSLSocket.getEnabledCipherSuites()));
            }
            return new C63996P9s(sSLSocket);
        }
        return socket;
    }

    public final void LIZIZ(Socket socket, String str) {
        Method method;
        if (!this.LIZJ.isInstance(socket) || (method = this.LIZLLL) == null) {
            return;
        }
        try {
            LIZLLL(socket, method, new Object[]{str});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.LIZ.createSocket(str, i);
        LIZIZ(createSocket, str);
        return LIZ(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return LIZ(this.LIZ.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.LIZ.createSocket(str, i, inetAddress, i2);
        LIZIZ(createSocket, str);
        return LIZ(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.LIZ.createSocket(socket, str, i, z);
        LIZIZ(createSocket, str);
        return LIZ(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return LIZ(this.LIZ.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
