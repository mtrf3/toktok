package com.ss.android.ugc.aweme.search.ecommerce.core.ui;

import X.AbstractC49300JWm;
import X.C49592JdE;
import X.C65352Pkq;
import X.InterfaceC49025JLx;
import X.InterfaceC65350Pko;
import X.JXS;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ECStoreCardLiveProtocol implements ISearchCardProtocol<SearchMixFeed> {
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC65350Pko<SearchMixFeed> LLLIZZ() {
        return C65352Pkq.LIZ(SearchMixFeed.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final AbstractC49300JWm<SearchMixFeed> getConfig() {
        return new C49592JdE();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem k3() {
        return EcomSearchServiceImpl.LJJJJZI().LJJIIZI(true);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean LJJLIL(SearchMixFeed searchMixFeed) {
        EComShopCardStruct eComShopCardStruct;
        SearchMixFeed item = searchMixFeed;
        o.LJIIIZ(item, "item");
        if (item.getFeedType() == 94 && (eComShopCardStruct = item.shopCard) != null && eComShopCardStruct.liveEntity != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC49025JLx LLLLLLJ(SearchMixFeed searchMixFeed) {
        Aweme aweme;
        SearchMixFeed searchMixFeed2 = searchMixFeed;
        EComShopCardStruct eComShopCardStruct = searchMixFeed2.shopCard;
        if (eComShopCardStruct != null) {
            aweme = eComShopCardStruct.liveEntity;
        } else {
            aweme = null;
        }
        if (aweme == null) {
            aweme = new Aweme();
        }
        return new JXS(searchMixFeed2, aweme);
    }
}
