package com.bytedance.jedi.ext.widget;

import X.InterfaceC65784Pro;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InternalKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.widget.Widget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class WidgetLifecycleAwareLazy extends lifecycleAwareLazy {
    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetLifecycleAwareLazy(LifecycleOwner owner, InterfaceC65784Pro<String> interfaceC65784Pro, InterfaceC65784Pro<ViewModel> initializer) {
        super(owner, interfaceC65784Pro, initializer);
        o.LJIIJ(owner, "owner");
        o.LJIIJ(initializer, "initializer");
    }

    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy
    public final void LIZ(LifecycleOwner owner, ViewModel value, InterfaceC65784Pro<String> keyFactory) {
        o.LJIIJ(owner, "owner");
        o.LJIIJ(value, "value");
        o.LJIIJ(keyFactory, "keyFactory");
        Object host = ((Widget) owner).getHost();
        if (!(host instanceof Fragment)) {
            host = null;
        }
        Fragment fragment = (Fragment) host;
        if (fragment != null) {
            InternalKt.ensureViewModel(fragment, value, keyFactory);
        }
    }

    public /* synthetic */ WidgetLifecycleAwareLazy(LifecycleOwner lifecycleOwner, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, (i & 2) != 0 ? null : interfaceC65784Pro, interfaceC65784Pro2);
    }
}
