package X;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Itu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48078Itu {
    public static long LJFF = -1;
    public static final C1M9 LJI = new C1M9();
    public static long LJII = 1000;
    public final C48138Ius LIZ;
    public long LIZLLL;
    public InterfaceC48098IuE LJ = LJI;
    public final AtomicInteger LIZIZ = new AtomicInteger();
    public final HandlerC47482IkI LIZJ = new HandlerC47482IkI(this, C06M.LIZ("ParseThread").getLooper());

    public final void LIZ() {
        InterfaceC48098IuE interfaceC48098IuE = this.LJ;
        if (interfaceC48098IuE == null) {
            return;
        }
        long LIZ = interfaceC48098IuE.LIZ();
        long j = LJFF;
        long j2 = LIZ - j;
        if (j >= 0) {
            synchronized (this) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.LIZ.LIZ(j2, elapsedRealtime - this.LIZLLL);
                this.LIZLLL = elapsedRealtime;
            }
        }
        LJFF = LIZ;
    }

    public final void LIZJ() {
        this.LJ = LJI;
    }

    public final void LIZLLL() {
        if (this.LIZIZ.decrementAndGet() == 0) {
            this.LIZJ.removeMessages(1);
            LIZ();
            LJFF = -1L;
        }
    }

    public static C48078Itu LIZIZ() {
        return C48088Iu4.LIZ;
    }

    public C48078Itu(C48138Ius c48138Ius) {
        this.LIZ = c48138Ius;
    }
}
