package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel", f = "PoiReviewListViewModel.kt", l = {101}, m = "onLoadMore")
/* renamed from: X.7rU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199007rU extends C3CS {
    public PoiReviewListViewModel LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ PoiReviewListViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199007rU(PoiReviewListViewModel poiReviewListViewModel, InterfaceC67352kd<? super C199007rU> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = poiReviewListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.iv0(0L, this);
    }
}
