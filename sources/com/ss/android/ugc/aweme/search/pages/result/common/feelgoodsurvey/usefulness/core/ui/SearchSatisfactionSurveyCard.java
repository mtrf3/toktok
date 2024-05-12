package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.usefulness.core.ui;

import X.AbstractC49300JWm;
import X.C3C8;
import X.C49912JiO;
import X.C50352JpU;
import X.C65352Pkq;
import X.C65776Prg;
import X.InterfaceC49025JLx;
import X.InterfaceC65350Pko;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchSatisfactionSurveyCard implements ISearchCardProtocol<C50352JpU> {
    public final C65776Prg LJLIL = C65352Pkq.LIZ(C50352JpU.class);
    public final C49912JiO LJLILLLLZI = new C49912JiO();

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem<? extends C3C8> k3() {
        return new SearchSatisfactionSurveyAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC65350Pko<C50352JpU> LLLIZZ() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final AbstractC49300JWm<C50352JpU> getConfig() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean LJJLIL(C50352JpU item) {
        o.LJIIIZ(item, "item");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC49025JLx LLLLLLJ(C50352JpU c50352JpU) {
        return c50352JpU;
    }
}
