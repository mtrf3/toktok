package com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel;

import X.C17N;
import X.C50201Jn3;
import X.C50322Jp0;
import X.JNN;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchLabel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* loaded from: classes9.dex */
public final class SearchHubHeaderVM extends AssemViewModel<C50201Jn3> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C50201Jn3 defaultState() {
        return new C50201Jn3(null, null, null, null, null, 0, null, null, 4095);
    }

    public static void gv0(JNN jnn, C50201Jn3 c50201Jn3, int i, SearchLabel searchLabel) {
        ISearchContextAbility LJJJJLL = C17N.LJJJJLL();
        jnn.LJJI(Integer.valueOf(i));
        jnn.LJJII(searchLabel.labelId);
        C50322Jp0 LIZJ = LJJJJLL.If().LIZJ();
        jnn.LJJIFFI(LIZJ.LJLJI);
        jnn.LJIIZILJ("search_keyword", LIZJ.LJLJJI);
        jnn.LJIJI("general_search");
        jnn.LJIIZILJ("token_type", "entity_label_card");
        jnn.LIZLLL("entity_keyword", c50201Jn3.LJLIL);
        jnn.LIZLLL("entity_sub", searchLabel.labelText);
        jnn.LIZLLL("entity_type", c50201Jn3.LJLJJI.getMobType());
        jnn.LIZLLL("is_entity", "1");
    }
}
