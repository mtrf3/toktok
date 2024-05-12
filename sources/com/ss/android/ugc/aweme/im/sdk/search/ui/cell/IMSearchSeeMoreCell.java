package com.ss.android.ugc.aweme.im.sdk.search.ui.cell;

import X.C16880lQ;
import X.C1DI;
import X.C214298b3;
import X.C33L;
import X.C65352Pkq;
import X.C65776Prg;
import X.C87040YEa;
import X.C87041YEb;
import X.C87042YEc;
import X.C87043YEd;
import X.C87044YEe;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.YE1;
import X.YEZ;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class IMSearchSeeMoreCell extends PowerCell<C33L> {
    public final C214298b3 LJLIL;

    public IMSearchSeeMoreCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(IMSearchDefaultVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 442);
        C87042YEc c87042YEc = C87042YEc.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C87040YEa.INSTANCE, new AqS165S0100000_15(this, 443), new AqS165S0100000_15(this, 444), C87044YEe.INSTANCE, c87042YEc, new AqS165S0100000_15(this, 445), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C87041YEb.INSTANCE, new AqS165S0100000_15(this, 446), new AqS165S0100000_15(this, 437), C87043YEd.INSTANCE, c87042YEc, new AqS165S0100000_15(this, 438), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, YEZ.INSTANCE, new AqS165S0100000_15(this, 439), new AqS165S0100000_15(this, 440), new AqS165S0100000_15(this, 441), c87042YEc, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C33L t) {
        o.LJIIIZ(t, "t");
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 142), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b5n, viewGroup, false, "from(parent.context).inf…_see_more, parent, false)");
    }
}
