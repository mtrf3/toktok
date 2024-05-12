package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel;

import X.C2L4;
import X.C33Q;
import X.C49052JMy;
import X.C76965UIn;
import X.C8YE;
import X.JQA;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoScope;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchVideoHolderVM extends AssemViewModelWithItem<C49052JMy, Aweme> implements C8YE<C49052JMy, Aweme>, C2L4 {
    public boolean LJLILLLLZI;
    public JQA LJLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C49052JMy(0);
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(SearchVideoScope.class);
    }

    @Override // X.C8YE
    public final Object b50(C33Q state, Object item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }

    @Override // X.C8YE
    public final C49052JMy HU(C49052JMy state, Aweme item, List list) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return new C49052JMy(0);
    }
}
