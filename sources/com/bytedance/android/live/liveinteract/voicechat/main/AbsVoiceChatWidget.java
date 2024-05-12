package com.bytedance.android.live.liveinteract.voicechat.main;

import X.C28268B7o;
import X.C28272B7s;
import X.TX9;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget;

/* loaded from: classes14.dex */
public abstract class AbsVoiceChatWidget extends AbsVoiceChatSubWidget {
    public TX9 LJLIL;

    public abstract boolean LJLZ();

    public abstract void LJZ(boolean z);

    public abstract boolean interceptCloseRoom(Runnable runnable, boolean z, boolean z2, C28268B7o c28268B7o);

    public void onSei(C28272B7s c28272B7s) {
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        this.LJLIL = null;
    }
}
