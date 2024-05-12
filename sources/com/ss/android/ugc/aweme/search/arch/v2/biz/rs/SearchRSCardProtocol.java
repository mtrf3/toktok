package com.ss.android.ugc.aweme.search.arch.v2.biz.rs;

import X.AbstractC49300JWm;
import X.C3C8;
import X.C49301JWn;
import X.C49302JWo;
import X.C65352Pkq;
import X.C65776Prg;
import X.InterfaceC49025JLx;
import X.InterfaceC65350Pko;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchRSCardProtocol implements ISearchCardProtocol<SearchMixFeed> {
    public final C65776Prg LJLIL = C65352Pkq.LIZ(SearchMixFeed.class);
    public final C49302JWo LJLILLLLZI = new C49302JWo();

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem<? extends C3C8> k3() {
        return new SearchRSCardAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC65350Pko<SearchMixFeed> LLLIZZ() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final AbstractC49300JWm<SearchMixFeed> getConfig() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean LJJLIL(SearchMixFeed searchMixFeed) {
        SearchMixFeed item = searchMixFeed;
        o.LJIIIZ(item, "item");
        if (item.getFeedType() == 37) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC49025JLx LLLLLLJ(SearchMixFeed searchMixFeed) {
        return new C49301JWn(searchMixFeed);
    }
}
