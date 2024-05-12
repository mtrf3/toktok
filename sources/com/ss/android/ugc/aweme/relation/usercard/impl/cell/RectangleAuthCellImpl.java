package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C1FJ;
import X.C26338AVi;
import X.C27484AqW;
import X.C32151Nz;
import X.C57834Mms;
import X.C57846Mn4;
import X.C78897Uxp;
import X.O6R;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RectangleAuthCellImpl extends AbsAuthCell<C57834Mms> {
    public final int LJLJL = R.layout.cn2;

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
            if (i == 101) {
                C27484AqW.LJI(V(), C1FJ.LIZIZ(56), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(56))));
            }
        } else {
            V().setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
            V().setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
            C27484AqW.LJI(V(), C1FJ.LIZIZ(48), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48))));
        }
        if (uiConfig.LJIIJJI > 0) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26338AVi.LJIIIZ(itemView, null, Integer.valueOf(uiConfig.LJIIJJI), null, Integer.valueOf(uiConfig.LJIIJJI), 21);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final void c0(C57834Mms item) {
        o.LJIIIZ(item, "item");
        super.c0(item);
        if (!item.LJLILLLLZI.LJIJI) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78897Uxp.LJJJJJ(itemView, 0);
        }
    }
}
