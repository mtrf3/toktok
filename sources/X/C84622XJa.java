package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: X.XJa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84622XJa extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater LJLJLJ = AtomicIntegerFieldUpdater.newUpdater(C84622XJa.class, "workerCtl");
    public final C84623XJb LJLIL;
    public EnumC84624XJc LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public final /* synthetic */ CoroutineScheduler LJLJL;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;
    public volatile /* synthetic */ int workerCtl;

    public C84622XJa() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0002, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84622XJa.LIZIZ():void");
    }

    public final X9P LIZLLL() {
        if (LIZJ(2) == 0) {
            X9P LIZLLL = this.LJLJL.globalCpuQueue.LIZLLL();
            if (LIZLLL == null) {
                return this.LJLJL.globalBlockingQueue.LIZLLL();
            }
            return LIZLLL;
        }
        X9P LIZLLL2 = this.LJLJL.globalBlockingQueue.LIZLLL();
        if (LIZLLL2 == null) {
            return this.LJLJL.globalCpuQueue.LIZLLL();
        }
        return LIZLLL2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public final X9P LIZ(boolean z) {
        long j;
        boolean z2;
        X9P LIZLLL;
        X9P LIZLLL2;
        boolean z3 = true;
        if (this.LJLILLLLZI != EnumC84624XJc.CPU_ACQUIRED) {
            CoroutineScheduler coroutineScheduler = this.LJLJL;
            do {
                j = coroutineScheduler.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    z2 = false;
                    break;
                }
            } while (!CoroutineScheduler.controlState$FU.compareAndSet(coroutineScheduler, j, j - 4398046511104L));
            this.LJLILLLLZI = EnumC84624XJc.CPU_ACQUIRED;
        }
        z2 = true;
        if (z2) {
            if (z) {
                if (LIZJ(this.LJLJL.corePoolSize * 2) == 0) {
                    X9P LIZLLL3 = LIZLLL();
                    if (LIZLLL3 != null) {
                        return LIZLLL3;
                    }
                } else {
                    z3 = false;
                }
                C84623XJb c84623XJb = this.LJLIL;
                c84623XJb.getClass();
                X9P x9p = (X9P) C84623XJb.LIZIZ.getAndSet(c84623XJb, null);
                if (x9p == null) {
                    X9P LIZLLL4 = c84623XJb.LIZLLL();
                    if (LIZLLL4 == null) {
                        if (!z3 && (LIZLLL2 = LIZLLL()) != null) {
                            return LIZLLL2;
                        }
                    } else {
                        return LIZLLL4;
                    }
                } else {
                    return x9p;
                }
            } else {
                X9P LIZLLL5 = LIZLLL();
                if (LIZLLL5 != null) {
                    return LIZLLL5;
                }
            }
            return LJI(false);
        }
        if (z) {
            C84623XJb c84623XJb2 = this.LJLIL;
            c84623XJb2.getClass();
            X9P x9p2 = (X9P) C84623XJb.LIZIZ.getAndSet(c84623XJb2, null);
            if (x9p2 == null) {
                X9P LIZLLL6 = c84623XJb2.LIZLLL();
                if (LIZLLL6 == null) {
                    LIZLLL = this.LJLJL.globalBlockingQueue.LIZLLL();
                } else {
                    return LIZLLL6;
                }
            } else {
                return x9p2;
            }
        } else {
            LIZLLL = this.LJLJL.globalBlockingQueue.LIZLLL();
        }
        if (LIZLLL == null) {
            return LJI(true);
        }
        return LIZLLL;
    }

    public final int LIZJ(int i) {
        int i2 = this.LJLJJL;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.LJLJJL = i5;
        int i6 = i - 1;
        if ((i6 & i) == 0) {
            return i5 & i6;
        }
        return (i5 & Integer.MAX_VALUE) % i;
    }

    public final void LJ(int i) {
        String valueOf;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJL.schedulerName);
        LIZ.append("-worker-");
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        LIZ.append(valueOf);
        setName(X1D.LIZIZ(LIZ));
        this.indexInArray = i;
    }

    public final boolean LJFF(EnumC84624XJc enumC84624XJc) {
        boolean z;
        EnumC84624XJc enumC84624XJc2 = this.LJLILLLLZI;
        if (enumC84624XJc2 == EnumC84624XJc.CPU_ACQUIRED) {
            z = true;
            CoroutineScheduler.controlState$FU.addAndGet(this.LJLJL, 4398046511104L);
        } else {
            z = false;
        }
        if (enumC84624XJc2 != enumC84624XJc) {
            this.LJLILLLLZI = enumC84624XJc;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.X9P LJI(boolean r16) {
        /*
            r15 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r15.LJLJL
            long r2 = r0.controlState
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r0
            int r10 = (int) r2
            r0 = 2
            r5 = 0
            if (r10 >= r0) goto Le
            return r5
        Le:
            int r9 = r15.LIZJ(r10)
            kotlinx.coroutines.scheduling.CoroutineScheduler r8 = r15.LJLJL
            r7 = 0
            r6 = 0
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L1b:
            r13 = 0
            if (r6 >= r10) goto L75
            int r9 = r9 + 1
            if (r9 <= r10) goto L24
            r9 = 1
        L24:
            java.util.concurrent.atomic.AtomicReferenceArray<X.XJa> r0 = r8.workers
            java.lang.Object r0 = r0.get(r9)
            X.XJa r0 = (X.C84622XJa) r0
            if (r0 == 0) goto L72
            if (r0 == r15) goto L72
            r11 = -1
            if (r16 == 0) goto L54
            X.XJb r1 = r15.LJLIL
            X.XJb r0 = r0.LJLIL
            long r1 = r1.LJ(r0)
        L3c:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L6a
        L40:
            X.XJb r1 = r15.LJLIL
            r1.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C84623XJb.LIZIZ
            java.lang.Object r0 = r0.getAndSet(r1, r5)
            X.X9P r0 = (X.X9P) r0
            if (r0 != 0) goto L53
            X.X9P r0 = r1.LIZLLL()
        L53:
            return r0
        L54:
            X.XJb r2 = r15.LJLIL
            X.XJb r1 = r0.LJLIL
            r2.getClass()
            X.X9P r0 = r1.LIZLLL()
            if (r0 == 0) goto L65
            r2.LIZ(r0, r7)
            goto L40
        L65:
            long r1 = r2.LJFF(r1, r7)
            goto L3c
        L6a:
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 <= 0) goto L72
            long r3 = java.lang.Math.min(r3, r1)
        L72:
            int r6 = r6 + 1
            goto L1b
        L75:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L81
        L7e:
            r15.LJLJJI = r3
            return r5
        L81:
            r3 = 0
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84622XJa.LJI(boolean):X.X9P");
    }

    public C84622XJa(CoroutineScheduler coroutineScheduler, int i) {
        this.LJLJL = coroutineScheduler;
        this.LJLJL = coroutineScheduler;
        setDaemon(true);
        this.LJLIL = new C84623XJb();
        this.LJLILLLLZI = EnumC84624XJc.DORMANT;
        this.workerCtl = 0;
        this.nextParkedWorker = CoroutineScheduler.NOT_IN_STACK;
        this.LJLJJL = V0Q.Default.nextInt();
        LJ(i);
    }
}
