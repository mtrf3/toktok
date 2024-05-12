package com.ss.android.ugc.aweme.ecommerce.common;

import android.view.ViewGroup;
import android.widget.Space;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class JediSpaceHolder extends JediSimpleViewHolder {
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JediSpaceHolder(ViewGroup view) {
        super(new Space(view.getContext()));
        o.LJIIIZ(view, "view");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        this.itemView.setLayoutParams(new RecyclerView.LayoutParams(1, ((Number) obj).intValue()));
    }
}
