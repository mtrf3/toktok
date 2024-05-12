package com.ss.android.ugc.aweme.search.pages.result.hashtagsearch.core.ui;

import X.AbstractC49793JgT;
import X.C49378JZm;
import X.C49764Jg0;
import X.C49822Jgw;
import X.C49917JiT;
import X.C50605JtZ;
import android.view.View;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class SearchChallengeFragment extends SearchOriginalFragment<SearchChallenge> {
    public final Map<Integer, View> LLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String Jl() {
        return "tag";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLJJL).clear();
    }

    public SearchChallengeFragment() {
        this.LJLLLLLL = C50605JtZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void ym() {
        this.LLILL = new C49378JZm(this.LJLLILLLL, Ll(), this);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void zm() {
        this.LLJJJJJIL = new C49764Jg0();
        tn().LJJ(new C49822Jgw());
        tn().LJJI(this);
        C49917JiT<?> tn = tn();
        tn.LJLJJL = this;
        T t = tn.LJLIL;
        if (t != 0) {
            ((AbstractC49793JgT) t).LJLJL = sa();
        }
    }
}
