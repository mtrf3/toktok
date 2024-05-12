package X;

import android.os.Looper;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class PIH extends PIF {
    public final AtomicBoolean LIZLLL;
    public final ThreadLocal<java.util.Map<String, Deque<PIT>>> LJ;
    public C20010qT LJFF;

    @Override // X.PIU
    public final void LIZJ(PIR pir) {
    }

    @Override // X.PIU
    public final PIR LIZLLL(String str) {
        return null;
    }

    @Override // X.PIU
    public final PID LJFF() {
        if (!this.LIZLLL.get()) {
            C1JX.LJIIIIZZ("test", " is start after Trace finish not Trace not being !!!!!, it will be ignore!!!!");
            return null;
        }
        PID LIZ = this.LIZ.LIZ();
        if (LIZ != null) {
            java.util.Map<String, Deque<PIT>> map = this.LJ.get();
            if (map == null) {
                map = new LinkedHashMap<>();
                this.LJ.set(map);
            }
            Deque<PIT> deque = map.get("test");
            if (deque == null) {
                deque = new LinkedList<>();
                map.put("test", deque);
            }
            deque.push(LIZ);
            if (Looper.myLooper() != null && C16880lQ.LLJJJJ().equals(Looper.myLooper())) {
                this.LJFF.LIZIZ(LIZ);
                LIZ.LJIIIZ = System.currentTimeMillis();
            } else {
                PIO pio = (PIO) ((Deque) this.LJFF.LIZ).peek();
                if (pio != null || (pio = (PIO) this.LJFF.LIZJ) != null) {
                    LIZ.LIZLLL = pio.LIZIZ();
                }
                LIZ.LJIIIZ = System.currentTimeMillis();
            }
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
        this.LJFF.LIZ();
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
        this.LJFF = c20010qT;
        c20010qT.LIZ = new LinkedList();
        c20010qT.LIZIZ = new LinkedHashMap();
        this.LIZLLL.set(true);
    }

    public PIH(PIE pie) {
        super(pie);
        this.LIZLLL = new AtomicBoolean(false);
        ThreadLocal<java.util.Map<String, Deque<PIT>>> threadLocal = new ThreadLocal<>();
        this.LJ = threadLocal;
        threadLocal.set(new LinkedHashMap());
        new ThreadLocal().set(new LinkedHashMap());
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
