package com.ss.android.ugc.aweme.ecommerce.core.utils;

import X.C0AC;
import X.C74588TPc;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ScrollTopLinearLayoutManager extends LinearLayoutManager {
    public int LLIIIJ;
    public final boolean LLIIIL;
    public final float LLIIIZ;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final boolean LJIL() {
        if (this.LLIIIL && super.LJIL()) {
            return true;
        }
        return false;
    }

    public ScrollTopLinearLayoutManager(Context context) {
        o.LJIIIZ(context, "context");
        this.LLIIIL = true;
        this.LLIIIZ = 50.0f;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC state, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(state, "state");
        Context context = recyclerView.getContext();
        o.LJIIIIZZ(context, "recyclerView.context");
        C74588TPc c74588TPc = new C74588TPc(this, context);
        c74588TPc.LIZ = i;
        LLIIIILZ(c74588TPc);
    }
}
