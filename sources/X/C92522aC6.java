package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.bnpl.biz.bill.detail.DetailViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.detail.DetailViewModel", f = "DetailViewModel.kt", l = {112}, m = "onLoadMore")
/* renamed from: X.aC6, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92522aC6 extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ DetailViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92522aC6(DetailViewModel detailViewModel, InterfaceC67352kd<? super C92522aC6> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = detailViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.onLoadMore(null, this);
    }
}
