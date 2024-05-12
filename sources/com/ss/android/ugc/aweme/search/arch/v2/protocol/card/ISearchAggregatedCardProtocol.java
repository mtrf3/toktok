package com.ss.android.ugc.aweme.search.arch.v2.protocol.card;

import X.C3C8;
import X.InterfaceC57784Mm4;
import X.JW6;
import X.JXJ;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* loaded from: classes9.dex */
public interface ISearchAggregatedCardProtocol extends ISearchCardProtocol<SearchMixFeed> {
    JXJ LLLLLIL();

    Class<? extends SearchAggregatedSubCardAssem<? extends ReusedUISlotAssem<? extends C3C8>, ? extends InterfaceC57784Mm4>> P();

    List<InterfaceC57784Mm4> w2(JW6 jw6);
}
