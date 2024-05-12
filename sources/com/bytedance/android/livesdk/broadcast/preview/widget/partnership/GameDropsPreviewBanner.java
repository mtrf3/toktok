package com.bytedance.android.livesdk.broadcast.preview.widget.partnership;

import X.BZI;
import X.C16880lQ;
import X.C199097rd;
import X.C28787BRn;
import X.C30579BzL;
import X.C30582BzO;
import X.C38995FSd;
import X.C47261Igj;
import X.C48459J0d;
import X.C72818Shy;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.broadcast.PartnershipDropsV1ShowInfoChannel;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsShowCountSetting;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameDropsPreviewBanner extends BannerWidget implements InterfaceC72822Si2 {
    public boolean LJLL;
    public final String LJLJLLL = "game_partnership_drops_banner";
    public String LJLLI = "";

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpw;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void LLFF() {
        C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.K1;
        c48459J0d.LIZ(Long.valueOf(c48459J0d.LIZJ().longValue() + 1));
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (!this.LJLL) {
            return;
        }
        Long LIZJ = InterfaceC30442Bx8.K1.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GAME_DROPS_BANNER_COUNT.value");
        if (LIZJ.longValue() >= GameLivePartnershipDropsShowCountSetting.INSTANCE.getCount()) {
            return;
        }
        super.show();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(this, 69));
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 104), view);
        }
        hide();
        this.dataChannel.ov0(this, PartnershipDropsV1ShowInfoChannel.class, new AqS171S0100000_5(this, 215));
        C72818Shy.LIZLLL("partnershipJoinDropsEvent", this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("partnershipJoinDropsEvent", this);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        super.onShow();
        BZI LIZ = C28787BRn.LIZ("livesdk_drops_banner_show");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(this.LJLLI, "banner_id");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String LL() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        String str2;
        if (o.LJ(c199097rd.LJLIL, "partnershipJoinDropsEvent")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                str = u.LJJIJIL(interfaceC78280Uns, "taskId", "");
            } else {
                str = null;
            }
            InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns2 != null) {
                str2 = u.LJJIJIL(interfaceC78280Uns2, "tagId", "");
            } else {
                str2 = null;
            }
            C30579BzL S00 = ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).S00();
            if (S00 != null) {
                S00.LJI(C47261Igj.LJJIJ(new C30582BzO(String.valueOf(str), String.valueOf(str2), false, false, false, 28)), "game_drops", null);
            }
        }
    }
}
