package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.C1JI;
import X.C32151Nz;
import X.C49098JOs;
import X.InterfaceC48993JKr;
import X.InterfaceC49000JKy;
import X.InterfaceC49014JLm;
import X.JQA;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TakoVideoPlayerAssem extends SearchCardVideoPlayerAssem {
    public TakoVideoPlayerAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem
    public final void m4(JQA jqa) {
        String str;
        InterfaceC48993JKr interfaceC48993JKr;
        SearchMixFeed LIZ;
        InterfaceC49000JKy interfaceC49000JKy = this.LLFZ;
        if (!(interfaceC49000JKy instanceof InterfaceC49014JLm) || (interfaceC48993JKr = (InterfaceC48993JKr) interfaceC49000JKy) == null || (LIZ = interfaceC48993JKr.LIZ()) == null || (str = LIZ.providerDocIdStr) == null) {
            str = "";
        }
        jqa.LJIILJJIL = str;
        jqa.LJIJJLI = "tikbot";
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
