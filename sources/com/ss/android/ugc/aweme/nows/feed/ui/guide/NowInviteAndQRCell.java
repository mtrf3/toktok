package com.ss.android.ugc.aweme.nows.feed.ui.guide;

import X.C16880lQ;
import X.C188727au;
import X.C198677qx;
import X.C1DI;
import X.FMX;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class NowInviteAndQRCell extends PowerCell<C198677qx> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.fj1);
        o.LJIIIIZZ(findViewById, "itemView.layout_invite_friend");
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 11), findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.flk);
        o.LJIIIIZZ(findViewById2, "itemView.layout_share_qr_code");
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 12), findViewById2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C198677qx t) {
        o.LJIIIZ(t, "t");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "now_find_friends_page");
        c188727au.LJIIIZ("action_type", "show");
        FMX.LJIIL("qr_code_icon", c188727au.LIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.by2, viewGroup, false, "from(parent.context)\n   …yout_cell, parent, false)");
    }
}
