package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I42 implements TGR {
    public final /* synthetic */ C46002I3q LJLIL;

    public I42(C46002I3q c46002I3q) {
        this.LJLIL = c46002I3q;
    }

    @Override // X.TGR
    public final void LIZ(T4Q t4q) {
        if (t4q.LIZJ == EnumC44267HYx.MANUAL_SET) {
            View view = this.LJLIL.LJZL;
            if (view != null) {
                view.setVisibility(0);
                this.LJLIL.LLJILJIL().duetEnterRecordPageWithProps = true;
            } else {
                o.LJIJI("ivCrossIcon");
                throw null;
            }
        }
    }

    @Override // X.TGR
    public final void LIZIZ(T4R t4r) {
        View view = this.LJLIL.LJZL;
        if (view != null) {
            view.setVisibility(8);
        } else {
            o.LJIJI("ivCrossIcon");
            throw null;
        }
    }
}
