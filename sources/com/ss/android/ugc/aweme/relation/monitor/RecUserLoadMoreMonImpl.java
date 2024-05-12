package com.ss.android.ugc.aweme.relation.monitor;

import X.C0A6;
import X.ORY;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AdapterLoadingCell;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecUserLoadMoreMonImpl extends C0A6 implements LifecycleEventObserver {
    public static final Class<?>[] LJLILLLLZI = {LoadingFooterCell.class, AdapterLoadingCell.class};
    public boolean LJLIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            source.getLifecycle().removeObserver(this);
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (this.LJLIL) {
            recyclerView.LJJLL(this);
            return;
        }
        int childCount = recyclerView.getChildCount();
        if (childCount <= 0) {
            return;
        }
        RecyclerView.ViewHolder LJJJJJL = recyclerView.LJJJJJL(recyclerView.getChildAt(childCount - 1));
        if (!ORY.LJJIJIIJIL(LJJJJJL.getClass(), LJLILLLLZI)) {
            return;
        }
        this.LJLIL = true;
        throw null;
    }
}
