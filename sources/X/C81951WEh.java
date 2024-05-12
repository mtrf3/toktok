package X;

import Y.IDiS275S0100000_14;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;

/* renamed from: X.WEh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81951WEh {
    public View LIZ;
    public InterfaceC81963WEt LIZIZ;
    public TuxTextView LIZJ;
    public C80766Vms LIZLLL;
    public final IDiS275S0100000_14 LJ = new IDiS275S0100000_14(this, 8);

    public final void LIZ(C80841Vo5 c80841Vo5) {
        if (c80841Vo5 != null && c80841Vo5.getAdapter() != null) {
            this.LIZLLL = c80841Vo5;
            c80841Vo5.LJJIIJ(this.LJ);
            this.LIZLLL.LJFF(this.LJ);
            this.LJ.onPageSelected(this.LIZLLL.getCurrentItem());
        }
        View view = this.LIZ;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
