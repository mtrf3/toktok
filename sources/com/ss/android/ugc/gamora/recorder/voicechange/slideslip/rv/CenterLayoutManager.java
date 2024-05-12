package com.ss.android.ugc.gamora.recorder.voicechange.slideslip.rv;

import X.C0AC;
import X.C80084Vbs;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes15.dex */
public final class CenterLayoutManager extends LinearLayoutManager {
    public final Context LLIIIJ;

    public CenterLayoutManager(Context context) {
        super(0, false);
        this.LLIIIJ = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        C80084Vbs c80084Vbs = new C80084Vbs(this.LLIIIJ);
        c80084Vbs.LJIILLIIL = ((Number) c80084Vbs.LJIILL.getValue()).floatValue() / 0.4f;
        c80084Vbs.LIZ = i;
        LLIIIILZ(c80084Vbs);
    }
}
