package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel", f = "ExploreFeedListViewModel.kt", l = {144}, m = "fetchList")
/* renamed from: X.8Aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207048Aq extends C3CS {
    public ExploreFeedListViewModel LJLIL;
    public boolean LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ ExploreFeedListViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207048Aq(ExploreFeedListViewModel exploreFeedListViewModel, InterfaceC67352kd<? super C207048Aq> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = exploreFeedListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.gv0(false, this);
    }
}
