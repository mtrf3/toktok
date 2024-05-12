package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I41 implements TGR {
    public final /* synthetic */ C46003I3r LJLIL;

    public I41(C46003I3r c46003I3r) {
        this.LJLIL = c46003I3r;
    }

    @Override // X.TGR
    public final void LIZ(T4Q t4q) {
        if (t4q.LIZJ == EnumC44267HYx.MANUAL_SET) {
            View view = this.LJLIL.LLFFF;
            if (view != null) {
                view.setVisibility(0);
                this.LJLIL.LLJJIJIIJIL().duetEnterRecordPageWithProps = true;
            } else {
                o.LJIJI("ivCrossIcon");
                throw null;
            }
        }
    }

    @Override // X.TGR
    public final void LIZIZ(T4R t4r) {
        View view = this.LJLIL.LLFFF;
        if (view != null) {
            view.setVisibility(8);
        } else {
            o.LJIJI("ivCrossIcon");
            throw null;
        }
    }
}
