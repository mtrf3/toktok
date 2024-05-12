package com.ss.android.ugc.tools.view.widget;

import X.C0AC;
import X.C74275TDb;
import X.C80006Vac;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes15.dex */
public class ScrollCenterLayoutManager extends LinearLayoutManager {
    public C80006Vac LLIIIJ;
    public final Context LLIIIL;

    public ScrollCenterLayoutManager(Context context) {
        super(0, false);
        this.LLIIIL = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJZL(int i) {
        LJFF(i, (int) ((this.LJLLLL / 2) - C74275TDb.LIZIZ(this.LLIIIL, 45.0f)));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        Context context = recyclerView.getContext();
        if (this.LLIIIJ == null) {
            this.LLIIIJ = new C80006Vac(context);
        }
        C80006Vac c80006Vac = this.LLIIIJ;
        c80006Vac.LIZ = i;
        LLIIIILZ(c80006Vac);
    }

    public ScrollCenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LLIIIL = context;
    }
}
