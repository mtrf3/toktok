package com.ss.android.ugc.aweme.trending.ui.billboardpage.assem;

import X.C1DI;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public final class TrendingBillboardFooter extends PowerLoadingCell {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.ctq, viewGroup, false, "from(parent.context).inf…st_footer, parent, false)");
    }
}
