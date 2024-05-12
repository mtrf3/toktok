package com.ss.android.ugc.aweme.feed.landscape.cell.assem.favorite;

import X.C200647u8;
import X.C208088Eq;
import X.C26338AVi;
import X.C32151Nz;
import X.O6R;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeVideoFavoriteAssem extends VideoFavoriteAssem {
    @Override // com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem
    public final void z4() {
    }

    public LandscapeVideoFavoriteAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        if (C208088Eq.LIZIZ()) {
            return R.layout.bh9;
        }
        if (C208088Eq.LIZJ()) {
            return R.layout.bhg;
        }
        return R.layout.bho;
    }

    @Override // com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (C208088Eq.LIZIZ()) {
            View findViewById = Y3().findViewById(R.id.d56);
            o.LJIIIIZZ(findViewById, "contentView.favorite");
            g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(30)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(30)), findViewById);
            View findViewById2 = Y3().findViewById(R.id.d59);
            o.LJIIIIZZ(findViewById2, "contentView.favorite_container");
            g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(30)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(30)), findViewById2);
            ((TuxTextView) Y3().findViewById(R.id.d5_)).setTuxFont(72);
            View findViewById3 = Y3().findViewById(R.id.d5_);
            o.LJIIIIZZ(findViewById3, "contentView.favorite_count");
            C26338AVi.LJI(findViewById3, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, null, false, 29);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem
    public final void u4(C200647u8 c200647u8) {
        super.u4(c200647u8);
        if (c200647u8 != null && !c200647u8.LIZJ) {
            getContainerView().setVisibility(8);
        }
    }
}
