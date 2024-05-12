package X;

import Y.AfS53S0100000_1;
import Y.AfS58S0200000_9;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MG9 extends AbstractC72278SYg<MixListResponse> {
    public final /* synthetic */ MG8 LIZIZ;

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onRefresh(InterfaceC67352kd<? super A2G<MixListResponse>> continuation) {
        o.LJIIIZ(continuation, "continuation");
        MG8 mg8 = this.LIZIZ;
        List<InterfaceC57784Mm4> L = mg8.L(mg8.LJLJJLL);
        if (this.LIZIZ.LJLILLLLZI) {
            ListProtector.add(L, 0, new MGG());
        }
        A2F a2f = A2G.LIZ;
        MixListResponse mixListResponse = this.LIZIZ.LJLLLLLL;
        a2f.getClass();
        A2V LIZLLL = A2F.LIZLLL(null, mixListResponse, L);
        C3C5.m7constructorimpl(LIZLLL);
        continuation.resumeWith(LIZLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MG9(MG8 mg8, C57939MoZ c57939MoZ) {
        super(c57939MoZ);
        this.LIZIZ = mg8;
    }

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onLoadMore(InterfaceC67352kd continuation, Object obj) {
        AbstractC73638SvC<MixListResponse> userMixList;
        String str;
        MixListResponse params = (MixListResponse) obj;
        o.LJIIIZ(continuation, "continuation");
        o.LJIIIZ(params, "params");
        if (this.LIZIZ.LJLJI) {
            MixFeedApi.LIZ.getClass();
            MixFeedApi LIZ = C229108yw.LIZ();
            String str2 = this.LIZIZ.LJLJL;
            long cursor = params.getCursor();
            MixListResponse mixListResponse = this.LIZIZ.LJLLLLLL;
            if (mixListResponse == null || (str = mixListResponse.getKeyWord()) == null) {
                str = "";
            }
            userMixList = LIZ.searchLodeMore(str2, cursor, 10, 16, str);
        } else {
            MixFeedApi.LIZ.getClass();
            userMixList = C229108yw.LIZ().getUserMixList(this.LIZIZ.LJLJL, params.getCursor(), this.LIZIZ.LJLJLJ);
        }
        if (params.getHasMore()) {
            userMixList.LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS58S0200000_9(continuation, this.LIZIZ, 2), new AfS53S0100000_1(continuation, 6));
        }
    }
}
