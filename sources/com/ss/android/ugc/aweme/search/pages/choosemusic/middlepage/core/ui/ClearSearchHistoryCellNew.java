package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C16880lQ;
import X.C1DI;
import X.K2R;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ClearSearchHistoryCellNew extends PowerCell<K2R> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(K2R t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        C16880lQ.LJJJJI((TuxTextView) this.itemView.findViewById(R.id.m2e), new ACListenerS24S0100000_4(this, 278));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cgn, viewGroup, false, "from(parent.context)\n   …story_new, parent, false)");
    }
}
