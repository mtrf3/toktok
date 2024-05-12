package com.bytedance.ies.powerlist.header;

import X.C16880lQ;
import X.C1DI;
import X.C76800UCe;
import X.SIU;
import X.SIV;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FixedViewCell extends PowerCell<SIU> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(SIU siu) {
        ViewGroup viewGroup;
        SIU t = siu;
        o.LJIIIZ(t, "t");
        View view = t.LJLIL;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            if (!o.LJ(viewGroup, this.itemView.findViewById(R.id.j71))) {
                C16880lQ.LJLLL(view, viewGroup);
                if (SIV.LIZ) {
                    ((ViewGroup) this.itemView.findViewById(R.id.j71)).addView(view);
                }
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        ((ViewGroup) this.itemView.findViewById(R.id.j71)).addView(view);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.c2g, viewGroup, false, "from(parent.context)\n   …ixed_cell, parent, false)");
    }
}
