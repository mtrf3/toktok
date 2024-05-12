package com.ss.android.ugc.aweme.search.ecommerce.core.ui;

import X.C06490Nh;
import X.C16880lQ;
import X.C49467JbD;
import Y.ACListenerS28S0100000_8;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public final class ProductSeeAllCell extends PowerCell<C49467JbD> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.chc, viewGroup, false);
        C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 22), LIZIZ);
        return LIZIZ;
    }
}
