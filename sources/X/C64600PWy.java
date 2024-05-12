package X;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Request;

/* renamed from: X.PWy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64600PWy implements Cloneable, InterfaceC48134Iuo {
    public static final List<EnumC64572PVw> LLFZ = PVA.LJIILJJIL(EnumC64572PVw.HTTP_2, EnumC64572PVw.HTTP_1_1);
    public static final List<PVF> LLI = PVA.LJIILJJIL(PVF.LJ, PVF.LJI);
    public final C64588PWm LJLIL;
    public final Proxy LJLILLLLZI;
    public final List<EnumC64572PVw> LJLJI;
    public final List<PVF> LJLJJI;
    public final List<InterfaceC48121Iub> LJLJJL;
    public final List<InterfaceC48121Iub> LJLJJLL;
    public final PXC LJLJL;
    public final ProxySelector LJLJLJ;
    public final InterfaceC61701OJl LJLJLLL;
    public final SocketFactory LJLL;
    public final SSLSocketFactory LJLLI;
    public final P97 LJLLILLLL;
    public final HostnameVerifier LJLLJ;
    public final C64549PUz LJLLL;
    public final PXB LJLLLL;
    public final PXB LJLLLLLL;
    public final C64582PWg LJLZ;
    public final InterfaceC48118IuY LJZ;
    public final boolean LJZI;
    public final boolean LJZL;
    public final boolean LL;
    public final int LLD;
    public final int LLF;
    public final int LLFF;
    public final int LLFFF;
    public final int LLFII;

    static {
        AbstractC64554PVe.LIZ = new C64586PWk();
    }

    public C64600PWy() {
        this(new C64601PWz());
    }

    public C64600PWy(C64601PWz c64601PWz) {
        boolean z;
        this.LJLIL = c64601PWz.dispatcher;
        this.LJLILLLLZI = c64601PWz.proxy;
        this.LJLJI = c64601PWz.protocols;
        List<PVF> list = c64601PWz.connectionSpecs;
        this.LJLJJI = list;
        this.LJLJJL = PVA.LJIILIIL(c64601PWz.interceptors);
        this.LJLJJLL = PVA.LJIILIIL(c64601PWz.networkInterceptors);
        this.LJLJL = c64601PWz.eventListenerFactory;
        this.LJLJLJ = c64601PWz.proxySelector;
        this.LJLJLLL = c64601PWz.cookieJar;
        this.LJLL = c64601PWz.socketFactory;
        Iterator<PVF> it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z = z || it.next().LIZ;
            }
        }
        SSLSocketFactory sSLSocketFactory = c64601PWz.sslSocketFactory;
        if (sSLSocketFactory != null || !z) {
            this.LJLLI = sSLSocketFactory;
            this.LJLLILLLL = c64601PWz.certificateChainCleaner;
        } else {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            P9A p9a = P9A.LIZ;
                            SSLContext LJII = p9a.LJII();
                            LJII.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.LJLLI = LJII.getSocketFactory();
                            this.LJLLILLLL = p9a.LIZJ(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw PVA.LIZ(e, "No System TLS");
                        }
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unexpected default trust managers:");
                LIZ.append(Arrays.toString(trustManagers));
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            } catch (GeneralSecurityException e2) {
                throw PVA.LIZ(e2, "No System TLS");
            }
        }
        SSLSocketFactory sSLSocketFactory2 = this.LJLLI;
        if (sSLSocketFactory2 != null) {
            P9A.LIZ.LJ(sSLSocketFactory2);
        }
        this.LJLLJ = c64601PWz.hostnameVerifier;
        C64549PUz c64549PUz = c64601PWz.certificatePinner;
        P97 p97 = this.LJLLILLLL;
        this.LJLLL = PVA.LJIIJ(c64549PUz.LIZIZ, p97) ? c64549PUz : new C64549PUz(c64549PUz.LIZ, p97);
        this.LJLLLL = c64601PWz.proxyAuthenticator;
        this.LJLLLLLL = c64601PWz.authenticator;
        this.LJLZ = c64601PWz.connectionPool;
        this.LJZ = c64601PWz.dns;
        this.LJZI = c64601PWz.followSslRedirects;
        this.LJZL = c64601PWz.followRedirects;
        this.LL = c64601PWz.retryOnConnectionFailure;
        this.LLD = c64601PWz.callTimeout;
        this.LLF = c64601PWz.connectTimeout;
        this.LLFF = c64601PWz.readTimeout;
        this.LLFFF = c64601PWz.writeTimeout;
        this.LLFII = c64601PWz.pingInterval;
        if (!this.LJLJJL.contains(null)) {
            if (!this.LJLJJLL.contains(null)) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Null network interceptor: ");
            LIZ2.append(this.LJLJJLL);
            throw new IllegalStateException(X1D.LIZIZ(LIZ2));
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Null interceptor: ");
        LIZ3.append(this.LJLJJL);
        throw new IllegalStateException(X1D.LIZIZ(LIZ3));
    }

    @Override // X.InterfaceC48134Iuo
    public final C64587PWl LIZ(Request request) {
        return C64587PWl.LIZJ(this, request, false);
    }

    public final PXH LIZIZ(Request request, AbstractC38911fr abstractC38911fr) {
        C64600PWy build;
        PXH pxh = new PXH(request, abstractC38911fr, new Random(), this.LLFII);
        C64601PWz c64601PWz = new C64601PWz(this);
        c64601PWz.eventListener(AbstractC64590PWo.NONE);
        c64601PWz.protocols(PXH.LJIJJLI);
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "-2741063427336097496"));
        if (LIZJ.LIZ) {
            build = (C64600PWy) LIZJ.LIZIZ;
        } else {
            build = c64601PWz.build();
        }
        C64618PXq newBuilder = pxh.LIZ.newBuilder();
        newBuilder.LIZJ.LJ("Upgrade", "websocket");
        newBuilder.LIZJ.LJ("Connection", "Upgrade");
        newBuilder.LIZJ.LJ("Sec-WebSocket-Key", pxh.LJ);
        newBuilder.LIZJ.LJ("Sec-WebSocket-Version", "13");
        Request LIZIZ = newBuilder.LIZIZ();
        AbstractC64554PVe.LIZ.getClass();
        C64587PWl LIZJ2 = C64587PWl.LIZJ(build, LIZIZ, true);
        pxh.LJFF = LIZJ2;
        LIZJ2.LJLJI.LIZJ = 0L;
        C64599PWx c64599PWx = new C64599PWx(pxh, LIZIZ);
        if (!new C03880Dg(2).LIZJ(400103, "okhttp3/Call", "enqueue", LIZJ2, new Object[]{c64599PWx}, "void", new C65300Pk0(false, "(Lokhttp3/Callback;)V", "-2741063427336097496")).LIZ) {
            LIZJ2.LLIZLLLIL(c64599PWx);
        }
        return pxh;
    }
}
