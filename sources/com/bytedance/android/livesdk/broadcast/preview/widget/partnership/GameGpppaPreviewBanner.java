package com.bytedance.android.livesdk.broadcast.preview.widget.partnership;

import X.B83;
import X.BZI;
import X.C06510Nj;
import X.C16880lQ;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.InterfaceC30442Bx8;
import Y.ACListenerS25S0100000_5;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.broadcast.PartnershipGpppaBanInfoChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class GameGpppaPreviewBanner extends BannerWidget {
    public TextView LJLJLLL;
    public final String LJLL = "game_gpppa_ban_banner";
    public boolean LJLLI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dof;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void LLFF() {
        InterfaceC30442Bx8.p1.LIZJ(Boolean.TRUE);
        BZI LIZ = C28787BRn.LIZ("game_gpppa_ban_text_show");
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "user_id");
        LIZ.LJIJJ(this.LJLJJI, "live_type");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (this.LJLLI) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        TextView textView;
        super.LJZL();
        hide();
        View view = getView();
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.ag_);
        } else {
            textView = null;
        }
        this.LJLJLLL = textView;
        View view2 = getView();
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 107), view2);
        }
        if (C29306Beo.LJJIFFI(InterfaceC30442Bx8.p1.LIZ())) {
            return;
        }
        this.dataChannel.ov0(this, PartnershipGpppaBanInfoChannel.class, new AqS171S0100000_5(this, 217));
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String LL() {
        return this.LJLL;
    }
}
