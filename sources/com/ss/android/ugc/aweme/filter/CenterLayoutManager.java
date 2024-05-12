package com.ss.android.ugc.aweme.filter;

import X.C0AC;
import X.C78050UkA;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public class CenterLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        C78050UkA c78050UkA = new C78050UkA(recyclerView.getContext());
        c78050UkA.LIZ = i;
        LLIIIILZ(c78050UkA);
    }

    public CenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
