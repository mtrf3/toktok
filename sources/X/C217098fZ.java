package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.8fZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C217098fZ extends AbstractC216668es {
    public final C216678et LJIIJ;
    public final InterfaceC216738ez LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;

    public AbstractC216708ew<AbstractC216018dp> LJIIJ() {
        AbstractC216708ew<AbstractC216018dp> next;
        Iterator<AbstractC216708ew<AbstractC216018dp>> it = this.LIZLLL.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                AbstractC216708ew<AbstractC216018dp> abstractC216708ew = next;
                float LIZLLL = abstractC216708ew.LIZLLL() + abstractC216708ew.LIZLLL;
                do {
                    AbstractC216708ew<AbstractC216018dp> next2 = it.next();
                    AbstractC216708ew<AbstractC216018dp> abstractC216708ew2 = next2;
                    float LIZLLL2 = abstractC216708ew2.LIZLLL() + abstractC216708ew2.LIZLLL;
                    if (Float.compare(LIZLLL, LIZLLL2) < 0) {
                        next = next2;
                        LIZLLL = LIZLLL2;
                    }
                } while (it.hasNext());
            }
        }
        return next;
    }

    public void LJIILJJIL() {
        float max;
        Iterator<AbstractC216708ew<AbstractC216018dp>> it = this.LIZLLL.iterator();
        AbstractC216708ew<AbstractC216018dp> abstractC216708ew = null;
        float f = 0.0f;
        while (it.hasNext()) {
            AbstractC216708ew<AbstractC216018dp> next = it.next();
            next.LJIIJJI(this.LJIIIZ);
            float f2 = next.LIZLLL;
            next.LJFF(this.LIZJ);
            if (this.LJIIJ.LIZ.LIZJ.LJIIIZ) {
                if (abstractC216708ew != null && f > 0.0f) {
                    if (LJIIZILJ(abstractC216708ew, next, next.LIZLLL() + this.LIZJ.LJ.LJI)) {
                        max = Math.max(next.LIZLLL(), abstractC216708ew.LIZLLL() + abstractC216708ew.LIZLLL + this.LIZJ.LJ.LJI);
                    } else {
                        max = Math.max(LJI(abstractC216708ew, next, next.LIZLLL() + this.LIZJ.LJ.LJI), 0.0f) + next.LIZLLL();
                    }
                    next.LJIIJ(max);
                }
            } else if (f > 0.0f && abstractC216708ew != null && !LJIIJJI(abstractC216708ew, next, next.LIZLLL())) {
                next.LJIIJ(abstractC216708ew.LIZLLL() + abstractC216708ew.LIZLLL + this.LIZJ.LJ.LJI);
            }
            f = next.LIZLLL - f2;
            abstractC216708ew = next;
        }
    }

    public float LJII() {
        AbstractC216708ew<AbstractC216018dp> LJIIJ = LJIIJ();
        if (LJIIJ == null) {
            return Float.MAX_VALUE;
        }
        return LJIIJ.LIZLLL + LJIIJ.LIZLLL();
    }

    public final float LJIIIZ(AbstractC216708ew<AbstractC216018dp> item) {
        o.LJIIIZ(item, "item");
        if (item.LJIIIIZZ == 0) {
            item.LJIIIIZZ = this.LIZJ.LJ.LIZIZ;
        }
        return (item.LIZLLL + this.LJII) / ((float) item.LJIIIIZZ);
    }

    public boolean LJIIL(AbstractC216708ew<AbstractC216018dp> abstractC216708ew) {
        if (abstractC216708ew.LIZLLL() + abstractC216708ew.LIZLLL <= 0.0f) {
            return true;
        }
        return false;
    }

    public boolean LJIILIIL(AbstractC216708ew<AbstractC216018dp> abstractC216708ew) {
        if (abstractC216708ew.LIZLLL() < this.LJII) {
            return true;
        }
        return false;
    }

    public void LJIILL(AbstractC216708ew<AbstractC216018dp> abstractC216708ew) {
        abstractC216708ew.LJIIJ(abstractC216708ew.LIZLLL() - (LJIIIZ(abstractC216708ew) * ((float) this.LJIILIIL)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C217098fZ(C216678et c216678et, InterfaceC216738ez mLayer) {
        super(c216678et, mLayer);
        o.LJIIIZ(mLayer, "mLayer");
        this.LJIIJ = c216678et;
        this.LJIIJJI = mLayer;
        this.LJIIL = -1L;
        this.LJIILIIL = 16L;
    }

    public final boolean LIZJ(long j, AbstractC216708ew<AbstractC216018dp> item) {
        o.LJIIIZ(item, "item");
        item.LJIIIIZZ = this.LIZJ.LJ.LIZIZ;
        AbstractC216708ew<AbstractC216018dp> LJIIJ = LJIIJ();
        if (LJIIJ == null) {
            LJIIJ = null;
        } else if (!this.LJIIJ.LIZ.LIZJ.LJIIIZ ? !LJIIJJI(LJIIJ, item, this.LJII) : !(LJIILIIL(LJIIJ) && LJFF(LJIIJ, this.LJII))) {
            return false;
        }
        item.LJIIJ(LIZLLL(item, LJIIJ));
        item.LJIIJJI(this.LJIIIZ);
        item.LJI = j;
        this.LIZLLL.add(item);
        return true;
    }

    public float LIZLLL(AbstractC216708ew item, AbstractC216708ew abstractC216708ew) {
        o.LJIIIZ(item, "item");
        this.LIZJ.LJ.getClass();
        if (this.LJIIJ.LIZ.LIZJ.LJIIIZ) {
            if (LJIIZILJ(abstractC216708ew, item, this.LJII)) {
                return this.LJII;
            }
            float f = this.LJII;
            return Math.max(LJI(abstractC216708ew, item, f), 0.0f) + f;
        }
        return this.LJII;
    }

    public final long LJ(AbstractC216708ew<AbstractC216018dp> item, float f) {
        o.LJIIIZ(item, "item");
        if (f > 0.0f) {
            return (item.LIZLLL + this.LJII) / f;
        }
        return this.LIZJ.LJ.LIZIZ;
    }

    public boolean LJFF(AbstractC216708ew<AbstractC216018dp> abstractC216708ew, float f) {
        if ((f - abstractC216708ew.LIZLLL()) - abstractC216708ew.LIZLLL > this.LIZJ.LJ.LJI) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC217168fg
    public final int LIZ(long j, boolean z, boolean z2) {
        if (this.LJIIL < 0) {
            this.LJIIL = System.currentTimeMillis();
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - this.LJIIL;
            if (j2 >= 14) {
                j2 = 16;
            }
            this.LJIILIIL = j2;
            this.LJIIL = currentTimeMillis;
        }
        if (z) {
            Iterator<AbstractC216708ew<AbstractC216018dp>> it = this.LIZLLL.iterator();
            while (it.hasNext()) {
                AbstractC216708ew<AbstractC216018dp> next = it.next();
                if (!next.LJIIIZ) {
                    LJIILL(next);
                    if (this.LJIIJ.LIZ.LIZJ.LJIIIZ) {
                        if (LJIILIIL(next)) {
                            if (next.LJII <= 0) {
                                this.LJIIJ.LJI(C216828f8.LIZ(1000, next.LIZ));
                            }
                            next.LJII += this.LJIILIIL;
                        }
                    } else {
                        next.LJII += this.LJIILIIL;
                    }
                }
            }
            Iterator<AbstractC216708ew<AbstractC216018dp>> it2 = this.LIZLLL.iterator();
            o.LJIIIIZZ(it2, "mDrawingItems.iterator()");
            while (it2.hasNext()) {
                AbstractC216708ew<AbstractC216018dp> next2 = it2.next();
                o.LJIIIIZZ(next2, "iterator.next()");
                AbstractC216708ew<AbstractC216018dp> abstractC216708ew = next2;
                if (LJIIL(abstractC216708ew)) {
                    this.LJIIJJI.LJIIIZ(abstractC216708ew);
                    it2.remove();
                }
            }
        }
        if (z2) {
            LJIILJJIL();
        }
        return this.LIZLLL.size();
    }

    public float LJI(AbstractC216708ew<AbstractC216018dp> abstractC216708ew, AbstractC216708ew<AbstractC216018dp> newItem, float f) {
        o.LJIIIZ(newItem, "newItem");
        if (abstractC216708ew == null) {
            return 0.0f;
        }
        float f2 = newItem.LIZLLL + f;
        float LIZLLL = abstractC216708ew.LIZLLL();
        float f3 = abstractC216708ew.LIZLLL;
        return (((LIZLLL + f3) * f2) / (f3 + f)) - f;
    }

    public boolean LJIIJJI(AbstractC216708ew<AbstractC216018dp> abstractC216708ew, AbstractC216708ew<AbstractC216018dp> newItem, float f) {
        o.LJIIIZ(newItem, "newItem");
        float LIZLLL = (f - abstractC216708ew.LIZLLL()) - abstractC216708ew.LIZLLL;
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

    public final void LJIILLIIL(float f, float f2, float f3) {
        this.LJII = f;
        this.LJIIIIZZ = f2;
        this.LJIIIZ = f3;
        LJIILJJIL();
    }

    public boolean LJIIZILJ(AbstractC216708ew<AbstractC216018dp> abstractC216708ew, AbstractC216708ew<AbstractC216018dp> newItem, float f) {
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
                if (((LJIIIZ - LJIIIZ2) * ((float) abstractC216708ew.LJIIIIZZ)) + ((f - abstractC216708ew.LIZLLL()) - abstractC216708ew.LIZLLL) < this.LIZJ.LJ.LJI) {
                    return false;
                }
            }
        }
        return true;
    }
}
