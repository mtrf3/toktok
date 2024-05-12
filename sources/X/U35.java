package X;

import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.livesdk.sei.SeiAppData;
import webcast.data.multi_guest_play.ShowContent;

/* loaded from: classes14.dex */
public interface U35 {
    boolean LIZ();

    void LIZIZ(SeiAppData seiAppData);

    void LIZJ(ShowContent showContent);

    long LIZLLL(String str);

    void LJ();

    void LJFF(U3H u3h);

    long LJI(long j);

    int LJII();

    void LJIIIIZZ(U3H u3h);

    void LJIIIZ(EnumC75006TcA enumC75006TcA);

    Long LJIIJ();

    boolean LJIIJJI();

    void LJIIL(ShowContent showContent);

    void LJIILIIL(long j, long j2);

    void clearCache();

    AbstractC73638SvC<C28467BFf<CreateShowResponse.ResponseData>> createShow(CreateShowParams createShowParams);

    void destroy();

    AbstractC73638SvC<C28467BFf<EndShowResponse.ResponseData>> endShow(EndShowParams endShowParams);

    AbstractC73638SvC<C28467BFf<FinishShowingGuestResponse.ResponseData>> finishGuest(FinishShowingGuestParams finishShowingGuestParams);

    ShowContent getContent();

    AbstractC73638SvC<C28467BFf<GetShowContentResponse.ResponseData>> getShowContent(GetShowContentParams getShowContentParams);

    AbstractC73638SvC<C28467BFf<GetShowSettingsResponse.ResponseData>> getShowSetting(GetShowSettingsParams getShowSettingsParams);

    AbstractC73638SvC<C28467BFf<ShowAgainGuestResponse.ResponseData>> showAgainGuest(ShowAgainGuestParams showAgainGuestParams);

    AbstractC73638SvC<C28467BFf<UpdateShowContentResponse.ResponseData>> updateShowContent(UpdateShowContentParams updateShowContentParams);
}
