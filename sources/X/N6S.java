package X;

import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class N6S extends N6P {
    public final ViewGroup LJLJJI;

    @Override // X.N6P
    public final void LIZ() {
        ((ArrayList) this.LJLILLLLZI).add(new C58810N6g(this.LJLIL));
    }

    @Override // X.N6P
    public final void LIZIZ() {
        ViewGroup viewGroup = this.LJLJJI;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(8);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" param.slotView = ");
            LIZ.append(this.LJLIL.LIZIZ);
            N8M.LIZ(X1D.LIZIZ(LIZ));
        }
    }

    public N6S(C58809N6f c58809N6f) {
        super(c58809N6f);
        this.LJLJJI = c58809N6f.LIZIZ;
    }
}
