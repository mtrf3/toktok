package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import X.C1DI;
import X.C91733ir;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IndexCell extends PowerCell<C91733ir> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C91733ir c91733ir) {
        C91733ir textItem = c91733ir;
        o.LJIIIZ(textItem, "textItem");
        ((TextView) this.itemView.findViewById(R.id.el0)).setText(textItem.LJLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b3a, viewGroup, false, "from(parent.context)\n   …index_bar, parent, false)");
    }
}
