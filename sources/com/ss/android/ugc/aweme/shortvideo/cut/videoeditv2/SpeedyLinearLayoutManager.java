package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import X.ActivityC45651qj;
import X.C0AC;
import X.C74591TPf;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SpeedyLinearLayoutManager extends LinearLayoutManager {
    public C74591TPf LLIIIJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeedyLinearLayoutManager(ActivityC45651qj context) {
        super(0, false);
        o.LJIIIZ(context, "context");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (this.LLIIIJ == null) {
            this.LLIIIJ = new C74591TPf(recyclerView.getContext());
        }
        C74591TPf c74591TPf = this.LLIIIJ;
        o.LJI(c74591TPf);
        c74591TPf.LIZ = i;
        LLIIIILZ(this.LLIIIJ);
    }
}
