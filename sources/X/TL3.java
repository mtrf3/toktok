package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TL3 implements C0A3 {
    public final /* synthetic */ TL5 LJLIL;

    @Override // X.C0A3
    public final void LJIILIIL(View view) {
        o.LJIIIZ(view, "view");
    }

    public TL3(TL5 tl5) {
        this.LJLIL = tl5;
    }

    @Override // X.C0A3
    public final void LJJIFFI(View view) {
        o.LJIIIZ(view, "view");
        this.LJLIL.LJIIL().getClass();
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        AbstractC45801HyH<C157166Eu> abstractC45801HyH = this.LJLIL.LJ;
        if (abstractC45801HyH != null) {
            C157166Eu c157166Eu = (C157166Eu) ORZ.LJLLLLLL(this.LJLIL.LJIILLIIL(LJJJJIZL), abstractC45801HyH.getData());
            if (c157166Eu != null) {
                this.LJLIL.LJIILJJIL.onNext(new OSZ(c157166Eu.LJLIL, Integer.valueOf(LJJJJIZL + 1)));
                return;
            }
            return;
        }
        o.LJIJI("dataAdapter");
        throw null;
    }
}
