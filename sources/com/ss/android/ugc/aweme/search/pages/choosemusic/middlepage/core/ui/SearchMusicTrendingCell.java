package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C16880lQ;
import X.C1DI;
import X.K2N;
import Y.ACListenerS28S0100000_8;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchMusicTrendingCell extends PowerCell<K2N> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(K2N k2n) {
        int i;
        K2N t = k2n;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        ((TextView) this.itemView.findViewById(R.id.njt)).setText(t.LJLIL.getShowWord());
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.cf5);
        int i2 = t.LJLILLLLZI;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    i = R.drawable.c2m;
                } else {
                    i = R.drawable.c2p;
                }
            } else {
                i = R.drawable.c2n;
            }
        } else {
            i = R.drawable.c2o;
        }
        tuxIconView.setIconRes(i);
        C16880lQ.LJIL((ConstraintLayout) this.itemView.findViewById(R.id.lkp), new ACListenerS28S0100000_8(t, 77));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cgx, viewGroup, false, "from(parent.context)\n   …ding_list, parent, false)");
    }
}
