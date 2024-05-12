package com.bytedance.ies.powerlist;

import X.C49661JeL;
import X.InterfaceC57784Mm4;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PowerAdapterWithScrollFix extends PowerAdapter {
    public final InterfaceC88472Yns<Context, ViewGroup> LLIIIILZ;

    @Override // com.bytedance.ies.powerlist.PowerAdapter, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public PowerAdapterWithScrollFix(RecyclerView recyclerView, C49661JeL c49661JeL) {
        super(recyclerView);
        this.LLIIIILZ = c49661JeL;
    }

    @Override // com.bytedance.ies.powerlist.PowerAdapter
    public final View LLFF(PowerCell<? extends InterfaceC57784Mm4> powerCell, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View onCreateItemView = powerCell.onCreateItemView(parent);
        InterfaceC88472Yns<Context, ViewGroup> interfaceC88472Yns = this.LLIIIILZ;
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        ViewGroup invoke = interfaceC88472Yns.invoke(context);
        invoke.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        invoke.addView(onCreateItemView);
        return invoke;
    }
}
