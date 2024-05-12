package X;

import X.AbstractC216668es;
import Y.IDComparatorS336S0100000_3;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S0100100_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8fW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC217068fW<T extends AbstractC216668es> implements InterfaceC216738ez, InterfaceC216968fM, InterfaceC217018fR {
    public C216678et LIZ;
    public InterfaceC217158ff LIZIZ;
    public C217128fc LIZJ;
    public C216758f1 LIZLLL;
    public int LJFF;
    public int LJII;
    public int LJIIIIZZ;
    public final LinkedList<AbstractC216708ew<AbstractC216018dp>> LJ = new LinkedList<>();
    public final LinkedList<T> LJI = new LinkedList<>();

    public abstract void LJIIJ();

    public abstract boolean LJIIJJI(long j, AbstractC216708ew<AbstractC216018dp> abstractC216708ew);

    public abstract C217128fc LJIIL();

    @Override // X.InterfaceC216738ez
    public List<AbstractC216708ew<AbstractC216018dp>> LIZIZ() {
        this.LJ.clear();
        Iterator<T> it = this.LJI.iterator();
        while (it.hasNext()) {
            this.LJ.addAll(it.next().LIZLLL);
        }
        return this.LJ;
    }

    public final C217128fc LJIILIIL() {
        C217128fc c217128fc = this.LIZJ;
        if (c217128fc != null) {
            return c217128fc;
        }
        o.LJIJI("mBuffer");
        throw null;
    }

    public final InterfaceC217158ff LJIILJJIL() {
        InterfaceC217158ff interfaceC217158ff = this.LIZIZ;
        if (interfaceC217158ff != null) {
            return interfaceC217158ff;
        }
        o.LJIJI("mCachePool");
        throw null;
    }

    public final C216758f1 LJIILL() {
        C216758f1 c216758f1 = this.LIZLLL;
        if (c216758f1 != null) {
            return c216758f1;
        }
        o.LJIJI("mConfig");
        throw null;
    }

    public final C216678et LJIILLIIL() {
        C216678et c216678et = this.LIZ;
        if (c216678et != null) {
            return c216678et;
        }
        o.LJIJI("mController");
        throw null;
    }

    @Override // X.InterfaceC216738ez
    public final void LJFF() {
        LJIILIIL().LJ.clear();
    }

    @Override // X.InterfaceC216738ez
    public void LJ(InterfaceC88472Yns<? super AbstractC216018dp, Boolean> interfaceC88472Yns) {
        Iterator<T> it = this.LJI.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (interfaceC88472Yns == null) {
                Iterator<AbstractC216708ew<AbstractC216018dp>> it2 = next.LIZLLL.iterator();
                while (it2.hasNext()) {
                    next.LIZIZ.LJIIIZ(it2.next());
                }
                next.LIZLLL.clear();
            } else {
                Iterator<AbstractC216708ew<AbstractC216018dp>> it3 = next.LIZLLL.iterator();
                o.LJIIIIZZ(it3, "mDrawingItems.iterator()");
                while (it3.hasNext()) {
                    AbstractC216708ew<AbstractC216018dp> next2 = it3.next();
                    o.LJIIIIZZ(next2, "iterator.next()");
                    AbstractC216708ew<AbstractC216018dp> abstractC216708ew = next2;
                    if (interfaceC88472Yns.invoke(abstractC216708ew.LIZ).booleanValue()) {
                        next.LIZIZ.LJIIIZ(abstractC216708ew);
                        it3.remove();
                    }
                }
            }
        }
        C217128fc LJIILIIL = LJIILIIL();
        if (interfaceC88472Yns == null) {
            LJIILIIL.LJ.clear();
        } else {
            ORS.LJJLIL(new AqS169S0100000_3(interfaceC88472Yns, (InterfaceC88472Yns<? super C177336xd, C76800UCe>) 981), LJIILIIL.LJ);
        }
    }

    public InterfaceC216988fO LJI(MotionEvent event) {
        o.LJIIIZ(event, "event");
        Iterator<T> it = this.LJI.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (event.getY() <= next.LJIIIZ + next.LJIIIIZZ) {
                if (event.getY() < next.LJIIIZ || !next.LJIIIIZZ(event)) {
                    break;
                }
                return next;
            }
        }
        return null;
    }

    @Override // X.InterfaceC216738ez
    public void LJIIIZ(AbstractC216708ew<AbstractC216018dp> item) {
        o.LJIIIZ(item, "item");
        LJIILLIIL().LJI(C216828f8.LIZ(1001, item.LIZ));
        LJIILJJIL().LIZ(item);
    }

    @Override // X.InterfaceC216738ez
    public void LIZJ(int i, int i2) {
        this.LJII = i;
        this.LJIIIIZZ = i2;
        LJIIJ();
    }

    @Override // X.InterfaceC216738ez
    public void LJIIIIZZ(long j, List<? extends AbstractC216708ew<AbstractC216018dp>> list) {
        AbstractC216708ew<AbstractC216018dp> next;
        LJIILIIL().LJ.addAll(list);
        C217128fc LJIILIIL = LJIILIIL();
        if (!LJIILIIL.LJ.isEmpty() && LJIILIIL.LJ.size() > LJIILIIL.LIZJ) {
            LinkedList<AbstractC216708ew<AbstractC216018dp>> linkedList = LJIILIIL.LJ;
            AqS28S0100100_3 aqS28S0100100_3 = new AqS28S0100100_3(LJIILIIL, j, 5);
            Iterator<AbstractC216708ew<AbstractC216018dp>> it = linkedList.iterator();
            while (it.hasNext()) {
                if (((Boolean) aqS28S0100100_3.invoke(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            while (LJIILIIL.LJ.size() > LJIILIIL.LIZJ) {
                Iterator<AbstractC216708ew<AbstractC216018dp>> it2 = LJIILIIL.LJ.iterator();
                if (!it2.hasNext()) {
                    next = null;
                } else {
                    next = it2.next();
                    if (it2.hasNext()) {
                        Comparable<?> invoke = LJIILIIL.LIZ.LIZJ.LIZLLL.invoke(next.LIZ);
                        do {
                            AbstractC216708ew<AbstractC216018dp> next2 = it2.next();
                            Comparable<?> invoke2 = LJIILIIL.LIZ.LIZJ.LIZLLL.invoke(next2.LIZ);
                            if (invoke.compareTo(invoke2) > 0) {
                                next = next2;
                                invoke = invoke2;
                            }
                        } while (it2.hasNext());
                    }
                }
                AbstractC216708ew<AbstractC216018dp> abstractC216708ew = next;
                if (abstractC216708ew != null) {
                    LJIILIIL.LIZ.LIZJ.getClass();
                    LJIILIIL.LJ.remove(abstractC216708ew);
                    LJIILIIL.LIZIZ.LIZ(abstractC216708ew);
                }
            }
        }
        if (LJIILIIL.LIZ.LIZJ.LJIIIZ) {
            LinkedList<AbstractC216708ew<AbstractC216018dp>> linkedList2 = LJIILIIL.LJ;
            if (linkedList2.size() > 1) {
                C40675Fxn.LJJLIIIJ(linkedList2, new IDComparatorS336S0100000_3(LJIILIIL, 3));
            }
        }
    }

    public final void LJIIZILJ(C216678et controller, C216768f2 c216768f2) {
        o.LJIIIZ(controller, "controller");
        this.LIZ = controller;
        this.LIZIZ = c216768f2;
        C216758f1 c216758f1 = LJIILLIIL().LIZ;
        o.LJIIIZ(c216758f1, "<set-?>");
        this.LIZLLL = c216758f1;
        C217128fc LJIIL = LJIIL();
        o.LJIIIZ(LJIIL, "<set-?>");
        this.LIZJ = LJIIL;
        ((ArrayList) LJIILL().LIZ).add(this);
    }

    @Override // X.InterfaceC216738ez
    public int LIZ(long j, boolean z, boolean z2) {
        LJIILIIL().LIZ(new AqS28S0100100_3(this, j, 1));
        this.LJFF = 0;
        Iterator<T> it = this.LJI.iterator();
        while (it.hasNext()) {
            T next = it.next();
            this.LJFF = next.LIZ(j, z, z2) + this.LJFF;
        }
        if (z2) {
            C217128fc LJIILIIL = LJIILIIL();
            Iterator<AbstractC216708ew<AbstractC216018dp>> it2 = LJIILIIL.LJ.iterator();
            while (it2.hasNext()) {
                it2.next().LJFF(LJIILIIL.LIZ);
            }
        }
        return this.LJFF;
    }
}
