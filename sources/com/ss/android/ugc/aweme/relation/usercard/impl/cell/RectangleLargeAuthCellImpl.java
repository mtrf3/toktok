package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C57834Mms;
import X.C57846Mn4;
import X.C78897Uxp;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RectangleLargeAuthCellImpl extends AbsAuthCell<C57834Mms> {
    public final int LJLJL = R.layout.cn1;

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final boolean a0() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final int Y() {
        return this.LJLJL;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final void U(C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        super.U(uiConfig);
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
