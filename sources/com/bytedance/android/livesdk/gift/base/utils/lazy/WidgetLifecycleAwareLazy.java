package com.bytedance.android.livesdk.gift.base.utils.lazy;

import X.AbstractC32579CqV;
import X.C32580CqW;
import X.InterfaceC31781Cdd;
import X.InterfaceC65784Pro;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.WidgetInternalLiveSDKKt;
import com.bytedance.android.widget.Widget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class WidgetLifecycleAwareLazy extends com.bytedance.jedi.arch.lifecycleAwareLazy {
    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetLifecycleAwareLazy(LifecycleOwner owner, InterfaceC65784Pro<String> interfaceC65784Pro, InterfaceC65784Pro<ViewModel> initializer) {
        super(owner, interfaceC65784Pro, initializer);
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(initializer, "initializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.lifecycleAwareLazy
    public final void LIZ(LifecycleOwner owner, ViewModel value, InterfaceC65784Pro<String> keyFactory) {
        C32580CqW c32580CqW;
        Fragment fragment;
        Fragment fragment2;
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(value, "value");
        o.LJIIIZ(keyFactory, "keyFactory");
        if (owner instanceof Widget) {
            InterfaceC31781Cdd interfaceC31781Cdd = ((Widget) owner).widgetCallback;
            if (interfaceC31781Cdd != null && (fragment2 = interfaceC31781Cdd.getFragment()) != null) {
                WidgetInternalLiveSDKKt.ensureViewModel(fragment2, value, keyFactory);
                return;
            }
            return;
        }
        if (!(owner instanceof AbstractC32579CqV) || (c32580CqW = ((AbstractC32579CqV) owner).LJLJJL) == null || (fragment = c32580CqW.getFragment()) == null) {
            return;
        }
        WidgetInternalLiveSDKKt.ensureViewModel(fragment, value, keyFactory);
    }

    public /* synthetic */ WidgetLifecycleAwareLazy(LifecycleOwner lifecycleOwner, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, (i & 2) != 0 ? null : interfaceC65784Pro, interfaceC65784Pro2);
    }
}
