package com.ss.android.ugc.aweme.mention.ui.page;

import X.C1DI;
import X.C223338pd;
import X.C32151Nz;
import X.O6R;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class HorizontalMentionLoadingFooter extends PowerLoadingCell {
    public static final int LJLIL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(52));

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void M() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJIIIIZZ(layoutParams, "layoutParams");
        layoutParams.width = 0;
        view.setLayoutParams(layoutParams);
        ((C223338pd) view.findViewById(R.id.chz)).LIZJ();
        view.setVisibility(8);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void P() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJIIIIZZ(layoutParams, "layoutParams");
        layoutParams.width = LJLIL;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        ((C223338pd) view.findViewById(R.id.chz)).LIZIZ();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N() {
        M();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bs5, viewGroup, false, "from(parent.context)\n   …     false,\n            )");
    }
}
