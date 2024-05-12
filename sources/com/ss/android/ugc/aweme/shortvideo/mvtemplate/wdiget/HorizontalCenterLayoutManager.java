package com.ss.android.ugc.aweme.shortvideo.mvtemplate.wdiget;

import X.C0AC;
import X.C78053UkD;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class HorizontalCenterLayoutManager extends LinearLayoutManager {
    public HorizontalCenterLayoutManager(Context context) {
        super(0, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.LLIIII(recyclerView, c0ac, i);
        C78053UkD c78053UkD = new C78053UkD(recyclerView.getContext());
        c78053UkD.LIZ = i;
        LLIIIILZ(c78053UkD);
    }
}
