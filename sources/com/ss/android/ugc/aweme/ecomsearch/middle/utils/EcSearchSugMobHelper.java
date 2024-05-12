package com.ss.android.ugc.aweme.ecomsearch.middle.utils;

import X.C51214K8c;
import X.KAI;
import X.KC9;
import Y.AObjectS137S0100000_8;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcSearchSugMobHelper extends ViewModel {
    public LogPbBean LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public RecommendWordMob LJLJJI;
    public AObjectS137S0100000_8 LJLJJL;

    public final void gv0(String str, Integer num, String str2, SearchSugEntity searchSugEntity) {
        int LJI;
        String str3;
        o.LJIIIZ(searchSugEntity, "searchSugEntity");
        KC9 kc9 = new KC9();
        kc9.LJIILLIIL(this.LJLJI);
        kc9.LJIILL("enter_method", "sug");
        AObjectS137S0100000_8 aObjectS137S0100000_8 = this.LJLJJL;
        if (aObjectS137S0100000_8 != null) {
            LJI = ((Number) aObjectS137S0100000_8.invoke()).intValue();
        } else {
            LJI = C51214K8c.LJI();
        }
        kc9.LJIILL("search_type", KAI.LIZ(LJI));
        kc9.LJIILL("words_type", str);
        kc9.LJIILL("action_type", str2);
        kc9.LJIILL("input_keyword", this.LJLILLLLZI);
        kc9.LJIILL("search_keyword", searchSugEntity.content);
        Word word = searchSugEntity.mWord;
        if (word != null) {
            str3 = word.getId();
        } else {
            str3 = null;
        }
        kc9.LJIILL("group_id", str3);
        kc9.LJIILL("order", String.valueOf(num));
        kc9.LJIILIIL();
    }
}
