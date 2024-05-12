package com.ss.android.ugc.aweme.arch.widgets;

import X.XYS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;

/* loaded from: classes16.dex */
public abstract class ListItemWidget extends Widget {
    public XYS LJLJLJ;

    public boolean LJIILL(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void LJIILJJIL(XYS xys) {
        this.LJLJLJ = xys;
    }
}
