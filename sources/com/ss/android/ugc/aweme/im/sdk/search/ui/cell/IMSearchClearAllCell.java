package com.ss.android.ugc.aweme.im.sdk.search.ui.cell;

import X.C16880lQ;
import X.C1DI;
import X.C214298b3;
import X.C33K;
import X.C65352Pkq;
import X.C65776Prg;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.YE1;
import X.YET;
import X.YEU;
import X.YEV;
import X.YEW;
import X.YEX;
import X.YEY;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class IMSearchClearAllCell extends PowerCell<C33K> {
    public final C214298b3 LJLIL;

    public IMSearchClearAllCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(IMSearchDefaultVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 412);
        YEW yew = YEW.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, YEU.INSTANCE, new AqS165S0100000_15(this, 413), new AqS165S0100000_15(this, 414), YEY.INSTANCE, yew, new AqS165S0100000_15(this, 415), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, YEV.INSTANCE, new AqS165S0100000_15(this, 416), new AqS165S0100000_15(this, 407), YEX.INSTANCE, yew, new AqS165S0100000_15(this, 408), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, YET.INSTANCE, new AqS165S0100000_15(this, 409), new AqS165S0100000_15(this, 410), new AqS165S0100000_15(this, 411), yew, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C33K t) {
        o.LJIIIZ(t, "t");
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 141), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b5j, viewGroup, false, "from(parent.context).inf…clear_all, parent, false)");
    }
}
