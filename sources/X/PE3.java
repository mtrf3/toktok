package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class PE3 {
    public static final Object LJFF = new Object();
    public volatile C39050FUg LIZ;
    public volatile C39050FUg LIZIZ;
    public volatile C39050FUg LIZJ;
    public final java.util.Map<PD7, Long> LIZLLL = new ConcurrentHashMap(3);
    public PE9 LJ;

    public final C39050FUg LIZJ() {
        if (this.LIZ == null) {
            synchronized (LJFF) {
                if (this.LIZ == null) {
                    LJ();
                }
            }
        }
        return this.LIZ;
    }

    public final C39050FUg LIZLLL() {
        if (this.LIZJ == null) {
            synchronized (LJFF) {
                if (this.LIZJ == null) {
                    LJI();
                }
            }
        }
        return this.LIZJ;
    }

    public final void LJ() {
        synchronized (LJFF) {
            if (this.LIZ == null) {
                PE4 pe4 = new PE4("io-task");
                pe4.LJLILLLLZI = new PE5(this);
                this.LIZ = new C39050FUg(1, pe4);
            }
        }
    }

    public final void LJFF() {
        synchronized (LJFF) {
            if (this.LIZIZ == null) {
                PE4 pe4 = new PE4("light-weight-task");
                pe4.LJLILLLLZI = new PE6(this);
                this.LIZIZ = new C39050FUg(1, pe4);
            }
        }
    }

    public final void LJI() {
        synchronized (LJFF) {
            if (this.LIZJ == null) {
                PE4 pe4 = new PE4("time-sensitive-task");
                pe4.LJLILLLLZI = new PE7(this);
                this.LIZJ = new C39050FUg(1, pe4);
            }
        }
    }

    public final C39050FUg LIZIZ(PD3 pd3) {
        PD7 LJIJ = pd3.LJIJ();
        if (LJIJ == PD7.IO) {
            return LIZJ();
        }
        if (LJIJ == PD7.TIME_SENSITIVE) {
            return LIZLLL();
        }
        if (this.LIZIZ == null) {
            synchronized (LJFF) {
                if (this.LIZIZ == null) {
                    LJFF();
                }
            }
        }
        return this.LIZIZ;
    }

    public final void LJII(PD3 pd3) {
        try {
            LIZIZ(pd3).submit(pd3);
        } catch (Throwable th) {
            LIZ("Apm-Async-task-post", th);
        }
    }

    public final void LIZ(String str, Throwable th) {
        InterfaceC10050aP interfaceC10050aP;
        PE9 pe9 = this.LJ;
        if (pe9 != null && (interfaceC10050aP = ((C1PX) pe9).LIZ.LIZ) != null) {
            ((PDS) interfaceC10050aP).LIZ(str, th);
        }
    }

    public final void LJIIIIZZ(PD3 pd3, long j) {
        if (pd3 == null) {
            return;
        }
        try {
            C39050FUg LIZIZ = LIZIZ(pd3);
            LIZIZ.getClass();
            LIZIZ.LIZJ(LIZIZ.schedule(pd3, j, TimeUnit.MILLISECONDS), pd3.hashCode(), false);
        } catch (Throwable th) {
            LIZ("Apm-Async-task-postDelayed", th);
        }
    }
}
