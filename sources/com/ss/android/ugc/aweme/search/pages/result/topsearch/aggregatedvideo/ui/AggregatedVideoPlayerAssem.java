package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.ui;

import X.C1JI;
import X.C32151Nz;
import X.C48881JGj;
import X.C49098JOs;
import X.C78939UyV;
import X.InterfaceC48993JKr;
import X.InterfaceC49000JKy;
import X.InterfaceC49014JLm;
import X.JQA;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AggregatedVideoPlayerAssem extends SearchCardVideoPlayerAssem {
    public AggregatedVideoPlayerAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem
    public final void n4() {
        InterfaceC48993JKr interfaceC48993JKr;
        SearchMixFeed LIZ;
        C48881JGj dataProvider;
        super.n4();
        InterfaceC49000JKy interfaceC49000JKy = this.LLFZ;
        Aweme aweme = null;
        if (!(interfaceC49000JKy instanceof InterfaceC49014JLm) || (interfaceC48993JKr = (InterfaceC48993JKr) interfaceC49000JKy) == null || (LIZ = interfaceC48993JKr.LIZ()) == null || (dataProvider = q4().getDataProvider()) == null) {
            return;
        }
        InterfaceC49000JKy interfaceC49000JKy2 = this.LLFZ;
        if (interfaceC49000JKy2 != null) {
            aweme = interfaceC49000JKy2.getAweme();
        }
        String valueOf = String.valueOf(C78939UyV.LIZJ(LIZ, aweme));
        o.LJIIIZ(valueOf, "<set-?>");
        dataProvider.LJJIFFI = valueOf;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem
    public final void m4(JQA jqa) {
        String str = jqa.LJJIJIIJI;
        if (str != null) {
            jqa.LJIILJJIL = str;
        }
        String tokenType = jqa.LJJIJ;
        o.LJIIIZ(tokenType, "tokenType");
        jqa.LJIJJLI = tokenType;
        String rank = String.valueOf(jqa.LJIIL);
        o.LJIIIZ(rank, "rank");
        jqa.LJIILIIL = rank;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C49098JOs.LIZ.getClass();
        Integer valueOf = Integer.valueOf(C49098JOs.LIZJ());
        if (valueOf.intValue() > 0) {
            C1JI.LJJIIZ(view, Float.valueOf(C32151Nz.LJIIZILJ(Integer.valueOf(valueOf.intValue()))), null, null, null, null, 30);
        }
    }
}
