package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes9.dex */
public class SearchLinearLayoutManager extends LinearLayoutManager {
    public Boolean LLIIIJ;

    public SearchLinearLayoutManager() {
        super(1, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final boolean LLIIIJ() {
        Boolean bool = this.LLIIIJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return super.LLIIIJ();
    }
}
