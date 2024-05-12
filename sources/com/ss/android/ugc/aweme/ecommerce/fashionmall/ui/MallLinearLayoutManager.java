package com.ss.android.ugc.aweme.ecommerce.fashionmall.ui;

import X.C0AC;
import X.C56626MKg;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public final class MallLinearLayoutManager extends LinearLayoutManager {
    public MallLinearLayoutManager(Context context) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        Context context;
        if (recyclerView != null) {
            context = recyclerView.getContext();
        } else {
            context = null;
        }
        C56626MKg c56626MKg = new C56626MKg(context);
        c56626MKg.LIZ = i;
        LLIIIILZ(c56626MKg);
    }
}
