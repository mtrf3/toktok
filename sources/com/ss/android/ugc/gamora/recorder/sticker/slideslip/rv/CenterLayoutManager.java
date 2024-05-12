package com.ss.android.ugc.gamora.recorder.sticker.slideslip.rv;

import X.C0AC;
import X.C80142Vco;
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
        C80142Vco c80142Vco = new C80142Vco(this.LLIIIJ);
        c80142Vco.LIZ = i;
        LLIIIILZ(c80142Vco);
    }
}
