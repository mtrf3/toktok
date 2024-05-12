package X;

import Y.ARunnableS42S0100000_6;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS188S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FE8 implements FEM, FEJ {
    public static final FEA LIZ;
    public static final ReentrantReadWriteLock LIZIZ;
    public static final C39670Fha LIZJ;
    public static final C39670Fha LIZLLL;
    public static final FE8 LJ;

    static {
        FE8 fe8 = new FE8();
        LJ = fe8;
        LIZ = new FEA(fe8);
        LIZIZ = new ReentrantReadWriteLock();
        LIZJ = new C39670Fha(2);
        LIZLLL = new C39670Fha(2);
    }

    public static InterfaceC38613FDl LJ() {
        C38619FDr.LIZLLL.getClass();
        return C38619FDr.LIZ();
    }

    @Override // X.FEM
    public final void LIZIZ(FEH owner) {
        o.LJIIJ(owner, "owner");
        AqS188S0100000_6 aqS188S0100000_6 = new AqS188S0100000_6(owner, 0);
        ReentrantReadWriteLock.ReadLock readLock = LIZIZ.readLock();
        readLock.lock();
        try {
            Iterator it = ((java.util.Map) LIZJ.LJLIL).entrySet().iterator();
            while (it.hasNext()) {
                List list = (List) ((Map.Entry) it.next()).getValue();
                synchronized (list) {
                    aqS188S0100000_6.LIZ$0(FEB.LJLIL, list);
                }
            }
            Iterator it2 = ((java.util.Map) LIZLLL.LJLIL).entrySet().iterator();
            while (it2.hasNext()) {
                List list2 = (List) ((Map.Entry) it2.next()).getValue();
                synchronized (list2) {
                    aqS188S0100000_6.LIZ$0(FEC.LJLIL, list2);
                }
            }
        } finally {
            readLock.unlock();
        }
    }

    public final FEH LIZLLL(Context context) {
        Object LIZ2;
        Activity LIZJ2 = C109434Rf.LIZJ(context);
        FEH feh = null;
        if (LIZJ2 != null) {
            Iterator it = ((List) FEK.LIZ.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    LIZ2 = ((FEI) it.next()).LIZ(LIZJ2);
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th) {
                    LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (C3C5.m12isFailureimpl(LIZ2)) {
                    LIZ2 = null;
                }
                FEH feh2 = (FEH) LIZ2;
                if (feh2 != null) {
                    feh = feh2;
                    if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                        feh2.LIZ(this);
                    } else {
                        LIZ.postAtFrontOfQueue(new ARunnableS42S0100000_6(feh2, 0));
                    }
                }
            }
        }
        return feh;
    }

    public static void LJFF(int i, InterfaceC38616FDo creator) {
        int i2;
        FE5 fe5;
        o.LJIIJ(creator, "creator");
        ReentrantReadWriteLock reentrantReadWriteLock = LIZIZ;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i3 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i2 = reentrantReadWriteLock.getReadHoldCount();
            for (int i4 = 0; i4 < i2; i4++) {
                readLock.unlock();
            }
        } else {
            i2 = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            List LIZLLL2 = LIZJ.LIZLLL(i);
            synchronized (LIZLLL2) {
                fe5 = (FE5) C109434Rf.LJIIJ(LIZLLL2, new FE6(creator));
                if (fe5 != null) {
                    InterfaceC38613FDl LJ2 = LJ();
                    if (LJ2 != null) {
                        LJ2.LIZJ(fe5.L(), FEF.MOVE_TO_READY_CACHE);
                    }
                } else {
                    fe5 = null;
                }
            }
            if (fe5 != null) {
                List LIZLLL3 = LIZLLL.LIZLLL(i);
                synchronized (LIZLLL3) {
                    LIZLLL3.add(fe5);
                }
            } else {
                fe5 = null;
            }
            if (fe5 != null) {
                FEA fea = LIZ;
                fea.getClass();
                fea.removeMessages(1, fe5.LJLJJI);
                C38619FDr.LIZLLL.getClass();
                C38612FDk c38612FDk = C38619FDr.LIZIZ;
                if (c38612FDk != null) {
                    long j = c38612FDk.LJFF;
                    Message obtain = Message.obtain();
                    obtain.what = 2;
                    obtain.arg1 = fe5.LJLILLLLZI;
                    obtain.obj = fe5.LJLJJI;
                    fea.sendMessageDelayed(obtain, j);
                    InterfaceC38613FDl LJ3 = LJ();
                    if (LJ3 != null) {
                        LJ3.LJI(fe5.L());
                        return;
                    }
                    return;
                }
                o.LJIJI("config");
                throw null;
            }
        } finally {
            while (i3 < i2) {
                readLock.lock();
                i3++;
            }
            writeLock.unlock();
        }
    }

    public static void LJII(int i, InterfaceC38616FDo creator) {
        o.LJIIJ(creator, "creator");
        List LIZLLL2 = LIZJ.LIZLLL(i);
        synchronized (LIZLLL2) {
        }
        List LIZLLL3 = LIZLLL.LIZLLL(i);
        synchronized (LIZLLL3) {
        }
    }

    @Override // X.FEJ
    public final void LIZ(int i, String str) {
        LJI(LIZLLL, i, str, FEE.LJLIL);
    }

    @Override // X.FEJ
    public final void LIZJ(int i, String str) {
        LJI(LIZJ, i, str, FED.LJLIL);
    }

    public static void LJI(C39670Fha c39670Fha, int i, String str, InterfaceC88472Yns interfaceC88472Yns) {
        ReentrantReadWriteLock.ReadLock readLock = LIZIZ.readLock();
        readLock.lock();
        try {
            List LIZLLL2 = c39670Fha.LIZLLL(i);
            synchronized (LIZLLL2) {
                C109434Rf.LJIIJJI(LIZLLL2, new FEG(str), new AqS172S0100000_6(interfaceC88472Yns, 2));
            }
        } finally {
            readLock.unlock();
        }
    }
}
