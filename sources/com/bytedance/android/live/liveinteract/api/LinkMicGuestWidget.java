package com.bytedance.android.live.liveinteract.api;

import X.C28268B7o;
import X.C28272B7s;
import X.InterfaceC75472Tjg;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* loaded from: classes14.dex */
public abstract class LinkMicGuestWidget extends LiveWidget implements InterfaceC75472Tjg {
    public boolean isWidgetResumed;

    @Override // X.InterfaceC75472Tjg
    public boolean interceptCloseRoom(Runnable runnable, boolean z, boolean z2, C28268B7o c28268B7o) {
        return false;
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        this.isWidgetResumed = false;
        super.onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        this.isWidgetResumed = true;
        super.onResume();
    }

    @Override // X.InterfaceC75472Tjg
    public void onSei(C28272B7s c28272B7s, DataChannel dataChannel) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC75487Tjv
    public void unLoadPlayModeWidget() {
    }
}
