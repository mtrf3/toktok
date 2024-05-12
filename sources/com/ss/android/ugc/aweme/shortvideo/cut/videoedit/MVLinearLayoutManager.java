package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import X.C0AC;
import X.C78054UkE;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public class MVLinearLayoutManager extends LinearLayoutManager {
    public final float LLIIIJ;

    public MVLinearLayoutManager() {
        super(0, false);
        this.LLIIIJ = 5.0f;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        C78054UkE c78054UkE = new C78054UkE(this, recyclerView.getContext());
        c78054UkE.LIZ = i;
        LLIIIILZ(c78054UkE);
    }

    public MVLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LLIIIJ = 5.0f;
    }
}
