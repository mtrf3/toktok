package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C16880lQ;
import X.C1DI;
import X.K2E;
import X.K2Q;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ClearSearchHistoryCell extends PowerCell<K2Q> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(K2Q t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        C16880lQ.LJJJJI((TuxTextView) this.itemView.findViewById(R.id.m2e), K2E.LJLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cgm, viewGroup, false, "from(parent.context).inf…h_history, parent, false)");
    }
}
