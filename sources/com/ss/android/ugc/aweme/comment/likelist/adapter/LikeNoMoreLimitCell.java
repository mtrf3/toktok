package com.ss.android.ugc.aweme.comment.likelist.adapter;

import X.AnonymousClass796;
import X.C1DI;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* loaded from: classes2.dex */
public final class LikeNoMoreLimitCell extends PowerCell<AnonymousClass796> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.qb, viewGroup, false, "from(parent.context)\n   …ore_limit, parent, false)");
    }
}
