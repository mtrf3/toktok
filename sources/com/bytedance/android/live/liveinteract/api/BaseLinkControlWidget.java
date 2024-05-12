package com.bytedance.android.live.liveinteract.api;

import X.InterfaceC30131Bs7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* loaded from: classes6.dex */
public abstract class BaseLinkControlWidget extends LiveWidget implements InterfaceC30131Bs7 {
    public boolean LJLIL;

    public abstract void LJLZ();

    public abstract void LJZ();

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }
}
