package X;

import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.livesdk.sei.SeiAppData;
import webcast.data.multi_guest_play.ShowContent;
import webcast.im.LiveShowMessage;

/* loaded from: classes14.dex */
public interface U3C {
    void LIZ();

    void LIZIZ(SeiAppData seiAppData);

    void LIZJ(ShowContent showContent);

    void LIZLLL(LiveShowMessage liveShowMessage);

    void LJ(ShowContent showContent);

    void LJFF(ShowContent showContent);

    AbstractC73638SvC<C28467BFf<FinishShowingGuestResponse.ResponseData>> LJI(FinishShowingGuestParams finishShowingGuestParams);

    void LJII(ShowContent showContent);

    void LJIIIIZZ(LiveShowMessage liveShowMessage);

    AbstractC73638SvC<C28467BFf<CreateShowResponse.ResponseData>> createShow(CreateShowParams createShowParams);

    void destroy();

    AbstractC73638SvC<C28467BFf<EndShowResponse.ResponseData>> endShow(EndShowParams endShowParams);

    ShowContent getContent();

    AbstractC73638SvC<C28467BFf<GetShowContentResponse.ResponseData>> getShowContent(GetShowContentParams getShowContentParams);

    AbstractC73638SvC<C28467BFf<ShowAgainGuestResponse.ResponseData>> showAgainGuest(ShowAgainGuestParams showAgainGuestParams);

    AbstractC73638SvC<C28467BFf<UpdateShowContentResponse.ResponseData>> updateShowContent(UpdateShowContentParams updateShowContentParams);
}
