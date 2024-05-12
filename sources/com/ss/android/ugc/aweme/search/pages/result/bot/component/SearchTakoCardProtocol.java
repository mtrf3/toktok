package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.AbstractC49300JWm;
import X.C00F;
import X.C32I;
import X.C3C8;
import X.C49024JLw;
import X.C61878OQg;
import X.C65352Pkq;
import X.InterfaceC48979JKd;
import X.InterfaceC48995JKt;
import X.InterfaceC49025JLx;
import X.InterfaceC57784Mm4;
import X.InterfaceC65350Pko;
import X.JW6;
import X.JXJ;
import X.JXL;
import X.JXM;
import X.JXN;
import X.JXR;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchTakoCardProtocol implements ISearchAggregatedCardProtocol, InterfaceC48995JKt {
    public final JXL LJLIL = new JXL();
    public final JXR LJLILLLLZI = new JXR();

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol
    public final Class<? extends SearchAggregatedSubCardAssem<? extends ReusedUISlotAssem<? extends C3C8>, ? extends InterfaceC57784Mm4>> P() {
        return SearchTakoSubCardAssem.class;
    }

    @Override // X.InterfaceC48995JKt
    public final InterfaceC48979JKd LIZ() {
        return new JXM();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC65350Pko<SearchMixFeed> LLLIZZ() {
        return C65352Pkq.LIZ(SearchMixFeed.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem k3() {
        return new SearchTakoCardAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol
    public final /* bridge */ /* synthetic */ JXJ LLLLLIL() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final AbstractC49300JWm<SearchMixFeed> getConfig() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean LJJLIL(SearchMixFeed searchMixFeed) {
        SearchMixFeed item = searchMixFeed;
        o.LJIIIZ(item, "item");
        if (C00F.LIZ(31744, 0, "search_bot_card_opt", true) != 1 || !item.LJIIJ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC49025JLx LLLLLLJ(SearchMixFeed searchMixFeed) {
        return new JXN(searchMixFeed);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol
    public final List<InterfaceC57784Mm4> w2(JW6 item) {
        List<Aweme> awemeList;
        o.LJIIIZ(item, "item");
        TakoInfo takoInfo = item.LIZ().bot;
        if (takoInfo != null && (awemeList = takoInfo.getAwemeList()) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(awemeList, 10));
            Iterator<Aweme> it = awemeList.iterator();
            while (it.hasNext()) {
                arrayList.add(new C49024JLw(item.LIZ(), it.next()));
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }
}
