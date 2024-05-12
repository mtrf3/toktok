package com.bytedance.android.livesdk.impl.revenue.subscription.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class LandscapeSubscribeIconWidget extends SubscribeIconWidget {
    @Override // com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeIconWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dn1;
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeIconWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }
}
