package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.ui;

import X.C49098JOs;
import X.C54840Lfg;
import X.C78847Ux1;
import X.JKY;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AggregatedVideoBottomAssem extends SearchCardBottomBarAssem {
    public AggregatedVideoBottomAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem
    public final JKY n4() {
        return JKY.NONE;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C49098JOs.LIZ.getClass();
        Integer num = 0;
        if (num.intValue() > 0) {
            num.intValue();
            View findViewById = view.findViewById(R.id.c7d);
            if (findViewById != null) {
                C54840Lfg.LJLIIL((int) C78847Ux1.LJJIFFI(4), findViewById);
            }
        }
    }
}
