package com.ss.android.ugc.aweme.tag;

import X.C16880lQ;
import X.C1DI;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7BO;
import X.C87048YEi;
import X.C87049YEj;
import X.C87050YEk;
import X.C87052YEm;
import X.C87055YEp;
import X.C87056YEq;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.YE1;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.tag.viewmodel.FeedTaggedListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FeedTaggedEditCell extends PowerCell<C7BO> {
    public final C214298b3 LJLIL;

    public FeedTaggedEditCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FeedTaggedListViewModel.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 651);
        C87052YEm c87052YEm = C87052YEm.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C87049YEj.INSTANCE, new AqS165S0100000_15(this, 652), new AqS165S0100000_15(this, 653), C87056YEq.INSTANCE, c87052YEm, new AqS165S0100000_15(this, 654), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C87050YEk.INSTANCE, new AqS165S0100000_15(this, 655), new AqS165S0100000_15(this, 646), C87055YEp.INSTANCE, c87052YEm, new AqS165S0100000_15(this, 647), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C87048YEi.INSTANCE, new AqS165S0100000_15(this, 648), new AqS165S0100000_15(this, 649), new AqS165S0100000_15(this, 650), c87052YEm, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 157), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bs9, viewGroup, false, "from(parent.context)\n   …edit_cell, parent, false)");
    }
}
