package com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.viewmodel;

import X.C188727au;
import X.C92S;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Map;

/* loaded from: classes5.dex */
public final class SearchEllipsisVM extends AssemViewModel<C92S> {
    public boolean LJLIL = true;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C92S defaultState() {
        return new C92S(null);
    }

    public static C188727au gv0(C188727au c188727au, Map map) {
        if (map == null) {
            return c188727au;
        }
        c188727au.LJI("enter_from", (String) map.get("enter_from"));
        c188727au.LJI("search_keyword", (String) map.get("search_keyword"));
        c188727au.LJI("search_id", (String) map.get("search_id"));
        return c188727au;
    }
}
