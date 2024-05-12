package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDistributionListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDistributionListViewModel", f = "NowDistributionListViewModel.kt", l = {68}, m = "onRefresh")
/* renamed from: X.7kn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194857kn extends C3CS {
    public NowDistributionListViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ NowDistributionListViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C194857kn(NowDistributionListViewModel nowDistributionListViewModel, InterfaceC67352kd<? super C194857kn> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = nowDistributionListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.onRefresh(this);
    }
}
