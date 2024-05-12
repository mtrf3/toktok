package com.ss.android.ugc.aweme.music.v2.assem;

import X.AnonymousClass391;
import X.C16880lQ;
import X.C2068389v;
import X.C26338AVi;
import X.C32151Nz;
import X.C78897Uxp;
import X.C7MY;
import X.O6R;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public final class MusicLoadingBackBtnAssem extends DynamicAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setLayoutParams(new ViewGroup.MarginLayoutParams(C7MY.LIZIZ(40), C7MY.LIZIZ(40)));
        C26338AVi.LJI(tuxIconView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), AnonymousClass391.LIZJ(6), AnonymousClass391.LIZJ(8), AnonymousClass391.LIZJ(6), false, 16);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_left_ltr;
        c2068389v.LIZJ = C7MY.LIZIZ(24);
        c2068389v.LIZIZ = C7MY.LIZIZ(24);
        tuxIconView.setTuxIcon(c2068389v);
        C78897Uxp.LJJJJLI(tuxIconView, null);
        C16880lQ.LJJJ(tuxIconView, new ACListenerS23S0100000_3(this, 95));
        E3(tuxIconView);
        super.onCreateView();
    }
}
