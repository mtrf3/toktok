package com.ss.android.ugc.aweme.relation.ffp.ui.search;

import X.C227258vx;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SearchTitleCell extends PowerCell<C227258vx> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ayh;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C227258vx c227258vx) {
        C227258vx item = c227258vx;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        ((TextView) this.itemView.findViewById(R.id.l9r)).setText(item.LJLIL.getTextRes());
    }
}
