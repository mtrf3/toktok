package X;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* loaded from: classes12.dex */
public final class P99 extends P9A {
    public static P99 LJIILL() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new P99();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // X.P9A
    public final SSLContext LJII() {
        try {
            return SSLContext.getInstance("TLSv1.3", LJIILLIIL());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", LJIILLIIL());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    public static Provider LJIILLIIL() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // X.P9A
    public final void LJ(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // X.P9A
    public final String LJIIIIZZ(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // X.P9A
    public final X509TrustManager LJIILJJIL(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.LJIILJJIL(sSLSocketFactory);
        }
        try {
            Object LJIILIIL = P9A.LJIILIIL(Object.class, "sslParameters", sSLSocketFactory);
            if (LJIILIIL != null) {
                return (X509TrustManager) P9A.LJIILIIL(X509TrustManager.class, "x509TrustManager", LJIILIIL);
            }
            return null;
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    @Override // X.P9A
    public final void LJFF(SSLSocket sSLSocket, String str, List<EnumC64572PVw> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ((ArrayList) P9A.LIZIZ(list)).toArray(new String[0]));
        }
    }
}
