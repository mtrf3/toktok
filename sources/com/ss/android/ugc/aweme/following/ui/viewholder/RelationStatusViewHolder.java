package com.ss.android.ugc.aweme.following.ui.viewholder;

import X.C1DI;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RelationStatusViewHolder extends JediSimpleViewHolder {
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public RelationStatusViewHolder(ViewGroup viewGroup) {
        super(C1DI.LIZ(viewGroup, "parent", R.layout.c5u, viewGroup, false, "from(parent.context).inf…w,\n        parent, false)"));
        o.LJIIIIZZ(viewGroup.getContext(), "parent.context");
        this.itemView.findViewById(R.id.kf_);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object item) {
        o.LJIIIZ(item, "item");
    }
}
