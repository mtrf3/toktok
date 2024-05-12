package X;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.1RM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RM implements InterfaceC24390xX, InterfaceC13130fN, Runnable, Choreographer.FrameCallback {
    public static long LJLLI;
    public final C13140fO LJLIL;
    public final AnonymousClass167 LJLILLLLZI;
    public final C13060fG LJLJI;
    public final View LJLJJI;
    public final C25710zf<C1RL> LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public boolean LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public boolean LJLL;

    @Override // X.InterfaceC24390xX
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC24390xX
    public final void LIZLLL() {
        this.LJLL = false;
        this.LJLIL.LIZ.setValue(null);
        this.LJLJJI.removeCallbacks(this);
        ((Choreographer) this.LJLJLLL.getValue()).removeFrameCallback(this);
    }

    @Override // X.InterfaceC24390xX
    public final void LIZJ() {
        this.LJLIL.LIZ.setValue(this);
        this.LJLL = true;
    }

    public final void LJ() {
        boolean z = false;
        if (this.LJLJJL.LJIIJ() || !this.LJLJLJ || !this.LJLL || this.LJLJJI.getWindowVisibility() != 0) {
            this.LJLJLJ = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.LJLJJI.getDrawingTime()) + LJLLI;
        boolean z2 = false;
        while (true) {
            if (this.LJLJJL.LJIIJJI()) {
                if (z2) {
                    break;
                }
                C1RL c1rl = this.LJLJJL.LJLIL[z ? 1 : 0];
                InterfaceC13090fJ invoke = this.LJLJI.LIZIZ.invoke();
                if (!c1rl.LIZLLL) {
                    int itemCount = invoke.getItemCount();
                    int i = c1rl.LIZ;
                    if (i >= 0 && i < itemCount) {
                        if (c1rl.LIZJ == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                long nanoTime = System.nanoTime();
                                long j = this.LJLJJLL;
                                if (nanoTime > nanos || j + nanoTime < nanos) {
                                    Object LJII = invoke.LJII(c1rl.LIZ);
                                    InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LIZ = this.LJLJI.LIZ(c1rl.LIZ, LJII);
                                    AnonymousClass167 anonymousClass167 = this.LJLILLLLZI;
                                    anonymousClass167.getClass();
                                    c1rl.LIZJ = anonymousClass167.LIZ().LIZJ(LJII, LIZ);
                                    long nanoTime2 = System.nanoTime() - nanoTime;
                                    long j2 = this.LJLJJLL;
                                    if (j2 != 0) {
                                        long j3 = 4;
                                        nanoTime2 = (nanoTime2 / j3) + ((j2 / j3) * 3);
                                    }
                                    this.LJLJJLL = nanoTime2;
                                } else {
                                    z2 = true;
                                }
                            } finally {
                            }
                        } else {
                            Trace.beginSection("compose:lazylist:prefetch:measure");
                            try {
                                long nanoTime3 = System.nanoTime();
                                long j4 = this.LJLJL;
                                if (nanoTime3 > nanos || j4 + nanoTime3 < nanos) {
                                    AnonymousClass166 anonymousClass166 = c1rl.LIZJ;
                                    o.LJI(anonymousClass166);
                                    int LIZIZ = anonymousClass166.LIZIZ();
                                    for (int i2 = 0; i2 < LIZIZ; i2++) {
                                        anonymousClass166.LIZJ(i2, c1rl.LIZIZ);
                                    }
                                    long nanoTime4 = System.nanoTime() - nanoTime3;
                                    long j5 = this.LJLJL;
                                    if (j5 != 0) {
                                        long j6 = 4;
                                        nanoTime4 = (nanoTime4 / j6) + ((j5 / j6) * 3);
                                    }
                                    this.LJLJL = nanoTime4;
                                    this.LJLJJL.LJIILJJIL(0);
                                } else {
                                    z2 = true;
                                }
                                z = false;
                            } finally {
                            }
                        }
                    }
                }
                this.LJLJJL.LJIILJJIL(0);
                z = false;
            } else if (!z2) {
                this.LJLJLJ = z;
                return;
            }
        }
        ((Choreographer) this.LJLJLLL.getValue()).postFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.LJLL) {
            this.LJLJJI.post(this);
        }
    }

    @Override // X.InterfaceC13130fN
    public final C1RL LIZ(int i, long j) {
        C1RL c1rl = new C1RL(j, i);
        this.LJLJJL.LIZLLL(c1rl);
        if (!this.LJLJLJ) {
            this.LJLJLJ = true;
            this.LJLJJI.post(this);
        }
        return c1rl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        if (r1 >= 30.0f) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1RM(X.C13140fO r6, X.AnonymousClass167 r7, X.C13060fG r8, android.view.View r9) {
        /*
            r5 = this;
            java.lang.String r0 = "prefetchState"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "subcomposeLayoutState"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "itemContentFactory"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            r5.<init>()
            r5.LJLIL = r6
            r5.LJLILLLLZI = r7
            r5.LJLJI = r8
            r5.LJLJJI = r9
            X.0zf r1 = new X.0zf
            r0 = 16
            X.1RL[] r0 = new X.C1RL[r0]
            r1.<init>(r0)
            r5.LJLJJL = r1
            X.210 r0 = X.AnonymousClass210.INSTANCE
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r5.LJLJLLL = r0
            long r3 = X.C1RM.LJLLI
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L58
            android.view.Display r1 = r9.getDisplay()
            boolean r0 = r9.isInEditMode()
            if (r0 != 0) goto L59
            if (r1 == 0) goto L59
            float r1 = r1.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L59
        L50:
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r1
            long r0 = (long) r0
            X.C1RM.LJLLI = r0
        L58:
            return
        L59:
            r1 = 1114636288(0x42700000, float:60.0)
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1RM.<init>(X.0fO, X.167, X.0fG, android.view.View):void");
    }
}
