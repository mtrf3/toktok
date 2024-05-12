package X;

import Y.AfS53S0100000_1;
import Y.AfS58S0200000_9;
import com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MGA extends AbstractC72278SYg<MixListResponse> {
    public final /* synthetic */ GetMixListViewModel LIZIZ;

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onRefresh(InterfaceC67352kd<? super A2G<MixListResponse>> continuation) {
        o.LJIIIZ(continuation, "continuation");
        HG3.LJIIL();
        String curUserId = HG3.LJLJL.LJFF().getCurUserId();
        HG3.LJIIL();
        String secUid = HG3.LJLJL.LJFF().getCurSecUserId();
        MixFeedApi.LIZ.getClass();
        MixFeedApi LIZ = C229108yw.LIZ();
        o.LJIIIIZZ(secUid, "secUid");
        LIZ.getUserMixList(curUserId, 0L, secUid).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS58S0200000_9(this.LIZIZ, (GetMixListViewModel) continuation, (InterfaceC67352kd<? super A2G<MixListResponse>>) 6), new AfS53S0100000_1(continuation, 34));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MGA(GetMixListViewModel getMixListViewModel, C57939MoZ c57939MoZ) {
        super(c57939MoZ);
        this.LIZIZ = getMixListViewModel;
    }

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onLoadMore(InterfaceC67352kd continuation, Object obj) {
        MixListResponse params = (MixListResponse) obj;
        o.LJIIIZ(continuation, "continuation");
        o.LJIIIZ(params, "params");
        HG3.LJIIL();
        String curUserId = HG3.LJLJL.LJFF().getCurUserId();
        if (params.getHasMore()) {
            MixFeedApi.LIZ.getClass();
            C229108yw.LIZ().getUserMixList(curUserId, params.getCursor(), "").LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS58S0200000_9(this.LIZIZ, (GetMixListViewModel) continuation, (InterfaceC67352kd<? super A2G<MixListResponse>>) 5), new AfS53S0100000_1(continuation, 33));
        }
    }
}
