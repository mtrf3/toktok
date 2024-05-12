package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Itp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC48073Itp implements Callable<Void>, Runnable {
    public static final PThreadPoolExecutor LJLJJLL = new PThreadPoolExecutor(1, 10, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC36537EVp());
    public volatile boolean LJLIL;
    public boolean LJLILLLLZI;
    public final BlockingQueue<C48079Itv> LJLJI;
    public C48081Itx LJLJJI;
    public C48085Iu1 LJLJJL;

    public final void LIZ() {
        if (this.LJLILLLLZI && this.LJLJI != null && this.LJLIL) {
            ((LinkedBlockingQueue) this.LJLJI).clear();
            BlockingQueue<C48079Itv> blockingQueue = this.LJLJI;
            C48081Itx c48081Itx = this.LJLJJI;
            C48079Itv c48079Itv = (C48079Itv) ((LinkedBlockingQueue) C48079Itv.LJFF).poll();
            if (c48079Itv == null) {
                c48079Itv = new C48079Itv();
            }
            c48079Itv.LJ = 2;
            c48079Itv.LIZ = c48081Itx;
            ((LinkedBlockingQueue) blockingQueue).offer(c48079Itv);
            return;
        }
        C48081Itx c48081Itx2 = this.LJLJJI;
        if (c48081Itx2 == null) {
            return;
        }
        c48081Itx2.LIZ();
    }

    public final void LIZIZ() {
        while (this.LJLIL) {
            try {
                C48079Itv c48079Itv = (C48079Itv) ((LinkedBlockingQueue) this.LJLJI).poll(1000L, TimeUnit.MILLISECONDS);
                if (c48079Itv != null) {
                    int i = c48079Itv.LJ;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                this.LJLIL = false;
                            }
                        } else {
                            C48081Itx c48081Itx = c48079Itv.LIZ;
                            if (c48081Itx != null) {
                                c48081Itx.LIZ();
                            }
                            this.LJLIL = false;
                        }
                    } else {
                        try {
                            C48081Itx c48081Itx2 = c48079Itv.LIZ;
                            if (c48081Itx2 != null) {
                                try {
                                    try {
                                        c48081Itx2.LIZ.write(c48079Itv.LIZIZ, c48079Itv.LIZJ, c48079Itv.LIZLLL);
                                    } catch (IOException e) {
                                        throw new C48085Iu1(e);
                                    }
                                } catch (C48085Iu1 e2) {
                                    c48079Itv.LIZ.LIZ();
                                    throw e2;
                                }
                            }
                        } catch (C48085Iu1 e3) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("append to cache file error in network task!!! ");
                            LIZ.append(C48841JEv.LJIIL(e3));
                            C48841JEv.LJIIIZ("CacheWriter", X1D.LIZIZ(LIZ), null);
                            this.LJLIL = false;
                            this.LJLJJL = e3;
                            ((LinkedBlockingQueue) this.LJLJI).clear();
                            C48081Itx c48081Itx3 = c48079Itv.LIZ;
                            if (c48081Itx3 != null) {
                                c48081Itx3.LIZ();
                                return;
                            }
                            return;
                        }
                    }
                    c48079Itv.LIZ = null;
                    c48079Itv.LJ = 0;
                    c48079Itv.LIZJ = 0;
                    c48079Itv.LIZLLL = 0;
                    ((LinkedBlockingQueue) C48079Itv.LJFF).offer(c48079Itv);
                }
            } catch (Exception e4) {
                C48841JEv.LJIIIZ("CacheWriter", C48841JEv.LJIIL(e4), null);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public CallableC48073Itp(C48081Itx c48081Itx) {
        boolean z = C47455Ijr.LJJII;
        this.LJLILLLLZI = z;
        if (z) {
            this.LJLJI = new LinkedBlockingQueue();
        }
        this.LJLJJI = c48081Itx;
        this.LJLIL = false;
    }

    public final void LIZJ(byte[] bArr, int i) {
        if (this.LJLILLLLZI) {
            if (this.LJLJJL == null && this.LJLIL) {
                BlockingQueue<C48079Itv> blockingQueue = this.LJLJI;
                C48081Itx c48081Itx = this.LJLJJI;
                C48079Itv c48079Itv = (C48079Itv) ((LinkedBlockingQueue) C48079Itv.LJFF).poll();
                if (c48079Itv == null) {
                    c48079Itv = new C48079Itv();
                }
                c48079Itv.LJ = 1;
                c48079Itv.LIZ = c48081Itx;
                byte[] bArr2 = c48079Itv.LIZIZ;
                if (bArr2 == null || bArr2.length != bArr.length) {
                    c48079Itv.LIZIZ = new byte[bArr.length];
                }
                System.arraycopy(bArr, 0, c48079Itv.LIZIZ, 0, bArr.length);
                c48079Itv.LIZJ = 0;
                c48079Itv.LIZLLL = i;
                ((LinkedBlockingQueue) blockingQueue).offer(c48079Itv);
                return;
            }
            C48085Iu1 c48085Iu1 = this.LJLJJL;
            if (c48085Iu1 == null || this.LJLJJI == null) {
                return;
            }
            this.LJLJJI = null;
            throw c48085Iu1;
        }
        C48081Itx c48081Itx2 = this.LJLJJI;
        if (c48081Itx2 == null) {
            return;
        }
        try {
            c48081Itx2.LIZ.write(bArr, 0, i);
        } catch (IOException e) {
            throw new C48085Iu1(e);
        }
    }
}
