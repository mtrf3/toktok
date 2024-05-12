package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: X.P9t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C63997P9t extends SSLSocket {
    public final SSLSocket LJLIL;

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.LJLIL.close();
    }

    @Override // java.net.Socket
    public final synchronized int getReceiveBufferSize() {
        return this.LJLIL.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() {
        return this.LJLIL.getSendBufferSize();
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() {
        return this.LJLIL.getSoTimeout();
    }

    @Override // java.net.Socket
    public final SocketChannel getChannel() {
        return this.LJLIL.getChannel();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getEnableSessionCreation() {
        return this.LJLIL.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledCipherSuites() {
        return this.LJLIL.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledProtocols() {
        return this.LJLIL.getEnabledProtocols();
    }

    @Override // java.net.Socket
    public final InetAddress getInetAddress() {
        return this.LJLIL.getInetAddress();
    }

    @Override // java.net.Socket
    public final InputStream getInputStream() {
        return this.LJLIL.getInputStream();
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() {
        return this.LJLIL.getKeepAlive();
    }

    @Override // java.net.Socket
    public final InetAddress getLocalAddress() {
        return this.LJLIL.getLocalAddress();
    }

    @Override // java.net.Socket
    public final int getLocalPort() {
        return this.LJLIL.getLocalPort();
    }

    @Override // java.net.Socket
    public final SocketAddress getLocalSocketAddress() {
        return this.LJLIL.getLocalSocketAddress();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
        return this.LJLIL.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() {
        return this.LJLIL.getOOBInline();
    }

    @Override // java.net.Socket
    public final OutputStream getOutputStream() {
        return this.LJLIL.getOutputStream();
    }

    @Override // java.net.Socket
    public final int getPort() {
        return this.LJLIL.getPort();
    }

    @Override // java.net.Socket
    public final SocketAddress getRemoteSocketAddress() {
        return this.LJLIL.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() {
        return this.LJLIL.getReuseAddress();
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
        return this.LJLIL.getSession();
    }

    @Override // java.net.Socket
    public final int getSoLinger() {
        return this.LJLIL.getSoLinger();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedCipherSuites() {
        return this.LJLIL.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedProtocols() {
        return this.LJLIL.getSupportedProtocols();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() {
        return this.LJLIL.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() {
        return this.LJLIL.getTrafficClass();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
        return this.LJLIL.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
        return this.LJLIL.getWantClientAuth();
    }

    @Override // java.net.Socket
    public final boolean isBound() {
        return this.LJLIL.isBound();
    }

    @Override // java.net.Socket
    public final boolean isClosed() {
        return this.LJLIL.isClosed();
    }

    @Override // java.net.Socket
    public final boolean isConnected() {
        return this.LJLIL.isConnected();
    }

    @Override // java.net.Socket
    public final boolean isInputShutdown() {
        return this.LJLIL.isInputShutdown();
    }

    @Override // java.net.Socket
    public final boolean isOutputShutdown() {
        return this.LJLIL.isOutputShutdown();
    }

    @Override // java.net.Socket
    public final void shutdownInput() {
        this.LJLIL.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() {
        this.LJLIL.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() {
        this.LJLIL.startHandshake();
    }

    @Override // javax.net.ssl.SSLSocket, java.net.Socket
    public final String toString() {
        return this.LJLIL.toString();
    }

    public C63997P9t(SSLSocket sSLSocket) {
        this.LJLIL = sSLSocket;
    }

    @Override // javax.net.ssl.SSLSocket
    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.LJLIL.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void bind(SocketAddress socketAddress) {
        this.LJLIL.bind(socketAddress);
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) {
        this.LJLIL.connect(socketAddress);
    }

    public final boolean equals(Object obj) {
        return this.LJLIL.equals(obj);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.LJLIL.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) {
        this.LJLIL.sendUrgentData(i);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnableSessionCreation(boolean z) {
        this.LJLIL.setEnableSessionCreation(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledCipherSuites(String[] strArr) {
        this.LJLIL.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnabledProtocols(String[] strArr) {
        this.LJLIL.setEnabledProtocols(strArr);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) {
        this.LJLIL.setKeepAlive(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z) {
        this.LJLIL.setNeedClientAuth(z);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) {
        this.LJLIL.setOOBInline(z);
    }

    @Override // java.net.Socket
    public final synchronized void setReceiveBufferSize(int i) {
        this.LJLIL.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) {
        this.LJLIL.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public final synchronized void setSendBufferSize(int i) {
        this.LJLIL.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public final synchronized void setSoTimeout(int i) {
        this.LJLIL.setSoTimeout(i);
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) {
        this.LJLIL.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i) {
        this.LJLIL.setTrafficClass(i);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z) {
        this.LJLIL.setUseClientMode(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z) {
        this.LJLIL.setWantClientAuth(z);
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int i) {
        this.LJLIL.connect(socketAddress, i);
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i) {
        this.LJLIL.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.LJLIL.setPerformancePreferences(i, i2, i3);
    }
}
