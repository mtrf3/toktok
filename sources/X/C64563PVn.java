package X;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.PVn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64563PVn {
    public final C64626PXy LIZ;
    public final InterfaceC48118IuY LIZIZ;
    public final SocketFactory LIZJ;
    public final PXB LIZLLL;
    public final List<EnumC64572PVw> LJ;
    public final List<PVF> LJFF;
    public final ProxySelector LJI;
    public final Proxy LJII;
    public final SSLSocketFactory LJIIIIZZ;
    public final HostnameVerifier LJIIIZ;
    public final C64549PUz LJIIJ;

    public C64563PVn() {
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.LJI.hashCode() + C77339UWx.LIZ(this.LJFF, C77339UWx.LIZ(this.LJ, (this.LIZLLL.hashCode() + ((this.LIZIZ.hashCode() + ((this.LIZ.hashCode() + 527) * 31)) * 31)) * 31, 31), 31)) * 31;
        Proxy proxy = this.LJII;
        int i4 = 0;
        if (proxy != null) {
            i = proxy.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        SSLSocketFactory sSLSocketFactory = this.LJIIIIZZ;
        if (sSLSocketFactory != null) {
            i2 = sSLSocketFactory.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        HostnameVerifier hostnameVerifier = this.LJIIIZ;
        if (hostnameVerifier != null) {
            i3 = hostnameVerifier.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        C64549PUz c64549PUz = this.LJIIJ;
        if (c64549PUz != null) {
            i4 = c64549PUz.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.LIZ.LIZLLL);
        sb.append(":");
        sb.append(this.LIZ.LJ);
        if (this.LJII != null) {
            sb.append(", proxy=");
            sb.append(this.LJII);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.LJI);
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean LIZ(C64563PVn c64563PVn) {
        if (this.LIZIZ.equals(c64563PVn.LIZIZ) && this.LIZLLL.equals(c64563PVn.LIZLLL) && this.LJ.equals(c64563PVn.LJ) && this.LJFF.equals(c64563PVn.LJFF) && this.LJI.equals(c64563PVn.LJI) && PVA.LJIIJ(this.LJII, c64563PVn.LJII) && PVA.LJIIJ(this.LJIIIIZZ, c64563PVn.LJIIIIZZ) && PVA.LJIIJ(this.LJIIIZ, c64563PVn.LJIIIZ) && PVA.LJIIJ(this.LJIIJ, c64563PVn.LJIIJ) && this.LIZ.LJ == c64563PVn.LIZ.LJ) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C64563PVn) {
            C64563PVn c64563PVn = (C64563PVn) obj;
            if (this.LIZ.equals(c64563PVn.LIZ) && LIZ(c64563PVn)) {
                return true;
            }
        }
        return false;
    }

    public C64563PVn(String str, int i, InterfaceC48118IuY interfaceC48118IuY, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C64549PUz c64549PUz, PXB pxb, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        String str2;
        C64627PXz c64627PXz = new C64627PXz();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        c64627PXz.LJII(str2);
        c64627PXz.LIZLLL(str);
        if (i > 0 && i <= 65535) {
            c64627PXz.LJ = i;
            this.LIZ = c64627PXz.LIZJ();
            if (interfaceC48118IuY != null) {
                this.LIZIZ = interfaceC48118IuY;
                if (socketFactory != null) {
                    this.LIZJ = socketFactory;
                    if (pxb != null) {
                        this.LIZLLL = pxb;
                        if (list != null) {
                            this.LJ = PVA.LJIILIIL(list);
                            if (list2 != null) {
                                this.LJFF = PVA.LJIILIIL(list2);
                                if (proxySelector != null) {
                                    this.LJI = proxySelector;
                                    this.LJII = proxy;
                                    this.LJIIIIZZ = sSLSocketFactory;
                                    this.LJIIIZ = hostnameVerifier;
                                    this.LJIIJ = c64549PUz;
                                    return;
                                }
                                throw new NullPointerException("proxySelector == null");
                            }
                            throw new NullPointerException("connectionSpecs == null");
                        }
                        throw new NullPointerException("protocols == null");
                    }
                    throw new NullPointerException("proxyAuthenticator == null");
                }
                throw new NullPointerException("socketFactory == null");
            }
            throw new NullPointerException("dns == null");
        }
        throw new IllegalArgumentException(KMP.LJ("unexpected port: ", i));
    }
}
