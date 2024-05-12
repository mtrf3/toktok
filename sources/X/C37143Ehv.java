package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ehv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37143Ehv implements InterfaceC44448HcS {
    public final List<AbstractC37141Eht> LIZ = new ArrayList();
    public final /* synthetic */ C37144Ehw LIZIZ;

    public final void LIZIZ() {
        Iterator<AbstractC37141Eht> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(this.LIZIZ.LIZIZ);
        }
        C37144Ehw c37144Ehw = this.LIZIZ;
        c37144Ehw.LIZ.onNext(c37144Ehw.LIZIZ);
    }

    public C37143Ehv(C37144Ehw c37144Ehw) {
        this.LIZIZ = c37144Ehw;
    }

    @Override // X.InterfaceC44448HcS
    public final void LIZ(EO7 filter) {
        o.LJIIIZ(filter, "filter");
        ((ArrayList) this.LIZ).add(new C37140Ehs(filter));
    }

    public final void LIZJ(EO7 filter) {
        o.LJIIIZ(filter, "filter");
        ((ArrayList) this.LIZ).add(new C37142Ehu(filter));
    }

    public final void LIZLLL(InterfaceC88472Yns<? super EO7, Boolean> predicate) {
        o.LJIIIZ(predicate, "predicate");
        ((ArrayList) this.LIZ).add(new C37139Ehr(predicate));
    }
}
