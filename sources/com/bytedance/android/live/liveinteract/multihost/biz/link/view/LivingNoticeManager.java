package com.bytedance.android.live.liveinteract.multihost.biz.link.view;

import X.C0A7;
import X.C0AC;
import X.C16880lQ;
import X.C78042Uk2;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public final class LivingNoticeManager extends LinearLayoutManager {
    public LivingNoticeManager(Context context) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        try {
            super.LJLJJI(c0a7, c0ac);
        } catch (IndexOutOfBoundsException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        Context context;
        if (recyclerView != null) {
            context = recyclerView.getContext();
        } else {
            context = null;
        }
        C78042Uk2 c78042Uk2 = new C78042Uk2(context);
        c78042Uk2.LIZ = i;
        LLIIIILZ(c78042Uk2);
    }
}
