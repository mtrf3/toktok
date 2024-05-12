package com.bytedance.android.livesdk.broadcast.preview.widget.livestudio;

import X.BZI;
import X.C0DC;
import X.C16880lQ;
import X.C28787BRn;
import X.InterfaceC30442Bx8;
import Y.ACListenerS25S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewLiveStudioTipsWidget extends BannerWidget {
    public final String LJLJLLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dq3;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void LLFF() {
        String liveMode = this.LJLJJI;
        o.LJIIIZ(liveMode, "liveMode");
        BZI LIZ = C28787BRn.LIZ("livesdk_live_studio_available_show");
        LIZ.LJIJJ(C0DC.LIZ(), "anchor_id");
        LIZ.LJIJ(liveMode);
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        Boolean LIZIZ = InterfaceC30442Bx8.N0.LIZIZ(this.LJLJJI);
        if (LIZIZ == null || !LIZIZ.booleanValue()) {
            super.show();
        }
    }

    public PreviewLiveStudioTipsWidget() {
        this.LJLJJL = 3;
        this.LJLJLLL = "live_studio_launch_banner";
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 103), view);
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String LL() {
        return this.LJLJLLL;
    }
}
