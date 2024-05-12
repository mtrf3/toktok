package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui;

import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;

/* loaded from: classes9.dex */
public class SearchGridLayoutManager extends WrapGridLayoutManager {
    public Boolean LLIL;

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final boolean LLIIIJ() {
        Boolean bool = this.LLIL;
        if (bool != null) {
            return bool.booleanValue();
        }
        return super.LLIIIJ();
    }

    public SearchGridLayoutManager(int i) {
        super(i, 1, false);
    }
}
