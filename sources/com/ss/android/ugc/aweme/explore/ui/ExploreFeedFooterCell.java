package com.ss.android.ugc.aweme.explore.ui;

import X.AnonymousClass835;
import X.C16880lQ;
import X.C16950lX;
import X.C1BZ;
import X.C1DG;
import X.C1FL;
import X.C223338pd;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ExploreFeedFooterCell extends PowerLoadingCell {
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
        C16880lQ.LJJJJI((TuxTextView) view.findViewById(R.id.m77), new ACListenerS23S0100000_3(this, 43));
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
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        o.LJIIIIZZ(layoutParams, "itemView.layoutParams");
        if (layoutParams instanceof C1BZ) {
            ((C1BZ) layoutParams).LJLILLLLZI = true;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        if (AnonymousClass835.LIZ) {
            View LIZ = C16950lX.LIZ(parent.getContext(), R.layout.aun, parent, false, -1);
            o.LJIIIIZZ(LIZ, "getView(parent.context, …r_loading, parent, false)");
            return LIZ;
        }
        return C1FL.LIZIZ(parent, R.layout.aun, parent, false, "from(parent.context)\n   …r_loading, parent, false)");
    }
}
