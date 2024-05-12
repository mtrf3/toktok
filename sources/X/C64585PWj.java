package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.PWj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64585PWj {
    public final C64563PVn LIZ;
    public final C48292IxM LIZIZ;
    public final InterfaceC48133Iun LIZJ;
    public final AbstractC64590PWo LIZLLL;
    public int LJFF;
    public List<Proxy> LJ = Collections.emptyList();
    public List<InetSocketAddress> LJI = Collections.emptyList();
    public final List<C64562PVm> LJII = new ArrayList();

    public final C64592PWq LIZIZ() {
        boolean z;
        String str;
        int i;
        boolean contains;
        if (this.LJFF < this.LJ.size() || !((ArrayList) this.LJII).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            while (this.LJFF < this.LJ.size()) {
                if (this.LJFF < this.LJ.size()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    List<Proxy> list = this.LJ;
                    int i2 = this.LJFF;
                    this.LJFF = i2 + 1;
                    Proxy proxy = (Proxy) ListProtector.get(list, i2);
                    this.LJI = new ArrayList();
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        C64626PXy c64626PXy = this.LIZ.LIZ;
                        str = c64626PXy.LIZLLL;
                        i = c64626PXy.LJ;
                    } else {
                        SocketAddress address = proxy.address();
                        if (address instanceof InetSocketAddress) {
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                            InetAddress address2 = inetSocketAddress.getAddress();
                            if (address2 == null) {
                                str = inetSocketAddress.getHostName();
                            } else {
                                str = address2.getHostAddress();
                            }
                            i = inetSocketAddress.getPort();
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Proxy.address() is not an InetSocketAddress: ");
                            LIZ.append(address.getClass());
                            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                        }
                    }
                    if (i >= 1 && i <= 65535) {
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            this.LJI.add(InetSocketAddress.createUnresolved(str, i));
                        } else {
                            this.LIZLLL.dnsStart(this.LIZJ, str);
                            new ArrayList();
                            this.LIZ.getClass();
                            List<InetAddress> LIZ2 = this.LIZ.LIZIZ.LIZ(str);
                            this.LIZLLL.dnsEnd(this.LIZJ, str, LIZ2, null);
                            if (!LIZ2.isEmpty()) {
                                this.LIZLLL.dnsEnd(this.LIZJ, str, LIZ2);
                                int size = LIZ2.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    this.LJI.add(new InetSocketAddress((InetAddress) ListProtector.get(LIZ2, i3), i));
                                }
                            } else {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(this.LIZ.LIZIZ);
                                LIZ3.append(" returned no addresses for ");
                                LIZ3.append(str);
                                throw new UnknownHostException(X1D.LIZIZ(LIZ3));
                            }
                        }
                        int size2 = this.LJI.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            C64562PVm c64562PVm = new C64562PVm(this.LIZ, proxy, (InetSocketAddress) ListProtector.get(this.LJI, i4));
                            C48292IxM c48292IxM = this.LIZIZ;
                            synchronized (c48292IxM) {
                                contains = ((java.util.Set) c48292IxM.LIZ).contains(c64562PVm);
                            }
                            if (contains) {
                                ((ArrayList) this.LJII).add(c64562PVm);
                            } else {
                                arrayList.add(c64562PVm);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            break;
                        }
                    } else {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("No route to ");
                        LIZ4.append(str);
                        LIZ4.append(":");
                        LIZ4.append(i);
                        LIZ4.append("; port is out of range");
                        throw new SocketException(X1D.LIZIZ(LIZ4));
                    }
                } else {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("No route to ");
                    LIZ5.append(this.LIZ.LIZ.LIZLLL);
                    LIZ5.append("; exhausted proxy configurations: ");
                    LIZ5.append(this.LJ);
                    throw new SocketException(X1D.LIZIZ(LIZ5));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.LJII);
                ((ArrayList) this.LJII).clear();
            }
            return new C64592PWq(arrayList);
        }
        throw new NoSuchElementException();
    }

    public final void LIZ(C64562PVm c64562PVm, IOException iOException) {
        C64563PVn c64563PVn;
        ProxySelector proxySelector;
        if (c64562PVm.LIZIZ.type() != Proxy.Type.DIRECT && (proxySelector = (c64563PVn = this.LIZ).LJI) != null) {
            proxySelector.connectFailed(c64563PVn.LIZ.LJIJJ(), c64562PVm.LIZIZ.address(), iOException);
        }
        C48292IxM c48292IxM = this.LIZIZ;
        synchronized (c48292IxM) {
            ((java.util.Set) c48292IxM.LIZ).add(c64562PVm);
        }
    }

    public final void LIZJ(C64626PXy c64626PXy, Proxy proxy) {
        List<Proxy> LJIILJJIL;
        if (proxy != null) {
            this.LJ = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.LIZ.LJI.select(c64626PXy.LJIJJ());
            if (select != null && !select.isEmpty()) {
                LJIILJJIL = PVA.LJIILIIL(select);
            } else {
                LJIILJJIL = PVA.LJIILJJIL(Proxy.NO_PROXY);
            }
            this.LJ = LJIILJJIL;
        }
        this.LJFF = 0;
    }

    public C64585PWj(C64563PVn c64563PVn, C48292IxM c48292IxM, InterfaceC48133Iun interfaceC48133Iun, AbstractC64590PWo abstractC64590PWo) {
        this.LIZ = c64563PVn;
        this.LIZIZ = c48292IxM;
        this.LIZJ = interfaceC48133Iun;
        this.LIZLLL = abstractC64590PWo;
        LIZJ(c64563PVn.LIZ, c64563PVn.LJII);
    }
}
