package com.bytedance.android.live.broadcast.highlight;

import X.B83;
import X.BZI;
import X.C0NB;
import X.C16880lQ;
import X.C28787BRn;
import X.C29374Bfu;
import X.C30922CBq;
import X.C47061t0;
import X.C48459J0d;
import X.InterfaceC30442Bx8;
import X.X1D;
import Y.IDCListenerS135S0100000;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPageSelectLiveMode;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class PreviewHighLightVideoWidget extends BannerWidget {
    public C47061t0 LJLJLLL;
    public boolean LJLL;
    public GameLiveFragment LJLLI;
    public final String LJLLILLLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpx;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void LLFF() {
        String str;
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("PreviewHighLightVideoWidget", "hide().");
        }
        C48459J0d<String> c48459J0d = InterfaceC30442Bx8.LLJJJIL;
        GameLiveFragment gameLiveFragment = this.LJLLI;
        if (gameLiveFragment != null) {
            str = gameLiveFragment.vid;
        } else {
            str = null;
        }
        c48459J0d.LIZ(str);
        String liveType = this.LJLJJI;
        o.LJIIIZ(liveType, "liveType");
        BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_highlight_guide_show");
        LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ.LJIJJ(liveType, "live_type");
        LIZ.LJJIIJZLJL();
    }

    public final boolean LLFFF() {
        Boolean bool;
        GameLiveFragment gameLiveFragment;
        String str;
        Boolean bool2 = (Boolean) this.dataChannel.kv0(LiveAccessTipsShowChannel.class);
        boolean z = false;
        if (bool2 != null && bool2.booleanValue()) {
            return false;
        }
        String LIZJ = InterfaceC30442Bx8.LLJJJIL.LIZJ();
        String str2 = null;
        if (this.LJLL && (gameLiveFragment = this.LJLLI) != null && gameLiveFragment.isValid()) {
            GameLiveFragment gameLiveFragment2 = this.LJLLI;
            if (gameLiveFragment2 != null) {
                str = gameLiveFragment2.vid;
            } else {
                str = null;
            }
            if (!o.LJ(str, LIZJ) && o.LJ(InterfaceC30442Bx8.LLJJJ.LIZJ(), Boolean.TRUE)) {
                z = true;
            }
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("shouldShow(). hasFragment=");
            LIZ.append(this.LJLL);
            LIZ.append(", showingFragment?.isValid=");
            GameLiveFragment gameLiveFragment3 = this.LJLLI;
            if (gameLiveFragment3 != null) {
                bool = Boolean.valueOf(gameLiveFragment3.isValid());
            } else {
                bool = null;
            }
            LIZ.append(bool);
            LIZ.append(", showingFragment?.vid=");
            GameLiveFragment gameLiveFragment4 = this.LJLLI;
            if (gameLiveFragment4 != null) {
                str2 = gameLiveFragment4.vid;
            }
            LIZ.append(str2);
            LIZ.append(", SERVER_ENABLE_HIGHLIGHT_BUTTON=");
            LIZ.append(InterfaceC30442Bx8.LLJJJ.LIZJ());
            C0NB.LJIIIZ("PreviewHighLightVideoWidget", X1D.LIZIZ(LIZ));
        }
        return z;
    }

    public PreviewHighLightVideoWidget() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.kv0(PreviewPageSelectLiveMode.class);
        }
        this.LJLJJL = 5;
        this.LJLJJLL = true;
        this.LJLLILLLL = "highlight_banner";
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        this.LJLJLLL = (C47061t0) findViewById(R.id.f91);
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 25), view);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, RoomCreateInfoChannel.class, new IDqS416S0100000(this, 41));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onDestroy(). shouldShow=");
            LIZ.append(LLFFF());
            LIZ.append(' ');
            C0NB.LJIIIZ("PreviewHighLightVideoWidget", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        super.onShow();
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("PreviewHighLightVideoWidget", "try to show().");
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (LLFFF()) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String LL() {
        return this.LJLLILLLL;
    }
}
