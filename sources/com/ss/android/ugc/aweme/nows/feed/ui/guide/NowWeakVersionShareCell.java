package com.ss.android.ugc.aweme.nows.feed.ui.guide;

import X.C16880lQ;
import X.C198717r1;
import X.C198727r2;
import X.C73411SrX;
import X.C7MY;
import X.EnumC86195XsF;
import X.MCQ;
import X.XKX;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class NowWeakVersionShareCell extends PowerCell<C198727r2> {
    public C73411SrX LJLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onDestroy() {
        super.onDestroy();
        C73411SrX c73411SrX = this.LJLIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.fnv);
        o.LJIIIIZZ(findViewById, "itemView.layout_weak_share_link");
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 13), findViewById);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C198727r2 c198727r2) {
        C198727r2 t = c198727r2;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C198717r1(this, t, new MCQ(C7MY.LIZIZ(28), 0, (Integer) null, 0, 0.0f, 0.0f, 0, 0, (Boolean) null, (EnumC86195XsF) null, false, 4094), null), 3);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(new ContextThemeWrapper(parent.getContext(), R.style.uw)), R.layout.bys, parent, false);
        o.LJIIIIZZ(LLLLIILL, "from(contextWrapper)\n   …ll_layout, parent, false)");
        return LLLLIILL;
    }
}
