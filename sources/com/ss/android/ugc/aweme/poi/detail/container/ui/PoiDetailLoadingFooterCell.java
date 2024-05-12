package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C1DI;
import X.C221108m2;
import X.C223338pd;
import X.C32151Nz;
import X.C62822Ol8;
import X.O6R;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDetailLoadingFooterCell extends PowerLoadingCell {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 723));

    static {
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void M() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-loadingView>(...)");
        View view = (View) value;
        ((C223338pd) view.findViewById(R.id.chz)).LIZJ();
        view.setVisibility(8);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void P() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-loadingView>(...)");
        View view = (View) value;
        view.setVisibility(0);
        ((C223338pd) view.findViewById(R.id.chz)).LIZIZ();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N() {
        M();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bzy, viewGroup, false, "from(parent.context)\n   …r_loading, parent, false)");
    }
}
