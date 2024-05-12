package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesListViewModel", f = "SeriesPostListViewModel.kt", l = {96}, m = "requestData")
/* loaded from: classes5.dex */
public final class A23 extends C3CS {
    public SeriesListViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ SeriesListViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A23(SeriesListViewModel seriesListViewModel, InterfaceC67352kd<? super A23> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = seriesListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.hv0(0, this);
    }
}
