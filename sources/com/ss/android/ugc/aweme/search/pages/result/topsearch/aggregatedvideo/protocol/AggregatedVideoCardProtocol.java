package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.protocol;

import X.AbstractC49300JWm;
import X.C32I;
import X.C3C8;
import X.C49023JLv;
import X.C61878OQg;
import X.C65352Pkq;
import X.InterfaceC48979JKd;
import X.InterfaceC48995JKt;
import X.InterfaceC49025JLx;
import X.InterfaceC57784Mm4;
import X.InterfaceC65350Pko;
import X.JW5;
import X.JW6;
import X.JXD;
import X.JXE;
import X.JXG;
import X.JXJ;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.ui.AggregatedVideoCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.ui.AggregatedVideoSubCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AggregatedVideoCardProtocol implements ISearchAggregatedCardProtocol, InterfaceC48995JKt {
    public final JXD LJLIL = new JXD();
    public final JXG LJLILLLLZI = new JXG();

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol
    public final Class<? extends SearchAggregatedSubCardAssem<? extends ReusedUISlotAssem<? extends C3C8>, ? extends InterfaceC57784Mm4>> P() {
        return AggregatedVideoSubCardAssem.class;
    }

    @Override // X.InterfaceC48995JKt
    public final InterfaceC48979JKd LIZ() {
        return new JXE();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC65350Pko<SearchMixFeed> LLLIZZ() {
        return C65352Pkq.LIZ(SearchMixFeed.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem k3() {
        return new AggregatedVideoCardAssem();
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
        AggregatedVideo aggregatedVideo;
        List<Aweme> list;
        SearchMixFeed item = searchMixFeed;
        o.LJIIIZ(item, "item");
        if (!item.LJII() || (aggregatedVideo = item.aggregatedVideo) == null || (list = aggregatedVideo.awemes) == null || list.size() < 3) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC49025JLx LLLLLLJ(SearchMixFeed searchMixFeed) {
        return new JW5(searchMixFeed);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol
    public final List<InterfaceC57784Mm4> w2(JW6 item) {
        List<Aweme> list;
        o.LJIIIZ(item, "item");
        AggregatedVideo aggregatedVideo = item.LIZ().aggregatedVideo;
        if (aggregatedVideo != null && (list = aggregatedVideo.awemes) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C49023JLv(item.LIZ(), it.next()));
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }
}
