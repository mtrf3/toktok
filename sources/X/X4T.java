package X;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.segment.SegmentApplyException;
import com.ss.android.socialbase.downloader.segment.StreamClosedException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: classes16.dex */
public final class X4T implements Runnable {
    public final X4U LJLIL;
    public final C84252X4u LJLILLLLZI;
    public final DownloadInfo LJLJI;
    public final X4H LJLJJI;
    public X5F LJLJJL;
    public C84244X4m LJLJJLL;
    public volatile C84234X4c LJLJLJ;
    public C84233X4b LJLJLLL;
    public long LJLL;
    public volatile long LJLLI;
    public volatile long LJLLILLLL;
    public volatile long LJLLL;
    public Future LJLLLL;
    public volatile boolean LJLLLLLL;
    public volatile boolean LJLZ;
    public volatile boolean LJZ;
    public Thread LJZI;
    public final int LJZL;
    public volatile boolean LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public final X4Y LLFFF;
    public final X53 LLFII;
    public long LLFZ;
    public int LLI;
    public boolean LLIFFJFJJ;
    public BaseException LLII;
    public boolean LLIIII;
    public X5D LLIIIILZ;
    public volatile long LLIIIJ;
    public volatile long LLIIIL;
    public volatile long LLIIIZ;
    public volatile long LLIIJI;
    public String LLIIJLIL;
    public String LLIIL;
    public String LLIILII;
    public final List<C84234X4c> LJLJL = new ArrayList();
    public volatile long LJLLJ = -1;

