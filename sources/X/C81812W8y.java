package X;

import X.AbstractC81797W8j;
import android.util.Pair;
import java.util.List;

/* renamed from: X.W8y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81812W8y extends WB7 {
    public final /* synthetic */ Pair LIZ;
    public final /* synthetic */ AbstractC81797W8j.a LIZIZ;

    @Override // X.WB7, X.InterfaceC81847WAh
    public final void LIZ() {
        C81798W8k.LJII(this.LIZIZ.LJIIIZ());
    }

    @Override // X.WB7, X.InterfaceC81847WAh
    public final void LIZIZ() {
        C81798W8k.LJIIIZ(this.LIZIZ.LJIIJJI());
    }

    @Override // X.InterfaceC81847WAh
    public final void LIZJ() {
        boolean remove;
        List<InterfaceC81847WAh> list;
        C81798W8k c81798W8k;
        List<InterfaceC81847WAh> list2;
        List<InterfaceC81847WAh> list3;
        synchronized (this.LIZIZ) {
            remove = this.LIZIZ.LIZIZ.remove(this.LIZ);
            list = null;
            if (remove) {
                if (this.LIZIZ.LIZIZ.isEmpty()) {
                    c81798W8k = this.LIZIZ.LJFF;
                } else {
                    List<InterfaceC81847WAh> LJIIJ = this.LIZIZ.LJIIJ();
                    list2 = this.LIZIZ.LJIIJJI();
                    list3 = this.LIZIZ.LJIIIZ();
                    c81798W8k = null;
                    list = LJIIJ;
                }
            } else {
                c81798W8k = null;
            }
            list2 = null;
            list3 = null;
        }
        C81798W8k.LJIIIIZZ(list);
        C81798W8k.LJIIIZ(list2);
        C81798W8k.LJII(list3);
        if (c81798W8k != null) {
            c81798W8k.LJIIJ();
        }
        if (remove) {
            ((W7F) this.LIZ.first).LIZJ();
        }
    }

    @Override // X.WB7, X.InterfaceC81847WAh
    public final void LIZLLL() {
        C81798W8k.LJIIIIZZ(this.LIZIZ.LJIIJ());
    }

    public C81812W8y(AbstractC81797W8j.a aVar, Pair pair) {
        this.LIZIZ = aVar;
        this.LIZ = pair;
    }
}
