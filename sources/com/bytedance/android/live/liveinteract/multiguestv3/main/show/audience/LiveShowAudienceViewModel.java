package com.bytedance.android.live.liveinteract.multiguestv3.main.show.audience;

import X.AbstractC73638SvC;
import X.C28467BFf;
import X.C73318Sq2;
import X.C75559Tl5;
import X.InterfaceC76562U3a;
import X.InterfaceC92693kP;
import X.T28;
import X.TQA;
import X.TRS;
import X.U35;
import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowAudienceAndGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowEndWhenAnchorResumeLive;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowSeiUpdateStart;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveShowAudienceViewModel extends BaseLiveShowAudienceAndGuestViewModel {
    public static final /* synthetic */ int LJLLJ = 0;
    public final MutableLiveData<Boolean> LJLLILLLL = new MutableLiveData<>(Boolean.FALSE);

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel
    public final void onInit() {
        super.onInit();
        TRS trs = (TRS) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (trs != null) {
            trs.LJ(this.LJLLI);
        }
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.lv0(this.LJLJLLL, LiveShowSeiUpdateStart.class, new AqS179S0100000_13(this, 176));
            dataChannel.lv0(this.LJLJLLL, LiveShowEndWhenAnchorResumeLive.class, new AqS179S0100000_13(this, 177));
        }
    }

    public final void qv0(InterfaceC76562U3a interfaceC76562U3a) {
        AbstractC73638SvC<C28467BFf<GetShowContentResponse.ResponseData>> showContent;
        this.LJLL.setValue(pv0());
        GetShowContentParams getShowContentParams = new GetShowContentParams();
        getShowContentParams.showId = BaseLiveShowViewModel.ov0();
        getShowContentParams.channelId = LJJLI();
        getShowContentParams.roomId = this.LJLJL;
        U35 LIZ = TQA.LIZ();
        if (LIZ != null && (showContent = LIZ.getShowContent(getShowContentParams)) != null) {
            InterfaceC92693kP LJJII = T28.LIZLLL(showContent).LJJII(new AfS62S0200000_13(this, interfaceC76562U3a, 7), new AfS65S0100000_13(interfaceC76562U3a, 46));
            C73318Sq2 cb = nv0();
            o.LJIIIZ(cb, "cb");
            cb.LIZ(LJJII);
        }
    }
}
