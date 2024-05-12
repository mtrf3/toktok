package X;

import android.os.Handler;
import java.util.Locale;

/* renamed from: X.ZfD, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90483ZfD {
    public static final C90469Zez LJFF = new C90469Zez("RequestTracker");
    public static final Object LJI = new Object();
    public final long LIZ;
    public InterfaceC90481ZfB LIZLLL;
    public Runnable LJ;
    public long LIZJ = -1;
    public final Handler LIZIZ = new HandlerC90301ZcH(C16880lQ.LLJJJJ());

    public final boolean LIZJ() {
        boolean z;
        synchronized (LJI) {
            if (this.LIZJ != -1) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public C90483ZfD(long j) {
        this.LIZ = j;
    }

    public final boolean LIZLLL(long j) {
        boolean z;
        synchronized (LJI) {
            long j2 = this.LIZJ;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final boolean LJFF(int i) {
        synchronized (LJI) {
            long j = this.LIZJ;
            if (j == -1) {
                return false;
            }
            C16880lQ.LLLZI(Locale.ROOT, "clearing request %d", new Object[]{Long.valueOf(j)});
            LJ(i, null);
            return true;
        }
    }

    public final void LIZ(long j, InterfaceC90481ZfB interfaceC90481ZfB) {
        InterfaceC90481ZfB interfaceC90481ZfB2;
        long j2;
        Object obj = LJI;
        synchronized (obj) {
            interfaceC90481ZfB2 = this.LIZLLL;
            j2 = this.LIZJ;
            this.LIZJ = j;
            this.LIZLLL = interfaceC90481ZfB;
        }
        if (interfaceC90481ZfB2 != null) {
            interfaceC90481ZfB2.LIZ(j2);
        }
        synchronized (obj) {
            Runnable runnable = this.LJ;
            if (runnable != null) {
                this.LIZIZ.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable() { // from class: X.ZfC
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        C90483ZfD c90483ZfD = C90483ZfD.this;
                        synchronized (C90483ZfD.LJI) {
                            if (c90483ZfD.LIZJ != -1) {
                                c90483ZfD.LJFF(15);
                            }
                        }
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            };
            this.LJ = runnable2;
            this.LIZIZ.postDelayed(runnable2, this.LIZ);
        }
    }

    public final void LJ(int i, Object obj) {
        LJFF.getClass();
        Object obj2 = LJI;
        synchronized (obj2) {
            InterfaceC90481ZfB interfaceC90481ZfB = this.LIZLLL;
            if (interfaceC90481ZfB != null) {
                interfaceC90481ZfB.LIZIZ(this.LIZJ, i, obj);
            }
            this.LIZJ = -1L;
            this.LIZLLL = null;
            synchronized (obj2) {
                Runnable runnable = this.LJ;
                if (runnable != null) {
                    this.LIZIZ.removeCallbacks(runnable);
                    this.LJ = null;
                }
            }
        }
    }

    public final void LIZIZ(long j, int i, Object obj) {
        synchronized (LJI) {
            long j2 = this.LIZJ;
            if (j2 != -1 && j2 == j) {
                C16880lQ.LLLZI(Locale.ROOT, "request %d completed", new Object[]{Long.valueOf(j)});
                LJ(i, obj);
            }
        }
    }
}
