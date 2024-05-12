package X;

import Y.ARunnableS47S0100000_11;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import defpackage.a1;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class PXI implements PXW, PXU {
    public static final List<EnumC64572PVw> LJIJJLI = Collections.singletonList(EnumC64572PVw.HTTP_1_1);
    public QXX LIZ;
    public final Request LIZIZ;
    public final Random LIZJ;
    public final String LIZLLL;
    public final ARunnableS47S0100000_11 LJ;
    public final long LJII;
    public C64587PWl LJIIIIZZ;
    public PXJ LJIIIZ;
    public PVW LJIIJ;
    public PThreadScheduledThreadPoolExecutor LJIIJJI;
    public PXP LJIIL;
    public long LJIILIIL;
    public boolean LJIILJJIL;
    public ScheduledFuture<?> LJIILL;
    public String LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public final ArrayDeque<C64537PUn> LJFF = new ArrayDeque<>();
    public final ArrayDeque<Object> LJI = new ArrayDeque<>();
    public int LJIILLIIL = -1;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[Catch: all -> 0x00ed, TryCatch #3 {all -> 0x00ed, blocks: (B:22:0x0054, B:25:0x0059, B:27:0x005d, B:29:0x006f, B:30:0x0086, B:38:0x0095, B:39:0x0096, B:40:0x009d, B:41:0x009e, B:43:0x00a2, B:47:0x00b8, B:49:0x00c2, B:50:0x00c5, B:54:0x00ce, B:56:0x00d2, B:58:0x00d6, B:61:0x00de, B:62:0x00e0, B:63:0x00b2, B:65:0x00e1, B:66:0x00e6, B:67:0x00e7, B:68:0x00ec, B:32:0x0087, B:33:0x0091, B:53:0x00cb), top: B:19:0x0050, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJ() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PXI.LJIIJ():boolean");
    }

    public final void LJFF() {
        while (this.LJIILLIIL == -1) {
            PXJ pxj = this.LJIIIZ;
            pxj.LIZIZ();
            long j = pxj.LJI;
            if (j > pxj.LIZ) {
                try {
                    pxj.LIZJ.skip(j);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            } else if (pxj.LJIIIIZZ) {
                pxj.LIZ();
            } else {
                int i = pxj.LJFF;
                if (i == 1 || i == 2) {
                    while (!pxj.LJ) {
                        long j2 = pxj.LJI;
                        if (j2 > 0) {
                            pxj.LIZJ.LLFZ(pxj.LJIIJ, j2);
                            if (!pxj.LIZIZ) {
                                pxj.LJIIJ.LJIIJ(pxj.LJIIL);
                                pxj.LJIIL.LIZIZ(pxj.LJIIJ.LJLILLLLZI - pxj.LJI);
                                PUV.LIZIZ(pxj.LJIIL, pxj.LJIIJJI);
                                pxj.LJIIL.close();
                            }
                        }
                        if (pxj.LJII) {
                            if (i == 1) {
                                PXU pxu = pxj.LIZLLL;
                                String LJIILL = pxj.LJIIJ.LJIILL();
                                QXX qxx = ((PXI) pxu).LIZ;
                                if (qxx != null) {
                                    qxx.LLLFZ(LJIILL);
                                }
                            } else {
                                PXU pxu2 = pxj.LIZLLL;
                                C64537PUn LJIIL = pxj.LJIIJ.LJIIL();
                                QXX qxx2 = ((PXI) pxu2).LIZ;
                                if (qxx2 != null) {
                                    qxx2.LLLI(LJIIL);
                                }
                            }
                        } else {
                            while (true) {
                                if (pxj.LJ) {
                                    break;
                                }
                                pxj.LIZIZ();
                                long j3 = pxj.LJI;
                                if (j3 <= pxj.LIZ) {
                                    if (!pxj.LJIIIIZZ) {
                                        break;
                                    } else {
                                        pxj.LIZ();
                                    }
                                } else {
                                    try {
                                        pxj.LIZJ.skip(j3);
                                        break;
                                    } catch (Exception e2) {
                                        C16880lQ.LLLLIIL(e2);
                                    }
                                }
                            }
                            if (pxj.LJFF != 0) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Expected continuation opcode. Got: ");
                                LIZ.append(Integer.toHexString(pxj.LJFF));
                                throw new ProtocolException(X1D.LIZIZ(LIZ));
                            }
                        }
                    }
                    throw new IOException("closed");
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Unknown opcode: ");
                LIZ2.append(Integer.toHexString(i));
                throw new ProtocolException(X1D.LIZIZ(LIZ2));
            }
        }
    }

    public final Request LJIIIIZZ() {
        return this.LIZIZ;
    }

    @Override // X.PXX
    public final boolean LIZIZ(String str) {
        if (str != null) {
            return LJIIIZ(C64537PUn.encodeUtf8(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    public final void LIZJ(C64598PWw c64598PWw) {
        if (c64598PWw.LJLJI == 101) {
            String LIZ = c64598PWw.LIZ("Connection", null);
            if ("Upgrade".equalsIgnoreCase(LIZ)) {
                String LIZ2 = c64598PWw.LIZ("Upgrade", null);
                if ("websocket".equalsIgnoreCase(LIZ2)) {
                    String LIZ3 = c64598PWw.LIZ("Sec-WebSocket-Accept", null);
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(this.LIZLLL);
                    LIZ4.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                    String base64 = C64537PUn.encodeUtf8(X1D.LIZIZ(LIZ4)).sha1().base64();
                    if (base64.equals(LIZ3)) {
                        return;
                    } else {
                        throw new ProtocolException(UPJ.LIZIZ("Expected 'Sec-WebSocket-Accept' header value '", base64, "' but was '", LIZ3, "'"));
                    }
                }
                throw new ProtocolException(a1.LJ("Expected 'Upgrade' header value 'websocket' but was '", LIZ2, "'"));
            }
            throw new ProtocolException(a1.LJ("Expected 'Connection' header value 'Upgrade' but was '", LIZ, "'"));
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("Expected HTTP 101 response but was '");
        LIZ5.append(c64598PWw.LJLJI);
        LIZ5.append(" ");
        throw new ProtocolException(JBR.LJFF(LIZ5, c64598PWw.LJLJJI, "'", LIZ5));
    }

    public final synchronized void LJII(C64537PUn c64537PUn) {
        this.LJIJJ = false;
        QXX qxx = this.LIZ;
        if (qxx != null) {
            qxx.LLLIIL(this);
        }
    }

    @Override // X.PXX
    public final boolean LIZ(int i, String str) {
        C64537PUn c64537PUn;
        synchronized (this) {
            String LIZ = PUV.LIZ(i);
            if (LIZ == null) {
                if (str == null) {
                    c64537PUn = null;
                } else {
                    c64537PUn = C64537PUn.encodeUtf8(str);
                    if (c64537PUn.size() > 123) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("reason.size() > 123: ");
                        LIZ2.append(str);
                        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                    }
                }
                if (!this.LJIJ && !this.LJIILJJIL) {
                    this.LJIILJJIL = true;
                    this.LJI.add(new PXQ(i, c64537PUn));
                    PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = this.LJIIJJI;
                    if (pThreadScheduledThreadPoolExecutor != null) {
                        pThreadScheduledThreadPoolExecutor.execute(this.LJ);
                    }
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(LIZ);
        }
    }

    public final void LIZLLL(Exception exc, C64598PWw c64598PWw) {
        synchronized (this) {
            if (this.LJIJ) {
                return;
            }
            this.LJIJ = true;
            PXP pxp = this.LJIIL;
            this.LJIIL = null;
            ScheduledFuture<?> scheduledFuture = this.LJIILL;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = this.LJIIJJI;
            if (pThreadScheduledThreadPoolExecutor != null) {
                pThreadScheduledThreadPoolExecutor.shutdown();
            }
            try {
                QXX qxx = this.LIZ;
                if (qxx != null) {
                    qxx.LLJZIJLIL(this, exc, c64598PWw);
                }
            } finally {
                PVA.LJ(pxp);
            }
        }
    }

    public final void LJ(String str, C64594PWs c64594PWs) {
        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor;
        synchronized (this) {
            this.LJIIL = c64594PWs;
            this.LJIIJ = new PVW(c64594PWs.LJLIL, c64594PWs.LJLJI, this.LIZJ);
            this.LJIIJJI = new PThreadScheduledThreadPoolExecutor(1, new P8T(str, false));
            if (!this.LJI.isEmpty() && (pThreadScheduledThreadPoolExecutor = this.LJIIJJI) != null) {
                pThreadScheduledThreadPoolExecutor.execute(this.LJ);
            }
        }
        this.LJIIIZ = new PXJ(c64594PWs.LJLIL, c64594PWs.LJLILLLLZI, this, this.LJII);
    }

    public final void LJI(int i, String str) {
        PXP pxp;
        if (i != -1) {
            synchronized (this) {
                if (this.LJIILLIIL == -1) {
                    this.LJIILLIIL = i;
                    this.LJIIZILJ = str;
                    pxp = null;
                    if (this.LJIILJJIL && this.LJI.isEmpty()) {
                        PXP pxp2 = this.LJIIL;
                        this.LJIIL = null;
                        ScheduledFuture<?> scheduledFuture = this.LJIILL;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.LJIIJJI.shutdown();
                        pxp = pxp2;
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                QXX qxx = this.LIZ;
                if (qxx != null) {
                    qxx.LLJLLIL();
                    if (pxp != null) {
                        this.LIZ.LLJLL(this, i, str);
                    }
                }
                return;
            } finally {
                PVA.LJ(pxp);
            }
        }
        throw new IllegalArgumentException();
    }

    public final synchronized boolean LJIIIZ(C64537PUn c64537PUn, int i) {
        if (!this.LJIJ && !this.LJIILJJIL) {
            if (this.LJIILIIL + c64537PUn.size() > 16777216) {
                LIZ(1001, null);
                return false;
            }
            this.LJIILIIL += c64537PUn.size();
            this.LJI.add(new PXS(c64537PUn, i));
            PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = this.LJIIJJI;
            if (pThreadScheduledThreadPoolExecutor != null) {
                pThreadScheduledThreadPoolExecutor.execute(this.LJ);
            }
            return true;
        }
        return false;
    }

    public PXI(Request request, long j, C64863Pcx c64863Pcx, Random random) {
        if ("GET".equals(request.method())) {
            this.LIZIZ = request;
            this.LIZ = c64863Pcx;
            this.LIZJ = random;
            this.LJII = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.LIZLLL = C64537PUn.of(bArr).base64();
            this.LJ = new ARunnableS47S0100000_11(this, 167);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Request must be GET: ");
        LIZ.append(request.method());
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }
}
