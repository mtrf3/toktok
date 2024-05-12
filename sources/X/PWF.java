package X;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* loaded from: classes12.dex */
public final class PWF {
    public long LIZ;
    public long LIZIZ;
    public final int LIZJ;
    public final PWE LIZLLL;
    public final Deque<C64606PXe> LJ;
    public boolean LJFF;
    public final PWG LJI;
    public final PWJ LJII;
    public final PWI LJIIIIZZ;
    public final PWI LJIIIZ;
    public PWT LJIIJ;

    public final void LIZ() {
        boolean z;
        boolean LJFF;
        synchronized (this) {
            PWG pwg = this.LJI;
            if (!pwg.LJLJJL && pwg.LJLJJI) {
                PWJ pwj = this.LJII;
                if (pwj.LJLJI || pwj.LJLILLLLZI) {
                    z = true;
                    LJFF = LJFF();
                }
            }
            z = false;
            LJFF = LJFF();
        }
        if (z) {
            LIZJ(PWT.CANCEL);
        } else {
            if (LJFF) {
                return;
            }
            this.LIZLLL.LJ(this.LIZJ);
        }
    }

    public final synchronized boolean LJFF() {
        if (this.LJIIJ != null) {
            return false;
        }
        PWG pwg = this.LJI;
        if (pwg.LJLJJL || pwg.LJLJJI) {
            PWJ pwj = this.LJII;
            if (pwj.LJLJI || pwj.LJLILLLLZI) {
                if (this.LJFF) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void LJI() {
        boolean LJFF;
        synchronized (this) {
            this.LJI.LJLJJL = true;
            LJFF = LJFF();
            notifyAll();
        }
        if (!LJFF) {
            this.LIZLLL.LJ(this.LIZJ);
        }
    }

    public final void LIZIZ() {
        PWJ pwj = this.LJII;
        if (!pwj.LJLILLLLZI) {
            if (!pwj.LJLJI) {
                if (this.LJIIJ == null) {
                    return;
                } else {
                    throw new C64576PWa(this.LJIIJ);
                }
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final boolean LJ() {
        boolean z;
        if ((this.LIZJ & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.LIZLLL.LJLIL == z) {
            return true;
        }
        return false;
    }

    public final void LJIIIZ() {
        try {
            wait();
        } catch (InterruptedException unused) {
            C16880lQ.LLLLIIIILLL().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void LIZJ(PWT pwt) {
        if (!LIZLLL(pwt)) {
            return;
        }
        PWE pwe = this.LIZLLL;
        pwe.LL.LJI(this.LIZJ, pwt);
    }

    public final boolean LIZLLL(PWT pwt) {
        synchronized (this) {
            if (this.LJIIJ != null) {
                return false;
            }
            if (this.LJI.LJLJJL && this.LJII.LJLJI) {
                return false;
            }
            this.LJIIJ = pwt;
            notifyAll();
            this.LIZLLL.LJ(this.LIZJ);
            return true;
        }
    }

    public final void LJII(List<PWL> list) {
        boolean LJFF;
        synchronized (this) {
            this.LJFF = true;
            ((ArrayDeque) this.LJ).add(PVA.LJIL(list));
            LJFF = LJFF();
            notifyAll();
        }
        if (!LJFF) {
            this.LIZLLL.LJ(this.LIZJ);
        }
    }

    public final synchronized void LJIIIIZZ(PWT pwt) {
        if (this.LJIIJ == null) {
            this.LJIIJ = pwt;
            notifyAll();
        }
    }

    public PWF(int i, PWE pwe, boolean z, boolean z2, C64606PXe c64606PXe) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.LJ = arrayDeque;
        this.LJIIIIZZ = new PWI(this);
        this.LJIIIZ = new PWI(this);
        this.LJIIJ = null;
        if (pwe != null) {
            this.LIZJ = i;
            this.LIZLLL = pwe;
            this.LIZIZ = pwe.LJZI.LIZ();
            PWG pwg = new PWG(this, pwe.LJZ.LIZ());
            this.LJI = pwg;
            PWJ pwj = new PWJ(this);
            this.LJII = pwj;
            pwg.LJLJJL = z2;
            pwj.LJLJI = z;
            if (c64606PXe != null) {
                arrayDeque.add(c64606PXe);
            }
            if (!LJ() || c64606PXe == null) {
                if (LJ() || c64606PXe != null) {
                    return;
                } else {
                    throw new IllegalStateException("remotely-initiated streams should have headers");
                }
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        throw new NullPointerException("connection == null");
    }
}
