package com.bytedance.android.live.liveinteract.multiguestv3.main.show.guest;

import X.AbstractC73638SvC;
import X.C28467BFf;
import X.C31657Cbd;
import X.C65352Pkq;
import X.C73318Sq2;
import X.C73546Sti;
import X.C73671Svj;
import X.C75559Tl5;
import X.InterfaceC74236TBo;
import X.InterfaceC92693kP;
import X.T28;
import X.TBT;
import X.TQA;
import X.TRS;
import X.U35;
import X.U3J;
import Y.AfS29S0110000_13;
import Y.AfS65S0100000_13;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowAudienceAndGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowZoomEvent;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveShowGuestViewModel extends BaseLiveShowAudienceAndGuestViewModel {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLL;
    public C73546Sti LJLLILLLL;
    public final C31657Cbd LJLLJ = new C31657Cbd("ZOOM_SERVICE");

    static {
        TBT tbt = new TBT(LiveShowGuestViewModel.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/ZoomService;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel
    public final void onInit() {
        super.onInit();
        TRS trs = (TRS) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (trs != null) {
            trs.LJ(this.LJLLI);
        }
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.lv0(this.LJLJLLL, LiveShowZoomEvent.class, new AqS179S0100000_13(this, 181));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel
    public final void iv0(int i) {
        MultiGuestLiveShowConfigSetting multiGuestLiveShowConfigSetting = MultiGuestLiveShowConfigSetting.INSTANCE;
        if (multiGuestLiveShowConfigSetting.getSettingValue().calibrateContentTime < 0 && !multiGuestLiveShowConfigSetting.isBackUpIm()) {
            return;
        }
        this.LJLLILLLL = (C73546Sti) new C73671Svj(AbstractC73638SvC.LJIJ(1).LJII(i + r1, TimeUnit.SECONDS).LJIIIIZZ(new AfS65S0100000_13(this, 47))).LJIIIIZZ().LJIIJJI();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel
    public final void jv0(String str) {
        super.jv0("live-end-success");
        this.LJLILLLLZI.setValue(null);
        C73546Sti c73546Sti = this.LJLLILLLL;
        if (c73546Sti != null) {
            c73546Sti.dispose();
        }
        this.LJLLILLLL = null;
    }

    public final void qv0(boolean z) {
        AbstractC73638SvC<C28467BFf<GetShowContentResponse.ResponseData>> showContent;
        this.LJLL.setValue(pv0());
        GetShowContentParams getShowContentParams = new GetShowContentParams();
        getShowContentParams.showId = BaseLiveShowViewModel.ov0();
        getShowContentParams.channelId = LJJLI();
        getShowContentParams.roomId = this.LJLJL;
        U35 LIZ = TQA.LIZ();
        if (LIZ != null && (showContent = LIZ.getShowContent(getShowContentParams)) != null) {
            InterfaceC92693kP LJJII = T28.LIZLLL(showContent).LJJII(new AfS29S0110000_13(this, z, 1), U3J.LJLIL);
            C73318Sq2 cb = nv0();
            o.LJIIIZ(cb, "cb");
            cb.LIZ(LJJII);
        }
    }
}
