package X;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.8fU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217048fU extends AbstractC216668es {
    public final InterfaceC216738ez LJIIJ;

    public final long LIZJ() {
        AbstractC216708ew<AbstractC216018dp> abstractC216708ew;
        LinkedList<AbstractC216708ew<AbstractC216018dp>> linkedList = this.LIZLLL;
        if (!(!linkedList.isEmpty())) {
            linkedList = null;
        }
        if (linkedList == null || (abstractC216708ew = linkedList.get(0)) == null) {
            return Long.MAX_VALUE;
        }
        return abstractC216708ew.LJII;
    }

    public final void LIZLLL() {
        Iterator<AbstractC216708ew<AbstractC216018dp>> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            AbstractC216708ew<AbstractC216018dp> next = it.next();
            next.LJFF(this.LIZJ);
            next.LJIIJJI(this.LJIIIZ);
            next.LJIIJ((this.LJII - next.LIZLLL) / 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C217048fU(C216678et c216678et, InterfaceC216738ez mLayer) {
        super(c216678et, mLayer);
        o.LJIIIZ(mLayer, "mLayer");
        this.LJIIJ = mLayer;
    }

    @Override // X.InterfaceC217168fg
    public final int LIZ(long j, boolean z, boolean z2) {
        AbstractC216708ew<AbstractC216018dp> abstractC216708ew;
        if (z) {
            LinkedList<AbstractC216708ew<AbstractC216018dp>> linkedList = this.LIZLLL;
            if (!(!linkedList.isEmpty())) {
                linkedList = null;
            }
            if (linkedList == null || (abstractC216708ew = linkedList.get(0)) == null) {
                return 0;
            }
            if (!abstractC216708ew.LJIIIZ) {
                abstractC216708ew.LJII += 16;
            }
            if (abstractC216708ew.LJII >= this.LIZJ.LJFF.LIZ) {
                this.LJIIJ.LJIIIZ(abstractC216708ew);
                this.LIZLLL.clear();
            }
        }
        if (z2) {
            LIZLLL();
        }
        return this.LIZLLL.size();
    }

    public final void LJ(float f, float f2, float f3) {
        this.LJII = f;
        this.LJIIIIZZ = f2;
        this.LJIIIZ = f3;
        LIZLLL();
    }
}
