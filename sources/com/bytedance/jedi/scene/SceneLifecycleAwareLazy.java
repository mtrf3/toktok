package com.bytedance.jedi.scene;

import X.InterfaceC65784Pro;
import X.WM7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SceneInternalKt;
import androidx.lifecycle.ViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SceneLifecycleAwareLazy extends lifecycleAwareLazy {
    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SceneLifecycleAwareLazy(LifecycleOwner owner, InterfaceC65784Pro<String> interfaceC65784Pro, InterfaceC65784Pro<ViewModel> initializer) {
        super(owner, interfaceC65784Pro, initializer);
        o.LJIIJ(owner, "owner");
        o.LJIIJ(initializer, "initializer");
    }

    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy
    public final void LIZ(LifecycleOwner owner, ViewModel value, InterfaceC65784Pro<String> keyFactory) {
        o.LJIIJ(owner, "owner");
        o.LJIIJ(value, "value");
        o.LJIIJ(keyFactory, "keyFactory");
        WM7 wm7 = ((WM7) owner).mParentScene;
        if (wm7 != null) {
            SceneInternalKt.ensureViewModel(wm7, value, keyFactory);
        }
    }

    public /* synthetic */ SceneLifecycleAwareLazy(LifecycleOwner lifecycleOwner, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, (i & 2) != 0 ? null : interfaceC65784Pro, interfaceC65784Pro2);
    }
}
