package X;

import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class PIG extends PIF {
    public final AtomicBoolean LIZLLL;
    public final java.util.Map<String, Deque<PIT>> LJ;
    public final java.util.Map<String, Deque<PIR>> LJFF;
    public C20010qT LJI;

    @Override // X.PIU
    public final PID LJFF() {
        if (!this.LIZLLL.get()) {
            C1JX.LJIIIIZZ("test", " is start after Trace finish not Trace not being !!!!!, it will be ignore!!!!");
            return null;
        }
        PIF.LJI(this.LIZIZ);
        PID LIZ = this.LIZ.LIZ();
        if (LIZ != null) {
            Deque<PIT> deque = (Deque) ((LinkedHashMap) this.LJ).get("test");
            if (deque == null) {
                deque = new LinkedList<>();
                this.LJ.put("test", deque);
            }
            deque.push(LIZ);
            this.LJI.LIZIZ(LIZ);
            LIZ.LJIIIZ = System.currentTimeMillis();
        }
        return LIZ;
    }

    @Override // X.PIF, X.PIU
    public final void cancel() {
        if (!this.LIZLLL.get()) {
            return;
        }
        this.LIZLLL.set(false);
        super.cancel();
        this.LJI.LIZ();
    }

    @Override // X.PIU
    public final void start() {
        if (this.LIZLLL.get()) {
            return;
        }
        long id = C16880lQ.LLLLIIIILLL().getId();
        this.LIZIZ = id;
        this.LIZJ = id;
        PIE pie = this.LIZ;
        synchronized (pie) {
            pie.LIZIZ(System.currentTimeMillis());
        }
        C20010qT c20010qT = new C20010qT();
        this.LJI = c20010qT;
        c20010qT.LIZ = new LinkedList();
        c20010qT.LIZIZ = new LinkedHashMap();
        this.LIZLLL.set(true);
    }

    public PIG(PIE pie) {
        super(pie);
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = new LinkedHashMap();
        this.LJFF = new LinkedHashMap();
    }

    @Override // X.PIF, X.PIU
    public final void LIZ(long j) {
        if (!this.LIZLLL.get()) {
            return;
        }
        this.LIZLLL.set(false);
        super.LIZ(j);
        this.LJI.LIZ();
    }

    @Override // X.PIF, X.PIU
    public final void LIZIZ(long j) {
        if (this.LIZLLL.get()) {
            return;
        }
        super.LIZIZ(j);
        C20010qT c20010qT = new C20010qT();
        this.LJI = c20010qT;
        c20010qT.LIZ = new LinkedList();
        c20010qT.LIZIZ = new LinkedHashMap();
        this.LIZLLL.set(true);
    }

    @Override // X.PIU
    public final void LIZJ(PIR pir) {
        if (!this.LIZLLL.get()) {
            if (pir != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(pir.LIZLLL());
                LIZ.append(" is start after Trace finish not Trace not being !!!!!, it will be ignore!!!!");
                X1D.LIZIZ(LIZ);
                return;
            }
            return;
        }
        PIF.LJI(this.LIZIZ);
        if (pir != null) {
            String LIZLLL = pir.LIZLLL();
            Deque<PIR> deque = (Deque) ((LinkedHashMap) this.LJFF).get(LIZLLL);
            if (deque == null) {
                deque = new LinkedList<>();
                this.LJFF.put(LIZLLL, deque);
            }
            deque.push(pir);
        }
    }

    @Override // X.PIU
    public final PIR LIZLLL(String str) {
        PID pid;
        PIB pib;
        PIE pie = this.LIZ;
        synchronized (pie) {
            if (pie.LJ == null) {
                if (PIK.LIZ[pie.LIZLLL.ordinal()] != 1) {
                    pib = null;
                } else {
                    pib = new PIB(pie);
                }
                pie.LJ = pib;
            }
            PIB pib2 = pie.LJ;
            pib2.getClass();
            pid = new PID(str, "tracer_window_span", pib2);
        }
        return pid;
    }

    @Override // X.PIU
    public final void LJ(String str, String str2) {
        if (!this.LIZLLL.get()) {
            return;
        }
        PIE pie = this.LIZ;
        synchronized (pie) {
            if (!pie.LJII && pie.LJI) {
                ((ConcurrentHashMap) pie.LJ.LIZIZ).put(str, str2);
            }
        }
    }
}
