package com.ss.android.ugc.aweme.comment.adapter;

import X.C1DI;
import X.C77K;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public final class VideoViewerNoMoreLimitCell extends PowerCell<C77K> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.qe, viewGroup, false, "from(parent.context).inf…ore_limit, parent, false)");
    }
}
