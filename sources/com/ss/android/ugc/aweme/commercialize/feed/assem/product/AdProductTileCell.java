package com.ss.android.ugc.aweme.commercialize.feed.assem.product;

import X.C16880lQ;
import X.C1DI;
import X.C42058Gf0;
import X.S5L;
import X.S5M;
import X.W5F;
import X.W5U;
import Y.ACListenerS46S0200000_12;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AdProductTileCell extends PowerCell<S5M> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(S5M s5m) {
        S5M t = s5m;
        o.LJIIIZ(t, "t");
        String imageUrl = t.LJLIL.getImageUrl();
        if (TextUtils.isEmpty(imageUrl)) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS46S0200000_12(this, t, 44), this.itemView);
        this.itemView.setOutlineProvider(new C42058Gf0(this));
        this.itemView.setClipToOutline(true);
        long currentTimeMillis = System.currentTimeMillis();
        W5F LJIIIIZZ = W5U.LJIIIIZZ(imageUrl);
        LJIIIIZZ.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.tp);
        LJIIIIZZ.LIZLLL(new S5L(t, currentTimeMillis));
        if (t.LJLJI) {
            this.itemView.findViewById(R.id.to).setVisibility(0);
        } else {
            this.itemView.findViewById(R.id.to).setVisibility(8);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.a_j, viewGroup, false, "from(parent.context).inf…tile_cell, parent, false)");
    }
}
