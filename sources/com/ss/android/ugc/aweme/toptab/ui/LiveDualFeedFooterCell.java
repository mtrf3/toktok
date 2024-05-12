package com.ss.android.ugc.aweme.toptab.ui;

import X.C16880lQ;
import X.C1DG;
import X.C1DI;
import X.C223338pd;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public final class LiveDualFeedFooterCell extends PowerLoadingCell {
    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void M() {
        View view = this.itemView;
        ((C223338pd) view.findViewById(R.id.chz)).LIZJ();
        ((C223338pd) view.findViewById(R.id.chz)).setVisibility(8);
        view.findViewById(R.id.m77).setVisibility(0);
        C16880lQ.LJJJJI((TuxTextView) view.findViewById(R.id.m77), null);
        C1DG.LJI(view, R.string.hvf, (TuxTextView) view.findViewById(R.id.m77));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N() {
        View view = this.itemView;
        ((C223338pd) view.findViewById(R.id.chz)).LIZJ();
        ((C223338pd) view.findViewById(R.id.chz)).setVisibility(8);
        view.findViewById(R.id.m77).setVisibility(0);
        C16880lQ.LJJJJI((TuxTextView) view.findViewById(R.id.m77), new ACListenerS23S0100000_3(this, 166));
        C1DG.LJI(view, R.string.hve, (TuxTextView) view.findViewById(R.id.m77));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void P() {
        View view = this.itemView;
        view.findViewById(R.id.m77).setVisibility(8);
        ((C223338pd) view.findViewById(R.id.chz)).setVisibility(0);
        ((C223338pd) view.findViewById(R.id.chz)).LIZIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bqw, viewGroup, false, "from(parent.context).inf…r_loading, parent, false)");
    }
}
