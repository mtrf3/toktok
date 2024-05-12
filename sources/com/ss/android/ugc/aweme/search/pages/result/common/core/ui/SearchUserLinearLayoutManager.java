package com.ss.android.ugc.aweme.search.pages.result.common.core.ui;

import X.C0A7;
import X.C0AC;
import X.C34063DYl;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchUserLinearLayoutManager extends WrapLinearLayoutManager {
    public static long LLIIJLIL = -1;
    public final boolean LLIIJI = C34063DYl.LJLILLLLZI.LJJII();

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final boolean LJIL() {
        if (this.LLIIJI) {
            return false;
        }
        return super.LJIL();
    }

    @Override // com.ss.android.ugc.aweme.views.WrapLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJI(C0A7 recycler, C0AC state) {
        o.LJIIIZ(recycler, "recycler");
        o.LJIIIZ(state, "state");
        long currentTimeMillis = System.currentTimeMillis();
        super.LJLJJI(recycler, state);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long j = LLIIJLIL;
        if (currentTimeMillis2 < j) {
            currentTimeMillis2 = j;
        }
        LLIIJLIL = currentTimeMillis2;
    }
}
