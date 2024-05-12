package X;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.P9u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63998P9u extends SSLSocketFactory {
    public static final String[] LIZIZ = {"TLSv1.2"};
    public final SSLSocketFactory LIZ;

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.LIZ.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.LIZ.getSupportedCipherSuites();
    }

    public C63998P9u(SSLSocketFactory sSLSocketFactory) {
        this.LIZ = sSLSocketFactory;
    }

    public static void LIZ(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(LIZIZ);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.LIZ.createSocket(str, i);
        LIZ(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.LIZ.createSocket(inetAddress, i);
        LIZ(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.LIZ.createSocket(str, i, inetAddress, i2);
        LIZ(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.LIZ.createSocket(inetAddress, i, inetAddress2, i2);
        LIZ(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.LIZ.createSocket(socket, str, i, z);
        LIZ(createSocket);
        return createSocket;
    }
}
