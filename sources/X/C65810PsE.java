package X;

import java.lang.Thread;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.PsE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65810PsE {
    public static volatile C65810PsE LJIILJJIL;
    public volatile boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final PriorityBlockingQueue<InterfaceC65812PsG> LIZLLL;
    public final PriorityBlockingQueue<InterfaceC65812PsG> LJ;
    public final PriorityBlockingQueue<InterfaceC65812PsG> LJFF;
    public final C65808PsC[] LJI;
    public final C65811PsF[] LJII;
    public C65807PsB LJIIIIZZ;
    public volatile long LJIIIZ;
    public volatile long LJIIJ;
    public volatile long LJIIJJI;
    public volatile long LJIIL;
    public static final AtomicInteger LJIILIIL = new AtomicInteger();
    public static volatile boolean LJIILL = true;

    public C65810PsE() {
        this(4, true);
    }

    public final synchronized void LIZIZ() {
        if (!LJIILL) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LJIIJ > currentTimeMillis) {
            this.LJIIJ = currentTimeMillis;
        }
        if (currentTimeMillis - this.LJIIJ <= 1000) {
            return;
        }
        this.LJIIJ = currentTimeMillis;
        if (this.LJII == null) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            C65811PsF[] c65811PsFArr = this.LJII;
            if (i >= c65811PsFArr.length) {
                break;
            }
            if (c65811PsFArr[i] == null) {
                i2++;
                if (i2 > this.LIZJ) {
                    break;
                }
                C65811PsF c65811PsF = new C65811PsF(this.LJFF);
                this.LJII[i] = c65811PsF;
                c65811PsF.start();
            }
            i++;
        }
    }

    public final synchronized void LIZJ() {
        if (!LJIILL) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LJIIIZ > currentTimeMillis) {
            this.LJIIIZ = currentTimeMillis;
        }
        if (currentTimeMillis - this.LJIIIZ <= 1000) {
            return;
        }
        this.LJIIIZ = currentTimeMillis;
        int i = 0;
        int i2 = 0;
        while (true) {
            C65808PsC[] c65808PsCArr = this.LJI;
            if (i >= c65808PsCArr.length) {
                break;
            }
            if (c65808PsCArr[i] == null) {
                i2++;
                if (i2 > this.LIZIZ) {
                    break;
                }
                C65808PsC c65808PsC = new C65808PsC(this.LJ, "Account-ApiDispatcher-Thread");
                this.LJI[i] = c65808PsC;
                c65808PsC.start();
            }
            i++;
        }
    }

    public final synchronized void LIZLLL() {
        if (!LJIILL) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LJIIL > currentTimeMillis) {
            this.LJIIL = currentTimeMillis;
        }
        if (currentTimeMillis - this.LJIIL <= 2000) {
            return;
        }
        C65811PsF[] c65811PsFArr = this.LJII;
        if (c65811PsFArr == null) {
            return;
        }
        boolean z = true;
        boolean z2 = true;
        for (int length = c65811PsFArr.length - 1; length >= this.LIZJ; length--) {
            C65811PsF c65811PsF = this.LJII[length];
            if (c65811PsF != null) {
                if (c65811PsF.LJLJJI) {
                    z = false;
                }
                z2 = false;
            }
        }
        this.LJIIL = currentTimeMillis;
        if (!z || z2) {
            return;
        }
        for (int length2 = this.LJII.length - 1; length2 >= this.LIZJ; length2--) {
            try {
                C65811PsF c65811PsF2 = this.LJII[length2];
                if (c65811PsF2 != null && c65811PsF2.getState() != Thread.State.RUNNABLE && !c65811PsF2.LJLJJI) {
                    c65811PsF2.LJLJI = true;
                    c65811PsF2.interrupt();
                    this.LJII[length2] = null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final synchronized void LJ() {
        if (!LJIILL) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LJIIJJI > currentTimeMillis) {
            this.LJIIJJI = currentTimeMillis;
        }
        if (currentTimeMillis - this.LJIIJJI <= 2000) {
            return;
        }
        boolean z = true;
        boolean z2 = true;
        for (int length = this.LJI.length - 1; length >= this.LIZIZ; length--) {
            C65808PsC c65808PsC = this.LJI[length];
            if (c65808PsC != null) {
                if (c65808PsC.LJLJJI) {
                    z = false;
                }
                z2 = false;
            }
        }
        this.LJIIJJI = currentTimeMillis;
        if (!z || z2) {
            return;
        }
        for (int length2 = this.LJI.length - 1; length2 >= this.LIZIZ; length2--) {
            try {
                C65808PsC c65808PsC2 = this.LJI[length2];
                if (c65808PsC2 != null && c65808PsC2.getState() != Thread.State.RUNNABLE && !c65808PsC2.LJLJJI) {
                    c65808PsC2.LJLJI = true;
                    c65808PsC2.interrupt();
                    this.LJI[length2] = null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final synchronized void LJFF() {
        LJI();
        C65807PsB c65807PsB = new C65807PsB(this.LIZLLL, this.LJ);
        this.LJIIIIZZ = c65807PsB;
        c65807PsB.start();
        for (int i = 0; i < this.LIZIZ; i++) {
            C65808PsC c65808PsC = new C65808PsC(this.LJ, "Account-ApiDispatcher-Thread");
            this.LJI[i] = c65808PsC;
            c65808PsC.start();
        }
        if (this.LJII != null) {
            for (int i2 = 0; i2 < this.LIZJ; i2++) {
                C65811PsF c65811PsF = new C65811PsF(this.LJFF);
                this.LJII[i2] = c65811PsF;
                c65811PsF.start();
            }
        }
        this.LIZ = true;
    }

    public final synchronized void LJI() {
        int i = 0;
        this.LIZ = false;
        C65807PsB c65807PsB = this.LJIIIIZZ;
        if (c65807PsB != null) {
            c65807PsB.LJLJI = true;
            c65807PsB.interrupt();
        }
        int i2 = 0;
        while (true) {
            C65808PsC[] c65808PsCArr = this.LJI;
            if (i2 >= c65808PsCArr.length) {
                break;
            }
            C65808PsC c65808PsC = c65808PsCArr[i2];
            if (c65808PsC != null) {
                c65808PsC.LJLJI = true;
                c65808PsC.interrupt();
                this.LJI[i2] = null;
            }
            i2++;
        }
        if (this.LJII != null) {
            while (true) {
                C65811PsF[] c65811PsFArr = this.LJII;
                if (i >= c65811PsFArr.length) {
                    break;
                }
                C65811PsF c65811PsF = c65811PsFArr[i];
                if (c65811PsF != null) {
                    c65811PsF.LJLJI = true;
                    c65811PsF.interrupt();
                    this.LJII[i] = null;
                }
                i++;
            }
        }
    }

    public static C65810PsE LIZ() {
        if (LJIILJJIL == null) {
            synchronized (C65810PsE.class) {
                if (LJIILJJIL == null) {
                    LJIILJJIL = new C65810PsE(0, false);
                }
            }
        }
        return LJIILJJIL;
    }

    public C65810PsE(int i, boolean z) {
        this.LIZLLL = new PriorityBlockingQueue<>();
        this.LJ = new PriorityBlockingQueue<>();
        this.LJFF = new PriorityBlockingQueue<>();
        this.LJIIIZ = 0L;
        this.LJIIJ = 0L;
        this.LJIIJJI = 0L;
        this.LJIIL = 0L;
        this.LIZIZ = 4;
        this.LJI = new C65808PsC[16];
        if (z) {
            this.LIZJ = i;
            this.LJII = new C65811PsF[i * 4];
        }
    }
}
