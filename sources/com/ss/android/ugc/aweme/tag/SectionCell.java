package com.ss.android.ugc.aweme.tag;

import X.C1DI;
import X.C91753it;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SectionCell extends PowerCell<C91753it> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C91753it c91753it) {
        C91753it textItem = c91753it;
        o.LJIIIZ(textItem, "textItem");
        ((TextView) this.itemView.findViewById(R.id.jjt)).setText(textItem.LJLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bsc, viewGroup, false, "from(parent.context)\n   …ion_label, parent, false)");
    }
}
