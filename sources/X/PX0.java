package X;

import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class PX0 extends AbstractC64590PWo {
    public final C64608PXg LIZ;
    public final AbstractC64590PWo LIZIZ;

    @Override // X.AbstractC64590PWo
    public final void callEnd(InterfaceC48133Iun interfaceC48133Iun) {
        super.callEnd(interfaceC48133Iun);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.callEnd(interfaceC48133Iun);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.LJIILJJIL.set(System.currentTimeMillis());
        c64608PXg.LJJIJIL = PX3.IDLE;
        c64608PXg.LJJIL = PX4.SUCCESS;
    }

    @Override // X.AbstractC64590PWo
    public final void callStart(InterfaceC48133Iun interfaceC48133Iun) {
        super.callStart(interfaceC48133Iun);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.callStart(interfaceC48133Iun);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        c64608PXg.LIZ = System.currentTimeMillis();
        c64608PXg.LJJIL = PX4.IO_PENDING;
    }

    @Override // X.AbstractC64590PWo
    public final void requestBodyStart(InterfaceC48133Iun interfaceC48133Iun) {
        super.requestBodyStart(interfaceC48133Iun);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.requestBodyStart(interfaceC48133Iun);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        c64608PXg.LJIIIIZZ = System.currentTimeMillis();
    }

    @Override // X.AbstractC64590PWo
    public final void requestHeadersStart(InterfaceC48133Iun interfaceC48133Iun) {
        super.requestHeadersStart(interfaceC48133Iun);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.requestHeadersStart(interfaceC48133Iun);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        c64608PXg.LJJIJIL = PX3.SENDING_REQUEST;
        c64608PXg.LJI = System.currentTimeMillis();
    }

    @Override // X.AbstractC64590PWo
    public final void responseBodyStart(InterfaceC48133Iun interfaceC48133Iun) {
        super.responseBodyStart(interfaceC48133Iun);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.responseBodyStart(interfaceC48133Iun);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        c64608PXg.LJJIJIL = PX3.READING_RESPONSE;
        c64608PXg.LJIIL = System.currentTimeMillis();
    }

    @Override // X.AbstractC64590PWo
    public final void responseHeadersStart(InterfaceC48133Iun interfaceC48133Iun) {
        super.responseHeadersStart(interfaceC48133Iun);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.responseHeadersStart(interfaceC48133Iun);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        c64608PXg.LJIIJ = System.currentTimeMillis();
    }

    @Override // X.AbstractC64590PWo
    public final void secureConnectStart(InterfaceC48133Iun interfaceC48133Iun) {
        super.secureConnectStart(interfaceC48133Iun);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.secureConnectStart(interfaceC48133Iun);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        c64608PXg.LJ = System.currentTimeMillis();
        c64608PXg.LJJIJIL = PX3.SSL_HANDSHAKE;
    }

    public PX0(AbstractC64590PWo abstractC64590PWo, C64608PXg c64608PXg) {
        C16880lQ.LJLLJ(PX0.class);
        this.LIZIZ = abstractC64590PWo;
        this.LIZ = c64608PXg;
    }

    @Override // X.AbstractC64590PWo
    public final void callFailed(InterfaceC48133Iun interfaceC48133Iun, IOException iOException) {
        super.callFailed(interfaceC48133Iun, iOException);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.callFailed(interfaceC48133Iun, iOException);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.LJIILJJIL.set(System.currentTimeMillis());
        c64608PXg.LJJIJIL = PX3.IDLE;
        if (iOException != null && !TextUtils.isEmpty(iOException.getMessage()) && iOException.getMessage().contains("Canceled")) {
            c64608PXg.LJJIL = PX4.CANCELED;
        } else {
            c64608PXg.LJJIL = PX4.FAILED;
        }
        c64608PXg.LJJIJLIJ = C64608PXg.LJ(iOException);
    }

    @Override // X.AbstractC64590PWo
    public final void connectionAcquired(InterfaceC48133Iun interfaceC48133Iun, InterfaceC64569PVt interfaceC64569PVt) {
        super.connectionAcquired(interfaceC48133Iun, interfaceC64569PVt);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.connectionAcquired(interfaceC48133Iun, interfaceC64569PVt);
        }
        C64608PXg c64608PXg = this.LIZ;
        if (interfaceC64569PVt != null) {
            if (c64608PXg.LJIILJJIL.get() == -1) {
                C64561PVl c64561PVl = (C64561PVl) interfaceC64569PVt;
                Socket socket = c64561PVl.LJ;
                if (socket != null && socket.getInetAddress() != null && c64561PVl.LJ.getInetAddress().getHostAddress() != null) {
                    c64608PXg.LJJIIJZLJL = c64561PVl.LJ.getInetAddress().getHostAddress();
                }
                c64608PXg.LJJIIZ = c64561PVl.LJ;
            }
        } else {
            c64608PXg.getClass();
        }
        c64608PXg.LJIILL = System.currentTimeMillis();
    }

    @Override // X.AbstractC64590PWo
    public final void connectionReleased(InterfaceC48133Iun interfaceC48133Iun, InterfaceC64569PVt interfaceC64569PVt) {
        super.connectionReleased(interfaceC48133Iun, interfaceC64569PVt);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.connectionReleased(interfaceC48133Iun, interfaceC64569PVt);
        }
    }

    @Override // X.AbstractC64590PWo
    public final void dnsStart(InterfaceC48133Iun interfaceC48133Iun, String str) {
        super.dnsStart(interfaceC48133Iun, str);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.dnsStart(interfaceC48133Iun, str);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        c64608PXg.LIZIZ = System.currentTimeMillis();
        c64608PXg.LJJIJIL = PX3.RESOLVING_HOST;
    }

    @Override // X.AbstractC64590PWo
    public final void requestBodyEnd(InterfaceC48133Iun interfaceC48133Iun, long j) {
        super.requestBodyEnd(interfaceC48133Iun, j);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.requestBodyEnd(interfaceC48133Iun, j);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        c64608PXg.LJIIIZ = System.currentTimeMillis();
        c64608PXg.LJIL = j;
    }

    @Override // X.AbstractC64590PWo
    public final void requestHeadersEnd(InterfaceC48133Iun interfaceC48133Iun, Request request) {
        super.requestHeadersEnd(interfaceC48133Iun, request);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.requestHeadersEnd(interfaceC48133Iun, request);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        c64608PXg.LJII = System.currentTimeMillis();
        if (request != null && c64608PXg.LJIILJJIL.get() == -1) {
            c64608PXg.LJJ = request.headers();
        }
        c64608PXg.LJJIJIL = PX3.WAITING_FOR_RESPONSE;
    }

    @Override // X.AbstractC64590PWo
    public final void responseBodyEnd(InterfaceC48133Iun interfaceC48133Iun, long j) {
        super.responseBodyEnd(interfaceC48133Iun, j);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.responseBodyEnd(interfaceC48133Iun, j);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        c64608PXg.LJIILIIL = System.currentTimeMillis();
        c64608PXg.LJJIFFI = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    @Override // X.AbstractC64590PWo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void responseHeadersEnd(X.InterfaceC48133Iun r8, X.C64598PWw r9) {
        /*
            r7 = this;
            super.responseHeadersEnd(r8, r9)
            X.PWo r0 = r7.LIZIZ
            if (r0 == 0) goto La
            r0.responseHeadersEnd(r8, r9)
        La:
            X.PXg r2 = r7.LIZ
            r2.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJIIJJI = r0
            long r3 = r2.LJFF
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L98
            X.DyQ r0 = X.EnumC35618DyQ.HANDSHAKE_FULL
            r2.LJIJI = r0
        L21:
            if (r9 == 0) goto L2d
            java.util.concurrent.atomic.AtomicLong r0 = r2.LJIILJJIL
            long r3 = r0.get()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L2e
        L2d:
            return
        L2e:
            int r3 = r9.LJLJI
            r2.LJJI = r3
            X.PVw r0 = r9.LJLILLLLZI
            r2.LJJII = r0
            X.PNS r1 = r9.LJLJJL
            if (r1 == 0) goto L42
            X.P9w r0 = r1.LIZ
            r2.LJIJJ = r0
            X.PVG r0 = r1.LIZIZ
            r2.LJIJJLI = r0
        L42:
            r0 = 307(0x133, float:4.3E-43)
            if (r3 == r0) goto L96
            r0 = 308(0x134, float:4.32E-43)
            if (r3 == r0) goto L96
            switch(r3) {
                case 300: goto L96;
                case 301: goto L96;
                case 302: goto L96;
                case 303: goto L96;
                default: goto L4d;
            }
        L4d:
            r0 = 0
        L4e:
            r4 = 0
            if (r0 == 0) goto L7d
            int r0 = r2.LJJIJIIJI
            int r0 = r0 + 1
            r2.LJJIJIIJI = r0
            X.PXA r3 = new X.PXA
            r3.<init>()
            int r0 = r9.LJLJI
            r3.LIZ = r0
            okhttp3.Request r0 = r9.LJLIL
            java.lang.String r0 = r0.method()
            r3.LIZIZ = r0
            java.lang.String r0 = "location"
            java.lang.String r1 = r9.LIZ(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L76
            r3.LIZJ = r1
        L76:
            java.util.List<X.PXA> r0 = r2.LJJIJIIJIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r3)
        L7d:
            boolean r0 = r9.LIZIZ()
            if (r0 == 0) goto L91
            java.lang.String r0 = "content-type"
            java.lang.String r1 = r9.LIZ(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L91
            r2.LJJIJ = r1
        L91:
            X.PXe r0 = r9.LJLJJLL
            r2.LJJIIZI = r0
            goto L2d
        L96:
            r0 = 1
            goto L4e
        L98:
            X.DyQ r0 = X.EnumC35618DyQ.HANDSHAKE_RESUME
            r2.LJIJI = r0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PX0.responseHeadersEnd(X.Iun, X.PWw):void");
    }

    @Override // X.AbstractC64590PWo
    public final void secureConnectEnd(InterfaceC48133Iun interfaceC48133Iun, PNS pns) {
        super.secureConnectEnd(interfaceC48133Iun, pns);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.secureConnectEnd(interfaceC48133Iun, pns);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        c64608PXg.LJFF = System.currentTimeMillis();
    }

    @Override // X.AbstractC64590PWo
    public final void connectStart(InterfaceC48133Iun interfaceC48133Iun, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(interfaceC48133Iun, inetSocketAddress, proxy);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.connectStart(interfaceC48133Iun, inetSocketAddress, proxy);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        c64608PXg.LIZLLL = System.currentTimeMillis();
        c64608PXg.LJJIJIL = PX3.CONNECTING;
    }

    @Override // X.AbstractC64590PWo
    public final void dnsEnd(InterfaceC48133Iun interfaceC48133Iun, String str, List<InetAddress> list) {
        super.dnsEnd(interfaceC48133Iun, str, list);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.dnsEnd(interfaceC48133Iun, str, list);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        c64608PXg.LIZJ = System.currentTimeMillis();
    }

    @Override // X.AbstractC64590PWo
    public final void connectEnd(InterfaceC48133Iun interfaceC48133Iun, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC64572PVw enumC64572PVw) {
        super.connectEnd(interfaceC48133Iun, inetSocketAddress, proxy, enumC64572PVw);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.connectEnd(interfaceC48133Iun, inetSocketAddress, proxy, enumC64572PVw);
        }
        C64608PXg c64608PXg = this.LIZ;
        c64608PXg.getClass();
        System.currentTimeMillis();
        if (proxy != null) {
            c64608PXg.LJIJ = proxy.type();
        }
    }

    @Override // X.AbstractC64590PWo
    public final void connectFailed(InterfaceC48133Iun interfaceC48133Iun, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC64572PVw enumC64572PVw, IOException iOException) {
        super.connectFailed(interfaceC48133Iun, inetSocketAddress, proxy, enumC64572PVw, iOException);
        AbstractC64590PWo abstractC64590PWo = this.LIZIZ;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.connectFailed(interfaceC48133Iun, inetSocketAddress, proxy, enumC64572PVw, iOException);
        }
        C64608PXg c64608PXg = this.LIZ;
        if (inetSocketAddress != null) {
            if (c64608PXg.LJIILJJIL.get() == -1) {
                ((ArrayList) c64608PXg.LJIIZILJ).add(new Pair(inetSocketAddress, Integer.valueOf(C64608PXg.LJ(iOException))));
                return;
            }
            return;
        }
        c64608PXg.getClass();
    }
}
