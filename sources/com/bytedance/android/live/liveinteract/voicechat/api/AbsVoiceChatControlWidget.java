package com.bytedance.android.live.liveinteract.voicechat.api;

import X.C28272B7s;
import X.InterfaceC30131Bs7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* loaded from: classes6.dex */
public abstract class AbsVoiceChatControlWidget extends LiveWidget implements InterfaceC30131Bs7 {
    public abstract void onSei(C28272B7s c28272B7s);

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }
}
