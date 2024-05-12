package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class PWE implements Closeable {
    public static final PThreadPoolExecutor LLFF = new PThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new P8T("OkHttp Http2Connection", true));
    public final boolean LJLIL;
    public final AbstractC64566PVq LJLILLLLZI;
    public final String LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public final PThreadScheduledThreadPoolExecutor LJLJLJ;
    public final PThreadPoolExecutor LJLJLLL;
    public final C64568PVs LJLL;
    public long LJLZ;
    public final C64579PWd LJZ;
    public final C64579PWd LJZI;
    public final Socket LJZL;
    public final C64570PVu LL;
    public final PWO LLD;
    public final java.util.Set<Integer> LLF;
    public final java.util.Map<Integer, PWF> LJLJI = new LinkedHashMap();
    public long LJLLI = 0;
    public long LJLLILLLL = 0;
    public long LJLLJ = 0;
    public long LJLLL = 0;
    public long LJLLLL = 0;
    public long LJLLLLLL = 0;

    public final synchronized int LIZJ() {
        int i;
        C64579PWd c64579PWd = this.LJZI;
        if ((c64579PWd.LIZ & 16) != 0) {
            i = c64579PWd.LIZIZ[4];
        } else {
            i = Integer.MAX_VALUE;
        }
        return i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        LIZ(PWT.NO_ERROR, PWT.CANCEL);
    }

    public final void flush() {
        this.LL.flush();
    }

    public PWE(C64564PVo c64564PVo) {
        int i;
        C64579PWd c64579PWd = new C64579PWd();
        this.LJZ = c64579PWd;
        C64579PWd c64579PWd2 = new C64579PWd();
        this.LJZI = c64579PWd2;
        this.LLF = new LinkedHashSet();
        this.LJLL = c64564PVo.LJFF;
        boolean z = c64564PVo.LJI;
        this.LJLIL = z;
        this.LJLILLLLZI = c64564PVo.LJ;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.LJLJJLL = i;
        if (z) {
            this.LJLJJLL = i + 2;
        }
        if (z) {
            c64579PWd.LIZIZ(7, 16777216);
        }
        String str = c64564PVo.LIZIZ;
        this.LJLJJI = str;
        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = new PThreadScheduledThreadPoolExecutor(1, new P8T(PVA.LJIIJJI("OkHttp %s Writer", str), false));
        this.LJLJLJ = pThreadScheduledThreadPoolExecutor;
        if (c64564PVo.LJII != 0) {
            PWP pwp = new PWP(this);
            long j = c64564PVo.LJII;
            pThreadScheduledThreadPoolExecutor.scheduleAtFixedRate(pwp, j, j, TimeUnit.MILLISECONDS);
        }
        this.LJLJLLL = new PThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new P8T(PVA.LJIIJJI("OkHttp %s Push Observer", str), true));
        c64579PWd2.LIZIZ(7, 65535);
        c64579PWd2.LIZIZ(5, 16384);
        this.LJLZ = c64579PWd2.LIZ();
        this.LJZL = c64564PVo.LIZ;
        this.LL = new C64570PVu(c64564PVo.LIZLLL, z);
        this.LLD = new PWO(this, new PWC(c64564PVo.LIZJ, z));
    }

    public final synchronized PWF LIZIZ(int i) {
        return (PWF) ((LinkedHashMap) this.LJLJI).get(Integer.valueOf(i));
    }

    public final synchronized void LIZLLL(AbstractRunnableC64621PXt abstractRunnableC64621PXt) {
        if (!this.LJLJL) {
            this.LJLJLLL.execute(abstractRunnableC64621PXt);
        }
    }

    public final synchronized PWF LJ(int i) {
        PWF remove;
        remove = this.LJLJI.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public final void LJFF(PWT pwt) {
        synchronized (this.LL) {
            synchronized (this) {
                if (this.LJLJL) {
                    return;
                }
                this.LJLJL = true;
                this.LL.LIZLLL(this.LJLJJL, pwt, PVA.LIZ);
            }
        }
    }

    public final synchronized void LJI(long j) {
        long j2 = this.LJLLLLLL + j;
        this.LJLLLLLL = j2;
        if (j2 >= this.LJZ.LIZ() / 2) {
            LJIIL(0, this.LJLLLLLL);
            this.LJLLLLLL = 0L;
        }
    }

    public final void LIZ(PWT pwt, PWT pwt2) {
        PWF[] pwfArr = null;
        try {
            LJFF(pwt);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.LJLJI.isEmpty()) {
                pwfArr = (PWF[]) ((LinkedHashMap) this.LJLJI).values().toArray(new PWF[this.LJLJI.size()]);
                ((LinkedHashMap) this.LJLJI).clear();
            }
        }
        if (pwfArr != null) {
            for (PWF pwf : pwfArr) {
                try {
                    pwf.LIZJ(pwt2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.LL.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.LJZL.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.LJLJLJ.shutdown();
        this.LJLJLLL.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void LJIIJJI(int i, PWT pwt) {
        try {
            this.LJLJLJ.execute(new PWU(this, new Object[]{this.LJLJJI, Integer.valueOf(i)}, i, pwt));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void LJIIL(int i, long j) {
        try {
            this.LJLJLJ.execute(new PWV(this, new Object[]{this.LJLJJI, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
    
        r4 = java.lang.Math.min((int) java.lang.Math.min(r11, r0), r7.LL.LJLJJI);
        r0 = r4;
        r7.LJLZ -= r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(int r8, boolean r9, X.C64533PUj r10, long r11) {
        /*
            r7 = this;
            r1 = 0
            r5 = 0
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto Ld
            X.PVu r0 = r7.LL
            r0.LIZIZ(r9, r8, r10, r1)
            return
        Ld:
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 <= 0) goto L64
            monitor-enter(r7)
        L12:
            long r0 = r7.LJLZ     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L61
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L28
            java.util.Map<java.lang.Integer, X.PWF> r1 = r7.LJLJI     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L61
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L61
            boolean r0 = r1.containsKey(r0)     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L61
            if (r0 == 0) goto L4c
            r7.wait()     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L61
            goto L12
        L28:
            long r0 = java.lang.Math.min(r11, r0)     // Catch: java.lang.Throwable -> L61
            int r2 = (int) r0     // Catch: java.lang.Throwable -> L61
            X.PVu r0 = r7.LL     // Catch: java.lang.Throwable -> L61
            int r0 = r0.LJLJJI     // Catch: java.lang.Throwable -> L61
            int r4 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L61
            long r2 = r7.LJLZ     // Catch: java.lang.Throwable -> L61
            long r0 = (long) r4     // Catch: java.lang.Throwable -> L61
            long r2 = r2 - r0
            r7.LJLZ = r2     // Catch: java.lang.Throwable -> L61
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L61
            long r11 = r11 - r0
            X.PVu r1 = r7.LL
            if (r9 == 0) goto L4a
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto L4a
            r0 = 1
        L46:
            r1.LIZIZ(r0, r8, r10, r4)
            goto Ld
        L4a:
            r0 = 0
            goto L46
        L4c:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L61
            java.lang.String r0 = "stream closed"
            r1.<init>(r0)     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L61
            throw r1     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L61
        L54:
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()     // Catch: java.lang.Throwable -> L61
            r0.interrupt()     // Catch: java.lang.Throwable -> L61
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L61
            r0.<init>()     // Catch: java.lang.Throwable -> L61
            throw r0     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L61
            throw r0
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PWE.LJIIJ(int, boolean, X.PUj, long):void");
    }
}
