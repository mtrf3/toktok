package X;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class J2I extends ProxySelector {
    public static final List<Proxy> LIZLLL = Collections.singletonList(Proxy.NO_PROXY);
    public final ProxySelector LIZ = ProxySelector.getDefault();
    public final String LIZIZ = "127.0.0.1";
    public final int LIZJ;

    public J2I(int i) {
        this.LIZJ = i;
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(java.net.URI uri) {
        if (uri != null) {
            if (this.LIZIZ.equalsIgnoreCase(uri.getHost()) && this.LIZJ == uri.getPort()) {
                return LIZLLL;
            }
            return this.LIZ.select(uri);
        }
        throw new IllegalArgumentException("URI can't be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(java.net.URI uri, SocketAddress socketAddress, IOException iOException) {
        this.LIZ.connectFailed(uri, socketAddress, iOException);
    }
}
