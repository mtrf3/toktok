package X;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.4Gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106774Gz implements C31P, InterfaceC83423Pe, InterfaceC76442zI {
    public static final C106774Gz LJLIL;
    public static final C62822Ol8 LJLILLLLZI;
    public static long LJLJI;

    static {
        C106774Gz c106774Gz = new C106774Gz();
        LJLIL = c106774Gz;
        LJLILLLLZI = C221108m2.LIZIZ(C4H0.LJLIL);
        LJLJI = -1L;
        C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()));
        C115394fv LJII = C115394fv.LJII();
        LJII.getClass();
        C63322OtC.LJFF("StrangerManager registerStrangerBoxObserver");
        LJII.LIZIZ = c106774Gz;
        C4ZL.LIZLLL();
        C76482zM.LIZ(c106774Gz);
    }

    public static final void LJ() {
        if (C63308Osy.LJI().LJ) {
            C115394fv.LJII().LJIIIZ();
        }
    }

    @Override // X.C31P
    public final void LIZIZ() {
        C4ZL.LIZJ();
        C114834f1.LIZ.i("StrangerBoxModel", "refreshStrangerBox");
        LJFF(0);
    }

    public static final void LIZLLL(InterfaceC83423Pe observer) {
        o.LJIIIZ(observer, "observer");
        ((CopyOnWriteArraySet) LJLILLLLZI.getValue()).add(observer);
    }

    public static void LJFF(int i) {
        long uptimeMillis = SystemClock.uptimeMillis() - LJLJI;
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZLLL = C1FJ.LIZLLL("refreshStrangerBoxInternal: ", i, ", ", uptimeMillis);
        LIZLLL.append(", ");
        LIZLLL.append(C63308Osy.LJI().LJ);
        c114834f1.i("StrangerBoxModel", X1D.LIZIZ(LIZLLL));
        C4ZL.LIZLLL();
        boolean LIZLLL2 = C76482zM.LIZLLL();
        if (uptimeMillis >= 10000 && C63308Osy.LJI().LJ) {
            LJLJI = SystemClock.uptimeMillis();
            if (LIZLLL2) {
                C115394fv.LJII().LJ();
            } else {
                C115394fv.LJII().LJIIIZ();
            }
        }
    }

    public static final void LJI(InterfaceC83423Pe observer) {
        o.LJIIIZ(observer, "observer");
        ((CopyOnWriteArraySet) LJLILLLLZI.getValue()).remove(observer);
    }

    @Override // X.InterfaceC76442zI
    public final void LIZ(C76512zP c76512zP) {
        C4ZL.LIZLLL();
        boolean LIZLLL = C76482zM.LIZLLL();
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNetworkStateChanged: ");
        LIZ.append(LIZLLL);
        c114834f1.i("StrangerBoxModel", X1D.LIZIZ(LIZ));
        if (LIZLLL) {
            C4ZL.LIZIZ();
            LJFF(1);
        }
    }

    @Override // X.InterfaceC83423Pe
    public final void LIZJ(C3LB c3lb) {
        Iterator it = ((CopyOnWriteArraySet) LJLILLLLZI.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC83423Pe) it.next()).LIZJ(c3lb);
        }
    }
}
