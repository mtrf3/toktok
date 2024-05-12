package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Request;

/* renamed from: X.PVl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64561PVl extends AbstractC64566PVq implements InterfaceC64569PVt {
    public final C64582PWg LIZIZ;
    public final C64562PVm LIZJ;
    public Socket LIZLLL;
    public Socket LJ;
    public PNS LJFF;
    public EnumC64572PVw LJI;
    public PWE LJII;
    public C64532PUi LJIIIIZZ;
    public C64535PUl LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public int LJIIL = 1;
    public final List<Reference<C64583PWh>> LJIILIIL = new ArrayList();
    public long LJIILJJIL = Long.MAX_VALUE;

    public final String toString() {
        Object obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Connection{");
        LIZ.append(this.LIZJ.LIZ.LIZ.LIZLLL);
        LIZ.append(":");
        LIZ.append(this.LIZJ.LIZ.LIZ.LJ);
        LIZ.append(", proxy=");
        LIZ.append(this.LIZJ.LIZIZ);
        LIZ.append(" hostAddress=");
        LIZ.append(this.LIZJ.LIZJ);
        LIZ.append(" cipherSuite=");
        PNS pns = this.LJFF;
        if (pns != null) {
            obj = pns.LIZIZ;
        } else {
            obj = LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        LIZ.append(obj);
        LIZ.append(" protocol=");
        LIZ.append(this.LJI);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC64566PVq
    public final void LIZ(PWE pwe) {
        synchronized (this.LIZIZ) {
            this.LJIIL = pwe.LIZJ();
        }
    }

    @Override // X.AbstractC64566PVq
    public final void LIZIZ(PWF pwf) {
        pwf.LIZJ(PWT.REFUSED_STREAM);
    }

    public final boolean LJII(boolean z) {
        if (this.LJ.isClosed() || this.LJ.isInputShutdown() || this.LJ.isOutputShutdown()) {
            return false;
        }
        PWE pwe = this.LJII;
        if (pwe != null) {
            long nanoTime = System.nanoTime();
            synchronized (pwe) {
                if (pwe.LJLJL) {
                    return false;
                }
                if (pwe.LJLLL < pwe.LJLLJ) {
                    if (nanoTime >= pwe.LJLLLL) {
                        return false;
                    }
                }
                return true;
            }
        }
        if (z) {
            try {
                int soTimeout = this.LJ.getSoTimeout();
                try {
                    this.LJ.setSoTimeout(1);
                    if (this.LJIIIIZZ.LLJ()) {
                        return false;
                    }
                    return true;
                } finally {
                    this.LJ.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public final void LJIIIZ(int i) {
        this.LJ.setSoTimeout(0);
        C64564PVo c64564PVo = new C64564PVo();
        Socket socket = this.LJ;
        String str = this.LIZJ.LIZ.LIZ.LIZLLL;
        C64532PUi c64532PUi = this.LJIIIIZZ;
        C64535PUl c64535PUl = this.LJIIIZ;
        c64564PVo.LIZ = socket;
        c64564PVo.LIZIZ = str;
        c64564PVo.LIZJ = c64532PUi;
        c64564PVo.LIZLLL = c64535PUl;
        c64564PVo.LJ = this;
        c64564PVo.LJII = i;
        PWE pwe = new PWE(c64564PVo);
        this.LJII = pwe;
        C64570PVu c64570PVu = pwe.LL;
        synchronized (c64570PVu) {
            if (!c64570PVu.LJLJJL) {
                if (c64570PVu.LJLILLLLZI) {
                    Logger logger = C64570PVu.LJLJL;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(PVA.LJIIJJI(">> CONNECTION %s", PPI.LIZ.hex()));
                    }
                    c64570PVu.LJLIL.write(PPI.LIZ.toByteArray());
                    c64570PVu.LJLIL.flush();
                }
            } else {
                throw new IOException("closed");
            }
        }
        pwe.LL.LJIIJ(pwe.LJZ);
        if (pwe.LJZ.LIZ() != 65535) {
            pwe.LL.LJIIL(0, r1 - 65535);
        }
        new PthreadThread(pwe.LLD, "Http2Connection").start();
    }

    public final boolean LJIIJ(C64626PXy c64626PXy) {
        int i = c64626PXy.LJ;
        C64626PXy c64626PXy2 = this.LIZJ.LIZ.LIZ;
        if (i != c64626PXy2.LJ) {
            return false;
        }
        if (c64626PXy.LIZLLL.equals(c64626PXy2.LIZLLL)) {
            return true;
        }
        PNS pns = this.LJFF;
        if (pns == null || !PA2.LIZJ(c64626PXy.LIZLLL, (X509Certificate) ListProtector.get(pns.LIZJ, 0))) {
            return false;
        }
        return true;
    }

    public C64561PVl(C64582PWg c64582PWg, C64562PVm c64562PVm) {
        this.LIZIZ = c64582PWg;
        this.LIZJ = c64562PVm;
    }

    public final boolean LJI(C64563PVn c64563PVn, C64562PVm c64562PVm) {
        if (((ArrayList) this.LJIILIIL).size() < this.LJIIL && !this.LJIIJ) {
            C64586PWk c64586PWk = AbstractC64554PVe.LIZ;
            C64563PVn c64563PVn2 = this.LIZJ.LIZ;
            c64586PWk.getClass();
            if (!c64563PVn2.LIZ(c64563PVn)) {
                return false;
            }
            if (c64563PVn.LIZ.LIZLLL.equals(this.LIZJ.LIZ.LIZ.LIZLLL)) {
                return true;
            }
            if (this.LJII == null || c64562PVm == null || c64562PVm.LIZIZ.type() != Proxy.Type.DIRECT || this.LIZJ.LIZIZ.type() != Proxy.Type.DIRECT || !this.LIZJ.LIZJ.equals(c64562PVm.LIZJ) || c64562PVm.LIZ.LJIIIZ != PA2.LIZ || !LJIIJ(c64563PVn.LIZ)) {
                return false;
            }
            try {
                c64563PVn.LJIIJ.LIZ(c64563PVn.LIZ.LIZLLL, this.LJFF.LIZJ);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    public final PW9 LJIIIIZZ(C64600PWy c64600PWy, PW8 pw8, C64583PWh c64583PWh) {
        if (this.LJII != null) {
            return new PWD(c64600PWy, pw8, c64583PWh, this.LJII);
        }
        this.LJ.setSoTimeout(pw8.LJIIIZ);
        C64545PUv timeout = this.LJIIIIZZ.timeout();
        long j = pw8.LJIIIZ;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.LJI(j, timeUnit);
        this.LJIIIZ.timeout().LJI(pw8.LJIIJ, timeUnit);
        return new C64560PVk(c64600PWy, c64583PWh, this.LJIIIIZZ, this.LJIIIZ);
    }

    public final void LIZLLL(int i, int i2, InterfaceC48133Iun interfaceC48133Iun, AbstractC64590PWo abstractC64590PWo) {
        Socket createSocket;
        C64562PVm c64562PVm = this.LIZJ;
        Proxy proxy = c64562PVm.LIZIZ;
        C64563PVn c64563PVn = c64562PVm.LIZ;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            createSocket = c64563PVn.LIZJ.createSocket();
        } else {
            createSocket = new Socket(proxy);
        }
        this.LIZLLL = createSocket;
        abstractC64590PWo.connectStart(interfaceC48133Iun, this.LIZJ.LIZJ, proxy);
        this.LIZLLL.setSoTimeout(i2);
        try {
            P9A.LIZ.LJI(this.LIZLLL, this.LIZJ.LIZJ, i);
            try {
                this.LJIIIIZZ = PU7.LIZ(PU7.LJFF(this.LIZLLL));
                this.LJIIIZ = new C64535PUl(PU7.LIZJ(this.LIZLLL));
            } catch (NullPointerException e) {
                if (!"throw with null exception".equals(e.getMessage())) {
                } else {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed to connect to ");
            LIZ.append(this.LIZJ.LIZJ);
            ConnectException connectException = new ConnectException(X1D.LIZIZ(LIZ));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void LJFF(PVE pve, int i, InterfaceC48133Iun interfaceC48133Iun, AbstractC64590PWo abstractC64590PWo) {
        SSLSocket sSLSocket;
        EnumC64572PVw enumC64572PVw;
        C64563PVn c64563PVn = this.LIZJ.LIZ;
        if (c64563PVn.LJIIIIZZ == null) {
            List<EnumC64572PVw> list = c64563PVn.LJ;
            EnumC64572PVw enumC64572PVw2 = EnumC64572PVw.H2_PRIOR_KNOWLEDGE;
            if (list.contains(enumC64572PVw2)) {
                this.LJ = this.LIZLLL;
                this.LJI = enumC64572PVw2;
                LJIIIZ(i);
                return;
            } else {
                this.LJ = this.LIZLLL;
                this.LJI = EnumC64572PVw.HTTP_1_1;
                return;
            }
        }
        abstractC64590PWo.secureConnectStart(interfaceC48133Iun);
        C64563PVn c64563PVn2 = this.LIZJ.LIZ;
        SSLSocketFactory sSLSocketFactory = c64563PVn2.LJIIIIZZ;
        String str = null;
        try {
            try {
                Socket socket = this.LIZLLL;
                C64626PXy c64626PXy = c64563PVn2.LIZ;
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, c64626PXy.LIZLLL, c64626PXy.LJ, true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            sSLSocket = null;
        }
        try {
            PVF LIZ = pve.LIZ(sSLSocket);
            if (LIZ.LIZIZ) {
                P9A.LIZ.LJFF(sSLSocket, c64563PVn2.LIZ.LIZLLL, c64563PVn2.LJ);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            PNS LIZ2 = PNS.LIZ(session);
            if (!c64563PVn2.LJIIIZ.verify(c64563PVn2.LIZ.LIZLLL, session)) {
                List<Certificate> list2 = LIZ2.LIZJ;
                if (!list2.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) list2.get(0);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Hostname ");
                    LIZ3.append(c64563PVn2.LIZ.LIZLLL);
                    LIZ3.append(" not verified:\n    certificate: ");
                    LIZ3.append(C64549PUz.LIZIZ(x509Certificate));
                    LIZ3.append("\n    DN: ");
                    LIZ3.append(x509Certificate.getSubjectDN().getName());
                    LIZ3.append("\n    subjectAltNames: ");
                    LIZ3.append(PA2.LIZ(x509Certificate));
                    throw new SSLPeerUnverifiedException(X1D.LIZIZ(LIZ3));
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("Hostname ");
                LIZ4.append(c64563PVn2.LIZ.LIZLLL);
                LIZ4.append(" not verified (no certificates)");
                throw new SSLPeerUnverifiedException(X1D.LIZIZ(LIZ4));
            }
            c64563PVn2.LJIIJ.LIZ(c64563PVn2.LIZ.LIZLLL, LIZ2.LIZJ);
            if (LIZ.LIZIZ) {
                str = P9A.LIZ.LJIIIIZZ(sSLSocket);
            }
            this.LJ = sSLSocket;
            this.LJIIIIZZ = PU7.LIZ(PU7.LJFF(sSLSocket));
            this.LJIIIZ = new C64535PUl(PU7.LIZJ(this.LJ));
            this.LJFF = LIZ2;
            if (str == null) {
                enumC64572PVw = EnumC64572PVw.HTTP_1_1;
            } else {
                enumC64572PVw = EnumC64572PVw.get(str);
            }
            this.LJI = enumC64572PVw;
            P9A.LIZ.LIZ(sSLSocket);
            abstractC64590PWo.secureConnectEnd(interfaceC48133Iun, this.LJFF);
            if (this.LJI == EnumC64572PVw.HTTP_2) {
                LJIIIZ(i);
            }
        } catch (AssertionError e2) {
            e = e2;
            if (PVA.LJIILLIIL(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (Throwable th2) {
            th = th2;
            if (sSLSocket != null) {
                P9A.LIZ.LIZ(sSLSocket);
            }
            PVA.LJFF(sSLSocket);
            throw th;
        }
    }

    public final void LJ(int i, int i2, int i3, InterfaceC48133Iun interfaceC48133Iun, AbstractC64590PWo abstractC64590PWo) {
        C64618PXq c64618PXq = new C64618PXq();
        c64618PXq.LJIIIIZZ(this.LIZJ.LIZ.LIZ);
        c64618PXq.LJ("CONNECT", null);
        c64618PXq.LIZJ.LJ("Host", PVA.LJIIL(this.LIZJ.LIZ.LIZ, true));
        c64618PXq.LIZJ.LJ("Proxy-Connection", "Keep-Alive");
        c64618PXq.LIZJ.LJ("User-Agent", "okhttp/3.12.13.4-tiktok");
        Request LIZIZ = c64618PXq.LIZIZ();
        C64597PWv c64597PWv = new C64597PWv();
        c64597PWv.LIZ = LIZIZ;
        c64597PWv.LIZIZ = EnumC64572PVw.HTTP_1_1;
        c64597PWv.LIZJ = 407;
        c64597PWv.LIZLLL = "Preemptive Authenticate";
        c64597PWv.LJI = PVA.LIZJ;
        c64597PWv.LJIIJ = -1L;
        c64597PWv.LJIIJJI = -1L;
        c64597PWv.LJFF.LJ("Proxy-Authenticate", "OkHttp-Preemptive");
        this.LIZJ.LIZ.LIZLLL.LIZ(c64597PWv.LIZ());
        C64626PXy url = LIZIZ.url();
        LIZLLL(i, i2, interfaceC48133Iun, abstractC64590PWo);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CONNECT ");
        LIZ.append(PVA.LJIIL(url, true));
        LIZ.append(" HTTP/1.1");
        String LIZIZ2 = X1D.LIZIZ(LIZ);
        C64532PUi c64532PUi = this.LJIIIIZZ;
        C64560PVk c64560PVk = new C64560PVk(null, null, c64532PUi, this.LJIIIZ);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c64532PUi.timeout().LJI(i2, timeUnit);
        this.LJIIIZ.timeout().LJI(i3, timeUnit);
        c64560PVk.LJIIIZ(LIZIZ.headers(), LIZIZ2);
        c64560PVk.LJ();
        C64597PWv LJFF = c64560PVk.LJFF(false);
        LJFF.LIZ = LIZIZ;
        C64598PWw LIZ2 = LJFF.LIZ();
        long LIZ3 = C64573PVx.LIZ(LIZ2);
        if (LIZ3 == -1) {
            LIZ3 = 0;
        }
        C64557PVh LJII = c64560PVk.LJII(LIZ3);
        PVA.LJIJI(LJII, Integer.MAX_VALUE, timeUnit);
        LJII.close();
        int i4 = LIZ2.LJLJI;
        if (i4 != 200) {
            if (i4 == 407) {
                this.LIZJ.LIZ.LIZLLL.LIZ(LIZ2);
                throw new IOException("Failed to authenticate with proxy");
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Unexpected response code for CONNECT: ");
            LIZ4.append(LIZ2.LJLJI);
            throw new IOException(X1D.LIZIZ(LIZ4));
        }
        if (this.LJIIIIZZ.LJLILLLLZI.LLJ() && this.LJIIIZ.LJLIL.LLJ()) {
        } else {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        r1 = r17.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r1.LIZ.LJIIIIZZ == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r1.LIZIZ.type() != java.net.Proxy.Type.HTTP) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r17.LIZLLL == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0111, code lost:
    
        throw new X.PVD(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r17.LJII == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        r1 = r17.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f7, code lost:
    
        r17.LJIIL = r17.LJII.LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ff, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0104, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r18, int r19, int r20, int r21, boolean r22, X.InterfaceC48133Iun r23, X.AbstractC64590PWo r24) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64561PVl.LIZJ(int, int, int, int, boolean, X.Iun, X.PWo):void");
    }
}
