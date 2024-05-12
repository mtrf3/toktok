package com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor;

import X.AbstractC73638SvC;
import X.AbstractC74727TUl;
import X.B83;
import X.C28467BFf;
import X.C29374Bfu;
import X.C31657Cbd;
import X.C61878OQg;
import X.C65352Pkq;
import X.C73318Sq2;
import X.C73546Sti;
import X.C73671Svj;
import X.C75166Tek;
import X.C75559Tl5;
import X.InterfaceC31805Ce1;
import X.InterfaceC74236TBo;
import X.InterfaceC92693kP;
import X.T28;
import X.TBT;
import X.TQA;
import X.TRS;
import X.U35;
import X.U3I;
import Y.AfS29S0110000_13;
import Y.AfS65S0100000_13;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowContentChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowNextGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowZoomEvent;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;

/* loaded from: classes14.dex */
public final class LiveShowAnchorViewModel extends BaseLiveShowViewModel {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public C73546Sti LJLLI;
    public C73546Sti LJLLILLLL;
    public final MutableLiveData<List<LinkPlayerInfo>> LJLL = new MutableLiveData<>(C61878OQg.INSTANCE);
    public final C31657Cbd LJLLJ = new C31657Cbd("ZOOM_SERVICE");
    public final C75166Tek LJLLL = new C75166Tek(this);

    static {
        TBT tbt = new TBT(LiveShowAnchorViewModel.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/ZoomService;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel
    public final void gv0() {
        ShowConfig value;
        int i = MultiGuestLiveShowConfigSetting.INSTANCE.getSettingValue().muteAudioImBackUp;
        if (i <= 0 || (value = this.LJLJJI.getValue()) == null || value.allowOpenMicFreely) {
            return;
        }
        new C73671Svj(AbstractC73638SvC.LJIJ(1).LJII(i, TimeUnit.SECONDS).LJIIIIZZ(new AfS65S0100000_13(this, 43))).LJIIIIZZ().LJIIJJI();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        TRS trs = (TRS) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (trs != null) {
            trs.LIZLLL(this.LJLLL);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel
    public final void onInit() {
        super.onInit();
        TRS trs = (TRS) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (trs != null) {
            trs.LJ(this.LJLLL);
        }
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.lv0(this.LJLJLLL, LiveShowContentChangedEvent.class, new AqS179S0100000_13(this, 172));
            dataChannel.lv0(this.LJLJLLL, LiveShowNextGuestEvent.class, new AqS179S0100000_13(this, 173));
            dataChannel.lv0(this.LJLJLLL, LiveShowZoomEvent.class, new AqS179S0100000_13(this, 174));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel
    public final void hv0(int i) {
        MultiGuestLiveShowConfigSetting multiGuestLiveShowConfigSetting = MultiGuestLiveShowConfigSetting.INSTANCE;
        if (multiGuestLiveShowConfigSetting.getSettingValue().calibrateContentTime < 0 && !multiGuestLiveShowConfigSetting.isBackUpIm()) {
            return;
        }
        this.LJLLI = (C73546Sti) new C73671Svj(AbstractC73638SvC.LJIJ(1).LJII(i + r1, TimeUnit.SECONDS).LJIIIIZZ(new AfS65S0100000_13(this, 44))).LJIIIIZZ().LJIIJJI();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel
    public final void iv0(int i) {
        MultiGuestLiveShowConfigSetting multiGuestLiveShowConfigSetting = MultiGuestLiveShowConfigSetting.INSTANCE;
        if (multiGuestLiveShowConfigSetting.getSettingValue().calibrateContentTime < 0 && !multiGuestLiveShowConfigSetting.isBackUpIm()) {
            return;
        }
        this.LJLLILLLL = (C73546Sti) new C73671Svj(AbstractC73638SvC.LJIJ(1).LJII(i + r1, TimeUnit.SECONDS).LJIIIIZZ(new AfS65S0100000_13(this, 45))).LJIIIIZZ().LJIIJJI();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel
    public final void jv0(String str) {
        super.jv0("live-end-success");
        this.LJLILLLLZI.setValue(null);
        this.LJLJI.setValue(null);
        C73546Sti c73546Sti = this.LJLLI;
        if (c73546Sti != null) {
            c73546Sti.dispose();
        }
        this.LJLLI = null;
        C73546Sti c73546Sti2 = this.LJLLILLLL;
        if (c73546Sti2 != null) {
            c73546Sti2.dispose();
        }
        C73546Sti c73546Sti3 = this.LJLLILLLL;
        if (c73546Sti3 != null) {
            c73546Sti3.dispose();
        }
    }

    public final void pv0(boolean z) {
        AbstractC73638SvC<C28467BFf<GetShowContentResponse.ResponseData>> showContent;
        ArrayList arrayList;
        AbstractC74727TUl LIZ;
        List LJJI;
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 != null && LIZ2.LJII() == 0) {
            MutableLiveData<List<LinkPlayerInfo>> mutableLiveData = this.LJLL;
            InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (LJJI = LIZ.LJJI()) != null) {
                arrayList = new ArrayList();
                for (Object obj : LJJI) {
                    if (((LinkPlayerInfo) obj).mUser.getId() != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            mutableLiveData.postValue(arrayList);
            return;
        }
        GetShowContentParams getShowContentParams = new GetShowContentParams();
        getShowContentParams.showId = BaseLiveShowViewModel.ov0();
        getShowContentParams.channelId = LJJLI();
        getShowContentParams.roomId = this.LJLJL;
        U35 LIZ3 = TQA.LIZ();
        if (LIZ3 != null && (showContent = LIZ3.getShowContent(getShowContentParams)) != null) {
            InterfaceC92693kP LJJII = T28.LIZLLL(showContent).LJJII(new AfS29S0110000_13(this, z, 0), U3I.LJLIL);
            C73318Sq2 cb = nv0();
            o.LJIIIZ(cb, "cb");
            cb.LIZ(LJJII);
        }
    }
}
