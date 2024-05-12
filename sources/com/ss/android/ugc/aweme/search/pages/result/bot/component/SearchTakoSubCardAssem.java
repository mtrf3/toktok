package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.C49024JLw;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class SearchTakoSubCardAssem extends SearchAggregatedSubCardAssem<SearchTakoVideoRootAssem, C49024JLw> {
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem, X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        ArrayList arrayList = new ArrayList(super.getScopeDefine());
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem
    public final SearchTakoVideoRootAssem P() {
        return new SearchTakoVideoRootAssem();
    }
}
