package com.bytedance.android.livesdk.rank.impl.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class OnlineAudienceRankLandScapeWidget extends OnlineAudienceRankWidget {
    @Override // com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.deh;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }
}
