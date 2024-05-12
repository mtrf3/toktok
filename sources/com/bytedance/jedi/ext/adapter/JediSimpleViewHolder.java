package com.bytedance.jedi.ext.adapter;

import X.AMD;
import X.C26904AhA;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class JediSimpleViewHolder extends JediViewHolder implements AMD {
    public final ViewModelProvider.Factory viewModelFactory;

    public abstract void onBind(Object obj);

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AMD
    public ViewModelProvider.Factory getViewModelFactory() {
        return this.viewModelFactory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JediSimpleViewHolder(View view) {
        super(view);
        o.LJIIJ(view, "view");
        this.viewModelFactory = C26904AhA.LIZ;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onItemUpdated$ext_adapter_release(List<Object> list) {
        onBind(getItem(), this.latestItemPositionInternal, list);
    }

    public void onBind(Object obj, int i, List<Object> list) {
        onBind(obj);
    }
}
