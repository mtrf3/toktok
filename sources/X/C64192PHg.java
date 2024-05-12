package X;

import Y.IDComparatorS39S0000000_11;
import android.os.Process;
import android.util.Pair;
import d5b.c;
import defpackage.b0;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.PHg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64192PHg extends PGA {
    public final C64194PHi LIZ;
    public C64193PHh LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public C64200PHo LJII;
    public final InterfaceC46627IRr LJIIIIZZ;
    public boolean LJIIIZ = true;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public final void LJFF() {
        C46626IRq c46626IRq;
        EnumC64201PHp enumC64201PHp;
        C64191PHf c64191PHf;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJI < this.LJ) {
            return;
        }
        this.LJI = currentTimeMillis;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C30591Hz.LJIILJJIL(Process.myPid(), hashMap);
        try {
            Thread.sleep(100L);
            C30591Hz.LJIILJJIL(Process.myPid(), hashMap2);
            try {
                c46626IRq = ((C46625IRp) this.LJIIIIZZ).LIZIZ();
            } catch (Exception unused) {
                c46626IRq = null;
            }
            if (hashMap.isEmpty() || hashMap2.isEmpty()) {
                return;
            }
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            for (Map.Entry entry : hashMap.entrySet()) {
                C64191PHf c64191PHf2 = (C64191PHf) entry.getValue();
                if (c64191PHf2 != null && (c64191PHf = (C64191PHf) hashMap2.get(entry.getKey())) != null && (str = c64191PHf.LIZIZ) != null && str.equals(c64191PHf2.LIZIZ)) {
                    long j = c64191PHf.LIZJ - c64191PHf2.LIZJ;
                    if (j != 0) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("cpu_thread=");
                        b0.LJ(LIZ, c64191PHf.LIZIZ, " thread_time=", j);
                        LIZ.append(" app_time=");
                        LIZ.append(0L);
                        C64028PAy.LIZ("APM-CPU", X1D.LIZIZ(LIZ));
                        double d = j;
                        linkedList.add(new PI9(c64191PHf.LIZIZ, Double.valueOf(d)));
                        linkedList2.add(new C64206PHu(d));
                    }
                }
            }
            if (linkedList.isEmpty()) {
                return;
            }
            Collections.sort(linkedList2, new IDComparatorS39S0000000_11(30));
            C64184PGy c64184PGy = C64157PFx.LIZ;
            synchronized (c64184PGy) {
                c64184PGy.LIZJ = new Pair<>(Long.valueOf(System.currentTimeMillis()), linkedList2);
            }
            if (!this.LJII.LIZ) {
                return;
            }
            if (C64156PFw.LIZ.LIZIZ()) {
                enumC64201PHp = EnumC64201PHp.FRONT;
            } else {
                enumC64201PHp = EnumC64201PHp.BACK;
            }
            C64189PHd c64189PHd = new C64189PHd(enumC64201PHp, PGQ.LIZ().LJ(), linkedList, c46626IRq);
            c64189PHd.LJIIIIZZ = c.LIZJ(C09970aH.LIZ);
            try {
                c64189PHd.LJIIJ = ((C46625IRp) this.LJIIIIZZ).LIZLLL.LIZ();
            } catch (Throwable unused2) {
            }
            PC2.LIZ(c64189PHd);
        } catch (InterruptedException e) {
            C64028PAy.LIZJ("APM-CPU", "InterruptedException", e);
        }
    }

    public final void LJI(C64200PHo c64200PHo) {
        if (!this.LIZIZ.compareAndSet(false, true)) {
            return;
        }
        this.LJII = c64200PHo;
        if (this.LIZJ == null) {
            this.LIZJ = new C64193PHh(this);
        }
        if (this.LIZJ != null) {
            C64071PCp.LIZ(PD6.CPU).LIZJ(this.LIZJ);
        }
        try {
            ((C46625IRp) this.LJIIIIZZ).LJ();
        } catch (Throwable unused) {
        }
    }

    public C64192PHg(C64194PHi c64194PHi, InterfaceC46627IRr interfaceC46627IRr) {
        this.LIZ = c64194PHi;
        this.LJIIIIZZ = interfaceC46627IRr;
    }
}
