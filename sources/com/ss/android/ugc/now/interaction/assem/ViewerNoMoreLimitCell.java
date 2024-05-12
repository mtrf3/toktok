package com.ss.android.ugc.now.interaction.assem;

import X.C1DI;
import X.C221108m2;
import X.C62822Ol8;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ViewerNoMoreLimitCell extends PowerCell<ViewerNoMoreLimitItem> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1406));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(ViewerNoMoreLimitItem t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        ((TextView) this.LJLIL.getValue()).setText(((View) this.LJLIL.getValue()).getContext().getString(R.string.j7k));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.qe, viewGroup, false, "from(parent.context).inf…ore_limit, parent, false)");
    }
}
