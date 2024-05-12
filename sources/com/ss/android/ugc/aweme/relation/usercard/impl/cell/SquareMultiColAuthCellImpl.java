package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C110614Vt;
import X.C57834Mms;
import X.C57846Mn4;
import X.C61328O5c;
import X.C71313Ryn;
import X.C99W;
import X.C9AC;
import X.C9AE;
import android.view.View;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SquareMultiColAuthCellImpl extends AbsAuthCell<C57834Mms> {
    public final int LJLJL = R.layout.cn0;

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final boolean a0() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final int Y() {
        return this.LJLJL;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final void U(C57846Mn4 uiConfig) {
        int i;
        o.LJIIIZ(uiConfig, "uiConfig");
        super.U(uiConfig);
        if (uiConfig.LIZJ) {
            i = R.attr.d2;
        } else {
            i = R.attr.cv;
        }
        if (C99W.LIZ) {
            View view = this.itemView;
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(i);
            c110614Vt.LIZJ = Float.valueOf(BasePowerCell.N());
            C71313Ryn.LIZIZ(this.itemView, "itemView.context", c110614Vt, view);
        } else if (this.itemView.getBackground() == null) {
            View view2 = this.itemView;
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZIZ = Integer.valueOf(i);
            c110614Vt2.LIZJ = C61328O5c.LIZJ(2);
            C71313Ryn.LIZIZ(this.itemView, "itemView.context", c110614Vt2, view2);
        }
        C9AE.LIZ(this.itemView, C9AC.SCALE, 0.0f);
    }
}
