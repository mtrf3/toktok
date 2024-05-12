package com.bytedance.android.live.publicscreen.api;

import X.CQQ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public abstract class IPublicScreenContextWidget extends LiveRecyclableWidget {
    public CQQ LJLIL;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onPostUnload() {
        super.onPostUnload();
        this.LJLIL = null;
    }
}
