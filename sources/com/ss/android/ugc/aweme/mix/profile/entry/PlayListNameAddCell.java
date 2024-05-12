package com.ss.android.ugc.aweme.mix.profile.entry;

import X.C16880lQ;
import X.C1DI;
import X.C99W;
import X.MGG;
import X.SY4;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PlayListNameAddCell extends PowerCell<MGG> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(MGG t) {
        SY4 sy4;
        o.LJIIIZ(t, "t");
        View view = this.itemView;
        if ((view instanceof SY4) && (sy4 = (SY4) view) != null) {
            sy4.setIconTintColor(sy4.getResources().getColor(R.color.ck));
            if (C99W.LIZ) {
                sy4.setButtonVariant(5);
            }
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(sy4, 2), this.itemView);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.c5o, viewGroup, false, "from(parent.context).inf…entry_add, parent, false)");
    }
}
