package com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.lyric.widget;

import X.C0AC;
import X.C91484ZvM;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes22.dex */
public final class SmoothScrollLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        Context context;
        if (recyclerView != null) {
            context = recyclerView.getContext();
        } else {
            context = null;
        }
        C91484ZvM c91484ZvM = new C91484ZvM(context);
        c91484ZvM.LIZ = i;
        LLIIIILZ(c91484ZvM);
    }
}
