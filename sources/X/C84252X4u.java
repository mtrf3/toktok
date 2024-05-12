package X;

import com.ss.android.socialbase.downloader.segment.StreamClosedException;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.X4u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84252X4u implements X5L {
    public final int LIZ;
    public final int LIZIZ;
    public final Object LIZJ = new Object();
    public final Object LIZLLL = new Object();
    public X59 LJ;
    public X59 LJFF;
    public X59 LJI;
    public X59 LJII;
    public X59 LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public int LJIIJ;

    public final void LIZIZ() {
        this.LJIIIZ = true;
        synchronized (this.LIZJ) {
            this.LIZJ.notifyAll();
        }
        synchronized (this.LIZLLL) {
            this.LIZLLL.notifyAll();
        }
    }

    public final X59 LIZJ() {
        synchronized (this.LIZJ) {
            if (!this.LJIIIZ) {
                X59 x59 = this.LJ;
                if (x59 == null) {
                    int i = this.LJIIJ;
                    if (i < this.LIZ) {
                        this.LJIIJ = i + 1;
                        return new X59(this.LIZIZ);
                    }
                    do {
                        this.LIZJ.wait();
                        if (!this.LJIIIZ) {
                            x59 = this.LJ;
                        } else {
                            throw new StreamClosedException("obtain");
                        }
                    } while (x59 == null);
                }
                this.LJ = x59.LIZLLL;
                if (x59 == this.LJFF) {
                    this.LJFF = null;
                }
                x59.LIZLLL = null;
                return x59;
            }
            throw new StreamClosedException("obtain");
        }
    }

    public final X59 LIZLLL() {
        X59 x59;
        X59 x592 = this.LJIIIIZZ;
        if (x592 != null) {
            this.LJIIIIZZ = x592.LIZLLL;
            x592.LIZLLL = null;
            return x592;
        }
        synchronized (this.LIZLLL) {
            x59 = this.LJI;
            while (x59 == null) {
                if (!this.LJIIIZ) {
                    this.LIZLLL.wait();
                    x59 = this.LJI;
                } else {
                    throw new StreamClosedException("read");
                }
            }
            this.LJIIIIZZ = x59.LIZLLL;
            this.LJII = null;
            this.LJI = null;
            x59.LIZLLL = null;
        }
        return x59;
    }

    @Override // X.X5L
    public final void LIZ(X59 x59) {
        synchronized (this.LIZLLL) {
            X59 x592 = this.LJII;
            if (x592 == null) {
                this.LJII = x59;
                this.LJI = x59;
                this.LIZLLL.notify();
            } else {
                x592.LIZLLL = x59;
                this.LJII = x59;
            }
        }
    }

    public final void LJ(X59 x59) {
        synchronized (this.LIZJ) {
            X59 x592 = this.LJFF;
            if (x592 == null) {
                this.LJFF = x59;
                this.LJ = x59;
            } else {
                x592.LIZLLL = x59;
                this.LJFF = x59;
            }
            this.LIZJ.notify();
        }
    }

    public C84252X4u(int i, int i2) {
        i = i < 64 ? 64 : i;
        i2 = i2 < 8192 ? FileUtils.BUFFER_SIZE : i2;
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
