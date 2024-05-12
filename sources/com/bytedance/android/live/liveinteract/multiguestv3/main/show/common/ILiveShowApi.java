package com.bytedance.android.live.liveinteract.multiguestv3.main.show.common;

import X.AbstractC73638SvC;
import X.C28467BFf;
import X.E8M;
import X.EKC;
import X.EnumC29608Bjg;
import X.InterfaceC195727mC;
import X.InterfaceC65131PhH;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;

/* loaded from: classes14.dex */
public interface ILiveShowApi {
    @E8M("/webcast/multi_guest_play/create_show/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<C28467BFf<CreateShowResponse.ResponseData>> createShow(@InterfaceC195727mC CreateShowParams createShowParams);

    @E8M("/webcast/multi_guest_play/end_show/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<C28467BFf<EndShowResponse.ResponseData>> endShow(@InterfaceC195727mC EndShowParams endShowParams);

    @E8M("/webcast/multi_guest_play/finish_showing_guest/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<C28467BFf<FinishShowingGuestResponse.ResponseData>> finishGuest(@InterfaceC195727mC FinishShowingGuestParams finishShowingGuestParams);

    @E8M("/webcast/multi_guest_play/get_show_content/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<C28467BFf<GetShowContentResponse.ResponseData>> getShowContent(@InterfaceC195727mC GetShowContentParams getShowContentParams);

    @E8M("/webcast/multi_guest_play/get_show_rank/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<C28467BFf<GetShowRankResponse.ResponseData>> getShowRank(@InterfaceC195727mC GetShowRankParams getShowRankParams);

    @E8M("/webcast/multi_guest_play/get_show_settings/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<C28467BFf<GetShowSettingsResponse.ResponseData>> getShowSetting(@InterfaceC195727mC GetShowSettingsParams getShowSettingsParams);

    @E8M("/webcast/multi_guest_play/show_again_guest/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<C28467BFf<ShowAgainGuestResponse.ResponseData>> showAgainGuest(@InterfaceC195727mC ShowAgainGuestParams showAgainGuestParams);

    @E8M("/webcast/multi_guest_play/update_show_content/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<C28467BFf<UpdateShowContentResponse.ResponseData>> updateShowContent(@InterfaceC195727mC UpdateShowContentParams updateShowContentParams);
}
