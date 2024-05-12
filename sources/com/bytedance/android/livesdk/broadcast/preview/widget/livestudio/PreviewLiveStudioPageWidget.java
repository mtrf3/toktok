package com.bytedance.android.livesdk.broadcast.preview.widget.livestudio;

import X.C15490jB;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class PreviewLiveStudioPageWidget extends AbstractPreviewLiveStudioPage {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dq1;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.AbstractPreviewLiveStudioPage, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.AbstractPreviewLiveStudioPage, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        C15490jB.LJ(findViewById(R.id.f6d), "tiktok_live_game_demand_1", "ttlive_broadcast_live_studio_preview_page_detail_new.png");
    }
}
