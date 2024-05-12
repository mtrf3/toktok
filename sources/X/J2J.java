package X;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class J2J extends ProxySelector {
    @Override // java.net.ProxySelector
    public final void connectFailed(java.net.URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(java.net.URI uri) {
        if (uri != null) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}
