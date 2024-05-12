package com.bytedance.android.live.publicscreen.impl.caption.v2;

import X.C0AC;
import X.C78044Uk4;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CaptionLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final boolean LJIJJLI() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final boolean LJIL() {
        return false;
    }

    public CaptionLayoutManager() {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        o.LJI(recyclerView);
        C78044Uk4 c78044Uk4 = new C78044Uk4(recyclerView.getContext());
        c78044Uk4.LIZ = i;
        LLIIIILZ(c78044Uk4);
    }

    public CaptionLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
