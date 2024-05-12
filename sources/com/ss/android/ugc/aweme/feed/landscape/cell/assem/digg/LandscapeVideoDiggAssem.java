package com.ss.android.ugc.aweme.feed.landscape.cell.assem.digg;

import X.C200647u8;
import X.C208088Eq;
import X.C26338AVi;
import X.C32151Nz;
import X.O6R;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeVideoDiggAssem extends VideoDiggAssem {
    @Override // com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem
    public final void D4() {
    }

    public LandscapeVideoDiggAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        if (C208088Eq.LIZIZ()) {
            return R.layout.bh8;
        }
        if (C208088Eq.LIZJ()) {
            return R.layout.bhf;
        }
        return R.layout.bhn;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem
    public final void C4(C200647u8 c200647u8) {
        String str;
        super.C4(c200647u8);
        if (C208088Eq.LIZJ()) {
            Y3().findViewById(R.id.c_u).setVisibility(0);
            TextView textView = (TextView) Y3().findViewById(R.id.c_u);
            if (c200647u8 == null || (str = c200647u8.LIZ) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            textView.setText(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (C208088Eq.LIZIZ()) {
            View findViewById = Y3().findViewById(R.id.c_r);
            o.LJIIIIZZ(findViewById, "contentView.digg");
            g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(30)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(30)), findViewById);
            View findViewById2 = Y3().findViewById(R.id.c_t);
            o.LJIIIIZZ(findViewById2, "contentView.digg_container");
            g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(30)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(30)), findViewById2);
            ((TuxTextView) Y3().findViewById(R.id.c_u)).setTuxFont(72);
            View findViewById3 = Y3().findViewById(R.id.c_u);
            o.LJIIIIZZ(findViewById3, "contentView.digg_count");
            C26338AVi.LJI(findViewById3, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, null, false, 29);
        }
    }
}
