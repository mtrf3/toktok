package X;

import Y.IDHandlerS14S0100000_1;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4WD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WD {
    public static volatile C4WD LJ;
    public long LIZ;
    public long LIZIZ;
    public final List<C109544Rq> LIZJ = new CopyOnWriteArrayList();
    public final IDHandlerS14S0100000_1 LIZLLL = new IDHandlerS14S0100000_1(this, C16880lQ.LLJJJJ(), 3);

    public static C4WD LIZ() {
        if (LJ == null) {
            synchronized (C4WD.class) {
                if (LJ == null) {
                    LJ = new C4WD();
                }
            }
        }
        return LJ;
    }

    public static void LIZIZ(long j) {
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ("qos_read_receipt_perf");
        c63323OtD.LIZ("-1", "mark_read_cost");
        c63323OtD.LIZ(String.valueOf(j), "display_cost");
        c63323OtD.LIZ("-1", "server_cost");
        c63323OtD.LIZLLL();
    }

    public final void LIZJ(long j, long j2, String str, boolean z, long j3) {
        C109544Rq LJIILIIL;
        if (j > 0) {
            if (j2 > 0 && j3 > 0 && (C63308Osy.LJI().LIZLLL().LJJLJLI || z)) {
                C63309Osz LIZLLL = C63309Osz.LIZLLL();
                Long valueOf = Long.valueOf(j);
                Long valueOf2 = Long.valueOf(j3);
                Iterator it = ((CopyOnWriteArraySet) LIZLLL.LJIIIIZZ).iterator();
                while (it.hasNext()) {
                    ((C3UD) it.next()).gA(valueOf, valueOf2, str);
                }
                return;
            }
            if (j2 > 0 && (LJIILIIL = C63150OqQ.LJIILIIL(j2)) != null) {
                ((CopyOnWriteArrayList) this.LIZJ).add(LJIILIIL);
                this.LIZ = SystemClock.elapsedRealtime();
                if (!this.LIZLLL.hasMessages(100)) {
                    this.LIZLLL.sendEmptyMessageDelayed(100, C63308Osy.LJI().LIZLLL().LJJJJL);
                }
            }
        }
    }
}
