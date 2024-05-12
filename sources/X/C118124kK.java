package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.viewmodel.TrendingBillboardViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.trending.ui.billboardpage.viewmodel.TrendingBillboardViewModel", f = "TrendingBillboardViewModel.kt", l = {36}, m = "onLoadMore")
/* renamed from: X.4kK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118124kK extends C3CS {
    public TrendingBillboardViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ TrendingBillboardViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118124kK(TrendingBillboardViewModel trendingBillboardViewModel, InterfaceC67352kd<? super C118124kK> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = trendingBillboardViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.gv0(this);
    }
}
