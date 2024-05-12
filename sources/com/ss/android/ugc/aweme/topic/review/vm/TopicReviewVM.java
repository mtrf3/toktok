package com.ss.android.ugc.aweme.topic.review.vm;

import X.C185107Og;
import X.C186147Sg;
import X.C186157Sh;
import X.C78983UzD;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class TopicReviewVM extends AssemViewModel<C186157Sh> {
    public String LJLIL = "";
    public int LJLILLLLZI = 1;
    public final Map<String, String> LJLJI = new LinkedHashMap();
    public final C186147Sg LJLJJI = new C186147Sg();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C186157Sh defaultState() {
        return new C186157Sh(0);
    }

    public final void gv0(Integer num, String str) {
        C185107Og.LIZ((String) ((LinkedHashMap) this.LJLJI).get("enter_method"), (String) ((LinkedHashMap) this.LJLJI).get("previous_page"), C78983UzD.LJJLIIIJ(this.LJLILLLLZI), this.LJLIL, (String) ((LinkedHashMap) this.LJLJI).get("topic_title"), num, str, 257);
    }
}
