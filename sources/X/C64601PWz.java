package X;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.PWz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64601PWz {
    public PXB authenticator;
    public int callTimeout;
    public P97 certificateChainCleaner;
    public C64549PUz certificatePinner;
    public int connectTimeout;
    public C64582PWg connectionPool;
    public List<PVF> connectionSpecs;
    public InterfaceC61701OJl cookieJar;
    public C64588PWm dispatcher;
    public InterfaceC48118IuY dns;
    public PXC eventListenerFactory;
    public boolean followRedirects;
    public boolean followSslRedirects;
    public HostnameVerifier hostnameVerifier;
    public final List<InterfaceC48121Iub> interceptors;
    public final List<InterfaceC48121Iub> networkInterceptors;
    public int pingInterval;
    public List<EnumC64572PVw> protocols;
    public Proxy proxy;
    public PXB proxyAuthenticator;
    public ProxySelector proxySelector;
    public int readTimeout;
    public boolean retryOnConnectionFailure;
    public SocketFactory socketFactory;
    public SSLSocketFactory sslSocketFactory;
    public int writeTimeout;

    public C64600PWy build() {
        return new C64600PWy(this);
    }

    public C64601PWz() {
        this.interceptors = new ArrayList();
        this.networkInterceptors = new ArrayList();
        this.dispatcher = new C64588PWm();
        this.protocols = C64600PWy.LLFZ;
        this.connectionSpecs = C64600PWy.LLI;
        this.eventListenerFactory = AbstractC64590PWo.factory(AbstractC64590PWo.NONE);
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.proxySelector = proxySelector;
        if (proxySelector == null) {
            this.proxySelector = new J2J();
        }
        this.cookieJar = InterfaceC61701OJl.LIZ;
        this.socketFactory = SocketFactory.getDefault();
        this.hostnameVerifier = PA2.LIZ;
        this.certificatePinner = C64549PUz.LIZJ;
        PXD pxd = PXB.LIZ;
        this.proxyAuthenticator = pxd;
        this.authenticator = pxd;
        this.connectionPool = new C64582PWg();
        this.dns = InterfaceC48118IuY.LIZ;
        this.followSslRedirects = true;
        this.followRedirects = true;
        this.retryOnConnectionFailure = true;
        this.callTimeout = 0;
        this.connectTimeout = 10000;
        this.readTimeout = 10000;
        this.writeTimeout = 10000;
        this.pingInterval = 0;
    }

    public C64601PWz(C64600PWy c64600PWy) {
        ArrayList arrayList = new ArrayList();
        this.interceptors = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.networkInterceptors = arrayList2;
        this.dispatcher = c64600PWy.LJLIL;
        this.proxy = c64600PWy.LJLILLLLZI;
        this.protocols = c64600PWy.LJLJI;
        this.connectionSpecs = c64600PWy.LJLJJI;
        arrayList.addAll(c64600PWy.LJLJJL);
        arrayList2.addAll(c64600PWy.LJLJJLL);
        this.eventListenerFactory = c64600PWy.LJLJL;
        this.proxySelector = c64600PWy.LJLJLJ;
        this.cookieJar = c64600PWy.LJLJLLL;
        this.socketFactory = c64600PWy.LJLL;
        this.sslSocketFactory = c64600PWy.LJLLI;
        this.certificateChainCleaner = c64600PWy.LJLLILLLL;
        this.hostnameVerifier = c64600PWy.LJLLJ;
        this.certificatePinner = c64600PWy.LJLLL;
        this.proxyAuthenticator = c64600PWy.LJLLLL;
        this.authenticator = c64600PWy.LJLLLLLL;
        this.connectionPool = c64600PWy.LJLZ;
        this.dns = c64600PWy.LJZ;
        this.followSslRedirects = c64600PWy.LJZI;
        this.followRedirects = c64600PWy.LJZL;
        this.retryOnConnectionFailure = c64600PWy.LL;
        this.callTimeout = c64600PWy.LLD;
        this.connectTimeout = c64600PWy.LLF;
        this.readTimeout = c64600PWy.LLFF;
        this.writeTimeout = c64600PWy.LLFFF;
        this.pingInterval = c64600PWy.LLFII;
        if (!PXY.LIZ().enable) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof PX2) {
                return;
            }
        }
        addInterceptor(new PX2());
    }

    public C64601PWz addInterceptor(InterfaceC48121Iub interfaceC48121Iub) {
        if (interfaceC48121Iub != null) {
            this.interceptors.add(interfaceC48121Iub);
            return this;
        }
        throw new IllegalArgumentException("interceptor == null");
    }

    public C64601PWz addNetworkInterceptor(InterfaceC48121Iub interfaceC48121Iub) {
        if (interfaceC48121Iub != null) {
            this.networkInterceptors.add(interfaceC48121Iub);
            return this;
        }
        throw new IllegalArgumentException("interceptor == null");
    }

    public C64601PWz certificatePinner(C64549PUz c64549PUz) {
        if (c64549PUz != null) {
            this.certificatePinner = c64549PUz;
            return this;
        }
        throw new NullPointerException("certificatePinner == null");
    }

    public C64601PWz connectionPool(C64582PWg c64582PWg) {
        if (c64582PWg != null) {
            this.connectionPool = c64582PWg;
            return this;
        }
        throw new NullPointerException("connectionPool == null");
    }

    public C64601PWz connectionSpecs(List<PVF> list) {
        this.connectionSpecs = PVA.LJIILIIL(list);
        return this;
    }

    public C64601PWz cookieJar(InterfaceC61701OJl interfaceC61701OJl) {
        if (interfaceC61701OJl != null) {
            this.cookieJar = interfaceC61701OJl;
            return this;
        }
        throw new NullPointerException("cookieJar == null");
    }

    public C64601PWz dispatcher(C64588PWm c64588PWm) {
        if (c64588PWm != null) {
            this.dispatcher = c64588PWm;
            return this;
        }
        throw new IllegalArgumentException("dispatcher == null");
    }

    public C64601PWz dns(InterfaceC48118IuY interfaceC48118IuY) {
        if (interfaceC48118IuY != null) {
            this.dns = interfaceC48118IuY;
            return this;
        }
        throw new NullPointerException("dns == null");
    }

    public C64601PWz eventListener(AbstractC64590PWo abstractC64590PWo) {
        if (abstractC64590PWo != null) {
            this.eventListenerFactory = AbstractC64590PWo.factory(abstractC64590PWo);
            return this;
        }
        throw new NullPointerException("eventListener == null");
    }

    public C64601PWz eventListenerFactory(PXC pxc) {
        if (pxc != null) {
            this.eventListenerFactory = pxc;
            return this;
        }
        throw new NullPointerException("eventListenerFactory == null");
    }

    public C64601PWz followRedirects(boolean z) {
        this.followRedirects = z;
        return this;
    }

    public C64601PWz followSslRedirects(boolean z) {
        this.followSslRedirects = z;
        return this;
    }

    public C64601PWz protocols(List<EnumC64572PVw> list) {
        ArrayList arrayList = new ArrayList(list);
        EnumC64572PVw enumC64572PVw = EnumC64572PVw.H2_PRIOR_KNOWLEDGE;
        if (arrayList.contains(enumC64572PVw) || arrayList.contains(EnumC64572PVw.HTTP_1_1)) {
            if (!arrayList.contains(enumC64572PVw) || arrayList.size() <= 1) {
                if (!arrayList.contains(EnumC64572PVw.HTTP_1_0)) {
                    if (!arrayList.contains(null)) {
                        arrayList.remove(EnumC64572PVw.SPDY_3);
                        this.protocols = Collections.unmodifiableList(arrayList);
                        return this;
                    }
                    throw new IllegalArgumentException("protocols must not contain null");
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("protocols must not contain http/1.0: ");
                LIZ.append(arrayList);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("protocols containing h2_prior_knowledge cannot use other protocols: ");
            LIZ2.append(arrayList);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("protocols must contain h2_prior_knowledge or http/1.1: ");
        LIZ3.append(arrayList);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
    }

    public C64601PWz proxy(Proxy proxy) {
        this.proxy = proxy;
        return this;
    }

    public C64601PWz retryOnConnectionFailure(boolean z) {
        this.retryOnConnectionFailure = z;
        return this;
    }

    public C64601PWz sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        if (sSLSocketFactory != null) {
            this.sslSocketFactory = sSLSocketFactory;
            P9A p9a = P9A.LIZ;
            X509TrustManager LJIILJJIL = p9a.LJIILJJIL(sSLSocketFactory);
            if (LJIILJJIL != null) {
                this.certificateChainCleaner = p9a.LIZJ(LJIILJJIL);
                return this;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unable to extract the trust manager on ");
            LIZ.append(p9a);
            LIZ.append(", sslSocketFactory is ");
            LIZ.append(sSLSocketFactory.getClass());
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        throw new NullPointerException("sslSocketFactory == null");
    }

    public C64601PWz connectTimeout(long j, TimeUnit timeUnit) {
        this.connectTimeout = PVA.LIZLLL(j, timeUnit);
        return this;
    }

    public C64601PWz readTimeout(long j, TimeUnit timeUnit) {
        this.readTimeout = PVA.LIZLLL(j, timeUnit);
        return this;
    }

    public C64601PWz sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        if (sSLSocketFactory != null) {
            if (x509TrustManager != null) {
                this.sslSocketFactory = sSLSocketFactory;
                this.certificateChainCleaner = P9A.LIZ.LIZJ(x509TrustManager);
                return this;
            }
            throw new NullPointerException("trustManager == null");
        }
        throw new NullPointerException("sslSocketFactory == null");
    }

    public C64601PWz writeTimeout(long j, TimeUnit timeUnit) {
        this.writeTimeout = PVA.LIZLLL(j, timeUnit);
        return this;
    }
}
