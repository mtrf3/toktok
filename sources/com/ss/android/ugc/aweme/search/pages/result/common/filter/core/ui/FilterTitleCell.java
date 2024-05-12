package com.ss.android.ugc.aweme.search.pages.result.common.filter.core.ui;

import X.C1DI;
import X.C35513Dwj;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FilterTitleCell extends PowerCell<C35513Dwj> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C35513Dwj c35513Dwj) {
        C35513Dwj t = c35513Dwj;
        o.LJIIIZ(t, "t");
        View findViewById = this.itemView.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.title)");
        super.onBindItemView(t);
        ((TextView) findViewById).setText(t.LJLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cjc, viewGroup, false, "from(parent.context).inf…ser_title, parent, false)");
    }
}
