package com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.protocol;

import X.AbstractC49300JWm;
import X.C49013JLl;
import X.C65352Pkq;
import X.InterfaceC49025JLx;
import X.InterfaceC65350Pko;
import X.JMF;
import X.JMH;
import X.JWT;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchSingleCardTemplateServiceImpl;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchMixLiveCardProtocol implements ISearchCardProtocol<SearchMixFeed> {
    public final JWT LJLIL = new JWT();

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC65350Pko<SearchMixFeed> LLLIZZ() {
        return C65352Pkq.LIZ(SearchMixFeed.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem k3() {
        JMF init = JMF.LJLIL;
        o.LJIIIZ(init, "init");
        JMH<C49013JLl> jmh = new JMH<>();
        init.invoke(jmh);
        return SearchSingleCardTemplateServiceImpl.LIZJ().LIZIZ(jmh);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final AbstractC49300JWm<SearchMixFeed> getConfig() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean LJJLIL(SearchMixFeed searchMixFeed) {
        SingleLive singleLive;
        SearchMixFeed item = searchMixFeed;
        o.LJIIIZ(item, "item");
        if (item.getFeedType() == 62 && (singleLive = item.singleLive) != null && singleLive.aweme != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC49025JLx LLLLLLJ(SearchMixFeed searchMixFeed) {
        Aweme aweme;
        SearchMixFeed searchMixFeed2 = searchMixFeed;
        SingleLive singleLive = searchMixFeed2.singleLive;
        if (singleLive != null && (aweme = singleLive.aweme) != null) {
            return new C49013JLl(searchMixFeed2, aweme);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
