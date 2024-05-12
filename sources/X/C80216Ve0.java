package X;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.Ve0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80216Ve0 implements VTX {
    public final /* synthetic */ C80221Ve5 LIZ;

    public C80216Ve0(C80221Ve5 c80221Ve5) {
        this.LIZ = c80221Ve5;
    }

    @Override // X.VTY
    public final void LIZ(C80217Ve1 c80217Ve1, int i) {
        int i2;
        C80221Ve5 c80221Ve5 = this.LIZ;
        c80221Ve5.LLD = i;
        C16800lI c16800lI = c80221Ve5.LLF;
        if (c16800lI != null) {
            i2 = c16800lI.LJ();
        } else {
            i2 = 0;
        }
        int childCount = this.LIZ.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.LIZ.getChildAt(i3);
            C79856VVs c79856VVs = (C79856VVs) childAt.getLayoutParams();
            C80215Vdz LIZIZ = C80221Ve5.LIZIZ(childAt);
            int i4 = c79856VVs.LIZ;
            if (i4 != 1) {
                if (i4 == 2) {
                    LIZIZ.LIZIZ(Math.round((-i) * c79856VVs.LIZIZ));
                }
            } else {
                C80221Ve5 c80221Ve52 = this.LIZ;
                c80221Ve52.getClass();
                LIZIZ.LIZIZ(C78609UtB.LJJIIZ(-i, 0, ((c80221Ve52.getHeight() - C80221Ve5.LIZIZ(childAt).LIZIZ) - childAt.getHeight()) - ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin));
            }
        }
        this.LIZ.LIZLLL();
        C80221Ve5 c80221Ve53 = this.LIZ;
        if (c80221Ve53.LJLLLL != null && i2 > 0) {
            C16300kU.LJIIJ(c80221Ve53);
        }
        this.LIZ.LJLLI.LJIILIIL(Math.abs(i) / ((this.LIZ.getHeight() - C16300kU.LIZLLL(this.LIZ)) - i2));
    }
}
