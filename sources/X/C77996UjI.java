package X;

import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* renamed from: X.UjI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77996UjI implements InterfaceC78033Ujt {
    public final /* synthetic */ RankListViewModel LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.InterfaceC78033Ujt
    public final void onError() {
        this.LIZ.hv0(this.LIZIZ);
    }

    public C77996UjI(RankListViewModel rankListViewModel, boolean z) {
        this.LIZ = rankListViewModel;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC78033Ujt
    public final void LIZ(RankListV2Response.RankView rankView, long j) {
        RankListViewModel rankListViewModel = this.LIZ;
        rankListViewModel.LJLJLJ = j;
        rankListViewModel.LJLILLLLZI = rankView;
        rankListViewModel.gv0(rankView);
    }
}
