package X;

import Y.ARunnableS11S0201000_8;
import android.os.Handler;
import defpackage.i0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: X.Usl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78583Usl {
    public static final String LIZLLL;
    public static final String LJ;
    public static final C78582Usk LJFF;
    public static volatile C78583Usl LJI;
    public static volatile InterfaceC78587Usp LJII;
    public boolean LIZ;
    public Executor LIZIZ;
    public Handler LIZJ;

    public final synchronized void LIZIZ() {
        LJFF();
    }

    public final synchronized void LJFF() {
        LIZJ(LJ);
    }

    static {
        String LJLLJ = C16880lQ.LJLLJ(C78583Usl.class);
        LIZLLL = LJLLJ;
        LJ = i0.LJFF(LJLLJ, "-Thread");
        LJFF = new C78582Usk();
    }

    public static C78583Usl LJI() {
        if (LJI == null) {
            synchronized (C78583Usl.class) {
                if (LJI == null) {
                    LJI = new C78583Usl();
                    LJI.LIZIZ();
                }
            }
        }
        return LJI;
    }

    public final void LIZ(Callable callable) {
        if (this.LIZ) {
            this.LIZIZ.execute(new ARunnableS11S0201000_8(callable, 11));
            return;
        }
        throw new IllegalStateException("LiveTaskManager: Must call init() before use.");
    }

    public final synchronized void LIZJ(String str) {
        LIZLLL(str, LJFF);
    }

    public final synchronized void LJ(ExecutorC78584Usm executorC78584Usm) {
        this.LIZIZ = executorC78584Usm;
        this.LIZJ = new Handler(C16880lQ.LLJJJJ());
        this.LIZ = true;
    }

    public final synchronized void LIZLLL(String str, C78582Usk c78582Usk) {
        C78586Uso c78586Uso = new C78586Uso();
        c78586Uso.LIZ = 64;
        c78586Uso.LIZJ = str;
        c78586Uso.LIZIZ = c78582Usk;
        LJ(new ExecutorC78584Usm(c78586Uso.LIZ, new FQT(c78586Uso.LIZJ), c78586Uso.LIZIZ));
    }
}