    public final void LIZIZ() {
        X5F x5f = this.LJLJJL;
        if (x5f != null) {
            try {
                if (C65210PiY.LIZ()) {
                    int id = this.LJLJI.getId();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Thread: ");
                    LIZ.append(this.LJZL);
                    C65210PiY.LIZLLL(id, "SegmentReader", "closeConnection", X1D.LIZIZ(LIZ));
                }
                x5f.end();
                x5f.cancel();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x004a, code lost:
    
        if (X.C65210PiY.LIZ() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004c, code lost:
    
        r4 = r8.LJLJI.getId();
        r1 = X.X1D.LIZ();
        r1.append("No more segment, thread_index: ");
        r1.append(r8.LJZL);
        X.C65210PiY.LIZLLL(r4, "SegmentReader", "run", X.X1D.LIZIZ(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4T.LIZJ():void");
    }

    public final long LJFF() {
        long LJI;
        synchronized (this.LJLIL) {
            LJI = this.LJLLL + LJI();
        }
        return LJI;
    }

    public final long LJI() {
        synchronized (this.LJLIL) {
            long j = this.LJLLJ;
            long j2 = this.LJLL;
            if (j2 < 0 || j <= j2) {
                return 0L;
            }
            return j - j2;
        }
    }

    public final void LJIIJJI() {
        this.LLFZ = this.LLIIIJ;
        this.LLIIIJ = -1L;
        this.LLIIIL = -1L;
        this.LLIIIZ = -1L;
        this.LLIIJI = -1L;
        LIZIZ();
    }

    public final void LJIIL() {
        int backUpUrlRetryCount;
        if (this.LJLJLLL.LIZLLL) {
            backUpUrlRetryCount = this.LJLJI.getRetryCount();
        } else {
            backUpUrlRetryCount = this.LJLJI.getBackUpUrlRetryCount();
        }
        this.LLF = backUpUrlRetryCount;
        this.LLFF = 0;
        this.LLFFF.LIZLLL();
    }

    public final void LJIILIIL() {
        C84233X4b c84233X4b = this.LJLJLLL;
        try {
            synchronized (this.LJLIL) {
                long LJI = LJI();
                if (LJI > 0) {
                    this.LJLLL += LJI;
                    c84233X4b.LJIIIZ.addAndGet(LJI);
                }
                this.LJLLJ = -1L;
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZ() {
        if (C65210PiY.LIZ()) {
            int id = this.LJLJI.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ThreadIndex: ");
            C0FS.LIZJ(LIZ, this.LJZL, LIZ, id, "SegmentReader", "close");
        }
        synchronized (this) {
            this.LJLLLLLL = true;
            this.LL = true;
        }
        LIZIZ();
        Future future = this.LJLLLL;
        if (future != null) {
            this.LJLLLL = null;
            try {
                future.cancel(true);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0230: IPUT (r0v3 ?? I:long), (r6 I:X.X4T) (LINE:16777776) X.X4T.LLIIIL long, block:B:75:0x022c */
    public final void LIZLLL(C84234X4c c84234X4c) {
        X4T x4t;
        boolean z;
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.LLIIIL = 0L;
                this.LLIIIJ = currentTimeMillis;
                this.LJLL = c84234X4c.LIZIZ();
                this.LJLLILLLL = c84234X4c.LIZLLL;
                if (this.LJLLILLLL <= 0 || this.LJLL <= this.LJLLILLLL) {
                    this.LLIIIILZ = new X5D();
                    List<HttpHeader> extraHeaders = this.LJLJI.getExtraHeaders();
                    List<HttpHeader> LIZ = X4P.LIZ(this.LJLL, this.LJLLILLLL, this.LJLJI.geteTag(), extraHeaders);
                    ArrayList arrayList = (ArrayList) LIZ;
                    arrayList.add(new HttpHeader("Segment-Index", String.valueOf(c84234X4c.LJ)));
                    arrayList.add(new HttpHeader("Thread-Index", String.valueOf(this.LJZL)));
                    arrayList.add(new HttpHeader("extra_download_id", String.valueOf(this.LJLJI.getId())));
                    X4P.LIZJ(this.LJLJI, LIZ);
                    long ttnetProtectTimeout = this.LJLJI.getTtnetProtectTimeout();
                    if (ttnetProtectTimeout > 300) {
                        ((ArrayList) LIZ).add(new HttpHeader("extra_ttnet_protect_timeout", String.valueOf(ttnetProtectTimeout)));
                    }
                    Iterator it = ((ArrayList) this.LLFII.LJIIJJI).iterator();
                    while (it.hasNext()) {
                        ((X52) it.next()).LIZ(LIZ);
                    }
                    String str = this.LJLJLLL.LIZ;
                    if (this.LLIFFJFJJ && !TextUtils.isEmpty(str) && str.startsWith("https")) {
                        str = str.replaceFirst("https", "http");
                    }
                    String str2 = this.LJLJLLL.LIZIZ;
                    if (C65210PiY.LIZ()) {
                        int id = this.LJLJI.getId();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Url = ");
                        LIZ2.append(str);
                        LIZ2.append(", ip = ");
                        LIZ2.append(str2);
                        LIZ2.append(", segment = ");
                        LIZ2.append(c84234X4c);
                        LIZ2.append(", threadIndex = ");
                        LIZ2.append(this.LJZL);
                        C65210PiY.LIZLLL(id, "SegmentReader", "createConnection", X1D.LIZIZ(LIZ2));
                    }
                    this.LLIIJLIL = str;
                    this.LLIIL = str2;
                    boolean isNeedDefaultHttpServiceBackUp = this.LJLJI.isNeedDefaultHttpServiceBackUp();
                    int maxBytes = this.LJLJI.getMaxBytes();
                    if (currentTimeMillis - this.LLFZ > 3000 && this.LJLJJI.LJIIIIZZ("monitor_download_connect", 0) > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    X5F LIZIZ = C84212X3g.LIZIZ(isNeedDefaultHttpServiceBackUp, maxBytes, str, str2, LIZ, 0, z, this.LJLJI);
                    if (LIZIZ != null) {
                        this.LJLJJL = LIZIZ;
                        this.LJLJJLL = new C84244X4m(LIZIZ, str);
                        if (!this.LJLLLLLL) {
                            if (LIZIZ instanceof X3T) {
                                this.LLIILII = ((X3T) LIZIZ).LIZLLL();
                            }
                            if (C65210PiY.LIZ()) {
                                int id2 = this.LJLJI.getId();
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("Url = ");
                                LIZ3.append(str);
                                LIZ3.append(", ip = ");
                                LIZ3.append(str2);
                                LIZ3.append(", hostRealIp = ");
                                LIZ3.append(this.LLIILII);
                                LIZ3.append(", threadIndex = ");
                                LIZ3.append(this.LJZL);
                                C65210PiY.LIZLLL(id2, "SegmentReader", "createConnection", X1D.LIZIZ(LIZ3));
                            }
                            this.LLIIIL = System.currentTimeMillis();
                            X4U x4u = this.LJLIL;
                            C84233X4b c84233X4b = this.LJLJLLL;
                            C84244X4m c84244X4m = this.LJLJJLL;
                            synchronized (x4u) {
                                if (!x4u.LJFF && !x4u.LJI) {
                                    x4u.LJII(this, c84234X4c, c84233X4b, c84244X4m);
                                    this.LLIIII = false;
                                    if (x4u.LJIIL <= 0) {
                                        long totalBytes = x4u.LIZ.getTotalBytes();
                                        x4u.LJIIL = totalBytes;
                                        if (totalBytes <= 0) {
                                            x4u.LJIIL = c84244X4m.LIZLLL();
                                        }
                                        x4u.LJIIJ();
                                    } else if (x4u.LIZIZ.LIZ.optInt("segment_mode", 1) == 0) {
                                        x4u.LJIIJ();
                                    }
                                } else {
                                    throw new StreamClosedException("connected");
                                }
                            }
                            this.LJLJLLL.LIZJ();
                            return;
                        }
                        throw new StreamClosedException("createConn");
                    }
                    throw new BaseException(1022, new IOException("download can't continue, chunk connection is null"));
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("createConn, ");
                LIZ4.append(c84234X4c);
                throw new SegmentApplyException(6, X1D.LIZIZ(LIZ4));
            } catch (Throwable th) {
                x4t.LLIIIL = System.currentTimeMillis();
                throw th;
            }
        } catch (BaseException e) {
            throw e;
        } catch (Throwable th2) {
            X4P.LJIJJLI("createConn", th2);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(X.C84234X4c r8) {
        /*
            r7 = this;
            java.lang.String r2 = "download"
            r1 = 0
            r7.LLIFFJFJJ = r1
            r7.LJIIL()
        L8:
            r7.LIZLLL(r8)     // Catch: java.lang.Throwable -> Lf com.ss.android.socialbase.downloader.segment.SegmentApplyException -> L8a
            r7.LJIIIIZZ(r8)     // Catch: java.lang.Throwable -> Lf com.ss.android.socialbase.downloader.segment.SegmentApplyException -> L8a
            goto L74
        Lf:
            r3 = move-exception
            java.lang.String r6 = "SegmentReader"
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.LJLJI     // Catch: java.lang.Throwable -> L8e
            int r5 = r0.getId()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r4 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "e = "
            r4.append(r0)     // Catch: java.lang.Throwable -> L8e
            r4.append(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = ", threadIndex = "
            r4.append(r0)     // Catch: java.lang.Throwable -> L8e
            int r0 = r7.LJZL     // Catch: java.lang.Throwable -> L8e
            r4.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = ", reconnect = "
            r4.append(r0)     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r7.LJLZ     // Catch: java.lang.Throwable -> L8e
            r4.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = ", closed = "
            r4.append(r0)     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r7.LJLLLLLL     // Catch: java.lang.Throwable -> L8e
            r4.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = X.X1D.LIZIZ(r4)     // Catch: java.lang.Throwable -> L8e
            X.C65210PiY.LJ(r5, r6, r2, r0)     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r7.LJLLLLLL     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L4e
            goto L79
        L4e:
            boolean r0 = r7.LJLZ     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L5c
            r7.LJLZ = r1     // Catch: java.lang.Throwable -> L8e
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L57
        L57:
            boolean r0 = r7.LJZ     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L7d
            goto L70
        L5c:
            boolean r0 = r3 instanceof com.ss.android.socialbase.downloader.exception.BaseException     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L67
            com.ss.android.socialbase.downloader.exception.BaseException r3 = (com.ss.android.socialbase.downloader.exception.BaseException) r3     // Catch: java.lang.Throwable -> L8e
        L62:
            boolean r0 = r7.LJII(r8, r3)     // Catch: java.lang.Throwable -> L8e
            goto L6e
        L67:
            X.X4P.LJIJJLI(r2, r3)     // Catch: com.ss.android.socialbase.downloader.exception.BaseException -> L6c java.lang.Throwable -> L8e
            r0 = 0
            throw r0     // Catch: com.ss.android.socialbase.downloader.exception.BaseException -> L6c java.lang.Throwable -> L8e
        L6c:
            r3 = move-exception
            goto L62
        L6e:
            if (r0 == 0) goto L86
        L70:
            r7.LJIIJJI()
            goto L8
        L74:
            r7.LJIIJJI()
            r0 = 1
            return r0
        L79:
            r7.LJIIJJI()
            return r1
        L7d:
            r7.LJZ = r1     // Catch: java.lang.Throwable -> L8e
            com.ss.android.socialbase.downloader.segment.SegmentApplyException r1 = new com.ss.android.socialbase.downloader.segment.SegmentApplyException     // Catch: java.lang.Throwable -> L8e
            r0 = 5
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L86:
            r7.LJIIJJI()
            return r1
        L8a:
            r0 = move-exception
            r7.LLII = r0     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            r7.LJIIJJI()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4T.LJ(X.X4c):boolean");
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public final void LJIIIIZZ(X.C84234X4c r30) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4T.LJIIIIZZ(X.X4c):void");
    }

    public final void LJIIJ(boolean z) {
        if (C65210PiY.LIZ()) {
            int id = this.LJLJI.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ThreadIndex: ");
            C0FS.LIZJ(LIZ, this.LJZL, LIZ, id, "SegmentReader", "reconnect");
        }
        synchronized (this) {
            this.LJZ = z;
            this.LJLZ = true;
            this.LL = true;
        }
        LIZIZ();
        Thread thread = this.LJZI;
        if (thread != null) {
            try {
                if (C65210PiY.LIZ()) {
                    int id2 = this.LJLJI.getId();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Interrupt ThreadIndex: ");
                    LIZ2.append(this.LJZL);
                    C65210PiY.LIZLLL(id2, "SegmentReader", "reconnect", X1D.LIZIZ(LIZ2));
                }
                thread.interrupt();
            } catch (Throwable unused) {
            }
        }
    }

    public static X59 LJIIIZ(C84252X4u c84252X4u, InputStream inputStream) {
        int read;
        X59 LIZJ = c84252X4u.LIZJ();
        try {
            read = inputStream.read(LIZJ.LIZ);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (read != -1) {
                LIZJ.LIZJ = read;
                if (read == -1) {
                    c84252X4u.LJ(LIZJ);
                }
                return LIZJ;
            }
            throw new BaseException(1073, "probe");
        } catch (Throwable th2) {
            th = th2;
            if (read != -1) {
                throw th;
            }
            c84252X4u.LJ(LIZJ);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r3.getHttpStatusCode() != 416) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
    
        if (r6 < r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(X.C84234X4c r10, com.ss.android.socialbase.downloader.exception.BaseException r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4T.LJII(X.X4c, com.ss.android.socialbase.downloader.exception.BaseException):boolean");
    }

    public X4T(DownloadInfo downloadInfo, X4U x4u, C84252X4u c84252X4u, C84233X4b c84233X4b, int i) {
        this.LJLJI = downloadInfo;
        this.LJLIL = x4u;
        this.LJLILLLLZI = c84252X4u;
        this.LJLJJI = X4H.LJFF(downloadInfo.getId(), null);
        this.LJLJLLL = c84233X4b;
        this.LJZL = i;
        this.LLFFF = new X4Y(downloadInfo);
        this.LLFII = new X53(downloadInfo);
    }
}
