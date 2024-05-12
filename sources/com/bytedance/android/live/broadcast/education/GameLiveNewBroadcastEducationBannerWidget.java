package com.bytedance.android.live.broadcast.education;

import X.B83;
import X.BZI;
import X.C06540Nm;
import X.C0NB;
import X.C16880lQ;
import X.C28787BRn;
import X.C29374Bfu;
import X.C30922CBq;
import X.EnumC14050gr;
import X.InterfaceC30442Bx8;
import X.X1D;
import Y.IDCListenerS135S0100000;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.live.broadcast.model.GameLiveInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GameLiveNewBroadcastEducationBannerWidget extends BannerWidget {
    public boolean LJLJLLL;
    public final String LJLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.doh;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void LLFF() {
        if (!this.LJLJLLL) {
            this.LJLJLLL = true;
            EnumC14050gr eventPage = EnumC14050gr.Banner;
            String liveType = this.LJLJJI;
            o.LJIIIZ(eventPage, "eventPage");
            o.LJIIIZ(liveType, "liveType");
            BZI LIZ = C28787BRn.LIZ("livesdk_takepage_guide_show");
            C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id", liveType, "live_type");
            LIZ.LJIJJ(eventPage.getValue(), "event_page");
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        RoomCreateInfo roomCreateInfo;
        boolean z;
        boolean z2;
        GameLiveInfo gameLiveInfo;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            roomCreateInfo = (RoomCreateInfo) dataChannel.kv0(RoomCreateInfoChannel.class);
        } else {
            roomCreateInfo = null;
        }
        if (roomCreateInfo != null && (gameLiveInfo = roomCreateInfo.gameLiveInfo) != null && (bool = gameLiveInfo.hasGameLive) != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        Boolean LIZ = InterfaceC30442Bx8.M0.LIZ();
        if (LIZ != null) {
            z2 = LIZ.booleanValue();
        } else {
            z2 = false;
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("shouldShowEducationBanner. hadStaredGameLive=");
            LIZ2.append(z);
            LIZ2.append(", hadShowH5=");
            LIZ2.append(z2);
            C0NB.LJIIIZ("GameLiveNewBroadcastEducationBannerWidget", X1D.LIZIZ(LIZ2));
        }
        if (!z && !z2) {
            super.show();
        }
    }

    public GameLiveNewBroadcastEducationBannerWidget() {
        this.LJLJJL = 3;
        this.LJLL = "game_live_new_broadcast_education_banner";
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 21), view);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, RoomCreateInfoChannel.class, new IDqS416S0100000(this, 35));
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String LL() {
        return this.LJLL;
    }
}
