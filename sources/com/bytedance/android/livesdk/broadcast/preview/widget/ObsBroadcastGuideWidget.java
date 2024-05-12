package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0N7;
import X.C0NB;
import X.C30922CBq;
import X.InterfaceC30442Bx8;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class ObsBroadcastGuideWidget extends BannerWidget {
    public final String LJLJLLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpn;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void LLFF() {
        C0N7.LIZLLL("show", "obs_guide_banner", this.dataChannel, this.LJLJJI);
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("ObsBroadcastGuideWidget", "hide");
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        Boolean LIZ = InterfaceC30442Bx8.Q0.LIZ();
        if (LIZ == null || !LIZ.booleanValue()) {
            super.show();
        }
    }

    public ObsBroadcastGuideWidget() {
        this.LJLJJL = 3;
        this.LJLJLLL = "obs_live_new_broadcast_education_banner";
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        super.onShow();
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("ObsBroadcastGuideWidget", "try to show");
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String LL() {
        return this.LJLJLLL;
    }
}
