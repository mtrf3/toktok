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
import java.util.concurrent.TimeUnit;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class PXH implements PXX, PXV {
    public static final List<EnumC64572PVw> LJIJJLI = Collections.singletonList(EnumC64572PVw.HTTP_1_1);
    public final Request LIZ;
    public final AbstractC38911fr LIZIZ;
    public final Random LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public C64587PWl LJFF;
    public final ARunnableS47S0100000_11 LJI;
    public PXK LJII;
    public PVX LJIIIIZZ;
    public PThreadScheduledThreadPoolExecutor LJIIIZ;
    public PXP LJIIJ;
    public long LJIILIIL;
    public boolean LJIILJJIL;
    public ScheduledFuture<?> LJIILL;
    public String LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public final ArrayDeque<C64537PUn> LJIIJJI = new ArrayDeque<>();
    public final ArrayDeque<Object> LJIIL = new ArrayDeque<>();
    public int LJIILLIIL = -1;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[Catch: all -> 0x00ea, TryCatch #2 {all -> 0x00ea, blocks: (B:22:0x0054, B:25:0x0058, B:27:0x005c, B:29:0x006e, B:30:0x0085, B:38:0x0094, B:39:0x0095, B:40:0x009c, B:41:0x009d, B:43:0x00a1, B:47:0x00b7, B:49:0x00c1, B:50:0x00c4, B:54:0x00cd, B:56:0x00d1, B:59:0x00db, B:60:0x00dd, B:61:0x00b1, B:63:0x00de, B:64:0x00e3, B:65:0x00e4, B:66:0x00e9, B:32:0x0086, B:33:0x0090, B:53:0x00ca), top: B:19:0x0050, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1 A[Catch: all -> 0x00ea, TRY_LEAVE, TryCatch #2 {all -> 0x00ea, blocks: (B:22:0x0054, B:25:0x0058, B:27:0x005c, B:29:0x006e, B:30:0x0085, B:38:0x0094, B:39:0x0095, B:40:0x009c, B:41:0x009d, B:43:0x00a1, B:47:0x00b7, B:49:0x00c1, B:50:0x00c4, B:54:0x00cd, B:56:0x00d1, B:59:0x00db, B:60:0x00dd, B:61:0x00b1, B:63:0x00de, B:64:0x00e3, B:65:0x00e4, B:66:0x00e9, B:32:0x0086, B:33:0x0090, B:53:0x00ca), top: B:19:0x0050, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PXH.LJIIIIZZ():boolean");
    }

    public final void LJFF() {
        while (this.LJIILLIIL == -1) {
            PXK pxk = this.LJII;
            pxk.LIZIZ();
            if (pxk.LJII) {
                pxk.LIZ();
            } else {
                int i = pxk.LJ;
                if (i == 1 || i == 2) {
                    while (!pxk.LIZLLL) {
                        long j = pxk.LJFF;
                        if (j > 0) {
                            pxk.LIZIZ.LLFZ(pxk.LJIIIZ, j);
                            if (!pxk.LIZ) {
                                pxk.LJIIIZ.LJIIJ(pxk.LJIIJJI);
                                pxk.LJIIJJI.LIZIZ(pxk.LJIIIZ.LJLILLLLZI - pxk.LJFF);
                                PUW.LIZIZ(pxk.LJIIJJI, pxk.LJIIJ);
                                pxk.LJIIJJI.close();
                            }
                        }
                        if (pxk.LJI) {
                            if (i == 1) {
                                PXV pxv = pxk.LIZJ;
                                PXH pxh = (PXH) pxv;
                                pxh.LIZIZ.LJJIJIIJI(pxh, pxk.LJIIIZ.LJIILL());
                            } else {
                                PXV pxv2 = pxk.LIZJ;
                                PXH pxh2 = (PXH) pxv2;
                                pxh2.LIZIZ.LJJIJIIJIL(pxh2, pxk.LJIIIZ.LJIIL());
                            }
                        } else {
                            while (!pxk.LIZLLL) {
                                pxk.LIZIZ();
                                if (!pxk.LJII) {
                                    break;
                                } else {
                                    pxk.LIZ();
                                }
                            }
                            if (pxk.LJ != 0) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Expected continuation opcode. Got: ");
                                LIZ.append(Integer.toHexString(pxk.LJ));
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

    @Override // X.PXX
    public final boolean LIZIZ(String str) {
        if (str != null) {
            C64537PUn encodeUtf8 = C64537PUn.encodeUtf8(str);
            synchronized (this) {
                if (!this.LJIJ && !this.LJIILJJIL) {
                    if (this.LJIILIIL + encodeUtf8.size() > 16777216) {
                        LIZ(1001, null);
                        return false;
                    }
                    this.LJIILIIL += encodeUtf8.size();
                    this.LJIIL.add(new PXT(encodeUtf8));
                    PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = this.LJIIIZ;
                    if (pThreadScheduledThreadPoolExecutor != null) {
                        pThreadScheduledThreadPoolExecutor.execute(this.LJI);
                    }
                    return true;
                }
                return false;
            }
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
                    LIZ4.append(this.LJ);
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
    }

    @Override // X.PXX
    public final boolean LIZ(int i, String str) {
        C64537PUn c64537PUn;
        synchronized (this) {
            String LIZ = PUW.LIZ(i);
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
                    this.LJIIL.add(new PXR(i, c64537PUn));
                    PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = this.LJIIIZ;
                    if (pThreadScheduledThreadPoolExecutor != null) {
                        pThreadScheduledThreadPoolExecutor.execute(this.LJI);
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
            PXP pxp = this.LJIIJ;
            this.LJIIJ = null;
            ScheduledFuture<?> scheduledFuture = this.LJIILL;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = this.LJIIIZ;
            if (pThreadScheduledThreadPoolExecutor != null) {
                pThreadScheduledThreadPoolExecutor.shutdown();
            }
            try {
                this.LIZIZ.LJJIJ(this, exc, c64598PWw);
            } finally {
                PVA.LJ(pxp);
            }
        }
    }

    public final void LJ(String str, C64594PWs c64594PWs) {
        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor;
        synchronized (this) {
            this.LJIIJ = c64594PWs;
            this.LJIIIIZZ = new PVX(c64594PWs.LJLIL, c64594PWs.LJLJI, this.LIZJ);
            PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor2 = new PThreadScheduledThreadPoolExecutor(1, new P8T(str, false));
            this.LJIIIZ = pThreadScheduledThreadPoolExecutor2;
            long j = this.LIZLLL;
            if (j != 0) {
                pThreadScheduledThreadPoolExecutor2.scheduleAtFixedRate(new PXL(this), j, j, TimeUnit.MILLISECONDS);
            }
            if (!this.LJIIL.isEmpty() && (pThreadScheduledThreadPoolExecutor = this.LJIIIZ) != null) {
                pThreadScheduledThreadPoolExecutor.execute(this.LJI);
            }
        }
        this.LJII = new PXK(c64594PWs.LJLIL, c64594PWs.LJLILLLLZI, this);
    }

    public final void LJI(int i, String str) {
        PXP pxp;
        if (i != -1) {
            synchronized (this) {
                if (this.LJIILLIIL == -1) {
                    this.LJIILLIIL = i;
                    this.LJIIZILJ = str;
                    pxp = null;
                    if (this.LJIILJJIL && this.LJIIL.isEmpty()) {
                        PXP pxp2 = this.LJIIJ;
                        this.LJIIJ = null;
                        ScheduledFuture<?> scheduledFuture = this.LJIILL;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.LJIIIZ.shutdown();
                        pxp = pxp2;
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                this.LIZIZ.LJJI(this, i, str);
                if (pxp != null) {
                    this.LIZIZ.LJJ(this, i, str);
                }
                return;
            } finally {
                PVA.LJ(pxp);
            }
        }
        throw new IllegalArgumentException();
    }

    public PXH(Request request, AbstractC38911fr abstractC38911fr, Random random, long j) {
        if ("GET".equals(request.method())) {
            this.LIZ = request;
            this.LIZIZ = abstractC38911fr;
            this.LIZJ = random;
            this.LIZLLL = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.LJ = C64537PUn.of(bArr).base64();
            this.LJI = new ARunnableS47S0100000_11(this, 145);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Request must be GET: ");
        LIZ.append(request.method());
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }
}
