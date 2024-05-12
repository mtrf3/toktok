package com.ss.android.ugc.aweme.offlinemode.ui.sheet;

import X.AEM;
import X.AI8;
import X.C16880lQ;
import X.C1DI;
import X.C25827ABr;
import X.SY4;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.cell.TuxCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DownloadButtonCell extends TuxCell<C25827ABr, AEM> {
    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell
    public final View L(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.byw, viewGroup, false, "from(parent.context).inf… parent, false,\n        )");
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C25827ABr t) {
        o.LJIIIZ(t, "t");
        ((AI8) this.itemView.findViewById(R.id.h_d)).LJ(t.LL, t.LJZL);
        SY4 sy4 = (SY4) this.itemView.findViewById(R.id.h_c);
        C16880lQ.LJJIZ(sy4, t.LLD);
        sy4.setText(t.LLF);
    }
}
