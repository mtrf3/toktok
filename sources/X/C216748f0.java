package X;

import Y.IDComparatorS31S0000000_3;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS28S0100100_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8f0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216748f0 implements InterfaceC216968fM {
    public final C216678et LIZ;
    public final CopyOnWriteArrayList<InterfaceC216738ez> LIZIZ;
    public final C216768f2 LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;

    public C216748f0(C216678et mController) {
        o.LJIIIZ(mController, "mController");
        this.LIZ = mController;
        CopyOnWriteArrayList<InterfaceC216738ez> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.LIZIZ = copyOnWriteArrayList;
        C216768f2 c216768f2 = new C216768f2();
        this.LIZJ = c216768f2;
        AbstractC217068fW<C217098fZ> abstractC217068fW = new AbstractC217068fW<C217098fZ>() { // from class: X.8fX
            public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1492));

            @Override // X.InterfaceC216738ez
            public final int LJII() {
                return 1000;
            }

            @Override // X.InterfaceC216738ez
            public final int getLayerType() {
                return 1001;
            }

            @Override // X.AbstractC217068fW
            public final C217128fc LJIIL() {
                return new C217128fc(LJIILL(), LJIILJJIL(), LJIILL().LJ.LJII, LJIILL().LJ.LJIIIIZZ);
            }

            @Override // X.AbstractC217068fW
            public final void LJIIJ() {
                int size;
                C217098fZ c217098fZ;
                int i = LJIILL().LJ.LIZLLL;
                float f = LJIILL().LJ.LIZJ;
                float f2 = LJIILL().LJ.LJ;
                float f3 = LJIILL().LJ.LJFF;
                int i2 = 1;
                if (i > this.LJI.size()) {
                    int size2 = i - this.LJI.size();
                    if (1 <= size2) {
                        while (true) {
                            int i3 = i2 + 1;
                            LinkedList<T> linkedList = this.LJI;
                            if (LJIILL().LJ.LJIIJJI) {
                                final C216678et LJIILLIIL = LJIILLIIL();
                                c217098fZ = new C217098fZ(LJIILLIIL, this) { // from class: X.8fa
                                    public final long LJIILJJIL;

                                    @Override // X.C217098fZ
                                    public final AbstractC216708ew<AbstractC216018dp> LJIIJ() {
                                        AbstractC216708ew<AbstractC216018dp> next;
                                        Iterator<AbstractC216708ew<AbstractC216018dp>> it = this.LIZLLL.iterator();
                                        if (!it.hasNext()) {
                                            next = null;
                                        } else {
                                            next = it.next();
                                            if (it.hasNext()) {
                                                float LIZLLL = next.LIZLLL();
                                                do {
                                                    AbstractC216708ew<AbstractC216018dp> next2 = it.next();
                                                    float LIZLLL2 = next2.LIZLLL();
                                                    if (Float.compare(LIZLLL, LIZLLL2) > 0) {
                                                        next = next2;
                                                        LIZLLL = LIZLLL2;
                                                    }
                                                } while (it.hasNext());
                                            }
                                        }
                                        return next;
                                    }

                                    @Override // X.C217098fZ
                                    public final void LJIILJJIL() {
                                        float LIZLLL;
                                        Iterator<AbstractC216708ew<AbstractC216018dp>> it = this.LIZLLL.iterator();
                                        AbstractC216708ew<AbstractC216018dp> abstractC216708ew = null;
                                        float f4 = 0.0f;
                                        while (it.hasNext()) {
                                            AbstractC216708ew<AbstractC216018dp> next = it.next();
                                            next.LJIIJJI(this.LJIIIZ);
                                            float f5 = next.LIZLLL;
                                            next.LJFF(this.LIZJ);
                                            if (this.LJIIJ.LIZ.LIZJ.LJIIIZ) {
                                                if (abstractC216708ew != null && f4 > 0.0f) {
                                                    float LIZLLL2 = ((this.LJII - next.LIZLLL()) - next.LIZLLL) + this.LIZJ.LJ.LJI;
                                                    if (LJIIZILJ(abstractC216708ew, next, LIZLLL2)) {
                                                        LIZLLL = Math.min(next.LIZLLL(), (abstractC216708ew.LIZLLL() - this.LIZJ.LJ.LJI) - next.LIZLLL);
                                                    } else {
                                                        LIZLLL = (next.LIZLLL() - next.LIZLLL) - Math.max(LJI(abstractC216708ew, next, LIZLLL2), 0.0f);
                                                    }
                                                    next.LJIIJ(LIZLLL);
                                                }
                                            } else if (f4 > 0.0f && abstractC216708ew != null && !LJIIJJI(abstractC216708ew, next, this.LJII)) {
                                                next.LJIIJ((abstractC216708ew.LIZLLL() - next.LIZLLL) - this.LIZJ.LJ.LJI);
                                            }
                                            f4 = next.LIZLLL - f5;
                                            next.LJIIJ(next.LIZLLL() - f4);
                                            abstractC216708ew = next;
                                        }
                                    }

                                    @Override // X.C217098fZ
                                    public final float LJII() {
                                        float LIZLLL;
                                        AbstractC216708ew<AbstractC216018dp> LJIIJ = LJIIJ();
                                        if (LJIIJ == null) {
                                            LIZLLL = Float.MAX_VALUE;
                                        } else {
                                            LIZLLL = LJIIJ.LIZLLL();
                                        }
                                        return -LIZLLL;
                                    }

                                    @Override // X.C217098fZ
                                    public final boolean LJIIL(AbstractC216708ew<AbstractC216018dp> abstractC216708ew) {
                                        if (abstractC216708ew.LIZLLL() >= this.LJII) {
                                            return true;
                                        }
                                        return false;
                                    }

                                    @Override // X.C217098fZ
                                    public final boolean LJIILIIL(AbstractC216708ew<AbstractC216018dp> abstractC216708ew) {
                                        if (abstractC216708ew.LIZLLL() + abstractC216708ew.LIZLLL > 0.0f) {
                                            return true;
                                        }
                                        return false;
                                    }

                                    @Override // X.C217098fZ
                                    public final void LJIILL(AbstractC216708ew<AbstractC216018dp> abstractC216708ew) {
                                        abstractC216708ew.LJIIJ((LJIIIZ(abstractC216708ew) * ((float) this.LJIILJJIL)) + abstractC216708ew.LIZLLL());
                                    }

                                    {
                                        o.LJIIIZ(this, "mLayer");
                                        this.LJIILJJIL = 16L;
                                    }

                                    @Override // X.C217098fZ
                                    public final float LIZLLL(AbstractC216708ew item, AbstractC216708ew abstractC216708ew) {
                                        float f4;
                                        o.LJIIIZ(item, "item");
                                        this.LIZJ.LJ.getClass();
                                        if (this.LJIIJ.LIZ.LIZJ.LJIIIZ) {
                                            if (LJIIZILJ(abstractC216708ew, item, this.LJII)) {
                                                f4 = item.LIZLLL;
                                            } else {
                                                return (-item.LIZLLL) - Math.max(LJI(abstractC216708ew, item, this.LJII), 0.0f);
                                            }
                                        } else {
                                            f4 = item.LIZLLL;
                                        }
                                        return -f4;
                                    }

                                    @Override // X.C217098fZ
                                    public final boolean LJFF(AbstractC216708ew<AbstractC216018dp> abstractC216708ew, float f4) {
                                        if (abstractC216708ew.LIZLLL() > this.LIZJ.LJ.LJI) {
                                            return true;
                                        }
                                        return false;
                                    }

                                    @Override // X.C217098fZ
                                    public final float LJI(AbstractC216708ew<AbstractC216018dp> abstractC216708ew, AbstractC216708ew<AbstractC216018dp> newItem, float f4) {
                                        o.LJIIIZ(newItem, "newItem");
                                        if (abstractC216708ew == null) {
                                            return 0.0f;
                                        }
                                        return newItem.LIZLLL() + (((((newItem.LIZLLL + f4) * (f4 - abstractC216708ew.LIZLLL())) / (abstractC216708ew.LIZLLL + f4)) + this.LIZJ.LJ.LJI) - f4);
                                    }

                                    @Override // X.C217098fZ
                                    public final boolean LJIIJJI(AbstractC216708ew<AbstractC216018dp> abstractC216708ew, AbstractC216708ew<AbstractC216018dp> newItem, float f4) {
                                        o.LJIIIZ(newItem, "newItem");
                                        float LIZLLL = abstractC216708ew.LIZLLL() - (newItem.LIZLLL() + newItem.LIZLLL);
                                        if (LIZLLL < this.LIZJ.LJ.LJI) {
                                            return false;
                                        }
                                        float LJIIIZ = LJIIIZ(abstractC216708ew);
                                        float LJIIIZ2 = LJIIIZ(newItem);
                                        if (LJIIIZ < LJIIIZ2) {
                                            if (this.LIZJ.LJ.LJIIJ.invoke(newItem.LIZ).booleanValue()) {
                                                newItem.LJIIIIZZ = LJ(newItem, LJIIIZ);
                                            } else if (((LJIIIZ - LJIIIZ2) * ((float) abstractC216708ew.LJIIIIZZ)) + LIZLLL < this.LIZJ.LJ.LJI) {
                                                return false;
                                            }
                                        }
                                        return true;
                                    }

                                    @Override // X.C217098fZ
                                    public final boolean LJIIZILJ(AbstractC216708ew<AbstractC216018dp> abstractC216708ew, AbstractC216708ew<AbstractC216018dp> newItem, float f4) {
                                        o.LJIIIZ(newItem, "newItem");
                                        if (abstractC216708ew == null) {
                                            return false;
                                        }
                                        float LJIIIZ = LJIIIZ(abstractC216708ew);
                                        float LJIIIZ2 = LJIIIZ(newItem);
                                        if (LJIIIZ < LJIIIZ2) {
                                            if (this.LIZJ.LJ.LJIIJ.invoke(newItem.LIZ).booleanValue()) {
                                                newItem.LJIIIIZZ = LJ(newItem, LJIIIZ);
                                            } else {
                                                if (((LJIIIZ - LJIIIZ2) * ((float) abstractC216708ew.LJIIIIZZ)) + (abstractC216708ew.LIZLLL() - (newItem.LIZLLL() + newItem.LIZLLL)) < this.LIZJ.LJ.LJI) {
                                                    return false;
                                                }
                                            }
                                        }
                                        return true;
                                    }
                                };
                            } else {
                                c217098fZ = new C217098fZ(LJIILLIIL(), this);
                            }
                            ((ArrayList) LJIILLIIL().LIZLLL).add(c217098fZ);
                            linkedList.add(c217098fZ);
                            if (i2 == size2) {
                                break;
                            } else {
                                i2 = i3;
                            }
                        }
                    }
                } else if (i < this.LJI.size() && 1 <= (size = this.LJI.size() - i)) {
                    int i4 = 1;
                    while (true) {
                        int i5 = i4 + 1;
                        LinkedList<T> linkedList2 = this.LJI;
                        AbstractC216668es it = (AbstractC216668es) linkedList2.remove(linkedList2.size() - 1);
                        C216678et LJIILLIIL2 = LJIILLIIL();
                        o.LJIIIIZZ(it, "it");
                        LJIILLIIL2.LJIIJ(it);
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i5;
                        }
                    }
                }
                Iterator it2 = this.LJI.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        ((C217098fZ) next).LJIILLIIL(this.LJII, f, ((f2 + f) * i6) + f3);
                        i6 = i7;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }

            @Override // X.InterfaceC217018fR
            public final void LIZLLL(int i) {
                switch (i) {
                    case 1400:
                        Iterator it = this.LJI.iterator();
                        while (it.hasNext()) {
                            C217098fZ c217098fZ = (C217098fZ) it.next();
                            LinkedList<AbstractC216708ew<AbstractC216018dp>> linkedList = c217098fZ.LIZLLL;
                            Iterator<AbstractC216708ew<AbstractC216018dp>> it2 = linkedList.iterator();
                            int i2 = 0;
                            while (it2.hasNext()) {
                                AbstractC216708ew<AbstractC216018dp> next = it2.next();
                                int i3 = i2 + 1;
                                if (i2 >= 0) {
                                    AbstractC216708ew<AbstractC216018dp> abstractC216708ew = next;
                                    AbstractC216708ew<AbstractC216018dp> abstractC216708ew2 = (AbstractC216708ew) ORZ.LJLLLLLL(i2 - 1, linkedList);
                                    if (abstractC216708ew2 != null && c217098fZ.LIZJ.LJ.LJIIJ.invoke(abstractC216708ew.LIZ).booleanValue()) {
                                        abstractC216708ew.LJIIIIZZ = c217098fZ.LJ(abstractC216708ew, c217098fZ.LJIIIZ(abstractC216708ew2));
                                    } else {
                                        abstractC216708ew.LJIIIIZZ = c217098fZ.LIZJ.LJ.LIZIZ;
                                    }
                                    i2 = i3;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                        }
                        return;
                    case 1401:
                    case 1402:
                    case 1403:
                    case 1404:
                        LJIIJ();
                        return;
                    case 1405:
                    case 1408:
                    case 1409:
                    default:
                        return;
                    case 1406:
                    case 1407:
                        LJIILIIL().LIZIZ(LJIILL().LJ.LJII, LJIILL().LJ.LJIIIIZZ);
                        return;
                    case 1410:
                        Iterator it3 = this.LJI.iterator();
                        o.LJIIIIZZ(it3, "mLines.iterator()");
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            o.LJIIIIZZ(next2, "it.next()");
                            LJIILLIIL().LJIIJ((AbstractC216668es) next2);
                            it3.remove();
                        }
                        LJIIJ();
                        return;
                }
            }

            @Override // X.AbstractC217068fW, X.InterfaceC216968fM
            public final InterfaceC216988fO LJI(MotionEvent event) {
                o.LJIIIZ(event, "event");
                Iterator it = this.LJI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC216668es abstractC216668es = (AbstractC216668es) it.next();
                    if (event.getY() <= abstractC216668es.LJIIIZ + abstractC216668es.LJIIIIZZ) {
                        if (event.getY() < abstractC216668es.LJIIIZ || !abstractC216668es.LJIIIIZZ(event)) {
                            break;
                        }
                        return abstractC216668es;
                    }
                }
                return null;
            }

            @Override // X.AbstractC217068fW, X.InterfaceC216738ez
            public final void LJIIIIZZ(long j, List<? extends AbstractC216708ew<AbstractC216018dp>> list) {
                LJIILL().LJ.getClass();
                super.LJIIIIZZ(j, list);
            }

            @Override // X.AbstractC217068fW
            public final boolean LJIIJJI(long j, AbstractC216708ew<AbstractC216018dp> item) {
                Long valueOf;
                o.LJIIIZ(item, "item");
                if (LJIILL().LJ.LJIIIZ) {
                    Iterator<AbstractC216708ew<AbstractC216018dp>> it = LIZIZ().iterator();
                    while (true) {
                        Long l = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        AbstractC216708ew<AbstractC216018dp> next = it.next();
                        AbstractC216018dp abstractC216018dp = next.LIZ;
                        if (abstractC216018dp == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(abstractC216018dp.LIZIZ);
                        }
                        AbstractC216018dp abstractC216018dp2 = item.LIZ;
                        if (abstractC216018dp2 != null) {
                            l = Long.valueOf(abstractC216018dp2.LIZIZ);
                        }
                        if (o.LJ(valueOf, l)) {
                            if (next != null) {
                                return true;
                            }
                        }
                    }
                }
                if (LJIILL().LIZJ.LJIIIZ) {
                    Iterator it2 = ORZ.LLILII(new IDComparatorS31S0000000_3(6), this.LJI).iterator();
                    while (it2.hasNext()) {
                        if (((C217098fZ) it2.next()).LIZJ(j, item)) {
                            return true;
                        }
                    }
                    return false;
                }
                Iterator it3 = this.LJI.iterator();
                while (it3.hasNext()) {
                    if (((C217098fZ) it3.next()).LIZJ(j, item)) {
                        LJIILLIIL().LJI(C216828f8.LIZ(1000, item.LIZ));
                        return true;
                    }
                }
                return false;
            }

            @Override // X.AbstractC217068fW, X.InterfaceC216738ez
            public final int LIZ(long j, boolean z, boolean z2) {
                ((C217128fc) this.LJIIIZ.getValue()).LIZ(new AqS28S0100100_3(this, j, 3));
                return super.LIZ(j, z, z2);
            }
        };
        abstractC217068fW.LJIIZILJ(mController, c216768f2);
        copyOnWriteArrayList.add(abstractC217068fW);
        AbstractC217068fW<C217048fU> abstractC217068fW2 = new AbstractC217068fW<C217048fU>() { // from class: X.8fV
            @Override // X.InterfaceC216738ez
            public final int LJII() {
                return 1100;
            }

            @Override // X.InterfaceC216738ez
            public final int getLayerType() {
                return 1002;
            }

            @Override // X.AbstractC217068fW
            public final C217128fc LJIIL() {
                return new C217128fc(LJIILL(), LJIILJJIL(), LJIILL().LJFF.LJFF, LJIILL().LJFF.LJI);
            }

            @Override // X.AbstractC217068fW
            public final void LJIIJ() {
                int size;
                int i = LJIILL().LJFF.LIZLLL;
                float f = LJIILL().LJFF.LIZJ;
                float f2 = LJIILL().LJFF.LJ;
                LJIILL().LJFF.getClass();
                int i2 = 1;
                if (i > this.LJI.size()) {
                    int size2 = i - this.LJI.size();
                    if (1 <= size2) {
                        while (true) {
                            int i3 = i2 + 1;
                            LinkedList<T> linkedList = this.LJI;
                            C217048fU c217048fU = new C217048fU(LJIILLIIL(), this);
                            ((ArrayList) LJIILLIIL().LIZLLL).add(c217048fU);
                            linkedList.add(c217048fU);
                            if (i2 == size2) {
                                break;
                            } else {
                                i2 = i3;
                            }
                        }
                    }
                } else if (i < this.LJI.size() && 1 <= (size = this.LJI.size() - i)) {
                    int i4 = 1;
                    while (true) {
                        int i5 = i4 + 1;
                        LinkedList<T> linkedList2 = this.LJI;
                        AbstractC216668es it = (AbstractC216668es) linkedList2.remove(linkedList2.size() - 1);
                        C216678et LJIILLIIL = LJIILLIIL();
                        o.LJIIIIZZ(it, "it");
                        LJIILLIIL.LJIIJ(it);
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i5;
                        }
                    }
                }
                Iterator it2 = this.LJI.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        ((C217048fU) next).LJ(this.LJII, f, ((f2 + f) * i6) + 0.0f);
                        i6 = i7;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }

            @Override // X.InterfaceC217018fR
            public final void LIZLLL(int i) {
                switch (i) {
                    case 1502:
                    case 1503:
                    case 1504:
                    case 1505:
                        LJIIJ();
                        return;
                    case 1506:
                    case 1507:
                        LJIILIIL().LIZIZ(LJIILL().LJFF.LJFF, LJIILL().LJFF.LJI);
                        return;
                    default:
                        return;
                }
            }

            @Override // X.AbstractC217068fW, X.InterfaceC216968fM
            public final InterfaceC216988fO LJI(MotionEvent event) {
                o.LJIIIZ(event, "event");
                Iterator it = this.LJI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC216668es abstractC216668es = (AbstractC216668es) it.next();
                    if (event.getY() <= abstractC216668es.LJIIIZ + abstractC216668es.LJIIIIZZ) {
                        if (event.getY() < abstractC216668es.LJIIIZ || !abstractC216668es.LJIIIIZZ(event)) {
                            break;
                        }
                        return abstractC216668es;
                    }
                }
                return null;
            }

            @Override // X.AbstractC217068fW
            public final boolean LJIIJJI(long j, AbstractC216708ew<AbstractC216018dp> item) {
                AbstractC216708ew<AbstractC216018dp> abstractC216708ew;
                o.LJIIIZ(item, "item");
                LJIILL().LJFF.getClass();
                Iterator it = this.LJI.iterator();
                Object obj = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        long LIZJ = ((C217048fU) obj).LIZJ();
                        do {
                            Object next = it.next();
                            long LIZJ2 = ((C217048fU) next).LIZJ();
                            if (LIZJ < LIZJ2) {
                                obj = next;
                                LIZJ = LIZJ2;
                            }
                        } while (it.hasNext());
                    }
                }
                C217048fU c217048fU = (C217048fU) obj;
                if (c217048fU != null) {
                    LinkedList<AbstractC216708ew<AbstractC216018dp>> linkedList = c217048fU.LIZLLL;
                    if ((!linkedList.isEmpty()) && (abstractC216708ew = linkedList.get(0)) != null) {
                        if (!abstractC216708ew.LJIIIZ && abstractC216708ew.LJII >= c217048fU.LIZJ.LJFF.LIZIZ) {
                            c217048fU.LIZLLL.clear();
                            c217048fU.LJIIJ.LJIIIZ(abstractC216708ew);
                        }
                    }
                    item.LJIIJ((c217048fU.LJII - item.LIZLLL) / 2);
                    item.LJIIJJI(c217048fU.LJIIIZ);
                    item.LJI = j;
                    c217048fU.LIZLLL.clear();
                    c217048fU.LIZLLL.add(item);
                    LJIILLIIL().LJI(C216828f8.LIZ(1000, item.LIZ));
                    return true;
                }
                return false;
            }
        };
        abstractC217068fW2.LJIIZILJ(mController, c216768f2);
        copyOnWriteArrayList.add(abstractC217068fW2);
        AbstractC217068fW<C217038fT> abstractC217068fW3 = new AbstractC217068fW<C217038fT>() { // from class: X.8fY
            @Override // X.InterfaceC216738ez
            public final int LJII() {
                return LinkMicRtcMixBitrateSetting.DEFAULT;
            }

            @Override // X.InterfaceC216738ez
            public final int getLayerType() {
                return 1003;
            }

            @Override // X.AbstractC217068fW
            public final C217128fc LJIIL() {
                return new C217128fc(LJIILL(), LJIILJJIL(), LJIILL().LJI.LJI, LJIILL().LJI.LJII);
            }

            @Override // X.AbstractC217068fW
            public final void LJIIJ() {
                int size;
                int i = LJIILL().LJI.LIZLLL;
                float f = LJIILL().LJI.LIZJ;
                float f2 = LJIILL().LJI.LJ;
                float f3 = LJIILL().LJI.LJFF;
                int i2 = 0;
                if (i > this.LJI.size()) {
                    int size2 = i - this.LJI.size();
                    if (1 <= size2) {
                        int i3 = 1;
                        while (true) {
                            int i4 = i3 + 1;
                            LinkedList<T> linkedList = this.LJI;
                            C217038fT c217038fT = new C217038fT(LJIILLIIL(), this);
                            ((ArrayList) LJIILLIIL().LIZLLL).add(c217038fT);
                            linkedList.add(0, c217038fT);
                            if (i3 == size2) {
                                break;
                            } else {
                                i3 = i4;
                            }
                        }
                    }
                } else if (i < this.LJI.size() && 1 <= (size = this.LJI.size() - i)) {
                    int i5 = 1;
                    while (true) {
                        int i6 = i5 + 1;
                        AbstractC216668es it = (AbstractC216668es) this.LJI.remove(0);
                        C216678et LJIILLIIL = LJIILLIIL();
                        o.LJIIIIZZ(it, "it");
                        LJIILLIIL.LJIIJ(it);
                        if (i5 == size) {
                            break;
                        } else {
                            i5 = i6;
                        }
                    }
                }
                Iterator it2 = this.LJI.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i7 = i2 + 1;
                    if (i2 >= 0) {
                        ((C217038fT) next).LJ(this.LJII, f, ((this.LJIIIIZZ - f3) - ((f2 + f) * ((this.LJI.size() - i2) - 1))) - f);
                        i2 = i7;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }

            @Override // X.InterfaceC217018fR
            public final void LIZLLL(int i) {
                switch (i) {
                    case 1602:
                    case 1603:
                    case 1604:
                    case 1605:
                        LJIIJ();
                        return;
                    case 1606:
                    case 1607:
                        LJIILIIL().LIZIZ(LJIILL().LJI.LJI, LJIILL().LJI.LJII);
                        return;
                    default:
                        return;
                }
            }

            @Override // X.AbstractC217068fW, X.InterfaceC216968fM
            public final InterfaceC216988fO LJI(MotionEvent event) {
                o.LJIIIZ(event, "event");
                Iterator it = this.LJI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC216668es abstractC216668es = (AbstractC216668es) it.next();
                    if (event.getY() <= abstractC216668es.LJIIIZ + abstractC216668es.LJIIIIZZ) {
                        if (event.getY() < abstractC216668es.LJIIIZ || !abstractC216668es.LJIIIIZZ(event)) {
                            break;
                        }
                        return abstractC216668es;
                    }
                }
                return null;
            }

            @Override // X.AbstractC217068fW
            public final boolean LJIIJJI(long j, AbstractC216708ew<AbstractC216018dp> item) {
                AbstractC216708ew<AbstractC216018dp> abstractC216708ew;
                o.LJIIIZ(item, "item");
                LJIILL().LJI.getClass();
                Iterator<T> it = ORS.LJJLIIIJL(this.LJI).iterator();
                Object obj = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        long LIZJ = ((C217038fT) obj).LIZJ();
                        do {
                            Object next = it.next();
                            long LIZJ2 = ((C217038fT) next).LIZJ();
                            if (LIZJ < LIZJ2) {
                                obj = next;
                                LIZJ = LIZJ2;
                            }
                        } while (it.hasNext());
                    }
                }
                C217038fT c217038fT = (C217038fT) obj;
                if (c217038fT != null) {
                    LinkedList<AbstractC216708ew<AbstractC216018dp>> linkedList = c217038fT.LIZLLL;
                    if ((!linkedList.isEmpty()) && (abstractC216708ew = linkedList.get(0)) != null) {
                        if (!abstractC216708ew.LJIIIZ && abstractC216708ew.LJII >= c217038fT.LIZJ.LJI.LIZIZ) {
                            c217038fT.LIZLLL.clear();
                            c217038fT.LJIIJ.LJIIIZ(abstractC216708ew);
                        }
                    }
                    item.LJIIJ((c217038fT.LJII - item.LIZLLL) / 2);
                    item.LJIIJJI(c217038fT.LJIIIZ);
                    item.LJI = j;
                    c217038fT.LIZLLL.clear();
                    c217038fT.LIZLLL.add(item);
                    LJIILLIIL().LJI(C216828f8.LIZ(1000, item.LIZ));
                    return true;
                }
                return false;
            }
        };
        abstractC217068fW3.LJIIZILJ(mController, c216768f2);
        copyOnWriteArrayList.add(abstractC217068fW3);
        AbstractC217068fW<AbstractC216668es> abstractC217068fW4 = new AbstractC217068fW<AbstractC216668es>() { // from class: X.8fb
            public AbstractC216708ew<AbstractC216018dp> LJIIIZ;
            public final List<AbstractC216708ew<AbstractC216018dp>> LJIIJ = new ArrayList();
            public final Matrix LJIIJJI = new Matrix();

            @Override // X.AbstractC217068fW, X.InterfaceC216738ez
            public final int LIZ(long j, boolean z, boolean z2) {
                return 0;
            }

            @Override // X.InterfaceC216738ez
            public final int LJII() {
                return Integer.MAX_VALUE;
            }

            @Override // X.AbstractC217068fW, X.InterfaceC216738ez
            public final void LJIIIZ(AbstractC216708ew<AbstractC216018dp> item) {
                o.LJIIIZ(item, "item");
            }

            @Override // X.AbstractC217068fW
            public final void LJIIJ() {
            }

            @Override // X.AbstractC217068fW
            public final boolean LJIIJJI(long j, AbstractC216708ew<AbstractC216018dp> item) {
                o.LJIIIZ(item, "item");
                return true;
            }

            @Override // X.InterfaceC216738ez
            public final int getLayerType() {
                return 1004;
            }

            @Override // X.AbstractC217068fW, X.InterfaceC216738ez
            public final List<AbstractC216708ew<AbstractC216018dp>> LIZIZ() {
                ((ArrayList) this.LJIIJ).clear();
                AbstractC216708ew<AbstractC216018dp> abstractC216708ew = this.LJIIIZ;
                if (abstractC216708ew != null) {
                    ((ArrayList) this.LJIIJ).add(abstractC216708ew);
                }
                return this.LJIIJ;
            }

            @Override // X.AbstractC217068fW
            public final C217128fc LJIIL() {
                return new C217128fc(LJIILL(), LJIILJJIL(), 1, 1L);
            }

            public final void LJIJI() {
                AbstractC216708ew<AbstractC216018dp> abstractC216708ew = this.LJIIIZ;
                if (abstractC216708ew != null) {
                    abstractC216708ew.LJIIIZ();
                    LJIILJJIL().LIZ(abstractC216708ew);
                }
                this.LJIIIZ = null;
            }

            @Override // X.InterfaceC217018fR
            public final void LIZLLL(int i) {
                if (i == 1700) {
                    LJIILL().LJII.getClass();
                    LJIJI();
                    ((ArrayList) this.LJIIJ).clear();
                }
            }

            @Override // X.AbstractC217068fW, X.InterfaceC216738ez
            public final void LJ(InterfaceC88472Yns<? super AbstractC216018dp, Boolean> interfaceC88472Yns) {
                LJIJI();
                ((ArrayList) this.LJIIJ).clear();
            }

            public final void LJIJ(C216898fF c216898fF) {
                if (c216898fF.LIZ == 0) {
                    return;
                }
                this.LJIIJJI.reset();
                float f = 0;
                float f2 = this.LJII / f;
                float f3 = this.LJIIIIZZ / f;
                if (f2 < f3) {
                    this.LJIIJJI.postScale(f2, f2, 0.0f, 0.0f);
                } else {
                    this.LJIIJJI.postScale(f3, f3, 0.0f, 0.0f);
                }
            }

            @Override // X.AbstractC217068fW, X.InterfaceC216738ez
            public final void LIZJ(int i, int i2) {
                C216898fF c216898fF;
                this.LJII = i;
                this.LJIIIIZZ = i2;
                if (LJIILL().LJII.LIZ) {
                    AbstractC216708ew<AbstractC216018dp> abstractC216708ew = this.LJIIIZ;
                    if (!(abstractC216708ew instanceof C216898fF) || (c216898fF = (C216898fF) abstractC216708ew) == null) {
                        return;
                    }
                    LJIJ(c216898fF);
                }
            }

            @Override // X.AbstractC217068fW, X.InterfaceC216738ez
            public final void LJIIIIZZ(long j, List<? extends AbstractC216708ew<AbstractC216018dp>> list) {
                C216898fF c216898fF;
                if (!((ArrayList) list).isEmpty()) {
                    LJIJI();
                    this.LJIIIZ = (AbstractC216708ew) ListProtector.get(list, 0);
                    if (LJIILL().LJII.LIZ) {
                        AbstractC216708ew<AbstractC216018dp> abstractC216708ew = this.LJIIIZ;
                        if (!(abstractC216708ew instanceof C216898fF) || (c216898fF = (C216898fF) abstractC216708ew) == null) {
                            return;
                        }
                        LJIJ(c216898fF);
                    }
                }
            }
        };
        abstractC217068fW4.LJIIZILJ(mController, c216768f2);
        copyOnWriteArrayList.add(abstractC217068fW4);
        LIZJ(new InterfaceC216878fD() { // from class: X.8el
            @Override // X.InterfaceC216878fD
            public final int LIZIZ() {
                return 1001;
            }

            @Override // X.InterfaceC216878fD
            public final AbstractC216708ew<? extends AbstractC216018dp> LIZ() {
                return new AbstractC216708ew<C216038dr>() { // from class: X.8eh
                    public final Paint LJIIJ = new Paint(5);
                    public final Paint LJIIJJI = new Paint(5);

                    @Override // X.AbstractC216708ew
                    public final int LIZJ() {
                        return 1001;
                    }

                    @Override // X.AbstractC216708ew
                    public final void LJIIIZ() {
                        super.LJIIIZ();
                        this.LJIIJ.reset();
                        this.LJIIJJI.reset();
                    }

                    @Override // X.AbstractC216708ew
                    public final void LJI(C216038dr c216038dr) {
                        this.LJIIJ.setFlags(5);
                        this.LJIIJJI.setFlags(5);
                    }

                    @Override // X.AbstractC216708ew
                    public final void LJIIIIZZ(C216758f1 config) {
                        float f;
                        float f2;
                        o.LJIIIZ(config, "config");
                        if (!TextUtils.isEmpty(null)) {
                            this.LJIIJ.setTextSize(config.LIZLLL.LIZIZ);
                            this.LJIIJ.setTypeface(config.LIZLLL.LIZLLL);
                            this.LIZLLL = this.LJIIJ.measureText((CharSequence) null, 0, 0);
                            boolean z = config.LIZLLL.LJI;
                            Paint paint = this.LJIIJ;
                            if (z) {
                                f = paint.getFontMetrics().bottom;
                                f2 = paint.getFontMetrics().top;
                            } else {
                                f = paint.getFontMetrics().bottom;
                                f2 = paint.getFontMetrics().ascent;
                            }
                            this.LJ = f - f2;
                            return;
                        }
                        this.LIZLLL = 0.0f;
                        this.LJ = 0.0f;
                    }

                    @Override // X.AbstractC216708ew
                    public final void LJII(Canvas canvas, C216758f1 config) {
                        o.LJIIIZ(canvas, "canvas");
                        o.LJIIIZ(config, "config");
                    }
                };
            }
        });
        LIZJ(new InterfaceC216878fD() { // from class: X.8em
            @Override // X.InterfaceC216878fD
            public final int LIZIZ() {
                return 1002;
            }

            @Override // X.InterfaceC216878fD
            public final AbstractC216708ew<? extends AbstractC216018dp> LIZ() {
                return new AbstractC216708ew<C216048ds>() { // from class: X.8ek
                    public final Paint LJIIJ = new Paint(5);
                    public final RectF LJIIJJI = new RectF();

                    @Override // X.AbstractC216708ew
                    public final int LIZJ() {
                        return 1002;
                    }

                    @Override // X.AbstractC216708ew
                    public final void LJIIIZ() {
                        super.LJIIIZ();
                        this.LJIIJ.reset();
                        this.LJIIJJI.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }

                    @Override // X.AbstractC216708ew
                    public final void LJI(C216048ds c216048ds) {
                        this.LJIIJ.setFlags(5);
                    }

                    @Override // X.AbstractC216708ew
                    public final void LJIIIIZZ(C216758f1 config) {
                        o.LJIIIZ(config, "config");
                        this.LIZLLL = 0.0f;
                        this.LJ = 0.0f;
                    }

                    @Override // X.AbstractC216708ew
                    public final void LJII(Canvas canvas, C216758f1 config) {
                        o.LJIIIZ(canvas, "canvas");
                        o.LJIIIZ(config, "config");
                    }
                };
            }
        });
        LIZJ(new InterfaceC216878fD() { // from class: X.8fE
            @Override // X.InterfaceC216878fD
            public final int LIZIZ() {
                return 1003;
            }

            @Override // X.InterfaceC216878fD
            public final AbstractC216708ew<? extends AbstractC216018dp> LIZ() {
                return new AbstractC216708ew<C216058dt>() { // from class: X.8fF
                    @Override // X.AbstractC216708ew
                    public final int LIZJ() {
                        return 1003;
                    }

                    @Override // X.AbstractC216708ew
                    public final void LJIIIIZZ(C216758f1 config) {
                        o.LJIIIZ(config, "config");
                    }

                    {
                        Paint paint = new Paint(5);
                        new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
                        paint.setColor(-1);
                        paint.setAntiAlias(true);
                    }

                    @Override // X.AbstractC216708ew
                    public final void LJI(C216058dt c216058dt) {
                    }

                    @Override // X.AbstractC216708ew
                    public final void LJII(Canvas canvas, C216758f1 config) {
                        o.LJIIIZ(canvas, "canvas");
                        o.LJIIIZ(config, "config");
                        config.LJII.getClass();
                    }
                };
            }
        });
    }

    public final void LIZIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        Iterator<InterfaceC216738ez> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().LIZIZ());
        }
        C40675Fxn.LJJLIIIJ(arrayList, C66851QLn.LJ(C216778f3.LJLIL, C216788f4.LJLIL, C216798f5.LJLIL));
        this.LIZ.LIZ.LJII.getClass();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC216708ew abstractC216708ew = (AbstractC216708ew) it2.next();
            abstractC216708ew.LIZIZ(canvas, this.LIZ.LIZ);
            getClass();
            if (abstractC216708ew.LIZ != 0) {
                System.nanoTime();
            }
        }
        this.LIZ.LIZ.LJII.getClass();
        arrayList.clear();
    }

    public final void LIZJ(InterfaceC216878fD interfaceC216878fD) {
        C216768f2 c216768f2 = this.LIZJ;
        c216768f2.getClass();
        c216768f2.LIZIZ.LJI(interfaceC216878fD.LIZIZ(), interfaceC216878fD);
    }

    @Override // X.InterfaceC216968fM
    public final InterfaceC216988fO LJI(MotionEvent event) {
        InterfaceC216968fM interfaceC216968fM;
        InterfaceC216988fO LJI;
        o.LJIIIZ(event, "event");
        Iterator<T> it = ORS.LJJLIIIJL(this.LIZIZ).iterator();
        while (it.hasNext()) {
            InterfaceC216738ez interfaceC216738ez = (InterfaceC216738ez) it.next();
            if ((interfaceC216738ez instanceof InterfaceC216968fM) && (interfaceC216968fM = (InterfaceC216968fM) interfaceC216738ez) != null && (LJI = interfaceC216968fM.LJI(event)) != null) {
                return LJI;
            }
        }
        return null;
    }

    public final void LIZ(int i, InterfaceC88472Yns<? super AbstractC216018dp, Boolean> interfaceC88472Yns) {
        if (i == 1000) {
            Iterator<InterfaceC216738ez> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LJ(interfaceC88472Yns);
            }
        } else {
            Iterator<InterfaceC216738ez> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                InterfaceC216738ez next = it2.next();
                if (next.getLayerType() == i) {
                    next.LJ(interfaceC88472Yns);
                }
            }
        }
    }

    public final int LIZLLL(long j, boolean z, boolean z2) {
        this.LJFF = 0;
        Iterator<InterfaceC216738ez> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            InterfaceC216738ez next = it.next();
            this.LJFF = next.LIZ(j, z, z2) + this.LJFF;
        }
        return this.LJFF;
    }
}
