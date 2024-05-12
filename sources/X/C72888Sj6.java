package X;

import Y.AfS2S0200100_12;
import com.ss.android.ugc.aweme.following.repository.RelationSearchApi;
import com.ss.android.ugc.aweme.following.vm.RelationSearchVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Sj6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72888Sj6 extends AbstractC72278SYg<String> {
    public final /* synthetic */ RelationSearchVM LIZIZ;

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onRefresh(InterfaceC67352kd<? super A2G<String>> continuation) {
        o.LJIIIZ(continuation, "continuation");
        if (((String) this.LIZIZ.LJLILLLLZI.getValue()).length() == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C63803P2h.LIZ(this.LIZIZ.getEnterFrom(), currentTimeMillis, C33X.LIZ, this.LIZIZ.LJLJL);
        RelationSearchVM relationSearchVM = this.LIZIZ;
        relationSearchVM.LJLJL++;
        String str = relationSearchVM.LJLJJI;
        relationSearchVM.setState(C72890Sj8.LJLIL);
        RelationSearchApi.LIZ.getClass();
        C73454SsE LJJJ = ((RelationSearchApi) C35990EAo.LIZIZ.getValue()).queryRelationSearchList(((C72889Sj7) this.LIZIZ.LJLIL.getValue()).LJLILLLLZI.getValue(), (String) this.LIZIZ.LJLILLLLZI.getValue(), str).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        RelationSearchVM relationSearchVM2 = this.LIZIZ;
        LJJJ.LJJJLIIL(new AfS2S0200100_12(currentTimeMillis, relationSearchVM2, continuation, 0), new AfS2S0200100_12(currentTimeMillis, relationSearchVM2, continuation, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72888Sj6(RelationSearchVM relationSearchVM, C57939MoZ c57939MoZ) {
        super(c57939MoZ);
        this.LIZIZ = relationSearchVM;
    }

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onLoadMore(InterfaceC67352kd continuation, Object params) {
        o.LJIIIZ(continuation, "continuation");
        o.LJIIIZ(params, "params");
    }
}
