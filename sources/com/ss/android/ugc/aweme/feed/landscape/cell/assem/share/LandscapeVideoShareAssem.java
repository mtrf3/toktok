package com.ss.android.ugc.aweme.feed.landscape.cell.assem.share;

import X.C2068389v;
import X.C208088Eq;
import X.C26338AVi;
import X.C32151Nz;
import X.C79045V0n;
import X.C7MY;
import X.O6R;
import X.VA9;
import X.W5G;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeVideoShareAssem extends VideoShareAssem {
    @Override // com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem
    public final void C4() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem
    public final void q4() {
    }

    public LandscapeVideoShareAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem
    public final void D4() {
        if (C208088Eq.LIZLLL()) {
            VA9 va9 = (VA9) Y3().findViewById(R.id.jtf);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_ellipsis_vertical;
            c2068389v.LIZIZ = C7MY.LIZIZ(24);
            c2068389v.LIZJ = C7MY.LIZIZ(24);
            Context context = Y3().getContext();
            o.LJIIIIZZ(context, "contentView.context");
            c2068389v.LIZLLL = C79045V0n.LJI(R.attr.dj, context);
            Context context2 = Y3().getContext();
            o.LJIIIIZZ(context2, "contentView.context");
            va9.setImageDrawable(c2068389v.LIZ(context2));
        } else {
            ((W5G) Y3().findViewById(R.id.jtf)).setImageResource(R.drawable.bo6);
        }
        if (C208088Eq.LIZIZ()) {
            View findViewById = Y3().findViewById(R.id.jtf);
            o.LJIIIIZZ(findViewById, "contentView.share_iv");
            g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(30)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(30)), findViewById);
            ((TuxTextView) Y3().findViewById(R.id.jt6)).setTuxFont(72);
            View findViewById2 = Y3().findViewById(R.id.jt6);
            o.LJIIIIZZ(findViewById2, "contentView.share_count");
            C26338AVi.LJI(findViewById2, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, null, false, 29);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        if (C208088Eq.LIZIZ()) {
            return R.layout.bh_;
        }
        if (C208088Eq.LIZJ()) {
            return R.layout.bhh;
        }
        return R.layout.bhp;
    }
}
