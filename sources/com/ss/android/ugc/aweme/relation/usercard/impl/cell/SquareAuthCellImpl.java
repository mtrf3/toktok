package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.AnonymousClass391;
import X.C110614Vt;
import X.C1FJ;
import X.C26338AVi;
import X.C27484AqW;
import X.C32151Nz;
import X.C57834Mms;
import X.C57846Mn4;
import X.C61328O5c;
import X.C71313Ryn;
import X.C99W;
import X.C9AC;
import X.C9AE;
import X.O6R;
import android.view.View;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SquareAuthCellImpl extends AbsAuthCell<C57834Mms> {
    public final int LJLJL = R.layout.cn3;

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
        o.LJIIIZ(uiConfig, "uiConfig");
        super.U(uiConfig);
        int i = uiConfig.LIZ;
        if (i != 100) {
            if (i == 103 || i == 104) {
                C27484AqW.LJII(V(), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(56))), null, 2);
                V().setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)));
                V().setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)));
                C27484AqW.LJI(X(), AnonymousClass391.LIZJ(90), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))));
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                C27484AqW.LJI(itemView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(144))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(169))));
            }
        } else {
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            C27484AqW.LJI(itemView2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(150))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(210))));
            C27484AqW.LJI(V(), C1FJ.LIZIZ(96), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(96))));
            V().setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(96)));
            V().setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(96)));
            C27484AqW.LJI(X(), AnonymousClass391.LIZJ(126), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))));
        }
        if (C99W.LIZ) {
            View view = this.itemView;
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cv);
            c110614Vt.LIZJ = Float.valueOf(BasePowerCell.N());
            C71313Ryn.LIZIZ(this.itemView, "itemView.context", c110614Vt, view);
        } else if (this.itemView.getBackground() == null) {
            View view2 = this.itemView;
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZIZ = Integer.valueOf(R.attr.cv);
            c110614Vt2.LIZJ = C61328O5c.LIZJ(2);
            C71313Ryn.LIZIZ(this.itemView, "itemView.context", c110614Vt2, view2);
        }
        if (uiConfig.LJIIJJI > 0) {
            View itemView3 = this.itemView;
            o.LJIIIIZZ(itemView3, "itemView");
            C26338AVi.LJI(itemView3, 0, null, Integer.valueOf(uiConfig.LJIIJJI), null, false, 26);
        }
        C9AE.LIZ(this.itemView, C9AC.SCALE, 0.0f);
    }
}
