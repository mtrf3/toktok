package X;

import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* renamed from: X.Zys, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public abstract class AbstractC91702Zys {
    public final ReentrantLock LIZ = new ReentrantLock(true);
    public final XLM LIZIZ;
    public final XLM LIZJ;
    public boolean LIZLLL;
    public final C79863Bm LJ;
    public final C79863Bm LJFF;

    public abstract NavBackStackEntry LIZ(C91720ZzA c91720ZzA, Bundle bundle);

    public AbstractC91702Zys() {
        XLM LIZ = V8H.LIZ(C61878OQg.INSTANCE);
        this.LIZIZ = LIZ;
        XLM LIZ2 = V8H.LIZ(OQY.INSTANCE);
        this.LIZJ = LIZ2;
        this.LJ = V1M.LIZLLL(LIZ);
        this.LJFF = V1M.LIZLLL(LIZ2);
    }

    public void LIZIZ(NavBackStackEntry navBackStackEntry) {
        XLM xlm = this.LIZJ;
        xlm.setValue(F5P.LJIIJ((java.util.Set) xlm.getValue(), navBackStackEntry));
    }

    public void LJ(NavBackStackEntry backStackEntry) {
        o.LJIIIZ(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.LIZ;
        reentrantLock.lock();
        try {
            XLM xlm = this.LIZIZ;
            xlm.setValue(ORZ.LLIIJI(backStackEntry, (Collection) xlm.getValue()));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void LJFF(NavBackStackEntry backStackEntry) {
        o.LJIIIZ(backStackEntry, "backStackEntry");
        Object LLFII = ORZ.LLFII((List) this.LJ.getValue());
        if (LLFII != null) {
            XLM xlm = this.LIZJ;
            xlm.setValue(F5P.LJIIL((java.util.Set) xlm.getValue(), LLFII));
        }
        XLM xlm2 = this.LIZJ;
        xlm2.setValue(F5P.LJIIL((java.util.Set) xlm2.getValue(), backStackEntry));
        LJ(backStackEntry);
    }

    public void LIZJ(NavBackStackEntry popUpTo, boolean z) {
        o.LJIIIZ(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.LIZ;
        reentrantLock.lock();
        try {
            XLM xlm = this.LIZIZ;
            Iterable iterable = (Iterable) xlm.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(!o.LJ((NavBackStackEntry) obj, popUpTo))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            xlm.setValue(arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void LIZLLL(NavBackStackEntry popUpTo, boolean z) {
        o.LJIIIZ(popUpTo, "popUpTo");
        XLM xlm = this.LIZJ;
        xlm.setValue(F5P.LJIIL((java.util.Set) xlm.getValue(), popUpTo));
        List list = (List) this.LJ.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if (!o.LJ(previous, popUpTo) && ((List) this.LJ.getValue()).lastIndexOf(previous) < ((List) this.LJ.getValue()).lastIndexOf(popUpTo)) {
                if (previous != null) {
                    XLM xlm2 = this.LIZJ;
                    xlm2.setValue(F5P.LJIIL((java.util.Set) xlm2.getValue(), previous));
                }
            }
        }
        LIZJ(popUpTo, z);
    }
}
