package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS160S0100000_10;

/* loaded from: classes11.dex */
public final class N6X extends N6P {
    public final ViewGroup LJLJJI;
    public ViewGroup LJLJJL;

    @Override // X.N6P
    public final void LIZ() {
        ArrayList arrayList = (ArrayList) this.LJLILLLLZI;
        arrayList.add(new N6Y(this.LJLIL));
        arrayList.add(new N6T(this.LJLIL));
        arrayList.add(new C58817N6n(this.LJLIL));
        arrayList.add(new N6Z(this.LJLIL));
        arrayList.add(new C58816N6m(this.LJLIL));
        arrayList.add(new C58818N6o(this.LJLIL));
    }

    @Override // X.N6P
    public final void LIZIZ() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.LJLJJI;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            viewGroup2.setVisibility(8);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" param.slotView = ");
            LIZ.append(this.LJLIL.LIZIZ);
            N8M.LIZ(X1D.LIZIZ(LIZ));
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup2.getContext()), R.layout.ceu, viewGroup2, true);
            if (LLLLIILL instanceof ViewGroup) {
                viewGroup = (ViewGroup) LLLLIILL;
            } else {
                viewGroup = null;
            }
            this.LJLJJL = viewGroup;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("inflate bottom componentGroupView = ");
            LIZ2.append(this.LJLJJL);
            N8M.LIZ(X1D.LIZIZ(LIZ2));
        }
    }

    @Override // X.N6P, X.JK9
    public final void LLLLZI() {
        super.LLLLZI();
        N6K n6k = this.LJLIL.LIZLLL;
        if (n6k != null) {
            n6k.LIZLLL(N6F.MASK_SHOW, new AqS160S0100000_10(this, 605));
        }
        N6K n6k2 = this.LJLIL.LIZLLL;
        if (n6k2 != null) {
            n6k2.LIZLLL(N6F.MASK_HIDE, new AqS160S0100000_10(this, 606));
        }
    }

    public N6X(C58809N6f c58809N6f) {
        super(c58809N6f);
        this.LJLJJI = c58809N6f.LIZIZ;
    }
}
