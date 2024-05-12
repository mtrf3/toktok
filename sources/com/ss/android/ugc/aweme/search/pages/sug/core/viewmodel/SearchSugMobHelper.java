package com.ss.android.ugc.aweme.search.pages.sug.core.viewmodel;

import X.C49700Jey;
import X.C50605JtZ;
import X.C50676Jui;
import Y.AObjectS137S0100000_8;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchSugMobHelper extends ViewModel {
    public LogPbBean LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public RecommendWordMob LJLJJI;
    public AObjectS137S0100000_8 LJLJJL;

    public final void gv0(String str, Integer num, String str2, SearchSugEntity searchSugEntity) {
        String str3;
        int LJIIJJI;
        String str4;
        o.LJIIIZ(searchSugEntity, "searchSugEntity");
        C49700Jey c49700Jey = new C49700Jey();
        c49700Jey.LJIJI(this.LJLJI);
        c49700Jey.LJIIZILJ("enter_method", "sug");
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo != null && sugExtraInfo.isGenerativeSug()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c49700Jey.LJIIZILJ("sug_generate_type", str3);
        AObjectS137S0100000_8 aObjectS137S0100000_8 = this.LJLJJL;
        if (aObjectS137S0100000_8 != null) {
            LJIIJJI = ((Number) aObjectS137S0100000_8.invoke()).intValue();
        } else {
            LJIIJJI = C50605JtZ.LJIIJJI();
        }
        c49700Jey.LJIIZILJ("search_type", C50676Jui.LIZ(LJIIJJI));
        c49700Jey.LJIIZILJ("words_type", str);
        c49700Jey.LJIIZILJ("action_type", str2);
        c49700Jey.LJIIZILJ("input_keyword", this.LJLILLLLZI);
        c49700Jey.LJIIZILJ("search_keyword", searchSugEntity.content);
        Word word = searchSugEntity.mWord;
        if (word != null) {
            str4 = word.getId();
        } else {
            str4 = null;
        }
        c49700Jey.LJIIZILJ("group_id", str4);
        c49700Jey.LJIIZILJ("order", String.valueOf(num));
        c49700Jey.LJIILIIL();
    }
}
